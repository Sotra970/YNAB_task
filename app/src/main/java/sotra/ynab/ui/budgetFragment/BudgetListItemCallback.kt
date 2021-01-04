package sotra.ynab.ui.budgetFragment

import android.view.View
import sotra.ynab.data.budgets.Budget

interface  BudgetListItemCallback {
    fun addAccount(item :Budget)
    fun viewAccounts(item: Budget)
    fun payees(item: Budget)
}