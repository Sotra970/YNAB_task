package sotra.ynab.ui.budgetFragment

import android.widget.TextView
import sotra.ynab.data.payee.Payee
import sotra.ynab.util.dialog.GenericDialogFragment

class PayeeDialog(val data: List<Payee>, payeesClickListener: GenricDialogFragmentClickListener<Payee>) : GenericDialogFragment<Payee>() {



    override fun GenericDrawText(textView: TextView, item: Payee) {
        textView.text = item.name
    }

    init {
        setData(data)
        setListItemClickListener(payeesClickListener)
    }
}