package sotra.ynab.repo

import sotra.ynab.api.ApiService
import sotra.ynab.data.accounts.createAcc.CreateAccountBody
import sotra.ynab.data.accounts.createAcc.CreateAccBody
import sotra.ynab.data.payee.Payee
import sotra.ynab.data.transaction.createTransaction.TransactionPayload
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

/**
 * Created by developers@appgain.io on 12/26/2020.
 */
  class  NetworkRepo @Inject constructor(
        private val apiService: ApiService
){
    suspend fun  getBudgets() = apiService.getBudgets(true)
    suspend fun  getTransactions(budgetId : String? , payeeId : String?) = apiService.getTransactions(budgetId , payeeId)
    suspend fun  getPayee(budgetId: String?) = apiService.getPayees(budgetId)

    suspend fun addAccount( budgetId: String ,  name: String, accType: String, balance: Int) = apiService.addAccount(
            budgetId ,
            CreateAccBody(CreateAccountBody( name , accType , balance))
    )

    suspend fun addTransaction(budgetId: String?, payee: Payee, amount: Int, account_id: String)= apiService.addTransaction(
            budgetId ,
            TransactionPayload(TransactionPayload.TransactionPayloadBody(
                    payee_id = payee.id,
                    payee_name = payee.name,
                    amount = amount,
                    memo = "",
                    account_id = account_id ,
                    date = SimpleDateFormat("YYYY-MM-DD", Locale.getDefault()).format(Date())
            ))
    )
}