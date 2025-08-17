package com.alarmfm.radio.data.repository

import com.alarmfm.radio.data.api.RadioBrowserApi
import com.alarmfm.radio.data.database.dao.FavoriteStationDao
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao
import com.alarmfm.radio.data.database.entity.toFavoriteStationEntity
import com.alarmfm.radio.data.database.entity.toRecentlyPlayedStationEntity
import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.domain.repository.RadioStationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RadioStationRepositoryImpl @Inject constructor(
    private val api: RadioBrowserApi,
    private val favoriteStationDao: FavoriteStationDao,
    private val recentlyPlayedStationDao: RecentlyPlayedStationDao
) : RadioStationRepository {
    
    override suspend fun getTopStations(): Result<List<RadioStation>> {
        return try {
            val stations = api.getTopStations().map { it.toRadioStation() }
            Result.success(stations)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getPopularStations(): Result<List<RadioStation>> {
        return try {
            val stations = api.getPopularStations().map { it.toRadioStation() }
            Result.success(stations)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun searchStations(query: String): Result<List<RadioStation>> {
        return try {
            val stations = api.searchStations(name = query).map { it.toRadioStation() }
            Result.success(stations)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getStationsByTag(tag: String): Result<List<RadioStation>> {
        return try {
            val stations = api.getStationsByTag(tag).map { it.toRadioStation() }
            Result.success(stations)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getStationsByCountry(country: String): Result<List<RadioStation>> {
        return try {
            val stations = api.getStationsByCountry(country).map { it.toRadioStation() }
            Result.success(stations)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getStationsByLanguage(language: String): Result<List<RadioStation>> {
        return try {
            val stations = api.getStationsByLanguage(language).map { it.toRadioStation() }
            Result.success(stations)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getStationByUuid(uuid: String): Result<RadioStation?> {
        return try {
            val stations = api.getStationByUuid(uuid)
            val station = stations.firstOrNull()?.toRadioStation()
            Result.success(station)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override fun getFavoriteStations(): Flow<List<RadioStation>> {
        return favoriteStationDao.getAllFavorites().map { entities ->
            entities.map { it.toRadioStation() }
        }
    }
    
    override suspend fun addToFavorites(station: RadioStation) {
        favoriteStationDao.insertFavorite(station.toFavoriteStationEntity())
    }
    
    override suspend fun removeFromFavorites(stationId: String) {
        favoriteStationDao.deleteFavoriteById(stationId)
    }
    
    override suspend fun isFavorite(stationId: String): Boolean {
        return favoriteStationDao.isFavorite(stationId)
    }
    
    override fun getRecentlyPlayedStations(): Flow<List<RadioStation>> {
        return recentlyPlayedStationDao.getRecentlyPlayedStations().map { entities ->
            entities.map { it.toRadioStation() }
        }
    }
    
    override suspend fun addToRecentlyPlayed(station: RadioStation) {
        recentlyPlayedStationDao.insertRecentlyPlayed(station.toRecentlyPlayedStationEntity())
    }
    
    override suspend fun clearOldRecentlyPlayed() {
        val thirtyDaysAgo = System.currentTimeMillis() - (30 * 24 * 60 * 60 * 1000L)
        recentlyPlayedStationDao.deleteOldEntries(thirtyDaysAgo)
    }
}
