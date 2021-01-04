package sotra.ynab.ui.budgetFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019J\u0006\u0010\u001c\u001a\u00020\u0011J(\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\b2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0007\u0012\u0004\u0012\u00020\u001b0\u0019R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006!"}, d2 = {"Lsotra/ynab/ui/budgetFragment/BudgetViewModel;", "Landroidx/lifecycle/ViewModel;", "network", "Lsotra/ynab/repo/NetworkRepo;", "(Lsotra/ynab/repo/NetworkRepo;)V", "budgets", "Landroidx/lifecycle/MutableLiveData;", "", "Lsotra/ynab/data/budgets/Budget;", "getBudgets", "()Landroidx/lifecycle/MutableLiveData;", "loading", "", "getLoading", "networkStatus", "getNetworkStatus", "addAccount", "Lkotlinx/coroutines/Job;", "id", "", "name", "accType", "balance", "", "deliverAccount", "Lkotlin/Function1;", "Lsotra/ynab/data/budgets/Account;", "", "getBudget", "getPayees", "item", "deliverPayees", "Lsotra/ynab/data/payee/Payee;", "app_debug"})
public final class BudgetViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<sotra.ynab.data.budgets.Budget>> budgets = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> networkStatus = null;
    private final sotra.ynab.repo.NetworkRepo network = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<sotra.ynab.data.budgets.Budget>> getBudgets() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getBudget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String accType, int balance, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super sotra.ynab.data.budgets.Account, kotlin.Unit> deliverAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getPayees(@org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Budget item, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<sotra.ynab.data.payee.Payee>, kotlin.Unit> deliverPayees) {
        return null;
    }
    
    @javax.inject.Inject()
    public BudgetViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.repo.NetworkRepo network) {
        super();
    }
}