package com.alarmfm.radio.data.model;

import com.alarmfm.radio.domain.model.RadioStation;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00df\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u000fH\u00c6\u0003J\t\u00107\u001a\u00020\u0013H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u000fH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u000fH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00e3\u0001\u0010E\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\u0018\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010F\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u000fH\u00d6\u0001J\u0006\u0010I\u001a\u00020JJ\t\u0010K\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b\u00a8\u0006L"}, d2 = {"Lcom/alarmfm/radio/data/model/StationDto;", "", "changeuuid", "", "stationuuid", "name", "url", "urlResolved", "homepage", "favicon", "tags", "country", "countrycode", "language", "votes", "", "codec", "bitrate", "lastcheckok", "", "lastchecktime", "lastcheckoktime", "clicktimestamp", "clickcount", "clicktrend", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getBitrate", "()I", "getChangeuuid", "()Ljava/lang/String;", "getClickcount", "getClicktimestamp", "getClicktrend", "getCodec", "getCountry", "getCountrycode", "getFavicon", "getHomepage", "getLanguage", "getLastcheckok", "()Z", "getLastcheckoktime", "getLastchecktime", "getName", "getStationuuid", "getTags", "getUrl", "getUrlResolved", "getVotes", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toRadioStation", "Lcom/alarmfm/radio/domain/model/RadioStation;", "toString", "app_debug"})
public final class StationDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String changeuuid = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String stationuuid = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String urlResolved = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String homepage = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String favicon = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String countrycode = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String language = null;
    private final int votes = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String codec = null;
    private final int bitrate = 0;
    private final boolean lastcheckok = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastchecktime = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastcheckoktime = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String clicktimestamp = null;
    private final int clickcount = 0;
    private final int clicktrend = 0;
    
    public StationDto(@com.squareup.moshi.Json(name = "changeuuid")
    @org.jetbrains.annotations.NotNull
    java.lang.String changeuuid, @com.squareup.moshi.Json(name = "stationuuid")
    @org.jetbrains.annotations.NotNull
    java.lang.String stationuuid, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @com.squareup.moshi.Json(name = "url")
    @org.jetbrains.annotations.NotNull
    java.lang.String url, @com.squareup.moshi.Json(name = "url_resolved")
    @org.jetbrains.annotations.NotNull
    java.lang.String urlResolved, @com.squareup.moshi.Json(name = "homepage")
    @org.jetbrains.annotations.Nullable
    java.lang.String homepage, @com.squareup.moshi.Json(name = "favicon")
    @org.jetbrains.annotations.Nullable
    java.lang.String favicon, @com.squareup.moshi.Json(name = "tags")
    @org.jetbrains.annotations.Nullable
    java.lang.String tags, @com.squareup.moshi.Json(name = "country")
    @org.jetbrains.annotations.Nullable
    java.lang.String country, @com.squareup.moshi.Json(name = "countrycode")
    @org.jetbrains.annotations.Nullable
    java.lang.String countrycode, @com.squareup.moshi.Json(name = "language")
    @org.jetbrains.annotations.Nullable
    java.lang.String language, @com.squareup.moshi.Json(name = "votes")
    int votes, @com.squareup.moshi.Json(name = "codec")
    @org.jetbrains.annotations.Nullable
    java.lang.String codec, @com.squareup.moshi.Json(name = "bitrate")
    int bitrate, @com.squareup.moshi.Json(name = "lastcheckok")
    boolean lastcheckok, @com.squareup.moshi.Json(name = "lastchecktime")
    @org.jetbrains.annotations.NotNull
    java.lang.String lastchecktime, @com.squareup.moshi.Json(name = "lastcheckoktime")
    @org.jetbrains.annotations.Nullable
    java.lang.String lastcheckoktime, @com.squareup.moshi.Json(name = "clicktimestamp")
    @org.jetbrains.annotations.Nullable
    java.lang.String clicktimestamp, @com.squareup.moshi.Json(name = "clickcount")
    int clickcount, @com.squareup.moshi.Json(name = "clicktrend")
    int clicktrend) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChangeuuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStationuuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrlResolved() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHomepage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFavicon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountrycode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final int getVotes() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCodec() {
        return null;
    }
    
    public final int getBitrate() {
        return 0;
    }
    
    public final boolean getLastcheckok() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastchecktime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastcheckoktime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getClicktimestamp() {
        return null;
    }
    
    public final int getClickcount() {
        return 0;
    }
    
    public final int getClicktrend() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.alarmfm.radio.domain.model.RadioStation toRadioStation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.alarmfm.radio.data.model.StationDto copy(@com.squareup.moshi.Json(name = "changeuuid")
    @org.jetbrains.annotations.NotNull
    java.lang.String changeuuid, @com.squareup.moshi.Json(name = "stationuuid")
    @org.jetbrains.annotations.NotNull
    java.lang.String stationuuid, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @com.squareup.moshi.Json(name = "url")
    @org.jetbrains.annotations.NotNull
    java.lang.String url, @com.squareup.moshi.Json(name = "url_resolved")
    @org.jetbrains.annotations.NotNull
    java.lang.String urlResolved, @com.squareup.moshi.Json(name = "homepage")
    @org.jetbrains.annotations.Nullable
    java.lang.String homepage, @com.squareup.moshi.Json(name = "favicon")
    @org.jetbrains.annotations.Nullable
    java.lang.String favicon, @com.squareup.moshi.Json(name = "tags")
    @org.jetbrains.annotations.Nullable
    java.lang.String tags, @com.squareup.moshi.Json(name = "country")
    @org.jetbrains.annotations.Nullable
    java.lang.String country, @com.squareup.moshi.Json(name = "countrycode")
    @org.jetbrains.annotations.Nullable
    java.lang.String countrycode, @com.squareup.moshi.Json(name = "language")
    @org.jetbrains.annotations.Nullable
    java.lang.String language, @com.squareup.moshi.Json(name = "votes")
    int votes, @com.squareup.moshi.Json(name = "codec")
    @org.jetbrains.annotations.Nullable
    java.lang.String codec, @com.squareup.moshi.Json(name = "bitrate")
    int bitrate, @com.squareup.moshi.Json(name = "lastcheckok")
    boolean lastcheckok, @com.squareup.moshi.Json(name = "lastchecktime")
    @org.jetbrains.annotations.NotNull
    java.lang.String lastchecktime, @com.squareup.moshi.Json(name = "lastcheckoktime")
    @org.jetbrains.annotations.Nullable
    java.lang.String lastcheckoktime, @com.squareup.moshi.Json(name = "clicktimestamp")
    @org.jetbrains.annotations.Nullable
    java.lang.String clicktimestamp, @com.squareup.moshi.Json(name = "clickcount")
    int clickcount, @com.squareup.moshi.Json(name = "clicktrend")
    int clicktrend) {
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