package sotra.ynab.ui.accountsFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J4\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a0\u0018J \u0010\u001b\u001a\u00020\u00102\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d\u0012\u0004\u0012\u00020\u001a0\u0018J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u0006 "}, d2 = {"Lsotra/ynab/ui/accountsFragment/AccountViewModel;", "Landroidx/lifecycle/ViewModel;", "network", "Lsotra/ynab/repo/NetworkRepo;", "(Lsotra/ynab/repo/NetworkRepo;)V", "budget", "Landroidx/lifecycle/MutableLiveData;", "Lsotra/ynab/data/budgets/Budget;", "getBudget", "()Landroidx/lifecycle/MutableLiveData;", "loading", "", "getLoading", "networkStatus", "getNetworkStatus", "addTransaction", "Lkotlinx/coroutines/Job;", "account", "Lsotra/ynab/data/budgets/Account;", "payee", "Lsotra/ynab/data/payee/Payee;", "amount", "", "deliverTransaction", "Lkotlin/Function1;", "Lsotra/ynab/data/transaction/TransactionsResponse;", "", "getPayees", "deliverPayees", "", "setBudget", "item", "app_debug"})
public final class AccountViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<sotra.ynab.data.budgets.Budget> budget = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> networkStatus = null;
    private final sotra.ynab.repo.NetworkRepo network = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<sotra.ynab.data.budgets.Budget> getBudget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNetworkStatus() {
        return null;
    }
    
    public final void setBudget(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Budget item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getPayees(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<sotra.ynab.data.payee.Payee>, kotlin.Unit> deliverPayees) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addTransaction(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Account account, @org.jetbrains.annotations.NotNull()
    sotra.ynab.data.payee.Payee payee, int amount, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super sotra.ynab.data.transaction.TransactionsResponse, kotlin.Unit> deliverTransaction) {
        return null;
    }
    
    @javax.inject.Inject()
    public AccountViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.repo.NetworkRepo network) {
        super();
    }
}