package kz.homebank.base.presentation.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import by.kirich1409.viewbindingdelegate.viewBinding
import kz.homebank.base.presentation.R
import kz.homebank.base.presentation.databinding.FragmentStatusProcessBinding

class StatusProcessFragment : BaseFragment(R.layout.fragment_status_process) {

    private val binding: FragmentStatusProcessBinding by viewBinding(FragmentStatusProcessBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val title = it.getString(KEY_TITLE)
            with(binding) {
                if (title.isNullOrEmpty()) tvTitle.visibility = View.GONE
                ivAlert.setImageResource(it.getInt(KEY_IMAGE))
                tvTitle.text = it.getString(KEY_TITLE)
                tvSubtitle.text = it.getString(KEY_DESCRIPTION)
                btnCancel.text = it.getString(KEY_BTN_CANCEL_TEXT)
                btnContinue.text = it.getString(KEY_BTN_CONTINUE_TEXT)
                btnCancel.isVisible = it.getBoolean(KEY_BTN_CANCEL_VISIBLE)
            }
        }
        with(binding) {
            btnCancel.setOnClickListener { btnCancelClicked?.invoke() }
            btnContinue.setOnClickListener { btnContinueClicked?.invoke() }
        }
    }

    companion object {
        val TAG = StatusProcessFragment::class.java.simpleName

        private var btnCancelClicked: (() -> Unit)? = null
        private var btnContinueClicked: (() -> Unit)? = null

        private const val KEY_IMAGE = "image"
        private const val KEY_TITLE = "title"
        private const val KEY_DESCRIPTION = "description"
        private const val KEY_BTN_CANCEL_TEXT = "btnCancelText"
        private const val KEY_BTN_CONTINUE_TEXT = "btnContinueText"
        private const val KEY_BTN_CANCEL_VISIBLE = "btnCancelVisible"

        fun newInstance(
            image: Int,
            title: String,
            description: String,
            btnCancelText: String = "",
            btnContinueText: String,
            btnCancelClick: (() -> Unit)? = null,
            btnContinueClick: (() -> Unit),
            toolbarVisible: Boolean = false,
            btnCancelVisible: Boolean = true,
        ): StatusProcessFragment = StatusProcessFragment().apply {
            btnCancelClicked = btnCancelClick
            btnContinueClicked = btnContinueClick
            arguments = Bundle().apply {
                putInt(KEY_IMAGE, image)
                putString(KEY_TITLE, title)
                putString(KEY_DESCRIPTION, description)
                putString(KEY_BTN_CANCEL_TEXT, btnCancelText)
                putString(KEY_BTN_CONTINUE_TEXT, btnContinueText)
                putBoolean(KEY_BTN_CANCEL_VISIBLE, btnCancelVisible)
                //putBoolean("toolbarVisible", toolbarVisible)
            }
        }
    }
}