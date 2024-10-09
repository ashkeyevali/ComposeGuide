package kz.homebank.base.presentation.vm;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001eH\u0004J(\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001eH\u0002JH\u0010!\u001a\u00020\n\"\u0004\b\u0000\u0010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0$2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\n0\u001eH\u0004JH\u0010&\u001a\u00020\n\"\u0004\b\u0000\u0010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0$2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\n0\u001eH\u0004J\u00b5\u0001\u0010\'\u001a\u00020(\"\u0004\b\u0000\u0010)2\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0+\u0012\u0006\u0012\u0004\u0018\u00010,0\u001e2$\b\u0002\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0+\u0012\u0006\u0012\u0004\u0018\u00010,0-2$\b\u0002\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0+\u0012\u0006\u0012\u0004\u0018\u00010,0-2&\b\u0002\u0010\u001d\u001a \b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0+\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010-2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\n00H\u0004\u00a2\u0006\u0002\u00101J\u001a\u00102\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\n00H\u0084\b\u00f8\u0001\u0000JL\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H70605\"\b\b\u0000\u0010)*\u00020,\"\b\b\u0001\u00107*\u00020,*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)06052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H70\u001eH\u0004J>\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0$05\"\u0004\b\u0000\u0010)*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0$052\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u00020\n0\u001eH\u0004R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006:"}, d2 = {"Lkz/homebank/base/presentation/vm/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "get_isLoading", "()Landroidx/lifecycle/MutableLiveData;", "_noConnection", "Lkz/homebank/base/presentation/livedata/Event;", "", "get_noConnection", "_toast", "Lkz/homebank/base/presentation/text/UiText;", "get_toast", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "noConnection", "getNoConnection", "serializer", "Lkz/homebank/libraries/kotlin/api/serialization/Serializer;", "getSerializer", "()Lkz/homebank/libraries/kotlin/api/serialization/Serializer;", "toast", "getToast", "handleException", "exception", "", "onError", "Lkotlin/Function1;", "Lkz/homebank/base/network/model/ResponseError;", "handlePaymentException", "handlePaymentResult", "R", "result", "Lkz/homebank/base/domain/result/Result;", "onSuccess", "handleResult", "networkRequest", "Lkotlinx/coroutines/Job;", "T", "request", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/Function2;", "onLoading", "finally", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/Job;", "withLoading", "action", "collectPagingRequest", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "S", "mappedData", "onResultSuccess", "v5.34.65(539)_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kz.homebank.base.presentation.livedata.Event<kz.homebank.base.presentation.text.UiText>> _toast = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kz.homebank.base.presentation.livedata.Event<kotlin.Unit>> _noConnection = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.lifecycle.MutableLiveData<kz.homebank.base.presentation.livedata.Event<kz.homebank.base.presentation.text.UiText>> get_toast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kz.homebank.base.presentation.livedata.Event<kz.homebank.base.presentation.text.UiText>> getToast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.lifecycle.MutableLiveData<kz.homebank.base.presentation.livedata.Event<kotlin.Unit>> get_noConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kz.homebank.base.presentation.livedata.Event<kotlin.Unit>> getNoConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kz.homebank.libraries.kotlin.api.serialization.Serializer getSerializer() {
        return null;
    }
    
    protected final void withLoading(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final <T extends java.lang.Object>kotlinx.coroutines.Job networkRequest(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> request, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onLoading, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> p4_1720853697) {
        return null;
    }
    
    protected final <R extends java.lang.Object>void handleResult(@org.jetbrains.annotations.NotNull
    kz.homebank.base.domain.result.Result<? extends R> result, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super kz.homebank.base.network.model.ResponseError, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super R, kotlin.Unit> onSuccess) {
    }
    
    protected final void handleException(@org.jetbrains.annotations.NotNull
    java.lang.Throwable exception, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super kz.homebank.base.network.model.ResponseError, kotlin.Unit> onError) {
    }
    
    protected final <R extends java.lang.Object>void handlePaymentResult(@org.jetbrains.annotations.NotNull
    kz.homebank.base.domain.result.Result<? extends R> result, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super kz.homebank.base.network.model.ResponseError, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super R, kotlin.Unit> onSuccess) {
    }
    
    private final void handlePaymentException(java.lang.Throwable exception, kotlin.jvm.functions.Function1<? super kz.homebank.base.network.model.ResponseError, kotlin.Unit> onError) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<kz.homebank.base.domain.result.Result<T>> onResultSuccess(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends kz.homebank.base.domain.result.Result<? extends T>> $this$onResultSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final <T extends java.lang.Object, S extends java.lang.Object>kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<S>> collectPagingRequest(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> $this$collectPagingRequest, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, ? extends S> mappedData) {
        return null;
    }
}