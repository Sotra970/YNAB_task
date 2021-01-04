package sotra.ynab.ui.transactions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import sotra.ynab.data.transaction.Transaction
import sotra.ynab.databinding.TransactionItemBinding


class TransactionsAdapter : RecyclerView.Adapter<TransactionsAdapter.TransactionViewHolder>() {
    private val items: MutableList<Transaction> = mutableListOf()
    companion object: DiffUtil.ItemCallback<Transaction>() {
        override fun areItemsTheSame(oldItem: Transaction, newItem: Transaction): Boolean = oldItem === newItem
        override fun areContentsTheSame(oldItem: Transaction, newItem: Transaction): Boolean = oldItem.id == newItem.id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TransactionItemBinding.inflate(inflater , parent , false)
        return TransactionViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val item = items.get(position)
        holder.binding.item = item
        holder.binding.executePendingBindings()
    }
    fun add(data : List<Transaction>) {
        items.addAll(data)
        items.filter { transaction: Transaction -> !transaction.deleted }
        notifyDataSetChanged()
    }
    class TransactionViewHolder(val binding: TransactionItemBinding) : RecyclerView.ViewHolder(binding.root)




}