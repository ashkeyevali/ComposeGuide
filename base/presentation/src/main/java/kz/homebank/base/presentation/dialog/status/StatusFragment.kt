package kz.homebank.base.presentation.dialog.status

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.databinding.PresentationFragmentStatusBinding
import kz.homebank.base.presentation.fragment.BaseFragment

class StatusFragment : BaseFragment(R.layout.presentation_fragment_status) {
    private val binding by viewBinding(PresentationFragmentStatusBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setArgument()
        setListeners()
    }

    private fun setArgument() {
        val statusContent: StatusArg? = arguments?.getParcelable(StatusArg.EXTRA_STATUS_ARG)
        statusContent?.let {
            with(binding) {
                view?.findViewById<TextView>(R.id.tvHeader)?.text = it.header
                ivIcon.setImageResource(it.ivRes)
                tvTitle.text = it.title
                tvSubtitle.text = it.subtitle
                btnPrimary.setText(it.btnPrimaryRes)
                if (it.btnSecondaryRes != null) {
                    btnSecondary.isVisible = true
                    btnSecondary.setText(it.btnSecondaryRes)
                }
                configureBackBtn(it.backBtnEnabled)
            }
        }
    }

    private fun setListeners() {
        with(binding) {
            btnPrimary.setOnClickListener {
                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    StatusArg.RESULT_PRIMARY_BTN_CLICK, true
                )
                findNavController().popBackStack()
            }
            btnSecondary.setOnClickListener {
                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    StatusArg.RESULT_SECONDARY_BTN_CLICK, true
                )
                findNavController().popBackStack()
            }
        }
    }

    private fun configureBackBtn(isBackBtnEnabled: Boolean) {
        if (!isBackBtnEnabled) {
            val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {}
            }
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
        }
    }
}