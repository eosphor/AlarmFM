package com.alarmfm.radio.domain.repository

import com.alarmfm.radio.domain.model.RadioAlarm
import kotlinx.coroutines.flow.Flow

interface RadioAlarmRepository {
    fun getAllAlarms(): Flow<List<RadioAlarm>>
    fun getEnabledAlarms(): Flow<List<RadioAlarm>>
    suspend fun getAlarmById(id: Long): RadioAlarm?
    suspend fun insertAlarm(alarm: RadioAlarm): Long
    suspend fun updateAlarm(alarm: RadioAlarm)
    suspend fun deleteAlarm(alarm: RadioAlarm)
    suspend fun deleteAlarmById(id: Long)
    suspend fun updateAlarmEnabled(id: Long, isEnabled: Boolean)
}
