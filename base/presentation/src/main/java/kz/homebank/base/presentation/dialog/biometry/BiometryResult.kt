package kz.homebank.base.presentation.dialog.biometry

import androidx.biometric.BiometricPrompt

sealed interface BiometryResult {
    class Success(val authResult: BiometricPrompt.AuthenticationResult) : BiometryResult
    class Error(val errorCode: Int, val errorString: String) : BiometryResult
}