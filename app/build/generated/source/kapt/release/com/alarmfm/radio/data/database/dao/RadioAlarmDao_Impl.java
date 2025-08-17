package com.alarmfm.radio.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.alarmfm.radio.data.database.entity.IntListConverter;
import com.alarmfm.radio.data.database.entity.RadioAlarmEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RadioAlarmDao_Impl implements RadioAlarmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RadioAlarmEntity> __insertionAdapterOfRadioAlarmEntity;

  private final IntListConverter __intListConverter = new IntListConverter();

  private final EntityDeletionOrUpdateAdapter<RadioAlarmEntity> __deletionAdapterOfRadioAlarmEntity;

  private final EntityDeletionOrUpdateAdapter<RadioAlarmEntity> __updateAdapterOfRadioAlarmEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAlarmById;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAlarmEnabled;

  public RadioAlarmDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRadioAlarmEntity = new EntityInsertionAdapter<RadioAlarmEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `radio_alarms` (`id`,`stationId`,`stationName`,`stationUrl`,`stationFavicon`,`timeHour`,`timeMinute`,`isEnabled`,`repeatDays`,`volume`,`isVibrationEnabled`,`label`,`createdAt`,`updatedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RadioAlarmEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getStationId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getStationId());
        }
        if (entity.getStationName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getStationName());
        }
        if (entity.getStationUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getStationUrl());
        }
        if (entity.getStationFavicon() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getStationFavicon());
        }
        statement.bindLong(6, entity.getTimeHour());
        statement.bindLong(7, entity.getTimeMinute());
        final int _tmp = entity.isEnabled() ? 1 : 0;
        statement.bindLong(8, _tmp);
        final String _tmp_1 = __intListConverter.fromIntList(entity.getRepeatDays());
        if (_tmp_1 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_1);
        }
        statement.bindLong(10, entity.getVolume());
        final int _tmp_2 = entity.isVibrationEnabled() ? 1 : 0;
        statement.bindLong(11, _tmp_2);
        if (entity.getLabel() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getLabel());
        }
        statement.bindLong(13, entity.getCreatedAt());
        statement.bindLong(14, entity.getUpdatedAt());
      }
    };
    this.__deletionAdapterOfRadioAlarmEntity = new EntityDeletionOrUpdateAdapter<RadioAlarmEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `radio_alarms` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RadioAlarmEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfRadioAlarmEntity = new EntityDeletionOrUpdateAdapter<RadioAlarmEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `radio_alarms` SET `id` = ?,`stationId` = ?,`stationName` = ?,`stationUrl` = ?,`stationFavicon` = ?,`timeHour` = ?,`timeMinute` = ?,`isEnabled` = ?,`repeatDays` = ?,`volume` = ?,`isVibrationEnabled` = ?,`label` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RadioAlarmEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getStationId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getStationId());
        }
        if (entity.getStationName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getStationName());
        }
        if (entity.getStationUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getStationUrl());
        }
        if (entity.getStationFavicon() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getStationFavicon());
        }
        statement.bindLong(6, entity.getTimeHour());
        statement.bindLong(7, entity.getTimeMinute());
        final int _tmp = entity.isEnabled() ? 1 : 0;
        statement.bindLong(8, _tmp);
        final String _tmp_1 = __intListConverter.fromIntList(entity.getRepeatDays());
        if (_tmp_1 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_1);
        }
        statement.bindLong(10, entity.getVolume());
        final int _tmp_2 = entity.isVibrationEnabled() ? 1 : 0;
        statement.bindLong(11, _tmp_2);
        if (entity.getLabel() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getLabel());
        }
        statement.bindLong(13, entity.getCreatedAt());
        statement.bindLong(14, entity.getUpdatedAt());
        statement.bindLong(15, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAlarmById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM radio_alarms WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAlarmEnabled = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE radio_alarms SET isEnabled = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertAlarm(final RadioAlarmEntity alarm,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfRadioAlarmEntity.insertAndReturnId(alarm);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAlarm(final RadioAlarmEntity alarm,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRadioAlarmEntity.handle(alarm);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateAlarm(final RadioAlarmEntity alarm,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRadioAlarmEntity.handle(alarm);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAlarmById(final long id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAlarmById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAlarmById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateAlarmEnabled(final long id, final boolean isEnabled,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAlarmEnabled.acquire();
        int _argIndex = 1;
        final int _tmp = isEnabled ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateAlarmEnabled.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<RadioAlarmEntity>> getAllAlarms() {
    final String _sql = "SELECT * FROM radio_alarms ORDER BY timeHour, timeMinute";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"radio_alarms"}, new Callable<List<RadioAlarmEntity>>() {
      @Override
      @NonNull
      public List<RadioAlarmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStationId = CursorUtil.getColumnIndexOrThrow(_cursor, "stationId");
          final int _cursorIndexOfStationName = CursorUtil.getColumnIndexOrThrow(_cursor, "stationName");
          final int _cursorIndexOfStationUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "stationUrl");
          final int _cursorIndexOfStationFavicon = CursorUtil.getColumnIndexOrThrow(_cursor, "stationFavicon");
          final int _cursorIndexOfTimeHour = CursorUtil.getColumnIndexOrThrow(_cursor, "timeHour");
          final int _cursorIndexOfTimeMinute = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMinute");
          final int _cursorIndexOfIsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnabled");
          final int _cursorIndexOfRepeatDays = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatDays");
          final int _cursorIndexOfVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "volume");
          final int _cursorIndexOfIsVibrationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "isVibrationEnabled");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<RadioAlarmEntity> _result = new ArrayList<RadioAlarmEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RadioAlarmEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpStationId;
            if (_cursor.isNull(_cursorIndexOfStationId)) {
              _tmpStationId = null;
            } else {
              _tmpStationId = _cursor.getString(_cursorIndexOfStationId);
            }
            final String _tmpStationName;
            if (_cursor.isNull(_cursorIndexOfStationName)) {
              _tmpStationName = null;
            } else {
              _tmpStationName = _cursor.getString(_cursorIndexOfStationName);
            }
            final String _tmpStationUrl;
            if (_cursor.isNull(_cursorIndexOfStationUrl)) {
              _tmpStationUrl = null;
            } else {
              _tmpStationUrl = _cursor.getString(_cursorIndexOfStationUrl);
            }
            final String _tmpStationFavicon;
            if (_cursor.isNull(_cursorIndexOfStationFavicon)) {
              _tmpStationFavicon = null;
            } else {
              _tmpStationFavicon = _cursor.getString(_cursorIndexOfStationFavicon);
            }
            final int _tmpTimeHour;
            _tmpTimeHour = _cursor.getInt(_cursorIndexOfTimeHour);
            final int _tmpTimeMinute;
            _tmpTimeMinute = _cursor.getInt(_cursorIndexOfTimeMinute);
            final boolean _tmpIsEnabled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsEnabled);
            _tmpIsEnabled = _tmp != 0;
            final List<Integer> _tmpRepeatDays;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfRepeatDays)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfRepeatDays);
            }
            _tmpRepeatDays = __intListConverter.toIntList(_tmp_1);
            final int _tmpVolume;
            _tmpVolume = _cursor.getInt(_cursorIndexOfVolume);
            final boolean _tmpIsVibrationEnabled;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsVibrationEnabled);
            _tmpIsVibrationEnabled = _tmp_2 != 0;
            final String _tmpLabel;
            if (_cursor.isNull(_cursorIndexOfLabel)) {
              _tmpLabel = null;
            } else {
              _tmpLabel = _cursor.getString(_cursorIndexOfLabel);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new RadioAlarmEntity(_tmpId,_tmpStationId,_tmpStationName,_tmpStationUrl,_tmpStationFavicon,_tmpTimeHour,_tmpTimeMinute,_tmpIsEnabled,_tmpRepeatDays,_tmpVolume,_tmpIsVibrationEnabled,_tmpLabel,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<RadioAlarmEntity>> getEnabledAlarms() {
    final String _sql = "SELECT * FROM radio_alarms WHERE isEnabled = 1 ORDER BY timeHour, timeMinute";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"radio_alarms"}, new Callable<List<RadioAlarmEntity>>() {
      @Override
      @NonNull
      public List<RadioAlarmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStationId = CursorUtil.getColumnIndexOrThrow(_cursor, "stationId");
          final int _cursorIndexOfStationName = CursorUtil.getColumnIndexOrThrow(_cursor, "stationName");
          final int _cursorIndexOfStationUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "stationUrl");
          final int _cursorIndexOfStationFavicon = CursorUtil.getColumnIndexOrThrow(_cursor, "stationFavicon");
          final int _cursorIndexOfTimeHour = CursorUtil.getColumnIndexOrThrow(_cursor, "timeHour");
          final int _cursorIndexOfTimeMinute = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMinute");
          final int _cursorIndexOfIsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnabled");
          final int _cursorIndexOfRepeatDays = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatDays");
          final int _cursorIndexOfVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "volume");
          final int _cursorIndexOfIsVibrationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "isVibrationEnabled");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<RadioAlarmEntity> _result = new ArrayList<RadioAlarmEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RadioAlarmEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpStationId;
            if (_cursor.isNull(_cursorIndexOfStationId)) {
              _tmpStationId = null;
            } else {
              _tmpStationId = _cursor.getString(_cursorIndexOfStationId);
            }
            final String _tmpStationName;
            if (_cursor.isNull(_cursorIndexOfStationName)) {
              _tmpStationName = null;
            } else {
              _tmpStationName = _cursor.getString(_cursorIndexOfStationName);
            }
            final String _tmpStationUrl;
            if (_cursor.isNull(_cursorIndexOfStationUrl)) {
              _tmpStationUrl = null;
            } else {
              _tmpStationUrl = _cursor.getString(_cursorIndexOfStationUrl);
            }
            final String _tmpStationFavicon;
            if (_cursor.isNull(_cursorIndexOfStationFavicon)) {
              _tmpStationFavicon = null;
            } else {
              _tmpStationFavicon = _cursor.getString(_cursorIndexOfStationFavicon);
            }
            final int _tmpTimeHour;
            _tmpTimeHour = _cursor.getInt(_cursorIndexOfTimeHour);
            final int _tmpTimeMinute;
            _tmpTimeMinute = _cursor.getInt(_cursorIndexOfTimeMinute);
            final boolean _tmpIsEnabled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsEnabled);
            _tmpIsEnabled = _tmp != 0;
            final List<Integer> _tmpRepeatDays;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfRepeatDays)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfRepeatDays);
            }
            _tmpRepeatDays = __intListConverter.toIntList(_tmp_1);
            final int _tmpVolume;
            _tmpVolume = _cursor.getInt(_cursorIndexOfVolume);
            final boolean _tmpIsVibrationEnabled;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsVibrationEnabled);
            _tmpIsVibrationEnabled = _tmp_2 != 0;
            final String _tmpLabel;
            if (_cursor.isNull(_cursorIndexOfLabel)) {
              _tmpLabel = null;
            } else {
              _tmpLabel = _cursor.getString(_cursorIndexOfLabel);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new RadioAlarmEntity(_tmpId,_tmpStationId,_tmpStationName,_tmpStationUrl,_tmpStationFavicon,_tmpTimeHour,_tmpTimeMinute,_tmpIsEnabled,_tmpRepeatDays,_tmpVolume,_tmpIsVibrationEnabled,_tmpLabel,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAlarmById(final long id,
      final Continuation<? super RadioAlarmEntity> $completion) {
    final String _sql = "SELECT * FROM radio_alarms WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<RadioAlarmEntity>() {
      @Override
      @Nullable
      public RadioAlarmEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStationId = CursorUtil.getColumnIndexOrThrow(_cursor, "stationId");
          final int _cursorIndexOfStationName = CursorUtil.getColumnIndexOrThrow(_cursor, "stationName");
          final int _cursorIndexOfStationUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "stationUrl");
          final int _cursorIndexOfStationFavicon = CursorUtil.getColumnIndexOrThrow(_cursor, "stationFavicon");
          final int _cursorIndexOfTimeHour = CursorUtil.getColumnIndexOrThrow(_cursor, "timeHour");
          final int _cursorIndexOfTimeMinute = CursorUtil.getColumnIndexOrThrow(_cursor, "timeMinute");
          final int _cursorIndexOfIsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnabled");
          final int _cursorIndexOfRepeatDays = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatDays");
          final int _cursorIndexOfVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "volume");
          final int _cursorIndexOfIsVibrationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "isVibrationEnabled");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final RadioAlarmEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpStationId;
            if (_cursor.isNull(_cursorIndexOfStationId)) {
              _tmpStationId = null;
            } else {
              _tmpStationId = _cursor.getString(_cursorIndexOfStationId);
            }
            final String _tmpStationName;
            if (_cursor.isNull(_cursorIndexOfStationName)) {
              _tmpStationName = null;
            } else {
              _tmpStationName = _cursor.getString(_cursorIndexOfStationName);
            }
            final String _tmpStationUrl;
            if (_cursor.isNull(_cursorIndexOfStationUrl)) {
              _tmpStationUrl = null;
            } else {
              _tmpStationUrl = _cursor.getString(_cursorIndexOfStationUrl);
            }
            final String _tmpStationFavicon;
            if (_cursor.isNull(_cursorIndexOfStationFavicon)) {
              _tmpStationFavicon = null;
            } else {
              _tmpStationFavicon = _cursor.getString(_cursorIndexOfStationFavicon);
            }
            final int _tmpTimeHour;
            _tmpTimeHour = _cursor.getInt(_cursorIndexOfTimeHour);
            final int _tmpTimeMinute;
            _tmpTimeMinute = _cursor.getInt(_cursorIndexOfTimeMinute);
            final boolean _tmpIsEnabled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsEnabled);
            _tmpIsEnabled = _tmp != 0;
            final List<Integer> _tmpRepeatDays;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfRepeatDays)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfRepeatDays);
            }
            _tmpRepeatDays = __intListConverter.toIntList(_tmp_1);
            final int _tmpVolume;
            _tmpVolume = _cursor.getInt(_cursorIndexOfVolume);
            final boolean _tmpIsVibrationEnabled;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsVibrationEnabled);
            _tmpIsVibrationEnabled = _tmp_2 != 0;
            final String _tmpLabel;
            if (_cursor.isNull(_cursorIndexOfLabel)) {
              _tmpLabel = null;
            } else {
              _tmpLabel = _cursor.getString(_cursorIndexOfLabel);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _result = new RadioAlarmEntity(_tmpId,_tmpStationId,_tmpStationName,_tmpStationUrl,_tmpStationFavicon,_tmpTimeHour,_tmpTimeMinute,_tmpIsEnabled,_tmpRepeatDays,_tmpVolume,_tmpIsVibrationEnabled,_tmpLabel,_tmpCreatedAt,_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAlarmsCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM radio_alarms";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
