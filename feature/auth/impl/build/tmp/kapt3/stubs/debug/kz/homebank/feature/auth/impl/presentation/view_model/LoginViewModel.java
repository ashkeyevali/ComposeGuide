package kz.homebank.feature.auth.impl.presentation.view_model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lkz/homebank/feature/auth/impl/presentation/view_model/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authLoginImpl", "Lkz/homebank/feature/auth/impl/domain/AuthLoginImpl;", "(Lkz/homebank/feature/auth/impl/domain/AuthLoginImpl;)V", "_viewAction", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Llogin/models/LoginAction;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkz/homebank/feature/auth/impl/presentation/view_model/model/LoginState;", "viewAction", "Lkotlinx/coroutines/flow/SharedFlow;", "getViewAction", "()Lkotlinx/coroutines/flow/SharedFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "obtainEmailChanged", "", "value", "", "obtainEvent", "viewEvent", "Llogin/models/LoginEvent;", "obtainPasswordChanged", "openForgotPasswordScreen", "openRegisterScreen", "sendLogin", "showPassword", "v5.34.65(539)_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.feature.auth.impl.domain.AuthLoginImpl authLoginImpl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<login.models.LoginAction> _viewAction = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<login.models.LoginAction> viewAction = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    kz.homebank.feature.auth.impl.domain.AuthLoginImpl authLoginImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<login.models.LoginAction> getViewAction() {
        return null;
    }
    
    public final void obtainEvent(@org.jetbrains.annotations.NotNull
    login.models.LoginEvent viewEvent) {
    }
    
    private final void showPassword() {
    }
    
    private final void sendLogin() {
    }
    
    private final void openRegisterScreen() {
    }
    
    private final void openForgotPasswordScreen() {
    }
    
    private final void obtainEmailChanged(java.lang.String value) {
    }
    
    private final void obtainPasswordChanged(java.lang.String value) {
    }
}