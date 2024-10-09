package kz.homebank.feature.auth.impl.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\t0\bH\u0007\u00a8\u0006\f"}, d2 = {"Lkz/homebank/feature/auth/impl/di/AuthProviderModule;", "", "()V", "providePaymentServicesApiService", "Lkz/homebank/feature/payments/services/impl/data/repository/AuthApiService;", "factory", "Lkz/homebank/base/network/api/network_client/ApiServiceFactory;", "provideTokenAndUserFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "Lkz/homebank/feature/payments/services/impl/data/model/AuthModel;", "", "v5.34.65(539)_debug"})
public final class AuthProviderModule {
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.feature.auth.impl.di.AuthProviderModule INSTANCE = null;
    
    private AuthProviderModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final kz.homebank.feature.payments.services.impl.data.repository.AuthApiService providePaymentServicesApiService(@org.jetbrains.annotations.NotNull
    kz.homebank.base.network.api.network_client.ApiServiceFactory factory) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Pair<kz.homebank.feature.payments.services.impl.data.model.AuthModel, java.lang.String>> provideTokenAndUserFlow() {
        return null;
    }
}