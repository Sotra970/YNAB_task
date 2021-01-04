package sotra.ynab.ui.budgetFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u00100\u001a\u00020\"H\u0002J\u0010\u00101\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00062"}, d2 = {"Lsotra/ynab/ui/budgetFragment/BudgetFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/android/example/github/di/Injectable;", "Lsotra/ynab/ui/budgetFragment/BudgetListItemCallback;", "()V", "<set-?>", "Lsotra/ynab/databinding/BudgetFragmentBinding;", "binding", "getBinding", "()Lsotra/ynab/databinding/BudgetFragmentBinding;", "setBinding", "(Lsotra/ynab/databinding/BudgetFragmentBinding;)V", "binding$delegate", "Lsotra/ynab/util/AutoClearedValue;", "Lsotra/ynab/ui/budgetFragment/BudgetAdapter;", "budgetAdapter", "getBudgetAdapter", "()Lsotra/ynab/ui/budgetFragment/BudgetAdapter;", "setBudgetAdapter", "(Lsotra/ynab/ui/budgetFragment/BudgetAdapter;)V", "budgetAdapter$delegate", "viewModel", "Lsotra/ynab/ui/budgetFragment/BudgetViewModel;", "getViewModel", "()Lsotra/ynab/ui/budgetFragment/BudgetViewModel;", "setViewModel", "(Lsotra/ynab/ui/budgetFragment/BudgetViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "addAccount", "", "item", "Lsotra/ynab/data/budgets/Budget;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "payees", "setupBinding", "viewAccounts", "app_debug"})
public final class BudgetFragment extends androidx.fragment.app.Fragment implements com.android.example.github.di.Injectable, sotra.ynab.ui.budgetFragment.BudgetListItemCallback {
    @org.jetbrains.annotations.NotNull()
    private final sotra.ynab.util.AutoClearedValue binding$delegate = null;
    private final sotra.ynab.util.AutoClearedValue budgetAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public sotra.ynab.ui.budgetFragment.BudgetViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.databinding.BudgetFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    sotra.ynab.databinding.BudgetFragmentBinding p0) {
    }
    
    private final sotra.ynab.ui.budgetFragment.BudgetAdapter getBudgetAdapter() {
        return null;
    }
    
    private final void setBudgetAdapter(sotra.ynab.ui.budgetFragment.BudgetAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.ui.budgetFragment.BudgetViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.budgetFragment.BudgetViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBinding() {
    }
    
    @java.lang.Override()
    public void addAccount(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Budget item) {
    }
    
    @java.lang.Override()
    public void payees(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Budget item) {
    }
    
    @java.lang.Override()
    public void viewAccounts(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Budget item) {
    }
    
    public BudgetFragment() {
        super();
    }
}