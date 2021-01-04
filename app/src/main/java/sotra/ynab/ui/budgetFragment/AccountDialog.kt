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
class AccountDialog : BaseDialog() {

    private lateinit var radioGroup: RadioGroup
    private lateinit  var dialog_acc_name_input: TextInputEditText
    private lateinit  var dialog_acc_balance_input: TextInputEditText
    private lateinit  var dialog_acc_balance_input_layout: TextInputLayout
    private lateinit  var dialog_acc_name_input_layout: TextInputLayout
    private val radioButtons = arrayOf( "checking", "savings", "creditCard", "cash", "lineOfCredit", "otherAsset"  , "otherLiability" )
    var type: String = radioButtons[0]
    private var  callback: Callback? = null
    override fun createDialogView(): View {
        val v: View = LayoutInflater.from(context).inflate(R.layout.account_dialog, null)
        createDialgsRadioButtons(v)
        v.findViewById<View>(R.id.dialog_confirm).setOnClickListener { confirm()}
        v.findViewById<View>(R.id.dialog_cancel).setOnClickListener { dismiss()}
        dialog_acc_name_input = v.findViewById<TextInputEditText>(R.id.dialog_acc_name_input)
        dialog_acc_name_input.requestFocus()
        dialog_acc_balance_input = v.findViewById<TextInputEditText>(R.id.dialog_acc_balance_input)
        dialog_acc_balance_input_layout = v.findViewById<TextInputLayout>(R.id.dialog_acc_balance_input_layout)
        dialog_acc_name_input_layout = v.findViewById<TextInputLayout>(R.id.dialog_acc_name_input_layout)
        return v
    }

    fun createDialgsRadioButtons(v: View) {
        for (i in radioButtons.indices) {
            val radioButtonView = RadioButton(this.context)
            radioButtonView.setText(radioButtons[i])
            if (i==0)radioButtonView.isChecked = true
            radioButtonView.id = Random.nextInt()
           radioGroup =  v.findViewById<RadioGroup>(R.id.radioGroup)
           radioGroup.addView(radioButtonView)
        }
        v.findViewById<RadioGroup>(R.id.radioGroup).setOnCheckedChangeListener { group, checkedId ->
            val selectedId = radioGroup.checkedRadioButtonId
            var radioButton = radioGroup.findViewById(selectedId) as RadioButton
            type = radioButton.text.toString()
        }
    }
    fun confirm() {
        if (
                isValidInput(dialog_acc_name_input , dialog_acc_name_input_layout)&&
                isValidInput(dialog_acc_balance_input , dialog_acc_balance_input_layout)

        ){
            callback?.deliverValue(dialog_acc_name_input.text.toString(),
                    type ,
                    dialog_acc_balance_input.text.toString().toDouble().toInt())
            dismiss()
        }
    }

    public interface Callback {
        fun deliverValue(name: String, accType: String, balance: Int)
    }

    companion object {
        fun getInstance(callback: Callback?): AccountDialog {
            val accountDialog = AccountDialog()
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