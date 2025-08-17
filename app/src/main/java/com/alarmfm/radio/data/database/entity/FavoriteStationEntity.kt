package com.alarmfm.radio.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alarmfm.radio.domain.model.RadioStation

@Entity(tableName = "favorite_stations")
data class FavoriteStationEntity(
    @PrimaryKey
    val stationId: String,
    val name: String,
    val url: String,
    val favicon: String?,
    val tags: String,
    val country: String?,
    val language: String?,
    val bitrate: Int,
    val codec: String,
    val addedAt: Long
) {
    fun toRadioStation(): RadioStation {
        return RadioStation(
            id = stationId,
            name = name,
            url = url,
            favicon = favicon,
            tags = tags.split(",").map { it.trim() }.filter { it.isNotEmpty() },
            country = country,
            language = language,
            bitrate = bitrate,
            codec = codec,
            isPlaying = false,
            isFavorite = true
        )
    }
}

fun RadioStation.toFavoriteStationEntity(): FavoriteStationEntity {
    return FavoriteStationEntity(
        stationId = id,
        name = name,
        url = url,
        favicon = favicon,
        tags = tags.joinToString(","),
        country = country,
        language = language,
        bitrate = bitrate,
        codec = codec,
        addedAt = System.currentTimeMillis()
    )
}
