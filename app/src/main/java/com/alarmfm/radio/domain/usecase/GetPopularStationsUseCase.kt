package com.alarmfm.radio.domain.usecase

import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.repository.RadioStationRepository
import javax.inject.Inject

class GetPopularStationsUseCase @Inject constructor(
    private val repository: RadioStationRepository
) {
    suspend operator fun invoke(): Result<List<RadioStation>> {
        return repository.getPopularStations()
    }
}
