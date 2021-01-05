package sotra.ynab.ui.accountsFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lsotra/ynab/ui/accountsFragment/AccountsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lsotra/ynab/ui/accountsFragment/AccountsAdapter$AccountViewHolder;", "callback", "Lsotra/ynab/ui/accountsFragment/AccountListItemCallback;", "(Lsotra/ynab/ui/accountsFragment/AccountListItemCallback;)V", "getCallback", "()Lsotra/ynab/ui/accountsFragment/AccountListItemCallback;", "currencyFormat", "Lsotra/ynab/data/budgets/CurrencyFormat;", "items", "", "Lsotra/ynab/data/budgets/Account;", "add", "", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrency", "AccountViewHolder", "Companion", "app_debug"})
public final class AccountsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<sotra.ynab.ui.accountsFragment.AccountsAdapter.AccountViewHolder> {
    private sotra.ynab.data.budgets.CurrencyFormat currencyFormat;
    private final java.util.List<sotra.ynab.data.budgets.Account> items = null;
    @org.jetbrains.annotations.NotNull()
    private final sotra.ynab.ui.accountsFragment.AccountListItemCallback callback = null;
    public static final sotra.ynab.ui.accountsFragment.AccountsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public sotra.ynab.ui.accountsFragment.AccountsAdapter.AccountViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.accountsFragment.AccountsAdapter.AccountViewHolder holder, int position) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<sotra.ynab.data.budgets.Account> data) {
    }
    
    public final void setCurrency(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.CurrencyFormat currencyFormat) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.ui.accountsFragment.AccountListItemCallback getCallback() {
        return null;
    }
    
    public AccountsAdapter(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.accountsFragment.AccountListItemCallback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsotra/ynab/ui/accountsFragment/AccountsAdapter$AccountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lsotra/ynab/databinding/AccountItemBinding;", "(Lsotra/ynab/databinding/AccountItemBinding;)V", "getBinding", "()Lsotra/ynab/databinding/AccountItemBinding;", "app_debug"})
    public static final class AccountViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final sotra.ynab.databinding.AccountItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final sotra.ynab.databinding.AccountItemBinding getBinding() {
            return null;
        }
        
        public AccountViewHolder(@org.jetbrains.annotations.NotNull()
        sotra.ynab.databinding.AccountItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lsotra/ynab/ui/accountsFragment/AccountsAdapter$Companion;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lsotra/ynab/data/budgets/Account;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class Companion extends androidx.recyclerview.widget.DiffUtil.ItemCallback<sotra.ynab.data.budgets.Account> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Account oldItem, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Account newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Account oldItem, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Account newItem) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}