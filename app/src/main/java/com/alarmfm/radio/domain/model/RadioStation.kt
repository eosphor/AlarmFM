package com.alarmfm.radio.domain.model

data class RadioStation(
    val id: String,
    val name: String,
    val url: String,
    val favicon: String?,
    val tags: List<String>,
    val country: String?,
    val language: String?,
    val bitrate: Int,
    val codec: String,
    val isPlaying: Boolean = false,
    val isFavorite: Boolean = false
)
