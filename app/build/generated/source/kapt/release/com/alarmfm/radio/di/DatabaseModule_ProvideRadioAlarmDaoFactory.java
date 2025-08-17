package com.alarmfm.radio.di;

import com.alarmfm.radio.data.database.AlarmFMDatabase;
import com.alarmfm.radio.data.database.dao.RadioAlarmDao;
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
public final class DatabaseModule_ProvideRadioAlarmDaoFactory implements Factory<RadioAlarmDao> {
  private final Provider<AlarmFMDatabase> databaseProvider;

  public DatabaseModule_ProvideRadioAlarmDaoFactory(Provider<AlarmFMDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RadioAlarmDao get() {
    return provideRadioAlarmDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideRadioAlarmDaoFactory create(
      Provider<AlarmFMDatabase> databaseProvider) {
    return new DatabaseModule_ProvideRadioAlarmDaoFactory(databaseProvider);
  }

  public static RadioAlarmDao provideRadioAlarmDao(AlarmFMDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideRadioAlarmDao(database));
  }
}
