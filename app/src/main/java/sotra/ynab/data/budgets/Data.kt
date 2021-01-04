package sotra.ynab.data.budgets

data class Data(
    val budgets: List<Budget>,
    val default_budget: Budget
)