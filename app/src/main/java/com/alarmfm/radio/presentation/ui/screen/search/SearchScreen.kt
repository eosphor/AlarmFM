package com.alarmfm.radio.presentation.ui.screen.search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
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
import com.alarmfm.radio.presentation.viewmodel.SearchViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: SearchViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val searchQuery by viewModel.searchQuery.collectAsState()
    val stations by viewModel.stations.collectAsState()
    val errorMessage by viewModel.errorMessage.collectAsState()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { viewModel.updateSearchQuery(it) },
            label = { Text(stringResource(R.string.search_stations)) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            singleLine = true
        )
        
        when (uiState) {
            UiState.LOADING -> {
                LoadingIndicator(
                    modifier = Modifier.fillMaxSize()
                )
            }
            
            UiState.SUCCESS -> {
                if (searchQuery.isBlank()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Введите запрос для поиска станций",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                } else if (stations.isEmpty()) {
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
