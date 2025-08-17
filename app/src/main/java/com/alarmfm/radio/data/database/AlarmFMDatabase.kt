package com.alarmfm.radio.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.alarmfm.radio.data.database.dao.FavoriteStationDao
import com.alarmfm.radio.data.database.dao.RadioAlarmDao
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao
import com.alarmfm.radio.data.database.entity.FavoriteStationEntity
import com.alarmfm.radio.data.database.entity.RadioAlarmEntity
import com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity
import com.alarmfm.radio.data.database.entity.IntListConverter

@Database(
    entities = [
        FavoriteStationEntity::class,
        RadioAlarmEntity::class,
        RecentlyPlayedStationEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(IntListConverter::class)
abstract class AlarmFMDatabase : RoomDatabase() {
    
    abstract fun favoriteStationDao(): FavoriteStationDao
    abstract fun radioAlarmDao(): RadioAlarmDao
    abstract fun recentlyPlayedStationDao(): RecentlyPlayedStationDao
    
    companion object {
        const val DATABASE_NAME = "alarmfm_database"
        
        @Volatile
        private var INSTANCE: AlarmFMDatabase? = null
        
        fun getDatabase(context: Context): AlarmFMDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AlarmFMDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
