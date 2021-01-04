package sotra.ynab.ui.accountsFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import sotra.i.chachingdemo.api.ApiResponse
import sotra.ynab.data.budgets.Account
import sotra.ynab.data.budgets.Budget
import sotra.ynab.data.payee.Payee
import sotra.ynab.data.transaction.Transaction
import sotra.ynab.data.transaction.TransactionsResponse
import sotra.ynab.repo.NetworkRepo
import javax.inject.Inject

class AccountViewModel @Inject constructor(
    private val network: NetworkRepo
) : ViewModel() {

    val budget: MutableLiveData<Budget>  = MutableLiveData()
    val loading = MutableLiveData<Boolean>()
    val networkStatus = MutableLiveData<Boolean>()

     fun  setBudget(item: Budget) {
         budget.postValue(item)
     }


    fun getPayees( deliverPayees: (List<Payee>) -> Unit)=viewModelScope.launch{
        networkStatus.postValue(false)
        loading.postValue(true)
        when(val response =  network.getPayee(budget.value?.id)){
            is ApiResponse.Success ->{
                loading.postValue(false)
                deliverPayees(response.body.data.payees)
                //to do save last_server_Knowledge
            }
            is ApiResponse.NetworkError -> networkStatus.postValue(true)
            else ->loading.postValue(false)
        }
    }
    fun addTransaction(account : Account, payee: Payee, amount: Int, deliverTransaction: (TransactionsResponse?) -> Unit) =viewModelScope.launch{
        networkStatus.postValue(false)
        loading.postValue(true)
        when(val response = network.addTransaction(budgetId = budget.value?.id, payee = payee , amount = amount , account_id = account.id)){
            is ApiResponse.Success ->{
                loading.postValue(false)
                deliverTransaction(response.body)
            }
            is ApiResponse.NetworkError -> networkStatus.postValue(true)
            else ->loading.postValue(false)
        }
    }
}