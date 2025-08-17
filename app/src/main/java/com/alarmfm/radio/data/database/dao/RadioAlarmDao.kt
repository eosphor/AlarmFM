package com.alarmfm.radio.data.database.dao

import androidx.room.*
import com.alarmfm.radio.data.database.entity.RadioAlarmEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RadioAlarmDao {
    
    @Query("SELECT * FROM radio_alarms ORDER BY timeHour, timeMinute")
    fun getAllAlarms(): Flow<List<RadioAlarmEntity>>
    
    @Query("SELECT * FROM radio_alarms WHERE isEnabled = 1 ORDER BY timeHour, timeMinute")
    fun getEnabledAlarms(): Flow<List<RadioAlarmEntity>>
    
    @Query("SELECT * FROM radio_alarms WHERE id = :id")
    suspend fun getAlarmById(id: Long): RadioAlarmEntity?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAlarm(alarm: RadioAlarmEntity): Long
    
    @Update
    suspend fun updateAlarm(alarm: RadioAlarmEntity)
    
    @Delete
    suspend fun deleteAlarm(alarm: RadioAlarmEntity)
    
    @Query("DELETE FROM radio_alarms WHERE id = :id")
    suspend fun deleteAlarmById(id: Long)
    
    @Query("UPDATE radio_alarms SET isEnabled = :isEnabled WHERE id = :id")
    suspend fun updateAlarmEnabled(id: Long, isEnabled: Boolean)
    
    @Query("SELECT COUNT(*) FROM radio_alarms")
    suspend fun getAlarmsCount(): Int
}
