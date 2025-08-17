package com.alarmfm.radio.data.repository;

import com.alarmfm.radio.data.database.dao.RadioAlarmDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RadioAlarmRepositoryImpl_Factory implements Factory<RadioAlarmRepositoryImpl> {
  private final Provider<RadioAlarmDao> radioAlarmDaoProvider;

  public RadioAlarmRepositoryImpl_Factory(Provider<RadioAlarmDao> radioAlarmDaoProvider) {
    this.radioAlarmDaoProvider = radioAlarmDaoProvider;
  }

  @Override
  public RadioAlarmRepositoryImpl get() {
    return newInstance(radioAlarmDaoProvider.get());
  }

  public static RadioAlarmRepositoryImpl_Factory create(
      Provider<RadioAlarmDao> radioAlarmDaoProvider) {
    return new RadioAlarmRepositoryImpl_Factory(radioAlarmDaoProvider);
  }

  public static RadioAlarmRepositoryImpl newInstance(RadioAlarmDao radioAlarmDao) {
    return new RadioAlarmRepositoryImpl(radioAlarmDao);
  }
}
