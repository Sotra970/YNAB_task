package sotra.ynab.util

import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import sotra.ynab.R

class BindingAdapterUtils {
    companion object {

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