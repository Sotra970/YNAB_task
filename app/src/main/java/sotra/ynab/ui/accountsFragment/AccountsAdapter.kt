package sotra.ynab.ui.accountsFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import sotra.ynab.data.budgets.Account
import sotra.ynab.data.budgets.CurrencyFormat
import sotra.ynab.databinding.AccountItemBinding


class AccountsAdapter(val callback : AccountListItemCallback) : RecyclerView.Adapter<AccountsAdapter.AccountViewHolder>() {
    private  var currencyFormat: CurrencyFormat? = null
    private val items: MutableList<Account> = mutableListOf()
    companion object: DiffUtil.ItemCallback<Account>() {
        override fun areItemsTheSame(oldItem: Account, newItem: Account): Boolean = oldItem === newItem
        override fun areContentsTheSame(oldItem: Account, newItem: Account): Boolean = oldItem.id == newItem.id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AccountItemBinding.inflate(inflater , parent , false)
        return AccountViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        val item = items.get(position)
        holder.binding.item = item
        holder.binding.currency = currencyFormat
        holder.binding.callback =callback
        holder.binding.executePendingBindings()
    }
    fun add(data : List<Account>) {
        items.addAll(data)
        items.filter { account: Account -> !account.deleted }
        items.sortByDescending { it.balance }
        notifyDataSetChanged()
    }

    fun setCurrency(currencyFormat: CurrencyFormat) {
        this.currencyFormat = currencyFormat
    }

    class AccountViewHolder(val binding: AccountItemBinding) : RecyclerView.ViewHolder(binding.root)




}