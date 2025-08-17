package com.alarmfm.radio.domain.repository;

import com.alarmfm.radio.domain.model.RadioAlarm;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\rH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\rH&J\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/alarmfm/radio/domain/repository/RadioAlarmRepository;", "", "deleteAlarm", "", "alarm", "Lcom/alarmfm/radio/domain/model/RadioAlarm;", "(Lcom/alarmfm/radio/domain/model/RadioAlarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlarmById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlarmById", "getAllAlarms", "Lkotlinx/coroutines/flow/Flow;", "", "getEnabledAlarms", "insertAlarm", "updateAlarm", "updateAlarmEnabled", "isEnabled", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RadioAlarmRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioAlarm>> getAllAlarms();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioAlarm>> getEnabledAlarms();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAlarmById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.alarmfm.radio.domain.model.RadioAlarm> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioAlarm alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioAlarm alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioAlarm alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAlarmById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateAlarmEnabled(long id, boolean isEnabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}