package sotra.ynab.data.transaction


import android.annotation.SuppressLint
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Transaction(
    var account_id: String,
    var account_name: String,
    var amount: Int,
    var approved: Boolean,
    var category_id: String,
    var category_name: String,
    var cleared: String,
    var date: String,
    var deleted: Boolean,
    var flag_color: String,
    var id: String,
    var import_id: String,
    var matched_transaction_id: String,
    var memo: String,
    var payee_id: String,
    var payee_name: String,
    var subtransactions: List<Subtransaction>,
    var transfer_account_id: String,
    var transfer_transaction_id: String
) : Parcelable