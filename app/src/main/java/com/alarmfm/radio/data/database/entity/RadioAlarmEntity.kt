package com.alarmfm.radio.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.alarmfm.radio.domain.model.RadioAlarm

@Entity(tableName = "radio_alarms")
@TypeConverters(IntListConverter::class)
data class RadioAlarmEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val stationId: String,
    val stationName: String,
    val stationUrl: String,
    val stationFavicon: String?,
    val timeHour: Int,
    val timeMinute: Int,
    val isEnabled: Boolean,
    val repeatDays: List<Int>,
    val volume: Int,
    val isVibrationEnabled: Boolean,
    val label: String?,
    val createdAt: Long,
    val updatedAt: Long
) {
    fun toRadioAlarm(): RadioAlarm {
        return RadioAlarm(
            id = id,
            stationId = stationId,
            stationName = stationName,
            stationUrl = stationUrl,
            stationFavicon = stationFavicon,
            timeHour = timeHour,
            timeMinute = timeMinute,
            isEnabled = isEnabled,
            repeatDays = repeatDays,
            volume = volume,
            isVibrationEnabled = isVibrationEnabled,
            label = label,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
}

fun RadioAlarm.toRadioAlarmEntity(): RadioAlarmEntity {
    return RadioAlarmEntity(
        id = id,
        stationId = stationId,
        stationName = stationName,
        stationUrl = stationUrl,
        stationFavicon = stationFavicon,
        timeHour = timeHour,
        timeMinute = timeMinute,
        isEnabled = isEnabled,
        repeatDays = repeatDays,
        volume = volume,
        isVibrationEnabled = isVibrationEnabled,
        label = label,
        createdAt = createdAt,
        updatedAt = updatedAt
    )
}

class IntListConverter {
    @TypeConverter
    fun fromIntList(value: List<Int>): String {
        return value.joinToString(",")
    }

    @TypeConverter
    fun toIntList(value: String): List<Int> {
        return if (value.isEmpty()) {
            emptyList()
        } else {
            value.split(",").map { it.toInt() }
        }
    }
}
