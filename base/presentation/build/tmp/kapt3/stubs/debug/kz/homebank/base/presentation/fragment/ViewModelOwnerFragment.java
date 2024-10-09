package kz.homebank.base.presentation.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016JG\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u0001*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00132\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015\u00a2\u0006\u0002\u0010\u0018R\u0012\u0010\u0007\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lkz/homebank/base/presentation/fragment/ViewModelOwnerFragment;", "T", "Lkz/homebank/base/presentation/vm/BaseViewModel;", "Lkz/homebank/base/presentation/fragment/BaseFragment;", "layoutId", "", "(I)V", "viewModel", "getViewModel", "()Lkz/homebank/base/presentation/vm/BaseViewModel;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "collectLatest", "Landroidx/lifecycle/LifecycleOwner;", "flow", "Lkotlinx/coroutines/flow/Flow;", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "v5.34.65(539)_debug"})
public abstract class ViewModelOwnerFragment<T extends kz.homebank.base.presentation.vm.BaseViewModel> extends kz.homebank.base.presentation.fragment.BaseFragment {
    
    public ViewModelOwnerFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract T getViewModel();
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final <T extends java.lang.Object>void collectLatest(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner $this$collectLatest, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends T> flow, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
}