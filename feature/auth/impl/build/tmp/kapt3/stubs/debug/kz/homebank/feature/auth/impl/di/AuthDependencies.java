package kz.homebank.feature.auth.impl.di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lkz/homebank/feature/auth/impl/di/AuthDependencies;", "Lkz/homebank/module_injector/BaseDependencies;", "authTokenHolder", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getAuthTokenHolder", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "networkCaller", "Lkz/homebank/base/network/api/network_utils/NetworkCaller;", "getNetworkCaller", "()Lkz/homebank/base/network/api/network_utils/NetworkCaller;", "paymentsNetworkCaller", "Lkz/homebank/base/network/api/network_utils/PaymentsNetworkCaller;", "getPaymentsNetworkCaller", "()Lkz/homebank/base/network/api/network_utils/PaymentsNetworkCaller;", "serviceFactory", "Lkz/homebank/base/network/api/network_client/ApiServiceFactory;", "getServiceFactory", "()Lkz/homebank/base/network/api/network_client/ApiServiceFactory;", "v5.34.65(539)_debug"})
public abstract interface AuthDependencies extends kz.homebank.module_injector.BaseDependencies {
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.base.network.api.network_client.ApiServiceFactory getServiceFactory();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getAuthTokenHolder();
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.base.network.api.network_utils.PaymentsNetworkCaller getPaymentsNetworkCaller();
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.base.network.api.network_utils.NetworkCaller getNetworkCaller();
    
    @kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineDispatcher getIoDispatcher();
}