package com.alarmfm.radio.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.model.UiState
import com.alarmfm.radio.domain.usecase.SearchStationsUseCase
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchStationsUseCase: SearchStationsUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(UiState.SUCCESS)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()
    
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()
    
    private val _stations = MutableStateFlow<List<RadioStation>>(emptyList())
    val stations: StateFlow<List<RadioStation>> = _stations.asStateFlow()
    
    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()
    
    private var searchJob: Job? = null
    
    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
        searchJob?.cancel()
        
        if (query.isBlank()) {
            _stations.value = emptyList()
            _uiState.value = UiState.SUCCESS
            return
        }
        
        searchJob = viewModelScope.launch {
            delay(500) // Debounce search
            searchStations(query)
        }
    }
    
    private fun searchStations(query: String) {
        viewModelScope.launch {
            _uiState.value = UiState.LOADING
            _errorMessage.value = null
            
            searchStationsUseCase(query).fold(
                onSuccess = { stationList ->
                    _stations.value = stationList
                    _uiState.value = UiState.SUCCESS
                    Timber.d("Found ${stationList.size} stations for query: $query")
                },
                onFailure = { exception ->
                    _errorMessage.value = exception.message ?: "Ошибка поиска"
                    _uiState.value = UiState.ERROR
                    Timber.e(exception, "Failed to search stations for query: $query")
                }
            )
        }
    }
    
    fun toggleFavorite(station: RadioStation) {
        viewModelScope.launch {
            try {
                toggleFavoriteUseCase(station)
                // Update the station in the list
                _stations.value = _stations.value.map { 
                    if (it.id == station.id) {
                        it.copy(isFavorite = !it.isFavorite)
                    } else {
                        it
                    }
                }
            } catch (e: Exception) {
                Timber.e(e, "Failed to toggle favorite for station ${station.name}")
            }
        }
    }
    
    fun retry() {
        if (_searchQuery.value.isNotBlank()) {
            searchStations(_searchQuery.value)
        }
    }
}
