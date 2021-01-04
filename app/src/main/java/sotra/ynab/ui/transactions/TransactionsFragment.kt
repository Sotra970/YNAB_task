package sotra.ynab.ui.transactions

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.android.example.github.di.Injectable
import sotra.ynab.R
import sotra.ynab.databinding.TransactionFragmentBinding
import sotra.ynab.util.RetryCallback
import sotra.ynab.util.autoCleared
import javax.inject.Inject

 class TransactionsFragment : Fragment()  , Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewModel: TransactionsViewModel

    var binding  by autoCleared<TransactionFragmentBinding>()
    private var adapter by autoCleared<TransactionsAdapter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = DataBindingUtil.inflate(inflater, R.layout.ransaction_fragment, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBinding()
        getDataFromViewmodel(savedInstanceState)
        startObserving()
    }

    private fun setupBinding() {
        viewModel = ViewModelProvider(this, viewModelFactory).get(TransactionsViewModel::class.java)
        binding.viewModel = viewModel
        adapter = TransactionsAdapter()
        binding.adapter = adapter
        binding.lifecycleOwner = this
        binding.retryCallback = object  :RetryCallback(){
            override fun callRetry() {
                viewModel.getTransactionsFromApi()
            }
        }
    }

    private fun getDataFromViewmodel(savedInstanceState: Bundle?) {
        if (savedInstanceState==null ){
            arguments?.let {
                viewModel.setValues( it.getString("budgetId") , it.getString("payeeId"))
                // looks creep ?? unfortunately we must do this because viewmodel.getvalue return null so we should wait until postvalue finish its call
                viewModel.payeeId.observe(viewLifecycleOwner , Observer {
                    viewModel.getTransactionsFromApi()
                })
            }
        }
    }


    private fun startObserving() {
        viewModel.transactions.observe(viewLifecycleOwner , Observer {
            adapter.add(it)
        })
    }



}