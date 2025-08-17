package com.alarmfm.radio.data.repository;

import com.alarmfm.radio.data.api.RadioBrowserApi;
import com.alarmfm.radio.data.database.dao.FavoriteStationDao;
import com.alarmfm.radio.data.database.dao.RecentlyPlayedStationDao;
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
public final class RadioStationRepositoryImpl_Factory implements Factory<RadioStationRepositoryImpl> {
  private final Provider<RadioBrowserApi> apiProvider;

  private final Provider<FavoriteStationDao> favoriteStationDaoProvider;

  private final Provider<RecentlyPlayedStationDao> recentlyPlayedStationDaoProvider;

  public RadioStationRepositoryImpl_Factory(Provider<RadioBrowserApi> apiProvider,
      Provider<FavoriteStationDao> favoriteStationDaoProvider,
      Provider<RecentlyPlayedStationDao> recentlyPlayedStationDaoProvider) {
    this.apiProvider = apiProvider;
    this.favoriteStationDaoProvider = favoriteStationDaoProvider;
    this.recentlyPlayedStationDaoProvider = recentlyPlayedStationDaoProvider;
  }

  @Override
  public RadioStationRepositoryImpl get() {
    return newInstance(apiProvider.get(), favoriteStationDaoProvider.get(), recentlyPlayedStationDaoProvider.get());
  }

  public static RadioStationRepositoryImpl_Factory create(Provider<RadioBrowserApi> apiProvider,
      Provider<FavoriteStationDao> favoriteStationDaoProvider,
      Provider<RecentlyPlayedStationDao> recentlyPlayedStationDaoProvider) {
    return new RadioStationRepositoryImpl_Factory(apiProvider, favoriteStationDaoProvider, recentlyPlayedStationDaoProvider);
  }

  public static RadioStationRepositoryImpl newInstance(RadioBrowserApi api,
      FavoriteStationDao favoriteStationDao, RecentlyPlayedStationDao recentlyPlayedStationDao) {
    return new RadioStationRepositoryImpl(api, favoriteStationDao, recentlyPlayedStationDao);
  }
}
