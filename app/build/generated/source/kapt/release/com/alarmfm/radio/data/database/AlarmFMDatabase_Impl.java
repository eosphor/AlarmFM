package com.alarmfm.radio.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.alarmfm.radio.data.database.dao.FavoriteStationDao;
import com.alarmfm.radio.data.database.dao.FavoriteStationDao_Impl;
import com.alarmfm.radio.data.database.dao.RadioAlarmDao;
import com.alarmfm.radio.data.database.dao.RadioAlarmDao_Impl;
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao;
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AlarmFMDatabase_Impl extends AlarmFMDatabase {
  private volatile FavoriteStationDao _favoriteStationDao;

  private volatile RadioAlarmDao _radioAlarmDao;

  private volatile RecentlyPlayedStationDao _recentlyPlayedStationDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_stations` (`stationId` TEXT NOT NULL, `name` TEXT NOT NULL, `url` TEXT NOT NULL, `favicon` TEXT, `tags` TEXT NOT NULL, `country` TEXT, `language` TEXT, `bitrate` INTEGER NOT NULL, `codec` TEXT NOT NULL, `addedAt` INTEGER NOT NULL, PRIMARY KEY(`stationId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `radio_alarms` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `stationId` TEXT NOT NULL, `stationName` TEXT NOT NULL, `stationUrl` TEXT NOT NULL, `stationFavicon` TEXT, `timeHour` INTEGER NOT NULL, `timeMinute` INTEGER NOT NULL, `isEnabled` INTEGER NOT NULL, `repeatDays` TEXT NOT NULL, `volume` INTEGER NOT NULL, `isVibrationEnabled` INTEGER NOT NULL, `label` TEXT, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `recently_played_stations` (`stationId` TEXT NOT NULL, `name` TEXT NOT NULL, `url` TEXT NOT NULL, `favicon` TEXT, `tags` TEXT NOT NULL, `country` TEXT, `language` TEXT, `bitrate` INTEGER NOT NULL, `codec` TEXT NOT NULL, `lastPlayedAt` INTEGER NOT NULL, PRIMARY KEY(`stationId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a2b2d417872a06a25fb5465ca5adc072')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `favorite_stations`");
        db.execSQL("DROP TABLE IF EXISTS `radio_alarms`");
        db.execSQL("DROP TABLE IF EXISTS `recently_played_stations`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsFavoriteStations = new HashMap<String, TableInfo.Column>(10);
        _columnsFavoriteStations.put("stationId", new TableInfo.Column("stationId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("favicon", new TableInfo.Column("favicon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("language", new TableInfo.Column("language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("bitrate", new TableInfo.Column("bitrate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("codec", new TableInfo.Column("codec", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteStations.put("addedAt", new TableInfo.Column("addedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteStations = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteStations = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteStations = new TableInfo("favorite_stations", _columnsFavoriteStations, _foreignKeysFavoriteStations, _indicesFavoriteStations);
        final TableInfo _existingFavoriteStations = TableInfo.read(db, "favorite_stations");
        if (!_infoFavoriteStations.equals(_existingFavoriteStations)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_stations(com.alarmfm.radio.data.database.entity.FavoriteStationEntity).\n"
                  + " Expected:\n" + _infoFavoriteStations + "\n"
                  + " Found:\n" + _existingFavoriteStations);
        }
        final HashMap<String, TableInfo.Column> _columnsRadioAlarms = new HashMap<String, TableInfo.Column>(14);
        _columnsRadioAlarms.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("stationId", new TableInfo.Column("stationId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("stationName", new TableInfo.Column("stationName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("stationUrl", new TableInfo.Column("stationUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("stationFavicon", new TableInfo.Column("stationFavicon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("timeHour", new TableInfo.Column("timeHour", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("timeMinute", new TableInfo.Column("timeMinute", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("isEnabled", new TableInfo.Column("isEnabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("repeatDays", new TableInfo.Column("repeatDays", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("volume", new TableInfo.Column("volume", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("isVibrationEnabled", new TableInfo.Column("isVibrationEnabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("label", new TableInfo.Column("label", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRadioAlarms.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRadioAlarms = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRadioAlarms = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRadioAlarms = new TableInfo("radio_alarms", _columnsRadioAlarms, _foreignKeysRadioAlarms, _indicesRadioAlarms);
        final TableInfo _existingRadioAlarms = TableInfo.read(db, "radio_alarms");
        if (!_infoRadioAlarms.equals(_existingRadioAlarms)) {
          return new RoomOpenHelper.ValidationResult(false, "radio_alarms(com.alarmfm.radio.data.database.entity.RadioAlarmEntity).\n"
                  + " Expected:\n" + _infoRadioAlarms + "\n"
                  + " Found:\n" + _existingRadioAlarms);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentlyPlayedStations = new HashMap<String, TableInfo.Column>(10);
        _columnsRecentlyPlayedStations.put("stationId", new TableInfo.Column("stationId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("favicon", new TableInfo.Column("favicon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("language", new TableInfo.Column("language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("bitrate", new TableInfo.Column("bitrate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("codec", new TableInfo.Column("codec", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyPlayedStations.put("lastPlayedAt", new TableInfo.Column("lastPlayedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentlyPlayedStations = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentlyPlayedStations = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecentlyPlayedStations = new TableInfo("recently_played_stations", _columnsRecentlyPlayedStations, _foreignKeysRecentlyPlayedStations, _indicesRecentlyPlayedStations);
        final TableInfo _existingRecentlyPlayedStations = TableInfo.read(db, "recently_played_stations");
        if (!_infoRecentlyPlayedStations.equals(_existingRecentlyPlayedStations)) {
          return new RoomOpenHelper.ValidationResult(false, "recently_played_stations(com.alarmfm.radio.data.database.entity.RecentlyPlayedStationEntity).\n"
                  + " Expected:\n" + _infoRecentlyPlayedStations + "\n"
                  + " Found:\n" + _existingRecentlyPlayedStations);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a2b2d417872a06a25fb5465ca5adc072", "4761c9d2bc9519eb8c7ef91df0511c07");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite_stations","radio_alarms","recently_played_stations");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorite_stations`");
      _db.execSQL("DELETE FROM `radio_alarms`");
      _db.execSQL("DELETE FROM `recently_played_stations`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FavoriteStationDao.class, FavoriteStationDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RadioAlarmDao.class, RadioAlarmDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RecentlyPlayedStationDao.class, RecentlyPlayedStationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public FavoriteStationDao favoriteStationDao() {
    if (_favoriteStationDao != null) {
      return _favoriteStationDao;
    } else {
      synchronized(this) {
        if(_favoriteStationDao == null) {
          _favoriteStationDao = new FavoriteStationDao_Impl(this);
        }
        return _favoriteStationDao;
      }
    }
  }

  @Override
  public RadioAlarmDao radioAlarmDao() {
    if (_radioAlarmDao != null) {
      return _radioAlarmDao;
    } else {
      synchronized(this) {
        if(_radioAlarmDao == null) {
          _radioAlarmDao = new RadioAlarmDao_Impl(this);
        }
        return _radioAlarmDao;
      }
    }
  }

  @Override
  public RecentlyPlayedStationDao recentlyPlayedStationDao() {
    if (_recentlyPlayedStationDao != null) {
      return _recentlyPlayedStationDao;
    } else {
      synchronized(this) {
        if(_recentlyPlayedStationDao == null) {
          _recentlyPlayedStationDao = new RecentlyPlayedStationDao_Impl(this);
        }
        return _recentlyPlayedStationDao;
      }
    }
  }
}
