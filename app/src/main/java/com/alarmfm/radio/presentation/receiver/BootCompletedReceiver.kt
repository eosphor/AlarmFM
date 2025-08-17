package com.alarmfm.radio.presentation.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.alarmfm.radio.domain.repository.RadioAlarmRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class BootCompletedReceiver : BroadcastReceiver() {

    @Inject
    lateinit var alarmRepository: RadioAlarmRepository

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED ||
            intent.action == Intent.ACTION_MY_PACKAGE_REPLACED ||
            intent.action == Intent.ACTION_PACKAGE_REPLACED) {
            
            Log.d("BootCompletedReceiver", "Device boot completed, rescheduling alarms")
            
            val pendingResult = goAsync()
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    alarmRepository.getAllAlarms().collect { alarms ->
                        alarms.filter { it.isEnabled }.forEach { alarm ->
                            Log.d("BootCompletedReceiver", "Rescheduling alarm: ${alarm.id}")
                        }
                    }
                } catch (e: Exception) {
                    Log.e("BootCompletedReceiver", "Error rescheduling alarms", e)
                } finally {
                    pendingResult.finish()
                }
            }
        }
    }
}
