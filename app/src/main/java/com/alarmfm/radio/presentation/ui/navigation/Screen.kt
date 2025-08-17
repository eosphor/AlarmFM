package com.alarmfm.radio.presentation.ui.navigation

sealed class Screen(val route: String) {
    object Discover : Screen("discover")
    object Search : Screen("search")
    object Favorites : Screen("favorites")
    object Alarms : Screen("alarms")
    object Settings : Screen("settings")
}
