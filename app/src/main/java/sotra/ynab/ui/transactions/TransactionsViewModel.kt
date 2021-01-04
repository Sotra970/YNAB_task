package sotra.ynab.ui.transactions

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import sotra.i.chachingdemo.api.ApiResponse
import sotra.ynab.data.payee.Payee
import sotra.ynab.data.transaction.Transaction
import sotra.ynab.repo.NetworkRepo
import javax.inject.Inject

class TransactionsViewModel @Inject constructor(
    private val network: NetworkRepo
) : ViewModel() {

    val payeeId : MutableLiveData<String> = MutableLiveData()
    val budgetId : MutableLiveData<String> = MutableLiveData()
    val transactions : MutableLiveData<List<Transaction>> = MutableLiveData()
    val loading = MutableLiveData<Boolean>()
    val networkStatus = MutableLiveData<Boolean>()
    val empty = MutableLiveData<Boolean>()


    fun  getTransactionsFromApi() = viewModelScope.launch {
        networkStatus.postValue(false)
        empty.postValue(false)
        loading.postValue(true)
        when(val response = network.getTransactions(
                budgetId.value, payeeId.value
        )){
            is ApiResponse.Success ->{
                loading.postValue(false)
                if (response.body.data.transactions.isNullOrEmpty()){
                    empty.postValue(true)
                    loading.postValue(false)
                }else
                transactions.postValue(response.body.data.transactions)
            }
            is ApiResponse.NetworkError -> {
                networkStatus.postValue(true)
                loading.postValue(false)
            }
            is ApiResponse.EmptyResponse ->{
                empty.postValue(true)
                loading.postValue(false)
            }
            else ->loading.postValue(false)
        }
    }

    fun setValues(budgetId: String?, payeeId: String?) {
        this.budgetId.postValue(budgetId)
        this.payeeId.postValue(payeeId)
    }


}