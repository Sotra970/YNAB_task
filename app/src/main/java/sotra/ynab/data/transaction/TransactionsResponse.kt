package sotra.ynab.data.transaction


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class TransactionsResponse(
    val `data`: Data
) : Parcelable