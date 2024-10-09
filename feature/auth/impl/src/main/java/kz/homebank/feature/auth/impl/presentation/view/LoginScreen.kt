package kz.homebank.feature.auth.impl.presentation.view

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import kz.homebank.base.presentation.navigation.NavigationTree
import kz.homebank.base.presentation.vm.factory.VmFactory
import kz.homebank.feature.auth.impl.di.AuthComponentHolder
import kz.homebank.feature.auth.impl.presentation.view_model.LoginViewModel

@Composable
internal fun LoginScreen(navHostController: NavHostController) {
    val viewModel: LoginViewModel = viewModel(factory = VmFactory { AuthComponentHolder.getComponent().loginViewModel }  )
    val navigateToPopularMovies by viewModel.navigateToPopularMovies.collectAsState()

    LoginView(viewModel)
    if (navigateToPopularMovies) {
        navHostController.navigate(NavigationTree.MoviesNavigation.Populars.name)
        viewModel.onNavigationDone()
    }
}