/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sotra.ynab.api
import retrofit2.http.*
import sotra.i.chachingdemo.api.ApiResponse
import sotra.ynab.data.Error.ErrorResponse
import sotra.ynab.data.accounts.createAcc.AccountResponse
import sotra.ynab.data.accounts.createAcc.CreateAccBody
import sotra.ynab.data.budgets.BudgetResponse
import sotra.ynab.data.payee.PayeeResponse
import sotra.ynab.data.transaction.TransactionsResponse
import sotra.ynab.data.transaction.createTransaction.TransactionPayload


/**
 * REST API access points
 */
interface ApiService {
    @GET("v1/budgets")
    suspend fun getBudgets(
        @Query("include_accounts")  inclueAccounts : Boolean
    ) : ApiResponse<BudgetResponse , ErrorResponse>



    @GET("v1/budgets/{budget_id}/payees")
    suspend fun getPayees(
        @Path("budget_id") budgetId: String?
        ) : ApiResponse<PayeeResponse , ErrorResponse>

    @GET("v1/budgets/{budget_id}/payees/{payee_id}/transactions")
    suspend fun getTransactions(
            @Path("budget_id") budgetId :String?,
            @Path("payee_id") payeeId :String?
    ) : ApiResponse<TransactionsResponse , ErrorResponse>

    @POST("v1/budgets/{budget_id}/accounts")
    suspend fun addAccount(
            @Path("budget_id") budgetId :String ,
            @Body body: CreateAccBody
    ): ApiResponse<AccountResponse , ErrorResponse>


    @POST("v1/budgets/{budget_id}/transactions")
    suspend fun addTransaction(
            @Path("budget_id") budgetId: String?,
            @Body TransactionPayload: TransactionPayload
    ) : ApiResponse<TransactionsResponse , ErrorResponse>
}
