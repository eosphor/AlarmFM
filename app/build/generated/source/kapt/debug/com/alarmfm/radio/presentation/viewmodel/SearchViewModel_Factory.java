package com.alarmfm.radio.presentation.viewmodel;

import com.alarmfm.radio.domain.usecase.SearchStationsUseCase;
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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchStationsUseCase> searchStationsUseCaseProvider;

  private final Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider;

  public SearchViewModel_Factory(Provider<SearchStationsUseCase> searchStationsUseCaseProvider,
      Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider) {
    this.searchStationsUseCaseProvider = searchStationsUseCaseProvider;
    this.toggleFavoriteUseCaseProvider = toggleFavoriteUseCaseProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(searchStationsUseCaseProvider.get(), toggleFavoriteUseCaseProvider.get());
  }

  public static SearchViewModel_Factory create(
      Provider<SearchStationsUseCase> searchStationsUseCaseProvider,
      Provider<ToggleFavoriteUseCase> toggleFavoriteUseCaseProvider) {
    return new SearchViewModel_Factory(searchStationsUseCaseProvider, toggleFavoriteUseCaseProvider);
  }

  public static SearchViewModel newInstance(SearchStationsUseCase searchStationsUseCase,
      ToggleFavoriteUseCase toggleFavoriteUseCase) {
    return new SearchViewModel(searchStationsUseCase, toggleFavoriteUseCase);
  }
}
