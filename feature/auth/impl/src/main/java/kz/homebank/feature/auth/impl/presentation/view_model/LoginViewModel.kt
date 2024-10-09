package kz.homebank.feature.auth.impl.presentation.view_model


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kz.homebank.feature.auth.impl.domain.AuthLoginImpl
import kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState
import login.models.LoginAction
import login.models.LoginEvent
import javax.inject.Inject

internal class LoginViewModel @Inject constructor(
    private val authLoginImpl: AuthLoginImpl
): ViewModel() {
    private val _viewState = MutableStateFlow(LoginState(email = "", password = ""))
    val viewState: StateFlow<LoginState> = _viewState

    private val _viewAction = MutableSharedFlow<LoginAction>(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val viewAction: SharedFlow<LoginAction> = _viewAction

    fun obtainEvent(viewEvent: LoginEvent) {
        when(viewEvent){
            is LoginEvent.LoginClicked -> sendLogin()
            is LoginEvent.EmailChanged -> obtainEmailChanged(viewEvent.email)
            is LoginEvent.PasswordChanged -> obtainPasswordChanged(viewEvent.password)
            is LoginEvent.ForgotPasswordClicked -> openForgotPasswordScreen()
            is LoginEvent.RegisterClicked -> openRegisterScreen()
            is LoginEvent.PasswordShowClicked -> showPassword()
        }
    }

    private fun showPassword() {
        _viewState.value = _viewState.value.copy(
            passwordHidden = !viewState.value.passwordHidden
        )
    }

    private fun sendLogin() {
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
                    _viewAction.tryEmit(LoginAction.OpenPopularScreen)
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

    private fun openRegisterScreen() {
        _viewAction.tryEmit(LoginAction.OpenRegisterScreen)
    }

    private fun openForgotPasswordScreen() {
        _viewAction.tryEmit(LoginAction.OpenForgotPasswordScreen)
    }

    private fun obtainEmailChanged(value: String) {
        _viewState.value = _viewState.value.copy(
            email = value
        )
    }

    private fun obtainPasswordChanged(value: String) {
        _viewState.value = _viewState.value.copy(
            password = value
        )
    }
}