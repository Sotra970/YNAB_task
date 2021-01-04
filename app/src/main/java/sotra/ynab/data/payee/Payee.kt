package sotra.ynab.data.payee

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Payee(
    val deleted: Boolean,
    val id: String,
    val name: String,
    val transfer_account_id: Any
) : Serializable