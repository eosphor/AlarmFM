package com.alarmfm.radio.data.database.dao;

import androidx.room.*;
import com.alarmfm.radio.data.database.entity.RadioAlarmEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u0010H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u0010H\'J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/alarmfm/radio/data/database/dao/RadioAlarmDao;", "", "deleteAlarm", "", "alarm", "Lcom/alarmfm/radio/data/database/entity/RadioAlarmEntity;", "(Lcom/alarmfm/radio/data/database/entity/RadioAlarmEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlarmById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlarmById", "getAlarmsCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAlarms", "Lkotlinx/coroutines/flow/Flow;", "", "getEnabledAlarms", "insertAlarm", "updateAlarm", "updateAlarmEnabled", "isEnabled", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@androidx.room.Dao
public abstract interface RadioAlarmDao {
    
    @androidx.room.Query(value = "SELECT * FROM radio_alarms ORDER BY timeHour, timeMinute")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.data.database.entity.RadioAlarmEntity>> getAllAlarms();
    
    @androidx.room.Query(value = "SELECT * FROM radio_alarms WHERE isEnabled = 1 ORDER BY timeHour, timeMinute")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.data.database.entity.RadioAlarmEntity>> getEnabledAlarms();
    
    @androidx.room.Query(value = "SELECT * FROM radio_alarms WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAlarmById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.alarmfm.radio.data.database.entity.RadioAlarmEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.entity.RadioAlarmEntity alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.entity.RadioAlarmEntity alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.entity.RadioAlarmEntity alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM radio_alarms WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAlarmById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE radio_alarms SET isEnabled = :isEnabled WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateAlarmEnabled(long id, boolean isEnabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM radio_alarms")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAlarmsCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}