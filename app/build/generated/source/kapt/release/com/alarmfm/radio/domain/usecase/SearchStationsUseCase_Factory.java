package com.alarmfm.radio.domain.usecase;

import com.alarmfm.radio.domain.repository.RadioStationRepository;
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
public final class SearchStationsUseCase_Factory implements Factory<SearchStationsUseCase> {
  private final Provider<RadioStationRepository> repositoryProvider;

  public SearchStationsUseCase_Factory(Provider<RadioStationRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchStationsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchStationsUseCase_Factory create(
      Provider<RadioStationRepository> repositoryProvider) {
    return new SearchStationsUseCase_Factory(repositoryProvider);
  }

  public static SearchStationsUseCase newInstance(RadioStationRepository repository) {
    return new SearchStationsUseCase(repository);
  }
}
