package com.alarmfm.radio.presentation.ui.screen.discover

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.alarmfm.radio.R
import com.alarmfm.radio.domain.model.UiState
import com.alarmfm.radio.presentation.ui.component.RadioStationItem
import com.alarmfm.radio.presentation.ui.component.LoadingIndicator
import com.alarmfm.radio.presentation.ui.component.ErrorMessage
import com.alarmfm.radio.presentation.viewmodel.DiscoverViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiscoverScreen(
    navController: NavController,
    viewModel: DiscoverViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val stations by viewModel.stations.collectAsState()
    val errorMessage by viewModel.errorMessage.collectAsState()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(R.string.popular_stations),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        when (uiState) {
            UiState.LOADING -> {
                LoadingIndicator(
                    modifier = Modifier.fillMaxSize()
                )
            }
            
            UiState.SUCCESS -> {
                if (stations.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.no_stations_found),
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                } else {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(stations) { station ->
                            RadioStationItem(
                                station = station,
                                onPlayClick = { /* TODO: Implement play functionality */ },
                                onFavoriteClick = { viewModel.toggleFavorite(station) }
                            )
                        }
                    }
                }
            }
            
            UiState.ERROR -> {
                ErrorMessage(
                    message = errorMessage ?: stringResource(R.string.error),
                    onRetryClick = { viewModel.retry() },
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
