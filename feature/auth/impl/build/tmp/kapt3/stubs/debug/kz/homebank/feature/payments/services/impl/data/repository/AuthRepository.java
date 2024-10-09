package kz.homebank.feature.payments.services.impl.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lkz/homebank/feature/payments/services/impl/data/repository/AuthRepository;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "networkCaller", "Lkz/homebank/base/network/api/network_utils/NetworkCaller;", "paymentServicesApiServiceV6", "Lkz/homebank/feature/payments/services/impl/data/repository/AuthApiService;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkz/homebank/base/network/api/network_utils/NetworkCaller;Lkz/homebank/feature/payments/services/impl/data/repository/AuthApiService;)V", "login", "Lkz/homebank/feature/payments/services/impl/data/model/AuthModel;", "body", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v5.34.65(539)_debug"})
public final class AuthRepository {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.base.network.api.network_utils.NetworkCaller networkCaller = null;
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.feature.payments.services.impl.data.repository.AuthApiService paymentServicesApiServiceV6 = null;
    
    @javax.inject.Inject
    public AuthRepository(@kz.homebank.libraries.kotlin.api.coroutine.IoDispatcher
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull
    kz.homebank.base.network.api.network_utils.NetworkCaller networkCaller, @org.jetbrains.annotations.NotNull
    kz.homebank.feature.payments.services.impl.data.repository.AuthApiService paymentServicesApiServiceV6) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kz.homebank.feature.payments.services.impl.data.model.AuthModel> $completion) {
        return null;
    }
}