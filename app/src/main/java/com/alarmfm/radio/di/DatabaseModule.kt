package com.alarmfm.radio.di

import android.content.Context
import androidx.room.Room
import com.alarmfm.radio.data.database.AlarmFMDatabase
import com.alarmfm.radio.data.database.dao.FavoriteStationDao
import com.alarmfm.radio.data.database.dao.RadioAlarmDao
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    
    @Provides
    @Singleton
    fun provideAlarmFMDatabase(@ApplicationContext context: Context): AlarmFMDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AlarmFMDatabase::class.java,
            AlarmFMDatabase.DATABASE_NAME
        ).build()
    }
    
    @Provides
    fun provideFavoriteStationDao(database: AlarmFMDatabase): FavoriteStationDao {
        return database.favoriteStationDao()
    }
    
    @Provides
    fun provideRadioAlarmDao(database: AlarmFMDatabase): RadioAlarmDao {
        return database.radioAlarmDao()
    }
    
    @Provides
    fun provideRecentlyPlayedStationDao(database: AlarmFMDatabase): RecentlyPlayedStationDao {
        return database.recentlyPlayedStationDao()
    }
}
