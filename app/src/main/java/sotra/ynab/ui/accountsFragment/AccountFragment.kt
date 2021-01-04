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
        })
    }


    // sorry about hard code :'D  , but i was have no time to build this use case !!
    override fun addTransaction(item: Account) {
        // get ammount from user
        AmountDialog.getInstance(object : AmountDialog.Callback{
            override fun deliverValue(amount: Int) {
                // get payees to be selected
                viewModel.getPayees{
                    // show payee dialog
                    PayeeDialog(it, object : GenericDialogFragment.GenricDialogFragmentClickListener<Payee> {
                        override fun onGenericDialogItemClicked(child: Payee) {
                            //add transaction
                            viewModel.addTransaction(account = item , payee = child , amount = amount , deliverTransaction = {
                                Toast.makeText(context , R.string.transaction_created , Toast.LENGTH_LONG).show()
                            })
                        }
                    }).show(parentFragmentManager , "show_payees_list")
                }
            }
        }).show(parentFragmentManager , "amount_dialog")
    }


}