package com.alarmfm.radio.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.repository.RadioStationRepository
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(
    private val radioStationRepository: RadioStationRepository,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase
) : ViewModel() {
    
    private val _favoriteStations = MutableStateFlow<List<RadioStation>>(emptyList())
    val favoriteStations: StateFlow<List<RadioStation>> = _favoriteStations.asStateFlow()
    
    init {
        loadFavoriteStations()
    }
    
    private fun loadFavoriteStations() {
        viewModelScope.launch {
            radioStationRepository.getFavoriteStations().collect { stations ->
                _favoriteStations.value = stations
                Timber.d("Loaded ${stations.size} favorite stations")
            }
        }
    }
    
    fun removeFromFavorites(station: RadioStation) {
        viewModelScope.launch {
            try {
                toggleFavoriteUseCase(station)
                Timber.d("Removed station ${station.name} from favorites")
            } catch (e: Exception) {
                Timber.e(e, "Failed to remove station ${station.name} from favorites")
            }
        }
    }
}
