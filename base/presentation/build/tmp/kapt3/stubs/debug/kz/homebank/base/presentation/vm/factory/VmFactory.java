package kz.homebank.base.presentation.vm.factory;

/**
 * VM factory that creates view model without [androidx.lifecycle.SavedStateHandle]
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\u0004\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lkz/homebank/base/presentation/vm/factory/VmFactory;", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "v5.34.65(539)_debug"})
public final class VmFactory<T extends androidx.lifecycle.ViewModel> implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<T> create = null;
    
    public VmFactory(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends T> create) {
        super();
    }
    
    @java.lang.Override
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.viewmodel.CreationExtras extras) {
        return null;
    }
}