package sotra.ynab.ui.budgetFragment

import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import sotra.ynab.R
import sotra.ynab.util.BaseDialog
import kotlin.random.Random


/**
 * Created by ahmed on 17/11/2017.
 */
class AmountDialog : BaseDialog() {

    private lateinit  var dialog_acc_balance_input: TextInputEditText
    private lateinit  var dialog_acc_balance_input_layout: TextInputLayout
    private var  callback: Callback? = null
    override fun createDialogView(): View {
        val v: View = LayoutInflater.from(context).inflate(R.layout.amount_dialog, null)
        v.findViewById<View>(R.id.dialog_confirm).setOnClickListener { confirm()}
        v.findViewById<View>(R.id.dialog_cancel).setOnClickListener { dismiss()}

        dialog_acc_balance_input = v.findViewById<TextInputEditText>(R.id.dialog_acc_balance_input)
        dialog_acc_balance_input_layout = v.findViewById<TextInputLayout>(R.id.dialog_acc_balance_input_layout)

        return v
    }


    fun confirm() {
        if (isValidInput(dialog_acc_balance_input , dialog_acc_balance_input_layout)){
            callback?.deliverValue(dialog_acc_balance_input.text.toString().toDouble().toInt())
            dismiss()
        }
    }

    public interface Callback {
        fun deliverValue( balance: Int)
    }

    companion object {
        fun getInstance(callback: Callback?): AmountDialog {
            val accountDialog = AmountDialog()
            accountDialog.callback = callback
            return accountDialog
        }
    }
    fun isValidInput(editText: EditText, inputLayout: TextInputLayout): Boolean {
        return if(!editText.text.isNullOrEmpty()){
                    inputLayout.error = null
                    inputLayout.isErrorEnabled = false
            true
        }else{
            inputLayout.isErrorEnabled = true
            inputLayout.requestFocus()
            inputLayout.error = requireContext().getString(R.string.empty_error)
            false
        }
    }

}