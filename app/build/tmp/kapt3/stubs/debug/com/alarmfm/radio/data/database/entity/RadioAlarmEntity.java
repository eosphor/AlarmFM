package com.alarmfm.radio.data.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import com.alarmfm.radio.domain.model.RadioAlarm;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\rH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u00c6\u0003J\u009f\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\nH\u00d6\u0001J\u0006\u00109\u001a\u00020:J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#\u00a8\u0006<"}, d2 = {"Lcom/alarmfm/radio/data/database/entity/RadioAlarmEntity;", "", "id", "", "stationId", "", "stationName", "stationUrl", "stationFavicon", "timeHour", "", "timeMinute", "isEnabled", "", "repeatDays", "", "volume", "isVibrationEnabled", "label", "createdAt", "updatedAt", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/util/List;IZLjava/lang/String;JJ)V", "getCreatedAt", "()J", "getId", "()Z", "getLabel", "()Ljava/lang/String;", "getRepeatDays", "()Ljava/util/List;", "getStationFavicon", "getStationId", "getStationName", "getStationUrl", "getTimeHour", "()I", "getTimeMinute", "getUpdatedAt", "getVolume", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toRadioAlarm", "Lcom/alarmfm/radio/domain/model/RadioAlarm;", "toString", "app_debug"})
@androidx.room.Entity(tableName = "radio_alarms")
@androidx.room.TypeConverters(value = {com.alarmfm.radio.data.database.entity.IntListConverter.class})
public final class RadioAlarmEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String stationId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String stationName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String stationUrl = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String stationFavicon = null;
    private final int timeHour = 0;
    private final int timeMinute = 0;
    private final boolean isEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> repeatDays = null;
    private final int volume = 0;
    private final boolean isVibrationEnabled = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String label = null;
    private final long createdAt = 0L;
    private final long updatedAt = 0L;
    
    public RadioAlarmEntity(long id, @org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    java.lang.String stationName, @org.jetbrains.annotations.NotNull
    java.lang.String stationUrl, @org.jetbrains.annotations.Nullable
    java.lang.String stationFavicon, int timeHour, int timeMinute, boolean isEnabled, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> repeatDays, int volume, boolean isVibrationEnabled, @org.jetbrains.annotations.Nullable
    java.lang.String label, long createdAt, long updatedAt) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStationName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStationUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStationFavicon() {
        return null;
    }
    
    public final int getTimeHour() {
        return 0;
    }
    
    public final int getTimeMinute() {
        return 0;
    }
    
    public final boolean isEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getRepeatDays() {
        return null;
    }
    
    public final int getVolume() {
        return 0;
    }
    
    public final boolean isVibrationEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final long getUpdatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.alarmfm.radio.domain.model.RadioAlarm toRadioAlarm() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final boolean component11() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    public final long component13() {
        return 0L;
    }
    
    public final long component14() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.alarmfm.radio.data.database.entity.RadioAlarmEntity copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    java.lang.String stationName, @org.jetbrains.annotations.NotNull
    java.lang.String stationUrl, @org.jetbrains.annotations.Nullable
    java.lang.String stationFavicon, int timeHour, int timeMinute, boolean isEnabled, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> repeatDays, int volume, boolean isVibrationEnabled, @org.jetbrains.annotations.Nullable
    java.lang.String label, long createdAt, long updatedAt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}