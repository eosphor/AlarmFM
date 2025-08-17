package com.alarmfm.radio.data.repository;

import com.alarmfm.radio.data.api.RadioBrowserApi;
import com.alarmfm.radio.data.database.dao.FavoriteStationDao;
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao;
import com.alarmfm.radio.domain.model.RadioStation;
import com.alarmfm.radio.domain.repository.RadioStationRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000f\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u0012H\u0016J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u0015H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0010J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u0012H\u0016J&\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u00152\u0006\u0010\u001e\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001f\u0010\u001cJ*\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u00152\u0006\u0010!\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\"\u0010\u001cJ*\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u00152\u0006\u0010$\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b%\u0010\u001cJ\"\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u0015H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\'\u0010\u0010J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001cJ*\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u00152\u0006\u0010-\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b.\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006/"}, d2 = {"Lcom/alarmfm/radio/data/repository/RadioStationRepositoryImpl;", "Lcom/alarmfm/radio/domain/repository/RadioStationRepository;", "api", "Lcom/alarmfm/radio/data/api/RadioBrowserApi;", "favoriteStationDao", "Lcom/alarmfm/radio/data/database/dao/FavoriteStationDao;", "recentlyPlayedStationDao", "Lcom/alarmfm/radio/data/database/dao/RecentlyPlayedStationDao;", "(Lcom/alarmfm/radio/data/api/RadioBrowserApi;Lcom/alarmfm/radio/data/database/dao/FavoriteStationDao;Lcom/alarmfm/radio/data/database/dao/RecentlyPlayedStationDao;)V", "addToFavorites", "", "station", "Lcom/alarmfm/radio/domain/model/RadioStation;", "(Lcom/alarmfm/radio/domain/model/RadioStation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToRecentlyPlayed", "clearOldRecentlyPlayed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteStations", "Lkotlinx/coroutines/flow/Flow;", "", "getPopularStations", "Lkotlin/Result;", "getPopularStations-IoAF18A", "getRecentlyPlayedStations", "getStationByUuid", "uuid", "", "getStationByUuid-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStationsByCountry", "country", "getStationsByCountry-gIAlu-s", "getStationsByLanguage", "language", "getStationsByLanguage-gIAlu-s", "getStationsByTag", "tag", "getStationsByTag-gIAlu-s", "getTopStations", "getTopStations-IoAF18A", "isFavorite", "", "stationId", "removeFromFavorites", "searchStations", "query", "searchStations-gIAlu-s", "app_debug"})
public final class RadioStationRepositoryImpl implements com.alarmfm.radio.domain.repository.RadioStationRepository {
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.data.api.RadioBrowserApi api = null;
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.data.database.dao.FavoriteStationDao favoriteStationDao = null;
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao recentlyPlayedStationDao = null;
    
    @javax.inject.Inject
    public RadioStationRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.api.RadioBrowserApi api, @org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.dao.FavoriteStationDao favoriteStationDao, @org.jetbrains.annotations.NotNull
    com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao recentlyPlayedStationDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> getFavoriteStations() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addToFavorites(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object removeFromFavorites(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull
    java.lang.String stationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> getRecentlyPlayedStations() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addToRecentlyPlayed(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object clearOldRecentlyPlayed(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}