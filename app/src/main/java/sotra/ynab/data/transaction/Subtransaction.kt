package sotra.ynab.data.transaction


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Subtransaction(
    val amount: Int,
    val category_id: String,
    val category_name: String,
    val deleted: Boolean,
    val id: String,
    val memo: String,
    val payee_id: String,
    val payee_name: String,
    val transaction_id: String,
    val transfer_account_id: String,
    val transfer_transaction_id: String
) : Parcelable