package sotra.ynab.di.modules;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lsotra/ynab/di/modules/ViewModelModule;", "", "()V", "bindAccountViewModel", "Landroidx/lifecycle/ViewModel;", "vm", "Lsotra/ynab/ui/accountsFragment/AccountViewModel;", "bindBudgetViewModel", "Lsotra/ynab/ui/budgetFragment/BudgetViewModel;", "bindTransactionsViewModel", "Lsotra/ynab/ui/transactions/TransactionsViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lsotra/io/digistask/util/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @sotra.i.chachingdemo.di.ViewModelKey(value = sotra.ynab.ui.budgetFragment.BudgetViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindBudgetViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.budgetFragment.BudgetViewModel vm);
    
    @org.jetbrains.annotations.NotNull()
    @sotra.i.chachingdemo.di.ViewModelKey(value = sotra.ynab.ui.accountsFragment.AccountViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindAccountViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.accountsFragment.AccountViewModel vm);
    
    @org.jetbrains.annotations.NotNull()
    @sotra.i.chachingdemo.di.ViewModelKey(value = sotra.ynab.ui.transactions.TransactionsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindTransactionsViewModel(@org.jetbrains.annotations.NotNull()
    sotra.ynab.ui.transactions.TransactionsViewModel vm);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    sotra.io.digistask.util.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}