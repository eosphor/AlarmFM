package com.alarmfm.radio.presentation.viewmodel;

import com.alarmfm.radio.domain.usecase.GetPopularStationsUseCase;
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class DiscoverViewModel_Factory implements Factory<DiscoverViewModel> {
  private final Provider<GetPopularStationsUseCase> getPopularStationsUseCaseProvider;

  private final Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider;

  public DiscoverViewModel_Factory(
      Provider<GetPopularStationsUseCase> getPopularStationsUseCaseProvider,
      Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider) {
    this.getPopularStationsUseCaseProvider = getPopularStationsUseCaseProvider;
    this.toggleFavoriteUseCaseProvider = toggleFavoriteUseCaseProvider;
  }

  @Override
  public DiscoverViewModel get() {
    return newInstance(getPopularStationsUseCaseProvider.get(), toggleFavoriteUseCaseProvider.get());
  }

  public static DiscoverViewModel_Factory create(
      Provider<GetPopularStationsUseCase> getPopularStationsUseCaseProvider,
      Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider) {
    return new DiscoverViewModel_Factory(getPopularStationsUseCaseProvider, toggleFavoriteUseCaseProvider);
  }

  public static DiscoverViewModel newInstance(GetPopularStationsUseCase getPopularStationsUseCase,
      ToggleFavoriteUseCase toggleFavoriteUseCase) {
    return new DiscoverViewModel(getPopularStationsUseCase, toggleFavoriteUseCase);
  }
}
