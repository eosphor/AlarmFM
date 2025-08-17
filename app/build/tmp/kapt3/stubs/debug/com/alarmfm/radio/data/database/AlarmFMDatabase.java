package com.alarmfm.radio.data.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import android.content.Context;
import com.alarmfm.radio.data.database.dao.FavoriteStationDao;
import com.alarmfm.radio.data.database.dao.RadioAlarmDao;
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao;
import com.alarmfm.radio.data.database.entity.FavoriteStationEntity;
import com.alarmfm.radio.data.database.entity.RadioAlarmEntity;
import com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity;
import com.alarmfm.radio.data.database.entity.IntListConverter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/alarmfm/radio/data/database/AlarmFMDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favoriteStationDao", "Lcom/alarmfm/radio/data/database/dao/FavoriteStationDao;", "radioAlarmDao", "Lcom/alarmfm/radio/data/database/dao/RadioAlarmDao;", "recentlyPlayedStationDao", "Lcom/alarmfm/radio/data/database/dao/RecentlyPlayedStationDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.alarmfm.radio.data.database.entity.FavoriteStationEntity.class, com.alarmfm.radio.data.database.entity.RadioAlarmEntity.class, com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.alarmfm.radio.data.database.entity.IntListConverter.class})
public abstract class AlarmFMDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "alarmfm_database";
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.alarmfm.radio.data.database.AlarmFMDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.alarmfm.radio.data.database.AlarmFMDatabase.Companion Companion = null;
    
    public AlarmFMDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.alarmfm.radio.data.database.dao.FavoriteStationDao favoriteStationDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.alarmfm.radio.data.database.dao.RadioAlarmDao radioAlarmDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao recentlyPlayedStationDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/alarmfm/radio/data/database/AlarmFMDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/alarmfm/radio/data/database/AlarmFMDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.alarmfm.radio.data.database.AlarmFMDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}