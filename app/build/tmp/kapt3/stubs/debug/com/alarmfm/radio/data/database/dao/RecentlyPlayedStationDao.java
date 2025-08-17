package com.alarmfm.radio.data.database.dao;

import androidx.room.*;
import com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\'J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/alarmfm/radio/data/database/dao/RecentlyPlayedStationDao;", "", "deleteOldEntries", "", "timestamp", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecentlyPlayed", "stationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentlyPlayedCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentlyPlayedStations", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/alarmfm/radio/data/database/entity/RecentlyPlayedStationEntity;", "insertRecentlyPlayed", "station", "(Lcom/alarmfm/radio/data/database/entity/RecentlyPlayedStationEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface RecentlyPlayedStationDao {
    
    @androidx.room.Query(value = "SELECT * FROM recently_played_stations ORDER BY lastPlayedAt DESC LIMIT 50")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity>> getRecentlyPlayedStations();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertRecentlyPlayed(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM recently_played_stations WHERE stationId = :stationId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteRecentlyPlayed(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM recently_played_stations WHERE lastPlayedAt < :timestamp")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteOldEntries(long timestamp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM recently_played_stations")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecentlyPlayedCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}