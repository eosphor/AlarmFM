package com.alarmfm.radio.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CountryDto(
    @Json(name = "name") val name: String,
    @Json(name = "iso_3166_1") val iso31661: String,
    @Json(name = "stationcount") val stationcount: Int
)
