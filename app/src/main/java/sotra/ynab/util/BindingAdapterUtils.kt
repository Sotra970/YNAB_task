package sotra.ynab.util

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import sotra.ynab.R
import sotra.ynab.data.budgets.Budget
import java.text.SimpleDateFormat
import java.util.*

class BindingAdapterUtils {
    companion object {

        @BindingAdapter("app:dateText")
        @JvmStatic
        fun formatServerDate(view: TextView, item: Budget) {

            val serverFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.getDefault())
            val desiredFormat = SimpleDateFormat(item.date_format.format , Locale.getDefault())
            serverFormat.parse(item.last_modified_on)?.let {
                view.text = desiredFormat.format(it)
            }
        }
        @BindingAdapter("app:viewModelVisible")
        @JvmStatic
        fun setViewModelVisible(view : View , isVisible: MutableLiveData<Boolean>) {
            if (isVisible.value == true) {
                view.visibility = View.VISIBLE
            } else {
                view.visibility = View.GONE
            }
        }

        @BindingAdapter("app:viewModelVisible")
        @JvmStatic
        fun setViewModelVisible(view : ViewGroup , isVisible: MutableLiveData<Boolean>) {
            if (isVisible.value == true) {
                view.visibility = View.VISIBLE
            } else {
                view.visibility = View.GONE
            }
        }

        @BindingAdapter("app:retryCallback")
        @JvmStatic
        fun setRetryCallback(view :View, retryCallback:RetryCallback): RetryCallback {
            view.run {
                 findViewById<View>(R.id.retry).setOnClickListener {
                     retryCallback.callRetry()
                 }
            }
            return retryCallback
        }

        @BindingAdapter("android:visibility")
        @JvmStatic
        fun setVisibility(view: View, value: String?) {
            view.visibility = if (value.isNullOrEmpty()) View.VISIBLE else View.GONE
        }

    }


}