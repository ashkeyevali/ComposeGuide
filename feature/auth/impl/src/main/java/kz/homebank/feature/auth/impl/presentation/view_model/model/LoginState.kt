package kz.homebank.feature.auth.impl.presentation.view_model.model

data class LoginState(
    val email: String,
    val password: String,
    val isSending: Boolean = false,
    val passwordHidden: Boolean = true,
    val isLoginSuccess: Boolean = false
)