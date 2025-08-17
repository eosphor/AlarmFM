package com.alarmfm.radio.data.model

import com.alarmfm.radio.domain.model.RadioStation
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StationDto(
    @Json(name = "changeuuid") val changeuuid: String,
    @Json(name = "stationuuid") val stationuuid: String,
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String,
    @Json(name = "url_resolved") val urlResolved: String,
    @Json(name = "homepage") val homepage: String?,
    @Json(name = "favicon") val favicon: String?,
    @Json(name = "tags") val tags: String?,
    @Json(name = "country") val country: String?,
    @Json(name = "countrycode") val countrycode: String?,
    @Json(name = "language") val language: String?,
    @Json(name = "votes") val votes: Int,
    @Json(name = "codec") val codec: String?,
    @Json(name = "bitrate") val bitrate: Int,
    @Json(name = "lastcheckok") val lastcheckok: Boolean,
    @Json(name = "lastchecktime") val lastchecktime: String,
    @Json(name = "lastcheckoktime") val lastcheckoktime: String?,
    @Json(name = "clicktimestamp") val clicktimestamp: String?,
    @Json(name = "clickcount") val clickcount: Int,
    @Json(name = "clicktrend") val clicktrend: Int
) {
    fun toRadioStation(): RadioStation {
        return RadioStation(
            id = stationuuid,
            name = name,
            url = urlResolved.ifEmpty { url },
            favicon = favicon,
            tags = tags?.split(",")?.map { it.trim() } ?: emptyList(),
            country = country,
            language = language,
            bitrate = bitrate,
            codec = codec ?: "",
            isPlaying = false,
            isFavorite = false
        )
    }
}
