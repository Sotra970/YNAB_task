package sotra.ynab.data.transaction


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Data(
    val server_knowledge: Int,
    val transactions: List<Transaction>,
    val transaction: Transaction
) : Parcelable