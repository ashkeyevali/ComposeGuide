package kz.homebank.base.presentation.dialog.biometry

import androidx.annotation.StringRes
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

suspend fun Fragment.biometryAuth(
    @StringRes titleResId: Int,
    @StringRes descriptionResId: Int = 0,
    @StringRes negativeBtnTextResId: Int
): BiometryResult {
    return suspendCancellableCoroutine { continuation ->
        val executor = ContextCompat.getMainExecutor(requireContext())
        val biometricPrompt = BiometricPrompt(this, executor, object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                continuation.resume(BiometryResult.Error(errorCode, errString.toString()))
            }

            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                continuation.resume(BiometryResult.Success(result))
            }
        })
        continuation.invokeOnCancellation { biometricPrompt.cancelAuthentication() }

        val promptInfo = BiometricPrompt.PromptInfo.Builder().apply {
            setTitle(getString(titleResId))
            setConfirmationRequired(false)
            setNegativeButtonText(getString(negativeBtnTextResId))
            if (descriptionResId != 0) {
                setDescription(getString(descriptionResId))
            }
        }.build()
        biometricPrompt.authenticate(promptInfo)
    }
}

