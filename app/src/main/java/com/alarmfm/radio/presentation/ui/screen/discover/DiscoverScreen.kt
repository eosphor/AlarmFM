package com.alarmfm.radio.presentation.ui.screen.discover

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.alarmfm.radio.R
import com.alarmfm.radio.domain.model.UiState
import com.alarmfm.radio.presentation.ui.component.RadioStationItem
import com.alarmfm.radio.presentation.ui.component.LoadingIndicator
import com.alarmfm.radio.presentation.ui.component.ErrorMessage
import com.alarmfm.radio.presentation.viewmodel.DiscoverViewModel

@Composable
fun DiscoverScreen(
    navController: NavController,
    viewModel: DiscoverViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val stations by viewModel.stations.collectAsState()
    val errorMessage by viewModel.errorMessage.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadPopularStations()
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0F172A),
                        Color(0xFF0F172A),
                        Color(0xFF312E81)
                    )
                )
            )
            .padding(16.dp)
    ) {
        Text(
            text = "AlarmFM",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            ),
            modifier = Modifier.padding(bottom = 24.dp)
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
                            text = "No stations found",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.White.copy(alpha = 0.6f)
                        )
                    }
                } else {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
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
                    message = errorMessage ?: "Error loading stations",
                    onRetryClick = { viewModel.retry() },
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
