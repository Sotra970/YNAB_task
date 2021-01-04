package sotra.ynab.util

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.DialogFragment
import sotra.ynab.R

abstract class BaseDialog : DialogFragment() {
    var cancelCallback: OnDialogCancelCallback? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(this.requireActivity())
        dialog.requestWindowFeature(STYLE_NO_TITLE)
        val v = createDialogView()
        v.setBackgroundColor(
                ResourcesCompat.getColor(
                        resources,
                        R.color.white, null
                )
        )
        dialog.setContentView(v)
        return dialog
    }

    override fun onStart() {
        super.onStart()
        val lp = WindowManager.LayoutParams()
        val window = dialog!!.window
        lp.copyFrom(window!!.attributes)
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        window.attributes = lp
    }

    protected abstract fun createDialogView(): View
    fun cancel() {
        if (cancelCallback != null) {
            cancelCallback!!.onDialogCancelled()
        }
        dismiss()
    }

    interface OnDialogCancelCallback {
        fun onDialogCancelled()
    }
}