package com.alarmfm.radio.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.alarmfm.radio.domain.model.RadioStation;
import com.alarmfm.radio.domain.repository.RadioStationRepository;
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/alarmfm/radio/presentation/viewmodel/FavoritesViewModel;", "Landroidx/lifecycle/ViewModel;", "radioStationRepository", "Lcom/alarmfm/radio/domain/repository/RadioStationRepository;", "toggleFavoriteUseCase", "Lcom/alarmfm/radio/domain/usecase/ToggleFavoriteUseCase;", "(Lcom/alarmfm/radio/domain/repository/RadioStationRepository;Lcom/alarmfm/radio/domain/usecase/ToggleFavoriteUseCase;)V", "_favoriteStations", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/alarmfm/radio/domain/model/RadioStation;", "favoriteStations", "Lkotlinx/coroutines/flow/StateFlow;", "getFavoriteStations", "()Lkotlinx/coroutines/flow/StateFlow;", "loadFavoriteStations", "", "removeFromFavorites", "station", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FavoritesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.domain.repository.RadioStationRepository radioStationRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase toggleFavoriteUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> _favoriteStations = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> favoriteStations = null;
    
    @javax.inject.Inject
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.repository.RadioStationRepository radioStationRepository, @org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase toggleFavoriteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> getFavoriteStations() {
        return null;
    }
    
    private final void loadFavoriteStations() {
    }
    
    public final void removeFromFavorites(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station) {
    }
}