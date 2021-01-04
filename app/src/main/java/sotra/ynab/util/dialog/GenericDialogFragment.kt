package sotra.ynab.util.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sotra.ynab.R
import sotra.ynab.util.dialog.Decorator.DividerItemDecoration
import java.io.Serializable
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
abstract class GenericDialogFragment<T> : DialogFragment() {
    private var data: List<T>? = ArrayList()
    
    private var addressListClickListener: GenricDialogFragmentClickListener<T>? = null
    
    fun setListItemClickListener(addressListClickListener: GenricDialogFragmentClickListener<T>?) {
        this.addressListClickListener = addressListClickListener
    }

    fun setData(data: List<T>?) {
        this.data = data
    }

    var listView: RecyclerView? = null
    
    private lateinit var genericDialogArrayAdapter: GenricDialogArrayAdapter<T>
    
    abstract fun GenericDrawText(textView: TextView, item: T)
    
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireActivity())
        dialog.requestWindowFeature(STYLE_NO_TITLE)
        val v = LayoutInflater.from(activity).inflate(R.layout.fragment_generic_dialog, null, false)
        listView = v.findViewById(R.id.recycler);
        if (savedInstanceState != null)
            data = savedInstanceState.getSerializable("data") as ArrayList<T>?
        setup()
        dialog.setContentView(v)
        return dialog
    }

    private fun setup() {
        listView?.layoutManager = LinearLayoutManager(context)
        val dividerItemDecoration = DividerItemDecoration(context)
        dividerItemDecoration.isActivated = true
        listView?.addItemDecoration(dividerItemDecoration)
        genericDialogArrayAdapter = object : GenricDialogArrayAdapter<T>(context, data) {
            override fun drawText(textView: TextView, item: T) {
                GenericDrawText(textView, item)
            }
        }
        genericDialogArrayAdapter.setGenricDialogArrayAdapterClickListenr(object : GenricDialogFragmentClickListener<T> {
            override fun onGenericDialogItemClicked(child: T) {
                dismiss()
                addressListClickListener?.onGenericDialogItemClicked(child)

            }
        })
        listView?.adapter = genericDialogArrayAdapter
    }

    override fun onStart() {
        super.onStart()
        val lp = WindowManager.LayoutParams()
        val window = dialog?.window
        lp.copyFrom(window?.attributes)
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        window?.attributes = lp
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable("data", data as Serializable?)
    }

    interface GenricDialogFragmentClickListener<T> {
        fun onGenericDialogItemClicked(child: T)
    }
}