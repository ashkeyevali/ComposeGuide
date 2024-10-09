package kz.homebank.feature.auth.impl.presentation.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import kz.homebank.base.presentation.navigation.NavigationTree
import kz.homebank.base.presentation.vm.factory.VmFactory
import kz.homebank.feature.auth.impl.di.AuthComponentHolder
import kz.homebank.feature.auth.impl.presentation.view_model.LoginViewModel
import login.models.LoginAction

@Composable
internal fun LoginScreen(navHostController: NavHostController) {
    val viewModel: LoginViewModel = viewModel(factory = VmFactory { AuthComponentHolder.getComponent().loginViewModel }  )

    val state = viewModel.viewState.collectAsState()
    val actions = viewModel.viewAction.collectAsState(initial = null)


    LoginView(state.value) {
        viewModel.obtainEvent(it)
    }
    LaunchedEffect(key1 = actions.value) {
        when(actions.value) {
            is LoginAction.OpenRegisterScreen -> {
                navHostController.navigate(NavigationTree.AuthNavigation.Register.name)
            }
            is LoginAction.OpenForgotPasswordScreen -> {
                navHostController.navigate(NavigationTree.AuthNavigation.ForgotPassword.name)

            }
            is LoginAction.OpenPopularScreen -> {
                navHostController.navigate(NavigationTree.MoviesNavigation.Populars.name)
            }
            else -> {}
        }
    }




}