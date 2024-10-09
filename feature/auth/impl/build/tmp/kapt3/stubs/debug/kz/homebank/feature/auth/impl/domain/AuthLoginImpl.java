package kz.homebank.feature.auth.impl.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u00a2\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\u00020\u00052\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004H\u0096@\u00a2\u0006\u0002\u0010\rR\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lkz/homebank/feature/auth/impl/domain/AuthLoginImpl;", "Lkz/homebank/base/domain/use_case/UseCase;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Lkz/homebank/feature/payments/services/impl/data/model/AuthModel;", "paymentServicesRepository", "Lkz/homebank/feature/payments/services/impl/data/repository/AuthRepository;", "authTokenHolder", "Lkotlinx/coroutines/flow/MutableStateFlow;", "(Lkz/homebank/feature/payments/services/impl/data/repository/AuthRepository;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "execute", "param", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v5.34.65(539)_debug"})
public final class AuthLoginImpl extends kz.homebank.base.domain.use_case.UseCase<java.util.HashMap<java.lang.String, java.lang.String>, kz.homebank.feature.payments.services.impl.data.model.AuthModel> {
    @org.jetbrains.annotations.NotNull
    private final kz.homebank.feature.payments.services.impl.data.repository.AuthRepository paymentServicesRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> authTokenHolder = null;
    
    @javax.inject.Inject
    public AuthLoginImpl(@org.jetbrains.annotations.NotNull
    kz.homebank.feature.payments.services.impl.data.repository.AuthRepository paymentServicesRepository, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> authTokenHolder) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.String> param, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kz.homebank.feature.payments.services.impl.data.model.AuthModel> $completion) {
        return null;
    }
}