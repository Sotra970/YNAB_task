package sotra.ynab.ui.accountsFragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.android.example.github.di.Injectable
import sotra.ynab.R
import sotra.ynab.data.budgets.Account
import sotra.ynab.data.budgets.Budget
import sotra.ynab.data.payee.Payee
import sotra.ynab.databinding.AccountFragmentBinding
import sotra.ynab.ui.budgetFragment.AmountDialog
import sotra.ynab.ui.budgetFragment.PayeeDialog
import sotra.ynab.util.RetryCallback
import sotra.ynab.util.autoCleared
import sotra.ynab.util.dialog.GenericDialogFragment
import timber.log.Timber
import javax.inject.Inject

class AccountFragment : Fragment()  , Injectable , AccountListItemCallback  {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewModel: AccountViewModel

    var binding  by autoCleared<AccountFragmentBinding>()
    private var adapter by autoCleared<AccountsAdapter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater, R.layout.account_fragment, container, false)
        return binding.root
    }

    private fun getEmptyRetryCallback(): RetryCallback? {
        return  object :RetryCallback(){
            override fun callRetry() {

            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBinding()
        // observe and bind into adapter
        startObserving()
        // get incoming budgets which have all accounts
        postRecivedBudget(savedInstanceState)
    }

    private fun setupBinding() {
        viewModel = ViewModelProvider(this, viewModelFactory).get(AccountViewModel::class.java)
        binding.viewModel = viewModel
        adapter = AccountsAdapter(this)
        binding.adapter = adapter
        binding.lifecycleOwner = this
        // add no internet connection retry call back to data binding
        binding.retryCallback =getEmptyRetryCallback()
    }

    private fun postRecivedBudget(savedInstanceState: Bundle?) {
        if (savedInstanceState==null){
            val budget :Budget =  arguments?.getSerializable("budgetArg") as Budget
            viewModel.setBudget(budget)
        }
    }

    private fun startObserving() {
        viewModel.budget.observe(viewLifecycleOwner , Observer {
            adapter.add(it.accounts)
            adapter.setCurrency(it.currency_format)
        })
    }


    // sorry about hard code :'D  , but i was have no time to build this use case !!
    override fun addTransaction(account: Account) {
        // get ammount from user
        showAcmountDialog(account)
    }

    private fun showAcmountDialog(account: Account) {
        AmountDialog.getInstance(object : AmountDialog.Callback{
            override fun deliverValue(amount: Int) {
                // get payees to be selected
                viewModel.getPayees{ payeeList ->
                    // hide manual , reconc  , same
                    val filtered = payeeList.filter {
                        payee -> payee.name.trim() != "Transfer: "+account.name.trim()
                            && !payee.name.contains("Reconciliation Balance Adjustment")
                            && !payee.name.contains("Manual Balance Adjustment")
                    }
                    // show payee dialog
                    showPayeeDialog(filtered , account , amount)
                }
            }
        }).show(parentFragmentManager , "amount_dialog")
    }

    private fun showPayeeDialog(filtered : List<Payee>, account: Account, amount:Int  ) {
        PayeeDialog(filtered, object : GenericDialogFragment.GenricDialogFragmentClickListener<Payee> {
            override fun onGenericDialogItemClicked(child: Payee) {
               addTransactionCall(account , amount , child)
            }

        }).show(parentFragmentManager , "show_payees_list")
    }

    private fun addTransactionCall(account: Account , amount:Int , payee: Payee) {
        //add transaction
        val retryCallback = object : RetryCallback() {
            override fun callRetry() {
                viewModel.addTransaction(account = account , payee = payee , amount = amount , deliverTransaction = {
                    Toast.makeText(context , R.string.transaction_created , Toast.LENGTH_LONG).show()
                    binding.retryCallback =getEmptyRetryCallback()
                })
            }
        }
        binding.retryCallback = retryCallback
        retryCallback.callRetry()
    }


}