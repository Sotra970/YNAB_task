package sotra.ynab.data.accounts.createAcc

data class CreateAccountBody (
    val name: String,
    val type: String ,
    val balance: Int
)