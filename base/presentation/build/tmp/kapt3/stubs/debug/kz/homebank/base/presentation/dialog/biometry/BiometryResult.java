package kz.homebank.base.presentation.dialog.biometry;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lkz/homebank/base/presentation/dialog/biometry/BiometryResult;", "", "Error", "Success", "Lkz/homebank/base/presentation/dialog/biometry/BiometryResult$Error;", "Lkz/homebank/base/presentation/dialog/biometry/BiometryResult$Success;", "v5.34.65(539)_debug"})
public abstract interface BiometryResult {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lkz/homebank/base/presentation/dialog/biometry/BiometryResult$Error;", "Lkz/homebank/base/presentation/dialog/biometry/BiometryResult;", "errorCode", "", "errorString", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorString", "()Ljava/lang/String;", "v5.34.65(539)_debug"})
    public static final class Error implements kz.homebank.base.presentation.dialog.biometry.BiometryResult {
        private final int errorCode = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String errorString = null;
        
        public Error(int errorCode, @org.jetbrains.annotations.NotNull
        java.lang.String errorString) {
            super();
        }
        
        public final int getErrorCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getErrorString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/base/presentation/dialog/biometry/BiometryResult$Success;", "Lkz/homebank/base/presentation/dialog/biometry/BiometryResult;", "authResult", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V", "getAuthResult", "()Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "v5.34.65(539)_debug"})
    public static final class Success implements kz.homebank.base.presentation.dialog.biometry.BiometryResult {
        @org.jetbrains.annotations.NotNull
        private final androidx.biometric.BiometricPrompt.AuthenticationResult authResult = null;
        
        public Success(@org.jetbrains.annotations.NotNull
        androidx.biometric.BiometricPrompt.AuthenticationResult authResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.biometric.BiometricPrompt.AuthenticationResult getAuthResult() {
            return null;
        }
    }
}