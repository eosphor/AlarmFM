package com.alarmfm.radio.domain.repository;

import com.alarmfm.radio.domain.model.RadioStation;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH&J\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000eH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000f\u0010\tJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH&J&\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0015J*\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000e2\u0006\u0010\u001a\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001b\u0010\u0015J*\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000e2\u0006\u0010\u001d\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001e\u0010\u0015J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000eH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b \u0010\tJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0015J*\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000e2\u0006\u0010&\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\'\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006("}, d2 = {"Lcom/alarmfm/radio/domain/repository/RadioStationRepository;", "", "addToFavorites", "", "station", "Lcom/alarmfm/radio/domain/model/RadioStation;", "(Lcom/alarmfm/radio/domain/model/RadioStation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToRecentlyPlayed", "clearOldRecentlyPlayed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteStations", "Lkotlinx/coroutines/flow/Flow;", "", "getPopularStations", "Lkotlin/Result;", "getPopularStations-IoAF18A", "getRecentlyPlayedStations", "getStationByUuid", "uuid", "", "getStationByUuid-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStationsByCountry", "country", "getStationsByCountry-gIAlu-s", "getStationsByLanguage", "language", "getStationsByLanguage-gIAlu-s", "getStationsByTag", "tag", "getStationsByTag-gIAlu-s", "getTopStations", "getTopStations-IoAF18A", "isFavorite", "", "stationId", "removeFromFavorites", "searchStations", "query", "searchStations-gIAlu-s", "app_debug"})
public abstract interface RadioStationRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> getFavoriteStations();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToFavorites(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeFromFavorites(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> getRecentlyPlayedStations();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToRecentlyPlayed(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearOldRecentlyPlayed(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}