package com.alarmfm.radio.domain.model

data class RadioAlarm(
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
)
