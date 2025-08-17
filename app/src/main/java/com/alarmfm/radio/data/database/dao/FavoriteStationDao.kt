package com.alarmfm.radio.data.database.dao

import androidx.room.*
import com.alarmfm.radio.data.database.entity.FavoriteStationEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteStationDao {
    
    @Query("SELECT * FROM favorite_stations ORDER BY addedAt DESC")
    fun getAllFavorites(): Flow<List<FavoriteStationEntity>>
    
    @Query("SELECT * FROM favorite_stations WHERE stationId = :stationId")
    suspend fun getFavoriteById(stationId: String): FavoriteStationEntity?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(station: FavoriteStationEntity)
    
    @Delete
    suspend fun deleteFavorite(station: FavoriteStationEntity)
    
    @Query("DELETE FROM favorite_stations WHERE stationId = :stationId")
    suspend fun deleteFavoriteById(stationId: String)
    
    @Query("SELECT EXISTS(SELECT 1 FROM favorite_stations WHERE stationId = :stationId)")
    suspend fun isFavorite(stationId: String): Boolean
    
    @Query("SELECT COUNT(*) FROM favorite_stations")
    suspend fun getFavoritesCount(): Int
}
