package kz.homebank.base.presentation.vm.factory;

/**
 * Base skeleton for inheritance vm factories that annotated with [dagger.assisted.AssistedFactory]
 *
 * Example:
 * class MyViewModel
 * @AssistedInject constructor(@Assisted savedState: SavedStateHandle) : BaseViewModel() {
 *       @AssistedFactory
 *       interface Factory : SavedStateVmFactory<MyViewModel>
 *   }
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lkz/homebank/base/presentation/vm/factory/SavedStateVmFactory;", "T", "Lkz/homebank/base/presentation/vm/BaseViewModel;", "", "create", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)Lkz/homebank/base/presentation/vm/BaseViewModel;", "v5.34.65(539)_debug"})
public abstract interface SavedStateVmFactory<T extends kz.homebank.base.presentation.vm.BaseViewModel> {
    
    @org.jetbrains.annotations.NotNull
    public abstract T create(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState);
}