package com.alarmfm.radio.domain.repository

import com.alarmfm.radio.domain.model.RadioStation
import kotlinx.coroutines.flow.Flow

interface RadioStationRepository {
    suspend fun getTopStations(): Result<List<RadioStation>>
    suspend fun getPopularStations(): Result<List<RadioStation>>
    suspend fun searchStations(query: String): Result<List<RadioStation>>
    suspend fun getStationsByTag(tag: String): Result<List<RadioStation>>
    suspend fun getStationsByCountry(country: String): Result<List<RadioStation>>
    suspend fun getStationsByLanguage(language: String): Result<List<RadioStation>>
    suspend fun getStationByUuid(uuid: String): Result<RadioStation?>
    
    fun getFavoriteStations(): Flow<List<RadioStation>>
    suspend fun addToFavorites(station: RadioStation)
    suspend fun removeFromFavorites(stationId: String)
    suspend fun isFavorite(stationId: String): Boolean
    
    fun getRecentlyPlayedStations(): Flow<List<RadioStation>>
    suspend fun addToRecentlyPlayed(station: RadioStation)
    suspend fun clearOldRecentlyPlayed()
}
