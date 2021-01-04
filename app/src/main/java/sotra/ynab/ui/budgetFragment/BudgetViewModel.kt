package sotra.ynab.ui.budgetFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import sotra.i.chachingdemo.api.ApiResponse
import sotra.ynab.data.budgets.Account
import sotra.ynab.data.budgets.Budget
import sotra.ynab.data.payee.Payee
import sotra.ynab.repo.NetworkRepo
import javax.inject.Inject

class BudgetViewModel @Inject constructor(
    private val network: NetworkRepo
) : ViewModel() {

    val budgets: MutableLiveData< List<Budget>>  = MutableLiveData()
    val loading = MutableLiveData<Boolean>()
    val networkStatus = MutableLiveData<Boolean>()

    init {
        getBudget()
    }
     fun  getBudget() = viewModelScope.launch {
         networkStatus.postValue(false)
         loading.postValue(true)
         when(val response = network.getBudgets()){
             is ApiResponse.Success ->{
                 loading.postValue(false)
               budgets.postValue(response.body.data.budgets)
             }
             is ApiResponse.NetworkError -> networkStatus.postValue(true)
             else ->loading.postValue(false)
         }
    }

    fun addAccount(id: String, name: String, accType: String, balance: Int, deliverAccount: (Account) -> Unit) = viewModelScope.launch {
        networkStatus.postValue(false)
        loading.postValue(true)
        when(val response =  network.addAccount(id , name  , accType , balance)){
            is ApiResponse.Success ->{
                loading.postValue(false)
                deliverAccount(response.body.data.account)
            }
            is ApiResponse.NetworkError -> networkStatus.postValue(true)
            else ->loading.postValue(false)
        }
    }

    fun getPayees(item : Budget, deliverPayees: (List<Payee>) -> Unit)=viewModelScope.launch{
        networkStatus.postValue(false)
        loading.postValue(true)
        when(val response =  network.getPayee(item.id)){
            is ApiResponse.Success ->{
                loading.postValue(false)
                deliverPayees(response.body.data.payees)
                //to do save last_server_Knowledge
            }
            is ApiResponse.NetworkError -> networkStatus.postValue(true)
            else ->loading.postValue(false)
        }
    }



}