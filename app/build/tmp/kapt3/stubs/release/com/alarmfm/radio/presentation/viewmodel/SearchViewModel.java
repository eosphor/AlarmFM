package com.alarmfm.radio.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.alarmfm.radio.domain.model.RadioStation;
import com.alarmfm.radio.domain.model.UiState;
import com.alarmfm.radio.domain.usecase.SearchStationsUseCase;
import com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/alarmfm/radio/presentation/viewmodel/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchStationsUseCase", "Lcom/alarmfm/radio/domain/usecase/SearchStationsUseCase;", "toggleFavoriteUseCase", "Lcom/alarmfm/radio/domain/usecase/ToggleFavoriteUseCase;", "(Lcom/alarmfm/radio/domain/usecase/SearchStationsUseCase;Lcom/alarmfm/radio/domain/usecase/ToggleFavoriteUseCase;)V", "_errorMessage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_searchQuery", "_stations", "", "Lcom/alarmfm/radio/domain/model/RadioStation;", "_uiState", "Lcom/alarmfm/radio/domain/model/UiState;", "errorMessage", "Lkotlinx/coroutines/flow/StateFlow;", "getErrorMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "searchJob", "Lkotlinx/coroutines/Job;", "searchQuery", "getSearchQuery", "stations", "getStations", "uiState", "getUiState", "retry", "", "searchStations", "query", "toggleFavorite", "station", "updateSearchQuery", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.domain.usecase.SearchStationsUseCase searchStationsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase toggleFavoriteUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alarmfm.radio.domain.model.UiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.alarmfm.radio.domain.model.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> _stations = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.alarmfm.radio.domain.model.RadioStation>> stations = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job searchJob;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.usecase.SearchStationsUseCase searchStationsUseCase, @org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.usecase.ToggleFavoriteUseCase toggleFavoriteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.alarmfm.radio.domain.model.UiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
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
    
    public final void updateSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    private final void searchStations(java.lang.String query) {
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull
    com.alarmfm.radio.domain.model.RadioStation station) {
    }
    
    public final void retry() {
    }
}