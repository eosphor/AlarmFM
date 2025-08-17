package com.alarmfm.radio.data.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import com.alarmfm.radio.domain.model.RadioAlarm;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/alarmfm/radio/data/database/entity/IntListConverter;", "", "()V", "fromIntList", "", "value", "", "", "toIntList", "app_release"})
public final class IntListConverter {
    
    public IntListConverter() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fromIntList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> toIntList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
}