package com.alarmfm.radio.presentation.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: String
) {
    companion object {
        val items = listOf(
            BottomNavItem(
                title = "Обзор",
                icon = Icons.Default.Explore,
                route = Screen.Discover.route
            ),
            BottomNavItem(
                title = "Поиск",
                icon = Icons.Default.Search,
                route = Screen.Search.route
            ),
            BottomNavItem(
                title = "Избранное",
                icon = Icons.Default.Favorite,
                route = Screen.Favorites.route
            ),
            BottomNavItem(
                title = "Будильники",
                icon = Icons.Default.Alarm,
                route = Screen.Alarms.route
            ),
            BottomNavItem(
                title = "Настройки",
                icon = Icons.Default.Settings,
                route = Screen.Settings.route
            )
        )
    }
}
