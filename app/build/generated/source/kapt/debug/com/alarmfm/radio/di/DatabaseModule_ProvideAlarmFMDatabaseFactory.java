package com.alarmfm.radio.di;

import android.content.Context;
import com.alarmfm.radio.data.database.AlarmFMDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseModule_ProvideAlarmFMDatabaseFactory implements Factory<AlarmFMDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideAlarmFMDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AlarmFMDatabase get() {
    return provideAlarmFMDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideAlarmFMDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideAlarmFMDatabaseFactory(contextProvider);
  }

  public static AlarmFMDatabase provideAlarmFMDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAlarmFMDatabase(context));
  }
}
