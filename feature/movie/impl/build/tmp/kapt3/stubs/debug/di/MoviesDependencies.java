package di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Ldi/MoviesDependencies;", "Lkz/homebank/module_injector/BaseDependencies;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "networkCaller", "Lkz/homebank/base/network/api/network_utils/NetworkCaller;", "getNetworkCaller", "()Lkz/homebank/base/network/api/network_utils/NetworkCaller;", "serviceFactory", "Lkz/homebank/base/network/api/network_client/ApiServiceFactory;", "getServiceFactory", "()Lkz/homebank/base/network/api/network_client/ApiServiceFactory;", "v5.34.65(539)_debug"})
public abstract interface MoviesDependencies extends kz.homebank.module_injector.BaseDependencies {
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.base.network.api.network_client.ApiServiceFactory getServiceFactory();
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.base.network.api.network_utils.NetworkCaller getNetworkCaller();
    
    @kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineDispatcher getIoDispatcher();
}