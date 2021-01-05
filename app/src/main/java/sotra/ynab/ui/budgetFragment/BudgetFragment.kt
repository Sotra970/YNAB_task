package sotra.ynab.ui.budgetFragment

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.android.example.github.di.Injectable
import sotra.ynab.R
import sotra.ynab.data.budgets.Budget
import sotra.ynab.data.payee.Payee
import sotra.ynab.databinding.BudgetFragmentBinding
import sotra.ynab.util.RetryCallback
import sotra.ynab.util.autoCleared
import sotra.ynab.util.dialog.GenericDialogFragment
import javax.inject.Inject

class BudgetFragment : Fragment()  , Injectable , BudgetListItemCallback  {

    var binding  by autoCleared<BudgetFragmentBinding>()
    private var budgetAdapter by autoCleared<BudgetAdapter>()

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewModel :BudgetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater, R.layout.budget_fragment, container, false)
        return binding.root
    }

    override fun  onViewCreated(view: View, savedInstanceState: Bundle?) {
        // setupBinding
        setupBinding()
        // observe to binf in adapter
        viewModel.budgets.observe(viewLifecycleOwner , Observer {budgetAdapter.add(it) })
    }

    private fun setupBinding() {
        viewModel = ViewModelProvider(this , viewModelFactory).get(BudgetViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner

        binding.viewModel = viewModel
        budgetAdapter=BudgetAdapter(this)
        binding.adapter = budgetAdapter
        binding.lifecycleOwner = this
        // add no internet connection retry call back to data binding
       setDefaultRetryCallback()
    }

    private fun setDefaultRetryCallback() {
        binding.retryCallback = object  : RetryCallback() {
            override fun callRetry() {
                viewModel.getBudget()
            }
        }
    }

    override fun addAccount(item: Budget) {
        CreateAccountDialog.getInstance(object : CreateAccountDialog.Callback{
            override fun deliverValue(name: String, accType: String, balance: Int) {
                val retryCallback = object  : RetryCallback() {
                    override fun callRetry() {
                        viewModel.addAccount(item.id , name , accType , balance) {
                            item.accounts.add(it)
                            Toast.makeText(requireContext() , R.string.acc_created,Toast.LENGTH_LONG ).show()
                            setDefaultRetryCallback()
                        }
                    }
                }
                binding.retryCallback = retryCallback
                retryCallback.callRetry()
            }
        }).show(this.parentFragmentManager , "crate_account_dialog")
    }


    override fun payees(item: Budget) {
        val retryCallback = object  : RetryCallback() {
            override fun callRetry() {
                viewModel.getPayees(item) {
                    PayeeDialog(it, object :GenericDialogFragment.GenricDialogFragmentClickListener<Payee> {
                        override fun onGenericDialogItemClicked(child: Payee) {
                            //  show transactions
                            Navigation.findNavController(requireActivity(),R.id.nav_host_fragment).navigate(
                                    BudgetFragmentDirections.actionBudgetFragmentToTransactionsFragment2(
                                            item.id , child.id
                                    )
                            )
                            setDefaultRetryCallback()
                        }
                    }).show(this@BudgetFragment.parentFragmentManager , "show_payees_list")
                }
            }
        }
        binding.retryCallback = retryCallback
        retryCallback.callRetry()
    }


    override fun viewAccounts(item: Budget) {
        Navigation.findNavController(requireActivity(),R.id.nav_host_fragment).navigate(
                BudgetFragmentDirections.actionNavGraphToAccountFragment(item)
        )
    }


}