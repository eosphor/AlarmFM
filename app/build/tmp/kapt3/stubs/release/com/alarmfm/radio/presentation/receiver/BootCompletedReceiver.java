package com.alarmfm.radio.presentation.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.alarmfm.radio.domain.repository.RadioAlarmRepository;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/alarmfm/radio/presentation/receiver/BootCompletedReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "alarmRepository", "Lcom/alarmfm/radio/domain/repository/RadioAlarmRepository;", "getAlarmRepository", "()Lcom/alarmfm/radio/domain/repository/RadioAlarmRepository;", "setAlarmRepository", "(Lcom/alarmfm/radio/domain/repository/RadioAlarmRepository;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"})
public final class BootCompletedReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject
    public com.alarmfm.radio.domain.repository.RadioAlarmRepository alarmRepository;
    
    public BootCompletedReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.alarmfm.radio.domain.repository.RadioAlarmRepository getAlarmRepository() {
        return null;
    }
    
    public final void setAlarmRepository(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.repository.RadioAlarmRepository p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
}