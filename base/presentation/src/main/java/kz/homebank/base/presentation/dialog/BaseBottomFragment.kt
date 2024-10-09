package kz.homebank.base.presentation.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kz.homebank.base.presentation.R

abstract class BaseBottomFragment(
    @LayoutRes private val layoutId: Int
) : BottomSheetDialogFragment() {

    protected var title:String = ""
    companion object {
        const val EXTRA_HEADER = "header"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_TITLE, R.style.HomebankBottomSheetDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.presentation_bottom_fragment, container, false)
        view.findViewById<ViewStub>(R.id.stub).apply {
            layoutResource = layoutId
            inflate()
        }
        return view
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener {
            val d = dialog as BottomSheetDialog

            d.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
                ?.let { bottomSheet ->
                    val behavior = BottomSheetBehavior.from(bottomSheet)
                    val inflatedView = d.findViewById<View>(R.id.inflatedView)
                    behavior.peekHeight = 0
                    behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    behavior.addBottomSheetCallback(
                        object : BottomSheetBehavior.BottomSheetCallback() {
                            override fun onSlide(bottomSheet: View, slideOffset: Float) {}

                            override fun onStateChanged(bottomSheet: View, newState: Int) {
                                if (newState == BottomSheetBehavior.STATE_DRAGGING &&
                                    (inflatedView?.scrollY ?: 0) > 0
                                ) {
                                    behavior.state = BottomSheetBehavior.STATE_EXPANDED
                                } else if (newState == BottomSheetBehavior.STATE_COLLAPSED ||
                                    newState == BottomSheetBehavior.STATE_HALF_EXPANDED
                                ) {
                                    dismiss()
                                }
                            }
                        })
                }
        }
        return dialog
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(view) {
            val header: String? = arguments?.getString(EXTRA_HEADER) ?: title
            findViewById<TextView>(R.id.tvHeader).text = header
            findViewById<ImageView>(R.id.btnClose).setOnClickListener { dismiss() }
        }
    }

}