package com.alarmfm.radio.data.database.dao

import androidx.room.*
import com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RecentlyPlayedStationDao {
    
    @Query("SELECT * FROM recently_played_stations ORDER BY lastPlayedAt DESC LIMIT 50")
    fun getRecentlyPlayedStations(): Flow<List<RecentlyPlayedStationEntity>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecentlyPlayed(station: RecentlyPlayedStationEntity)
    
    @Query("DELETE FROM recently_played_stations WHERE stationId = :stationId")
    suspend fun deleteRecentlyPlayed(stationId: String)
    
    @Query("DELETE FROM recently_played_stations WHERE lastPlayedAt < :timestamp")
    suspend fun deleteOldEntries(timestamp: Long)
    
    @Query("SELECT COUNT(*) FROM recently_played_stations")
    suspend fun getRecentlyPlayedCount(): Int
}
