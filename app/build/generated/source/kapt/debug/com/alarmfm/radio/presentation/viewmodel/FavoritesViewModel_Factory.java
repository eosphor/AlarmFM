package com.alarmfm.radio.presentation.viewmodel;

import com.alarmfm.radio.domain.repository.RadioStationRepository;
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
public final class FavoritesViewModel_Factory implements Factory<FavoritesViewModel> {
  private final Provider<RadioStationRepository> radioStationRepositoryProvider;

  private final Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider;

  public FavoritesViewModel_Factory(Provider<RadioStationRepository> radioStationRepositoryProvider,
      Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider) {
    this.radioStationRepositoryProvider = radioStationRepositoryProvider;
    this.toggleFavoriteUseCaseProvider = toggleFavoriteUseCaseProvider;
  }

  @Override
  public FavoritesViewModel get() {
    return newInstance(radioStationRepositoryProvider.get(), toggleFavoriteUseCaseProvider.get());
  }

  public static FavoritesViewModel_Factory create(
      Provider<RadioStationRepository> radioStationRepositoryProvider,
      Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider) {
    return new FavoritesViewModel_Factory(radioStationRepositoryProvider, toggleFavoriteUseCaseProvider);
  }

  public static FavoritesViewModel newInstance(RadioStationRepository radioStationRepository,
      ToggleFavoriteUseCase toggleFavoriteUseCase) {
    return new FavoritesViewModel(radioStationRepository, toggleFavoriteUseCase);
  }
}
