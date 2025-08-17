package com.alarmfm.radio.di;

import com.alarmfm.radio.data.api.RadioBrowserApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideRadioBrowserApiFactory implements Factory<RadioBrowserApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideRadioBrowserApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RadioBrowserApi get() {
    return provideRadioBrowserApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideRadioBrowserApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideRadioBrowserApiFactory(retrofitProvider);
  }

  public static RadioBrowserApi provideRadioBrowserApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRadioBrowserApi(retrofit));
  }
}
