package com.alarmfm.radio.presentation.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import com.alarmfm.radio.domain.model.RadioStation
import com.alarmfm.radio.presentation.service.RadioPlayerService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlarmReceiver : BroadcastReceiver() {

    companion object {
        const val EXTRA_STATION_UUID = "station_uuid"
        const val EXTRA_STATION_NAME = "station_name"
        const val EXTRA_STATION_URL = "station_url"
        const val EXTRA_STATION_COUNTRY = "station_country"
        const val EXTRA_STATION_LANGUAGE = "station_language"
        const val EXTRA_STATION_TAGS = "station_tags"
        const val EXTRA_ALARM_ID = "alarm_id"
    }

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("AlarmReceiver", "Alarm triggered")

        val stationUuid = intent.getStringExtra(EXTRA_STATION_UUID) ?: return
        val stationName = intent.getStringExtra(EXTRA_STATION_NAME) ?: return
        val stationUrl = intent.getStringExtra(EXTRA_STATION_URL) ?: return
        val stationCountry = intent.getStringExtra(EXTRA_STATION_COUNTRY) ?: ""
        val stationLanguage = intent.getStringExtra(EXTRA_STATION_LANGUAGE) ?: ""
        val stationTags = intent.getStringExtra(EXTRA_STATION_TAGS) ?: ""
        val alarmId = intent.getLongExtra(EXTRA_ALARM_ID, -1)

        val station = RadioStation(
            id = stationUuid,
            name = stationName,
            url = stationUrl,
            favicon = "",
            country = stationCountry,
            language = stationLanguage,
            tags = listOf(stationTags),
            bitrate = 0,
            codec = "",
            isFavorite = false
        )

        val serviceIntent = Intent(context, RadioPlayerService::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startForegroundService(serviceIntent)
        } else {
            context.startService(serviceIntent)
        }

        Log.d("AlarmReceiver", "Starting radio playback for alarm $alarmId with station: ${station.name}")
    }
}
