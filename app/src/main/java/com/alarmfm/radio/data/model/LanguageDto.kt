package com.alarmfm.radio.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LanguageDto(
    @Json(name = "name") val name: String,
    @Json(name = "stationcount") val stationcount: Int
)
