package sotra.ynab.ui.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006."}, d2 = {"Lsotra/ynab/ui/transactions/TransactionsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/android/example/github/di/Injectable;", "()V", "<set-?>", "Lsotra/ynab/ui/transactions/TransactionsAdapter;", "adapter", "getAdapter", "()Lsotra/ynab/ui/transactions/TransactionsAdapter;", "setAdapter", "(Lsotra/ynab/ui/transactions/TransactionsAdapter;)V", "adapter$delegate", "Lsotra/ynab/util/AutoClearedValue;", "Lsotra/ynab/databinding/TransactionFragmentBinding;", "binding", "getBinding", "()Lsotra/ynab/databinding/TransactionFragmentBinding;", "setBinding", "(Lsotra/ynab/databinding/TransactionFragmentBinding;)V", "binding$delegate", "viewModel", "Lsotra/ynab/ui/transactions/TransactionsViewModel;", "getViewModel", "()Lsotra/ynab/ui/transactions/TransactionsViewModel;", "setViewModel", "(Lsotra/ynab/ui/transactions/TransactionsViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getDataFromViewmodel", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupBinding", "startObserving", "app_debug"})
public final class TransactionsFragment extends androidx.fragment.app.Fragment implements com.android.example.github.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public sotra.ynab.ui.transactions.TransactionsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final sotra.ynab.util.AutoClearedValue binding$delegate = null;
    private final sotra.ynab.util.AutoClearedValue adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.ui.transactions.TransactionsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.transactions.TransactionsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.databinding.TransactionFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    sotra.ynab.databinding.TransactionFragmentBinding p0) {
    }
    
    private final sotra.ynab.ui.transactions.TransactionsAdapter getAdapter() {
        return null;
    }
    
    private final void setAdapter(sotra.ynab.ui.transactions.TransactionsAdapter p0) {
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
    
    private final void getDataFromViewmodel(android.os.Bundle savedInstanceState) {
    }
    
    private final void startObserving() {
    }
    
    public TransactionsFragment() {
        super();
    }
}