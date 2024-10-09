package kz.homebank.feature.auth.impl.presentation.view_model


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kz.homebank.feature.auth.impl.domain.AuthLoginImpl
import kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState
import javax.inject.Inject

internal class LoginViewModel @Inject constructor(
    private val authLoginImpl: AuthLoginImpl
): ViewModel() {
    private val _viewState = MutableStateFlow(LoginState(email = "", password = ""))
    val viewState: StateFlow<LoginState> = _viewState
    private val _navigateToPopularMovies = MutableStateFlow(false)
    val navigateToPopularMovies: StateFlow<Boolean> = _navigateToPopularMovies
    fun showPassword() {
        _viewState.value = _viewState.value.copy(
            passwordHidden = !viewState.value.passwordHidden
        )
    }

    fun sendLogin() {
        _viewState.value = _viewState.value.copy(
            isSending = true
        )
        viewModelScope.launch {
            try {
                val response = authLoginImpl.execute(hashMapOf( Pair(viewState.value.email, viewState.value.password)))
                if(response.success) {
                    _viewState.value = _viewState.value.copy(
                        email = "", password = "",
                        isSending = false, isLoginSuccess = true
                    )
                    _navigateToPopularMovies.value = true
                } else {
                    _viewState.value = _viewState.value.copy(
                        isSending = false
                    )
                }
            } catch (e: Exception) {
                _viewState.value = _viewState.value.copy(
                    isSending = false,
                )
            }
        }
    }

    fun onNavigationDone() {
        _navigateToPopularMovies.value = false
    }

    fun obtainEmailChanged(value: String) {
        _viewState.value = _viewState.value.copy(
            email = value
        )
    }

    fun obtainPasswordChanged(value: String) {
        _viewState.value = _viewState.value.copy(
            password = value
        )
    }
}