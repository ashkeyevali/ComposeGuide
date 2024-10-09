package kz.homebank.feature.auth.impl.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import kz.homebank.base.presentation.navigation.NavigationTree
import kz.homebank.feature.auth.impl.presentation.view.LoginScreen

fun NavGraphBuilder.addLoginFlow(navController: NavHostController) {
    composable(NavigationTree.AuthNavigation.Login.name) {
        LoginScreen(navController)
    }
}