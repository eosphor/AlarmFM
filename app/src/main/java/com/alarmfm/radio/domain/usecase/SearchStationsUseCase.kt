package com.alarmfm.radio.domain.usecase

import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.repository.RadioStationRepository
import javax.inject.Inject

class SearchStationsUseCase @Inject constructor(
    private val repository: RadioStationRepository
) {
    suspend operator fun invoke(query: String): Result<List<RadioStation>> {
        return repository.searchStations(query)
    }
}
