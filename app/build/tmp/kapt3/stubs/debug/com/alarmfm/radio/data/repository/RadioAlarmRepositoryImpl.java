package com.alarmfm.radio.data.repository;

import com.alarmfm.radio.data.database.dao.RadioAlarmDao;
import com.alarmfm.radio.domain.model.RadioAlarm;
import com.alarmfm.radio.domain.repository.RadioAlarmRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010H\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/alarmfm/radio/data/repository/RadioAlarmRepositoryImpl;", "Lcom/alarmfm/radio/domain/repository/RadioAlarmRepository;", "radioAlarmDao", "Lcom/alarmfm/radio/data/database/dao/RadioAlarmDao;", "(Lcom/alarmfm/radio/data/database/dao/RadioAlarmDao;)V", "deleteAlarm", "", "alarm", "Lcom/alarmfm/radio/domain/model/RadioAlarm;", "(Lcom/alarmfm/radio/domain/model/RadioAlarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlarmById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlarmById", "getAllAlarms", "Lkotlinx/coroutines/flow/Flow;", "", "getEnabledAlarms", "insertAlarm", "updateAlarm", "updateAlarmEnabled", "isEnabled", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RadioAlarmRepositoryImpl implements com.alarmfm.radio.domain.repository.RadioAlarmRepository {
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.data.database.dao.RadioAlarmDao radioAlarmDao = null;
    
    @javax.inject.Inject
    public RadioAlarmRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.dao.RadioAlarmDao radioAlarmDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioAlarm>> getAllAlarms() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioAlarm>> getEnabledAlarms() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAlarmById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.alarmfm.radio.domain.model.RadioAlarm> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioAlarm alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioAlarm alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteAlarm(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioAlarm alarm, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteAlarmById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateAlarmEnabled(long id, boolean isEnabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}