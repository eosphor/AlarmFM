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
import com.alarmfm.radio.data.database.entity.FavoriteStationEntity;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
public final class FavoriteStationDao_Impl implements FavoriteStationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteStationEntity> __insertionAdapterOfFavoriteStationEntity;

  private final EntityDeletionOrUpdateAdapter<FavoriteStationEntity> __deletionAdapterOfFavoriteStationEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFavoriteById;

  public FavoriteStationDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteStationEntity = new EntityInsertionAdapter<FavoriteStationEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_stations` (`stationId`,`name`,`url`,`favicon`,`tags`,`country`,`language`,`bitrate`,`codec`,`addedAt`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavoriteStationEntity entity) {
        if (entity.getStationId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getStationId());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getUrl());
        }
        if (entity.getFavicon() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFavicon());
        }
        if (entity.getTags() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getTags());
        }
        if (entity.getCountry() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getCountry());
        }
        if (entity.getLanguage() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getLanguage());
        }
        statement.bindLong(8, entity.getBitrate());
        if (entity.getCodec() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getCodec());
        }
        statement.bindLong(10, entity.getAddedAt());
      }
    };
    this.__deletionAdapterOfFavoriteStationEntity = new EntityDeletionOrUpdateAdapter<FavoriteStationEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favorite_stations` WHERE `stationId` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavoriteStationEntity entity) {
        if (entity.getStationId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getStationId());
        }
      }
    };
    this.__preparedStmtOfDeleteFavoriteById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM favorite_stations WHERE stationId = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertFavorite(final FavoriteStationEntity station,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteStationEntity.insert(station);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteFavorite(final FavoriteStationEntity station,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoriteStationEntity.handle(station);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteFavoriteById(final String stationId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFavoriteById.acquire();
        int _argIndex = 1;
        if (stationId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, stationId);
        }
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
          __preparedStmtOfDeleteFavoriteById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<FavoriteStationEntity>> getAllFavorites() {
    final String _sql = "SELECT * FROM favorite_stations ORDER BY addedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"favorite_stations"}, new Callable<List<FavoriteStationEntity>>() {
      @Override
      @NonNull
      public List<FavoriteStationEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStationId = CursorUtil.getColumnIndexOrThrow(_cursor, "stationId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfFavicon = CursorUtil.getColumnIndexOrThrow(_cursor, "favicon");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfBitrate = CursorUtil.getColumnIndexOrThrow(_cursor, "bitrate");
          final int _cursorIndexOfCodec = CursorUtil.getColumnIndexOrThrow(_cursor, "codec");
          final int _cursorIndexOfAddedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "addedAt");
          final List<FavoriteStationEntity> _result = new ArrayList<FavoriteStationEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final FavoriteStationEntity _item;
            final String _tmpStationId;
            if (_cursor.isNull(_cursorIndexOfStationId)) {
              _tmpStationId = null;
            } else {
              _tmpStationId = _cursor.getString(_cursorIndexOfStationId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpFavicon;
            if (_cursor.isNull(_cursorIndexOfFavicon)) {
              _tmpFavicon = null;
            } else {
              _tmpFavicon = _cursor.getString(_cursorIndexOfFavicon);
            }
            final String _tmpTags;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmpTags = null;
            } else {
              _tmpTags = _cursor.getString(_cursorIndexOfTags);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            final int _tmpBitrate;
            _tmpBitrate = _cursor.getInt(_cursorIndexOfBitrate);
            final String _tmpCodec;
            if (_cursor.isNull(_cursorIndexOfCodec)) {
              _tmpCodec = null;
            } else {
              _tmpCodec = _cursor.getString(_cursorIndexOfCodec);
            }
            final long _tmpAddedAt;
            _tmpAddedAt = _cursor.getLong(_cursorIndexOfAddedAt);
            _item = new FavoriteStationEntity(_tmpStationId,_tmpName,_tmpUrl,_tmpFavicon,_tmpTags,_tmpCountry,_tmpLanguage,_tmpBitrate,_tmpCodec,_tmpAddedAt);
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
  public Object getFavoriteById(final String stationId,
      final Continuation<? super FavoriteStationEntity> $completion) {
    final String _sql = "SELECT * FROM favorite_stations WHERE stationId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (stationId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, stationId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<FavoriteStationEntity>() {
      @Override
      @Nullable
      public FavoriteStationEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStationId = CursorUtil.getColumnIndexOrThrow(_cursor, "stationId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfFavicon = CursorUtil.getColumnIndexOrThrow(_cursor, "favicon");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfBitrate = CursorUtil.getColumnIndexOrThrow(_cursor, "bitrate");
          final int _cursorIndexOfCodec = CursorUtil.getColumnIndexOrThrow(_cursor, "codec");
          final int _cursorIndexOfAddedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "addedAt");
          final FavoriteStationEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpStationId;
            if (_cursor.isNull(_cursorIndexOfStationId)) {
              _tmpStationId = null;
            } else {
              _tmpStationId = _cursor.getString(_cursorIndexOfStationId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpFavicon;
            if (_cursor.isNull(_cursorIndexOfFavicon)) {
              _tmpFavicon = null;
            } else {
              _tmpFavicon = _cursor.getString(_cursorIndexOfFavicon);
            }
            final String _tmpTags;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmpTags = null;
            } else {
              _tmpTags = _cursor.getString(_cursorIndexOfTags);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            final int _tmpBitrate;
            _tmpBitrate = _cursor.getInt(_cursorIndexOfBitrate);
            final String _tmpCodec;
            if (_cursor.isNull(_cursorIndexOfCodec)) {
              _tmpCodec = null;
            } else {
              _tmpCodec = _cursor.getString(_cursorIndexOfCodec);
            }
            final long _tmpAddedAt;
            _tmpAddedAt = _cursor.getLong(_cursorIndexOfAddedAt);
            _result = new FavoriteStationEntity(_tmpStationId,_tmpName,_tmpUrl,_tmpFavicon,_tmpTags,_tmpCountry,_tmpLanguage,_tmpBitrate,_tmpCodec,_tmpAddedAt);
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
  public Object isFavorite(final String stationId,
      final Continuation<? super Boolean> $completion) {
    final String _sql = "SELECT EXISTS(SELECT 1 FROM favorite_stations WHERE stationId = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (stationId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, stationId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Boolean>() {
      @Override
      @NonNull
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
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
  public Object getFavoritesCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM favorite_stations";
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
