package kz.homebank.base.presentation.dialog.status

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.databinding.PresentationBottomFragmentStatusBinding
import kz.homebank.base.presentation.dialog.FullHeightBottomFragment
import kz.homebank.base.presentation.dialog.status.StatusArg.Companion.RESULT_PRIMARY_BTN_CLICK
import kz.homebank.base.presentation.dialog.status.StatusArg.Companion.RESULT_SECONDARY_BTN_CLICK

class StatusBottomFragment : FullHeightBottomFragment(R.layout.presentation_bottom_fragment_status) {

    private val binding by viewBinding(PresentationBottomFragmentStatusBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setContent()
        setListeners()
    }

    private fun setContent() {
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
                    btnSecondary.setText(it.btnSecondaryRes!!)
                }
            }
        }
    }

    private fun setListeners() {
        with(binding) {
            btnPrimary.setOnClickListener {
                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    RESULT_PRIMARY_BTN_CLICK, true
                )
                findNavController().popBackStack()
            }
            btnSecondary.setOnClickListener {
                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    RESULT_SECONDARY_BTN_CLICK, true
                )
                findNavController().popBackStack()
            }
        }
    }
}