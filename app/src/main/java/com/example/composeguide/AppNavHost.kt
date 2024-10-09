package com.example.composeguide


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

import kz.homebank.base.presentation.navigation.NavigationTree
import kz.homebank.feature.auth.impl.presentation.navigation.addLoginFlow
import kz.homebank.libraries.resources.Theme
import presentation.navigation.addMoviesFlow

@Composable
fun AppNavHost(navHostController: NavHostController) {
    NavHost(
        modifier = Modifier.fillMaxSize().background(Theme.colors.primaryBackground),
        navController = navHostController, startDestination = NavigationTree.AuthNavigation.Login.name) {
        addLoginFlow(navHostController)
        addMoviesFlow(navHostController)
    }
}