package sotra.ynab.repo;

import java.lang.System;

/**
 * Created by developers@appgain.io on 12/26/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ?\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lsotra/ynab/repo/NetworkRepo;", "", "apiService", "Lsotra/ynab/api/ApiService;", "(Lsotra/ynab/api/ApiService;)V", "addAccount", "Lsotra/i/chachingdemo/api/ApiResponse;", "Lsotra/ynab/data/accounts/createAcc/AccountResponse;", "Lsotra/ynab/data/Error/ErrorResponse;", "budgetId", "", "name", "accType", "balance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTransaction", "Lsotra/ynab/data/transaction/TransactionsResponse;", "payee", "Lsotra/ynab/data/payee/Payee;", "amount", "account_id", "(Ljava/lang/String;Lsotra/ynab/data/payee/Payee;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBudgets", "Lsotra/ynab/data/budgets/BudgetResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayee", "Lsotra/ynab/data/payee/PayeeResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactions", "payeeId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NetworkRepo {
    private final sotra.ynab.api.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBudgets(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.budgets.BudgetResponse, sotra.ynab.data.Error.ErrorResponse>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTransactions(@org.jetbrains.annotations.Nullable()
    java.lang.String budgetId, @org.jetbrains.annotations.Nullable()
    java.lang.String payeeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.transaction.TransactionsResponse, sotra.ynab.data.Error.ErrorResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPayee(@org.jetbrains.annotations.Nullable()
    java.lang.String budgetId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.payee.PayeeResponse, sotra.ynab.data.Error.ErrorResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String budgetId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String accType, int balance, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.accounts.createAcc.AccountResponse, sotra.ynab.data.Error.ErrorResponse>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addTransaction(@org.jetbrains.annotations.Nullable()
    java.lang.String budgetId, @org.jetbrains.annotations.NotNull()
    sotra.ynab.data.payee.Payee payee, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String account_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.transaction.TransactionsResponse, sotra.ynab.data.Error.ErrorResponse>> p4) {
        return null;
    }
    
    @javax.inject.Inject()
    public NetworkRepo(@org.jetbrains.annotations.NotNull()
    sotra.ynab.api.ApiService apiService) {
        super();
    }
}