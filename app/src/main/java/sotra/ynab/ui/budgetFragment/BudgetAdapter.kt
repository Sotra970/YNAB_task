package sotra.ynab.ui.budgetFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import sotra.ynab.data.budgets.Budget
import sotra.ynab.databinding.BudgetItemBinding
import timber.log.Timber

class BudgetAdapter constructor(private val callback :BudgetListItemCallback): RecyclerView.Adapter<BudgetAdapter.BudgetViewHolder>() {
    private val items: MutableList<Budget> = mutableListOf()
    companion object: DiffUtil.ItemCallback<Budget>() {
        override fun areItemsTheSame(oldItem: Budget, newItem: Budget): Boolean = oldItem === newItem
        override fun areContentsTheSame(oldItem: Budget, newItem: Budget): Boolean = oldItem.id == newItem.id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BudgetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BudgetItemBinding.inflate(inflater , parent , false)
        return BudgetViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BudgetViewHolder, position: Int) {
        val item = items.get(position)
        holder.binding.item = item
        holder.binding.callback =callback
        holder.binding.viewAccounts.visibility = if (!item.accounts.isNullOrEmpty()) View.VISIBLE else View.GONE
        holder.binding.executePendingBindings()
    }
    fun add(data : List<Budget>) {
        items.addAll(data)
        notifyDataSetChanged()
    }
    class BudgetViewHolder(val binding: BudgetItemBinding) : RecyclerView.ViewHolder(binding.root)




}