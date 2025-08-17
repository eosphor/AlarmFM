package com.alarmfm.radio.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.alarmfm.radio.domain.model.RadioStation;
import com.alarmfm.radio.domain.model.UiState;
import com.alarmfm.radio.domain.usecase.GetPopularStationsUseCase;
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\fR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/alarmfm/radio/presentation/viewmodel/DiscoverViewModel;", "Landroidx/lifecycle/ViewModel;", "getPopularStationsUseCase", "Lcom/alarmfm/radio/domain/usecase/GetPopularStationsUseCase;", "toggleFavoriteUseCase", "Lcom/alarmfm/radio/domain/usecase/ToggleFavoriteUseCase;", "(Lcom/alarmfm/radio/domain/usecase/GetPopularStationsUseCase;Lcom/alarmfm/radio/domain/usecase/ToggleFavoriteUseCase;)V", "_errorMessage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_stations", "", "Lcom/alarmfm/radio/domain/model/RadioStation;", "_uiState", "Lcom/alarmfm/radio/domain/model/UiState;", "errorMessage", "Lkotlinx/coroutines/flow/StateFlow;", "getErrorMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "stations", "getStations", "uiState", "getUiState", "loadPopularStations", "", "retry", "toggleFavorite", "station", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DiscoverViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.domain.usecase.GetPopularStationsUseCase getPopularStationsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase toggleFavoriteUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alarmfm.radio.domain.model.UiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.alarmfm.radio.domain.model.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> _stations = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> stations = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject
    public DiscoverViewModel(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.usecase.GetPopularStationsUseCase getPopularStationsUseCase, @org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase toggleFavoriteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.alarmfm.radio.domain.model.UiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> getStations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void loadPopularStations() {
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station) {
    }
    
    public final void retry() {
    }
}