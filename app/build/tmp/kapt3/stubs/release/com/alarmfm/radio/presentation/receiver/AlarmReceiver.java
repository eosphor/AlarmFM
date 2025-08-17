package com.alarmfm.radio.presentation.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.alarmfm.radio.domain.model.RadioStation;
import com.alarmfm.radio.presentation.service.RadioPlayerService;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/alarmfm/radio/presentation/receiver/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_release"})
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATION_UUID = "station_uuid";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATION_NAME = "station_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATION_URL = "station_url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATION_COUNTRY = "station_country";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATION_LANGUAGE = "station_language";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATION_TAGS = "station_tags";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_ALARM_ID = "alarm_id";
    @org.jetbrains.annotations.NotNull
    public static final com.alarmfm.radio.presentation.receiver.AlarmReceiver.Companion Companion = null;
    
    public AlarmReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/alarmfm/radio/presentation/receiver/AlarmReceiver$Companion;", "", "()V", "EXTRA_ALARM_ID", "", "EXTRA_STATION_COUNTRY", "EXTRA_STATION_LANGUAGE", "EXTRA_STATION_NAME", "EXTRA_STATION_TAGS", "EXTRA_STATION_URL", "EXTRA_STATION_UUID", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}