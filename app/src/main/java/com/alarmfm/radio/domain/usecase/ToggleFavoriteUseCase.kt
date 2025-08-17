package com.alarmfm.radio.domain.usecase

import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.repository.RadioStationRepository
import javax.inject.Inject

class ToggleFavoriteUseCase @Inject constructor(
    private val repository: RadioStationRepository
) {
    suspend operator fun invoke(station: RadioStation) {
        if (repository.isFavorite(station.id)) {
            repository.removeFromFavorites(station.id)
        } else {
            repository.addToFavorites(station)
        }
    }
}
