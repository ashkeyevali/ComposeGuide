package kz.homebank.base.presentation.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.livedata.EventObserver
import kz.homebank.base.presentation.text.asString
import kz.homebank.base.presentation.vm.BaseViewModel

abstract class ViewModelOwnerFragment<T : BaseViewModel>(
    @LayoutRes layoutId: Int
) : BaseFragment(layoutId) {
    protected abstract val viewModel: T

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.toast.observe(viewLifecycleOwner, EventObserver {
            Toast.makeText(requireContext(), it.asString(requireContext()), Toast.LENGTH_SHORT).show()
        })
        viewModel.isLoading.observe(viewLifecycleOwner) { show ->
            if (show) showLoader() else hideLoader()
        }
        viewModel.noConnection.observe(viewLifecycleOwner, EventObserver {
            showAlert {
                ivRes = R.drawable.presentation_ic_no_connection
                tvTitle = getString(R.string.presentation_low_connection)
                tvSubtitle = getString(R.string.presentation_check_connection)
                setPrimaryBtn(R.string.presentation_try_again)
            }
        })
    }

    fun <T> LifecycleOwner.collectLatest(flow: Flow<T>, action: suspend (T) -> Unit) {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                flow.collectLatest {
                    action.invoke(it)
                }
            }
        }
    }
}