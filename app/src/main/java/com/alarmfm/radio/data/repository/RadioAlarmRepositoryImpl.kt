package com.alarmfm.radio.data.repository

import com.alarmfm.radio.data.database.dao.RadioAlarmDao
import com.alarmfm.radio.data.database.entity.toRadioAlarmEntity
import com.alarmfm.radio.domain.model.RadioAlarm
import com.alarmfm.radio.domain.repository.RadioAlarmRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RadioAlarmRepositoryImpl @Inject constructor(
    private val radioAlarmDao: RadioAlarmDao
) : RadioAlarmRepository {
    
    override fun getAllAlarms(): Flow<List<RadioAlarm>> {
        return radioAlarmDao.getAllAlarms().map { entities ->
            entities.map { it.toRadioAlarm() }
        }
    }
    
    override fun getEnabledAlarms(): Flow<List<RadioAlarm>> {
        return radioAlarmDao.getEnabledAlarms().map { entities ->
            entities.map { it.toRadioAlarm() }
        }
    }
    
    override suspend fun getAlarmById(id: Long): RadioAlarm? {
        return radioAlarmDao.getAlarmById(id)?.toRadioAlarm()
    }
    
    override suspend fun insertAlarm(alarm: RadioAlarm): Long {
        return radioAlarmDao.insertAlarm(alarm.toRadioAlarmEntity())
    }
    
    override suspend fun updateAlarm(alarm: RadioAlarm) {
        radioAlarmDao.updateAlarm(alarm.toRadioAlarmEntity())
    }
    
    override suspend fun deleteAlarm(alarm: RadioAlarm) {
        radioAlarmDao.deleteAlarm(alarm.toRadioAlarmEntity())
    }
    
    override suspend fun deleteAlarmById(id: Long) {
        radioAlarmDao.deleteAlarmById(id)
    }
    
    override suspend fun updateAlarmEnabled(id: Long, isEnabled: Boolean) {
        radioAlarmDao.updateAlarmEnabled(id, isEnabled)
    }
}
