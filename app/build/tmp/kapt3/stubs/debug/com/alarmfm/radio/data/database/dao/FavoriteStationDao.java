package com.alarmfm.radio.data.database.dao;

import androidx.room.*;
import com.alarmfm.radio.data.database.entity.FavoriteStationEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/alarmfm/radio/data/database/dao/FavoriteStationDao;", "", "deleteFavorite", "", "station", "Lcom/alarmfm/radio/data/database/entity/FavoriteStationEntity;", "(Lcom/alarmfm/radio/data/database/entity/FavoriteStationEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteById", "stationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavorites", "Lkotlinx/coroutines/flow/Flow;", "", "getFavoriteById", "getFavoritesCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavorite", "isFavorite", "", "app_debug"})
@androidx.room.Dao
public abstract interface FavoriteStationDao {
    
    @androidx.room.Query(value = "SELECT * FROM favorite_stations ORDER BY addedAt DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.data.database.entity.FavoriteStationEntity>> getAllFavorites();
    
    @androidx.room.Query(value = "SELECT * FROM favorite_stations WHERE stationId = :stationId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFavoriteById(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.alarmfm.radio.data.database.entity.FavoriteStationEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertFavorite(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.entity.FavoriteStationEntity station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.entity.FavoriteStationEntity station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM favorite_stations WHERE stationId = :stationId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteFavoriteById(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT EXISTS(SELECT 1 FROM favorite_stations WHERE stationId = :stationId)")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM favorite_stations")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFavoritesCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}