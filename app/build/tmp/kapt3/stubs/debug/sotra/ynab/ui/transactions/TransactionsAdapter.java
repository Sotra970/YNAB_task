package sotra.ynab.ui.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lsotra/ynab/ui/transactions/TransactionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lsotra/ynab/ui/transactions/TransactionsAdapter$TransactionViewHolder;", "()V", "items", "", "Lsotra/ynab/data/transaction/Transaction;", "add", "", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TransactionViewHolder", "app_debug"})
public final class TransactionsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<sotra.ynab.ui.transactions.TransactionsAdapter.TransactionViewHolder> {
    private final java.util.List<sotra.ynab.data.transaction.Transaction> items = null;
    public static final sotra.ynab.ui.transactions.TransactionsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public sotra.ynab.ui.transactions.TransactionsAdapter.TransactionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.transactions.TransactionsAdapter.TransactionViewHolder holder, int position) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<sotra.ynab.data.transaction.Transaction> data) {
    }
    
    public TransactionsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsotra/ynab/ui/transactions/TransactionsAdapter$TransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lsotra/ynab/databinding/TransactionItemBinding;", "(Lsotra/ynab/databinding/TransactionItemBinding;)V", "getBinding", "()Lsotra/ynab/databinding/TransactionItemBinding;", "app_debug"})
    public static final class TransactionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final sotra.ynab.databinding.TransactionItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final sotra.ynab.databinding.TransactionItemBinding getBinding() {
            return null;
        }
        
        public TransactionViewHolder(@org.jetbrains.annotations.NotNull()
        sotra.ynab.databinding.TransactionItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lsotra/ynab/ui/transactions/TransactionsAdapter$Companion;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lsotra/ynab/data/transaction/Transaction;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class Companion extends androidx.recyclerview.widget.DiffUtil.ItemCallback<sotra.ynab.data.transaction.Transaction> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        sotra.ynab.data.transaction.Transaction oldItem, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.transaction.Transaction newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        sotra.ynab.data.transaction.Transaction oldItem, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.transaction.Transaction newItem) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}