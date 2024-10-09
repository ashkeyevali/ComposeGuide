package kz.homebank.base.presentation.vm.factory

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kz.homebank.base.presentation.vm.BaseViewModel

/**
 * Base skeleton for inheritance vm factories that annotated with [dagger.assisted.AssistedFactory]
 *
 * Example:
 * class MyViewModel
 * @AssistedInject constructor(@Assisted savedState: SavedStateHandle) : BaseViewModel() {
        @AssistedFactory
        interface Factory : SavedStateVmFactory<MyViewModel>
    }
 *  */
interface SavedStateVmFactory<T : BaseViewModel> {
    fun create(savedState: SavedStateHandle): T
}
