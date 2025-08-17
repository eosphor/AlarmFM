package com.alarmfm.radio.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.alarmfm.radio.presentation.ui.navigation.BottomNavItem
import com.alarmfm.radio.presentation.ui.navigation.Screen
import com.alarmfm.radio.presentation.ui.screen.discover.DiscoverScreen
import com.alarmfm.radio.presentation.ui.screen.favorites.FavoritesScreen
import com.alarmfm.radio.presentation.ui.screen.search.SearchScreen
import com.alarmfm.radio.presentation.ui.screen.settings.SettingsScreen
import com.alarmfm.radio.presentation.ui.screen.alarms.AlarmsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlarmFMApp() {
    val navController = rememberNavController()
    
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                
                BottomNavItem.items.forEach { item ->
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = item.title) },
                        label = { Text(item.title) },
                        selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Discover.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Discover.route) {
                DiscoverScreen(navController = navController)
            }
            composable(Screen.Search.route) {
                SearchScreen(navController = navController)
            }
            composable(Screen.Favorites.route) {
                FavoritesScreen(navController = navController)
            }
            composable(Screen.Alarms.route) {
                AlarmsScreen(navController = navController)
            }
            composable(Screen.Settings.route) {
                SettingsScreen(navController = navController)
            }
        }
    }
}
