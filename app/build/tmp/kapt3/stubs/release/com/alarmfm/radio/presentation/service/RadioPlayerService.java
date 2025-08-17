package com.alarmfm.radio.presentation.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.alarmfm.radio.R;
import com.alarmfm.radio.domain.model.RadioStation;
import com.alarmfm.radio.presentation.MainActivity;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.flow.StateFlow;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\"\u0010\"\u001a\u00020#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016J\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0016J\u0006\u0010*\u001a\u00020\u0016J\b\u0010+\u001a\u00020\u0016H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006."}, d2 = {"Lcom/alarmfm/radio/presentation/service/RadioPlayerService;", "Landroid/app/Service;", "()V", "_currentStationFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/alarmfm/radio/domain/model/RadioStation;", "_isPlaying", "", "binder", "Lcom/alarmfm/radio/presentation/service/RadioPlayerService$RadioPlayerBinder;", "currentStation", "currentStationFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStationFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "isPlaying", "createEmptyNotification", "Landroid/app/Notification;", "createNotification", "createNotificationChannel", "", "createPendingIntent", "Landroid/app/PendingIntent;", "action", "", "initializePlayer", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "pausePlayback", "playStation", "station", "resumePlayback", "stopPlayback", "updateNotification", "Companion", "RadioPlayerBinder", "app_release"})
public final class RadioPlayerService extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.presentation.service.RadioPlayerService.RadioPlayerBinder binder = null;
    @org.jetbrains.annotations.Nullable
    private androidx.media3.exoplayer.ExoPlayer exoPlayer;
    @org.jetbrains.annotations.Nullable
    private com.alarmfm.radio.domain.model.RadioStation currentStation;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isPlaying = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPlaying = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alarmfm.radio.domain.model.RadioStation> _currentStationFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.alarmfm.radio.domain.model.RadioStation> currentStationFlow = null;
    private static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHANNEL_ID = "radio_player_channel";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_PLAY = "ACTION_PLAY";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_PAUSE = "ACTION_PAUSE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_STOP = "ACTION_STOP";
    @org.jetbrains.annotations.NotNull
    public static final com.alarmfm.radio.presentation.service.RadioPlayerService.Companion Companion = null;
    
    public RadioPlayerService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPlaying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.alarmfm.radio.domain.model.RadioStation> getCurrentStationFlow() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void initializePlayer() {
    }
    
    public final void playStation(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station) {
    }
    
    public final void pausePlayback() {
    }
    
    public final void resumePlayback() {
    }
    
    public final void stopPlayback() {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    private final android.app.Notification createEmptyNotification() {
        return null;
    }
    
    private final android.app.PendingIntent createPendingIntent(java.lang.String action) {
        return null;
    }
    
    private final void updateNotification() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/alarmfm/radio/presentation/service/RadioPlayerService$Companion;", "", "()V", "ACTION_PAUSE", "", "ACTION_PLAY", "ACTION_STOP", "CHANNEL_ID", "NOTIFICATION_ID", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/alarmfm/radio/presentation/service/RadioPlayerService$RadioPlayerBinder;", "Landroid/os/Binder;", "(Lcom/alarmfm/radio/presentation/service/RadioPlayerService;)V", "getService", "Lcom/alarmfm/radio/presentation/service/RadioPlayerService;", "app_release"})
    public final class RadioPlayerBinder extends android.os.Binder {
        
        public RadioPlayerBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.alarmfm.radio.presentation.service.RadioPlayerService getService() {
            return null;
        }
    }
}