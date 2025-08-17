package com.alarmfm.radio.di;

import com.alarmfm.radio.data.database.AlarmFMDatabase;
import com.alarmfm.radio.data.database.dao.FavoriteStationDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DatabaseModule_ProvideFavoriteStationDaoFactory implements Factory<FavoriteStationDao> {
  private final Provider<AlarmFMDatabase> databaseProvider;

  public DatabaseModule_ProvideFavoriteStationDaoFactory(
      Provider<AlarmFMDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public FavoriteStationDao get() {
    return provideFavoriteStationDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideFavoriteStationDaoFactory create(
      Provider<AlarmFMDatabase> databaseProvider) {
    return new DatabaseModule_ProvideFavoriteStationDaoFactory(databaseProvider);
  }

  public static FavoriteStationDao provideFavoriteStationDao(AlarmFMDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideFavoriteStationDao(database));
  }
}
