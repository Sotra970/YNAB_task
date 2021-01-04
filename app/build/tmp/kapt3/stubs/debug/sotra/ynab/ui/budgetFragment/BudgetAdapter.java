package sotra.ynab.ui.budgetFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lsotra/ynab/ui/budgetFragment/BudgetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lsotra/ynab/ui/budgetFragment/BudgetAdapter$BudgetViewHolder;", "callback", "Lsotra/ynab/ui/budgetFragment/BudgetListItemCallback;", "(Lsotra/ynab/ui/budgetFragment/BudgetListItemCallback;)V", "items", "", "Lsotra/ynab/data/budgets/Budget;", "add", "", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BudgetViewHolder", "Companion", "app_debug"})
public final class BudgetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<sotra.ynab.ui.budgetFragment.BudgetAdapter.BudgetViewHolder> {
    private final java.util.List<sotra.ynab.data.budgets.Budget> items = null;
    private final sotra.ynab.ui.budgetFragment.BudgetListItemCallback callback = null;
    public static final sotra.ynab.ui.budgetFragment.BudgetAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public sotra.ynab.ui.budgetFragment.BudgetAdapter.BudgetViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.budgetFragment.BudgetAdapter.BudgetViewHolder holder, int position) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<sotra.ynab.data.budgets.Budget> data) {
    }
    
    public BudgetAdapter(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.budgetFragment.BudgetListItemCallback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsotra/ynab/ui/budgetFragment/BudgetAdapter$BudgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lsotra/ynab/databinding/BudgetItemBinding;", "(Lsotra/ynab/databinding/BudgetItemBinding;)V", "getBinding", "()Lsotra/ynab/databinding/BudgetItemBinding;", "app_debug"})
    public static final class BudgetViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final sotra.ynab.databinding.BudgetItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final sotra.ynab.databinding.BudgetItemBinding getBinding() {
            return null;
        }
        
        public BudgetViewHolder(@org.jetbrains.annotations.NotNull()
        sotra.ynab.databinding.BudgetItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lsotra/ynab/ui/budgetFragment/BudgetAdapter$Companion;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lsotra/ynab/data/budgets/Budget;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class Companion extends androidx.recyclerview.widget.DiffUtil.ItemCallback<sotra.ynab.data.budgets.Budget> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Budget oldItem, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Budget newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Budget oldItem, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Budget newItem) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}