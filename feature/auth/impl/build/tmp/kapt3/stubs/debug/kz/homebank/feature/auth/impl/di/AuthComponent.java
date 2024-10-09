package kz.homebank.feature.auth.impl.di;

@javax.inject.Singleton
@dagger.Component(dependencies = {kz.homebank.feature.auth.impl.di.AuthDependencies.class}, modules = {kz.homebank.feature.auth.impl.di.AuthProviderModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/feature/auth/impl/di/AuthComponent;", "Lkz/homebank/feature/auth/api/AuthApi;", "loginViewModel", "Lkz/homebank/feature/auth/impl/presentation/view_model/LoginViewModel;", "getLoginViewModel", "()Lkz/homebank/feature/auth/impl/presentation/view_model/LoginViewModel;", "Companion", "v5.34.65(539)_debug"})
public abstract interface AuthComponent extends kz.homebank.feature.auth.api.AuthApi {
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.feature.auth.impl.di.AuthComponent.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.feature.auth.impl.presentation.view_model.LoginViewModel getLoginViewModel();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/feature/auth/impl/di/AuthComponent$Companion;", "", "()V", "initAndGet", "Lkz/homebank/feature/auth/impl/di/AuthComponent;", "dependencies", "Lkz/homebank/feature/auth/impl/di/AuthDependencies;", "v5.34.65(539)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.homebank.feature.auth.impl.di.AuthComponent initAndGet(@org.jetbrains.annotations.NotNull
        kz.homebank.feature.auth.impl.di.AuthDependencies dependencies) {
            return null;
        }
    }
}