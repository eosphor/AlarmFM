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
public final class GetPopularStationsUseCase_Factory implements Factory<GetPopularStationsUseCase> {
  private final Provider<RadioStationRepository> repositoryProvider;

  public GetPopularStationsUseCase_Factory(Provider<RadioStationRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetPopularStationsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetPopularStationsUseCase_Factory create(
      Provider<RadioStationRepository> repositoryProvider) {
    return new GetPopularStationsUseCase_Factory(repositoryProvider);
  }

  public static GetPopularStationsUseCase newInstance(RadioStationRepository repository) {
    return new GetPopularStationsUseCase(repository);
  }
}
