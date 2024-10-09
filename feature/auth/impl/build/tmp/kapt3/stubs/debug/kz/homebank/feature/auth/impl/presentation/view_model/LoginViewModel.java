package kz.homebank.feature.auth.impl.presentation.view_model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lkz/homebank/feature/auth/impl/presentation/view_model/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authLoginImpl", "Lkz/homebank/feature/auth/impl/domain/AuthLoginImpl;", "(Lkz/homebank/feature/auth/impl/domain/AuthLoginImpl;)V", "_navigateToPopularMovies", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_viewState", "Lkz/homebank/feature/auth/impl/presentation/view_model/model/LoginState;", "navigateToPopularMovies", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigateToPopularMovies", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "getViewState", "obtainEmailChanged", "", "value", "", "obtainPasswordChanged", "onNavigationDone", "sendLogin", "showPassword", "v5.34.65(539)_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.feature.auth.impl.domain.AuthLoginImpl authLoginImpl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<kz.homebank.feature.auth.impl.presentation.view_model.model.LoginState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _navigateToPopularMovies = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> navigateToPopularMovies = null;
    
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
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getNavigateToPopularMovies() {
        return null;
    }
    
    public final void showPassword() {
    }
    
    public final void sendLogin() {
    }
    
    public final void onNavigationDone() {
    }
    
    public final void obtainEmailChanged(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void obtainPasswordChanged(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
}