package sotra.ynab.ui.accountsFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J \u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\n\u0010*\u001a\u0004\u0018\u00010+H\u0002J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00106\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00107\u001a\u00020\"H\u0002J\u0010\u00108\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J&\u00109\u001a\u00020\"2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020)0;2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010<\u001a\u00020\"H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006="}, d2 = {"Lsotra/ynab/ui/accountsFragment/AccountFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/android/example/github/di/Injectable;", "Lsotra/ynab/ui/accountsFragment/AccountListItemCallback;", "()V", "<set-?>", "Lsotra/ynab/ui/accountsFragment/AccountsAdapter;", "adapter", "getAdapter", "()Lsotra/ynab/ui/accountsFragment/AccountsAdapter;", "setAdapter", "(Lsotra/ynab/ui/accountsFragment/AccountsAdapter;)V", "adapter$delegate", "Lsotra/ynab/util/AutoClearedValue;", "Lsotra/ynab/databinding/AccountFragmentBinding;", "binding", "getBinding", "()Lsotra/ynab/databinding/AccountFragmentBinding;", "setBinding", "(Lsotra/ynab/databinding/AccountFragmentBinding;)V", "binding$delegate", "viewModel", "Lsotra/ynab/ui/accountsFragment/AccountViewModel;", "getViewModel", "()Lsotra/ynab/ui/accountsFragment/AccountViewModel;", "setViewModel", "(Lsotra/ynab/ui/accountsFragment/AccountViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "addTransaction", "", "account", "Lsotra/ynab/data/budgets/Account;", "addTransactionCall", "amount", "", "payee", "Lsotra/ynab/data/payee/Payee;", "getEmptyRetryCallback", "Lsotra/ynab/util/RetryCallback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "postRecivedBudget", "setupBinding", "showAcmountDialog", "showPayeeDialog", "filtered", "", "startObserving", "app_debug"})
public final class AccountFragment extends androidx.fragment.app.Fragment implements com.android.example.github.di.Injectable, sotra.ynab.ui.accountsFragment.AccountListItemCallback {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public sotra.ynab.ui.accountsFragment.AccountViewModel viewModel;
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
    public final sotra.ynab.ui.accountsFragment.AccountViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.accountsFragment.AccountViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.databinding.AccountFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    sotra.ynab.databinding.AccountFragmentBinding p0) {
    }
    
    private final sotra.ynab.ui.accountsFragment.AccountsAdapter getAdapter() {
        return null;
    }
    
    private final void setAdapter(sotra.ynab.ui.accountsFragment.AccountsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final sotra.ynab.util.RetryCallback getEmptyRetryCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBinding() {
    }
    
    private final void postRecivedBudget(android.os.Bundle savedInstanceState) {
    }
    
    private final void startObserving() {
    }
    
    @java.lang.Override()
    public void addTransaction(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Account account) {
    }
    
    private final void showAcmountDialog(sotra.ynab.data.budgets.Account account) {
    }
    
    private final void showPayeeDialog(java.util.List<sotra.ynab.data.payee.Payee> filtered, sotra.ynab.data.budgets.Account account, int amount) {
    }
    
    private final void addTransactionCall(sotra.ynab.data.budgets.Account account, int amount, sotra.ynab.data.payee.Payee payee) {
    }
    
    public AccountFragment() {
        super();
    }
}