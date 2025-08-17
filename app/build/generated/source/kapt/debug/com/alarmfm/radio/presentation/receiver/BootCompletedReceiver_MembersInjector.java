package com.alarmfm.radio.presentation.receiver;

import com.alarmfm.radio.domain.repository.RadioAlarmRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class BootCompletedReceiver_MembersInjector implements MembersInjector<BootCompletedReceiver> {
  private final Provider<RadioAlarmRepository> alarmRepositoryProvider;

  public BootCompletedReceiver_MembersInjector(
      Provider<RadioAlarmRepository> alarmRepositoryProvider) {
    this.alarmRepositoryProvider = alarmRepositoryProvider;
  }

  public static MembersInjector<BootCompletedReceiver> create(
      Provider<RadioAlarmRepository> alarmRepositoryProvider) {
    return new BootCompletedReceiver_MembersInjector(alarmRepositoryProvider);
  }

  @Override
  public void injectMembers(BootCompletedReceiver instance) {
    injectAlarmRepository(instance, alarmRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.alarmfm.radio.presentation.receiver.BootCompletedReceiver.alarmRepository")
  public static void injectAlarmRepository(BootCompletedReceiver instance,
      RadioAlarmRepository alarmRepository) {
    instance.alarmRepository = alarmRepository;
  }
}
