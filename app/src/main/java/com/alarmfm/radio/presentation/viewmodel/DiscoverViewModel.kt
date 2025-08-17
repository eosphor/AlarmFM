package com.alarmfm.radio.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.model.UiState
import com.alarmfm.radio.domain.usecase.GetPopularStationsUseCase
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class DiscoverViewModel @Inject constructor(
    private val getPopularStationsUseCase: GetPopularStationsUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(UiState.LOADING)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()
    
    private val _stations = MutableStateFlow<List<RadioStation>>(emptyList())
    val stations: StateFlow<List<RadioStation>> = _stations.asStateFlow()
    
    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()
    
    init {
        loadPopularStations()
    }
    
    fun loadPopularStations() {
        viewModelScope.launch {
            _uiState.value = UiState.LOADING
            _errorMessage.value = null
            
            getPopularStationsUseCase().fold(
                onSuccess = { stationList ->
                    _stations.value = stationList
                    _uiState.value = UiState.SUCCESS
                    Timber.d("Loaded ${stationList.size} popular stations")
                },
                onFailure = { exception ->
                    _errorMessage.value = exception.message ?: "Неизвестная ошибка"
                    _uiState.value = UiState.ERROR
                    Timber.e(exception, "Failed to load popular stations")
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
        loadPopularStations()
    }
}
