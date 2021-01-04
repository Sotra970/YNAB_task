package sotra.ynab.api;

import java.lang.System;

/**
 * REST API access points
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ3\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J)\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J5\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lsotra/ynab/api/ApiService;", "", "addAccount", "Lsotra/i/chachingdemo/api/ApiResponse;", "Lsotra/ynab/data/accounts/createAcc/AccountResponse;", "Lsotra/ynab/data/Error/ErrorResponse;", "budgetId", "", "body", "Lsotra/ynab/data/accounts/createAcc/CreateAccBody;", "(Ljava/lang/String;Lsotra/ynab/data/accounts/createAcc/CreateAccBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTransaction", "Lsotra/ynab/data/transaction/TransactionsResponse;", "TransactionPayload", "Lsotra/ynab/data/transaction/createTransaction/TransactionPayload;", "(Ljava/lang/String;Lsotra/ynab/data/transaction/createTransaction/TransactionPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBudgets", "Lsotra/ynab/data/budgets/BudgetResponse;", "inclueAccounts", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayees", "Lsotra/ynab/data/payee/PayeeResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactions", "payeeId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/budgets")
    public abstract java.lang.Object getBudgets(@retrofit2.http.Query(value = "include_accounts")
    boolean inclueAccounts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.budgets.BudgetResponse, sotra.ynab.data.Error.ErrorResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/budgets/{budget_id}/payees")
    public abstract java.lang.Object getPayees(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "budget_id")
    java.lang.String budgetId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.payee.PayeeResponse, sotra.ynab.data.Error.ErrorResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/budgets/{budget_id}/payees/{payee_id}/transactions")
    public abstract java.lang.Object getTransactions(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "budget_id")
    java.lang.String budgetId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "payee_id")
    java.lang.String payeeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.transaction.TransactionsResponse, sotra.ynab.data.Error.ErrorResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "v1/budgets/{budget_id}/accounts")
    public abstract java.lang.Object addAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "budget_id")
    java.lang.String budgetId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    sotra.ynab.data.accounts.createAcc.CreateAccBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.accounts.createAcc.AccountResponse, sotra.ynab.data.Error.ErrorResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "v1/budgets/{budget_id}/transactions")
    public abstract java.lang.Object addTransaction(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "budget_id")
    java.lang.String budgetId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    sotra.ynab.data.transaction.createTransaction.TransactionPayload TransactionPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super sotra.i.chachingdemo.api.ApiResponse<sotra.ynab.data.transaction.TransactionsResponse, sotra.ynab.data.Error.ErrorResponse>> p2);
}