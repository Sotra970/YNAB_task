package sotra.ynab.data.transaction.createTransaction
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class TransactionPayload(
    val transaction: TransactionPayloadBody
) : Parcelable {
@Parcelize
data class TransactionPayloadBody(
        var amount: Int,
        var date: String,
        var memo: String,
        var payee_id: String,
        var payee_name: String,
        val account_id: String
) : Parcelable

}