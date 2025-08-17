package com.alarmfm.radio.di

import com.alarmfm.radio.data.repository.RadioAlarmRepositoryImpl
import com.alarmfm.radio.data.repository.RadioStationRepositoryImpl
import com.alarmfm.radio.domain.repository.RadioAlarmRepository
import com.alarmfm.radio.domain.repository.RadioStationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    
    @Binds
    @Singleton
    abstract fun bindRadioStationRepository(
        radioStationRepositoryImpl: RadioStationRepositoryImpl
    ): RadioStationRepository
    
    @Binds
    @Singleton
    abstract fun bindRadioAlarmRepository(
        radioAlarmRepositoryImpl: RadioAlarmRepositoryImpl
    ): RadioAlarmRepository
}
