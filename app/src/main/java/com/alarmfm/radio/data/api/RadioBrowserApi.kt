package com.alarmfm.radio.data.api

import com.alarmfm.radio.data.model.CountryDto
import com.alarmfm.radio.data.model.LanguageDto
import com.alarmfm.radio.data.model.StationDto
import com.alarmfm.radio.data.model.TagDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RadioBrowserApi {
    
    @GET("json/stations/topvote")
    suspend fun getTopStations(
        @Query("limit") limit: Int = 100
    ): List<StationDto>
    
    @GET("json/stations/topclick")
    suspend fun getPopularStations(
        @Query("limit") limit: Int = 100
    ): List<StationDto>
    
    @GET("json/stations/search")
    suspend fun searchStations(
        @Query("name") name: String? = null,
        @Query("tag") tag: String? = null,
        @Query("country") country: String? = null,
        @Query("language") language: String? = null,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ): List<StationDto>
    
    @GET("json/stations/byuuid/{uuid}")
    suspend fun getStationByUuid(
        @Path("uuid") uuid: String
    ): List<StationDto>
    
    @GET("json/countries")
    suspend fun getCountries(): List<CountryDto>
    
    @GET("json/languages")
    suspend fun getLanguages(): List<LanguageDto>
    
    @GET("json/tags")
    suspend fun getTags(
        @Query("limit") limit: Int = 100
    ): List<TagDto>
    
    @GET("json/stations/bytag/{tag}")
    suspend fun getStationsByTag(
        @Path("tag") tag: String,
        @Query("limit") limit: Int = 100
    ): List<StationDto>
    
    @GET("json/stations/bycountry/{country}")
    suspend fun getStationsByCountry(
        @Path("country") country: String,
        @Query("limit") limit: Int = 100
    ): List<StationDto>
    
    @GET("json/stations/bylanguage/{language}")
    suspend fun getStationsByLanguage(
        @Path("language") language: String,
        @Query("limit") limit: Int = 100
    ): List<StationDto>
}
