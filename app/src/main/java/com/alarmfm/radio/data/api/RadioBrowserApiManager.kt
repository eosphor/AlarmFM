package com.alarmfm.radio.data.api

import kotlinx.coroutines.delay
import retrofit2.Retrofit
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RadioBrowserApiManager @Inject constructor(
    private val retrofitBuilder: Retrofit.Builder
) {
    private val serverPool = listOf(
        "https://de1.api.radio-browser.info/json/",
        "https://nl1.api.radio-browser.info/json/",
        "https://us1.api.radio-browser.info/json/",
        "https://fr1.api.radio-browser.info/json/",
        "https://all.api.radio-browser.info/json/"
    )
    
    private var currentServerIndex = 0
    
    suspend fun <T> executeWithFallback(apiCall: suspend (RadioBrowserApi) -> T): T {
        var lastException: Exception? = null
        
        for (i in serverPool.indices) {
            val serverUrl = serverPool[(currentServerIndex + i) % serverPool.size]
            try {
                val api = retrofitBuilder
                    .baseUrl(serverUrl)
                    .build()
                    .create(RadioBrowserApi::class.java)
                
                val result = apiCall(api)
                currentServerIndex = (currentServerIndex + i) % serverPool.size
                return result
            } catch (e: Exception) {
                Timber.w(e, "Failed to connect to server: $serverUrl")
                lastException = e
                if (i < serverPool.size - 1) {
                    delay(1000)
                }
            }
        }
        
        throw lastException ?: Exception("All Radio Browser servers failed")
    }
}
