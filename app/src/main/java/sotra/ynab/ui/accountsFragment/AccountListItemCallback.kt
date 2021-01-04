package sotra.ynab.ui.accountsFragment

import sotra.ynab.data.budgets.Account

interface  AccountListItemCallback {
    fun addTransaction(item: Account)
}