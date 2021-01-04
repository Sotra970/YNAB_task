package sotra.ynab.data.payee

data class Data(
    val payees: List<Payee>,
    val server_knowledge: Int
)