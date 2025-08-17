package com.alarmfm.radio.data.api;

import com.alarmfm.radio.data.model.CountryDto;
import com.alarmfm.radio.data.model.LanguageDto;
import com.alarmfm.radio.data.model.StationDto;
import com.alarmfm.radio.data.model.TagDto;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0013J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJX\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u001d\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/alarmfm/radio/data/api/RadioBrowserApi;", "", "getCountries", "", "Lcom/alarmfm/radio/data/model/CountryDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLanguages", "Lcom/alarmfm/radio/data/model/LanguageDto;", "getPopularStations", "Lcom/alarmfm/radio/data/model/StationDto;", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStationByUuid", "uuid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStationsByCountry", "country", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStationsByLanguage", "language", "getStationsByTag", "tag", "getTags", "Lcom/alarmfm/radio/data/model/TagDto;", "getTopStations", "searchStations", "name", "offset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface RadioBrowserApi {
    
    @retrofit2.http.GET(value = "json/stations/topvote")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTopStations(@retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @retrofit2.http.GET(value = "json/stations/topclick")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPopularStations(@retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @retrofit2.http.GET(value = "json/stations/search")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchStations(@retrofit2.http.Query(value = "name")
    @org.jetbrains.annotations.Nullable
    java.lang.String name, @retrofit2.http.Query(value = "tag")
    @org.jetbrains.annotations.Nullable
    java.lang.String tag, @retrofit2.http.Query(value = "country")
    @org.jetbrains.annotations.Nullable
    java.lang.String country, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.Nullable
    java.lang.String language, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @retrofit2.http.GET(value = "json/stations/byuuid/{uuid}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStationByUuid(@retrofit2.http.Path(value = "uuid")
    @org.jetbrains.annotations.NotNull
    java.lang.String uuid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @retrofit2.http.GET(value = "json/countries")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCountries(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.CountryDto>> $completion);
    
    @retrofit2.http.GET(value = "json/languages")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLanguages(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.LanguageDto>> $completion);
    
    @retrofit2.http.GET(value = "json/tags")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTags(@retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.TagDto>> $completion);
    
    @retrofit2.http.GET(value = "json/stations/bytag/{tag}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStationsByTag(@retrofit2.http.Path(value = "tag")
    @org.jetbrains.annotations.NotNull
    java.lang.String tag, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @retrofit2.http.GET(value = "json/stations/bycountry/{country}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStationsByCountry(@retrofit2.http.Path(value = "country")
    @org.jetbrains.annotations.NotNull
    java.lang.String country, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @retrofit2.http.GET(value = "json/stations/bylanguage/{language}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStationsByLanguage(@retrofit2.http.Path(value = "language")
    @org.jetbrains.annotations.NotNull
    java.lang.String language, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.alarmfm.radio.data.model.StationDto>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}