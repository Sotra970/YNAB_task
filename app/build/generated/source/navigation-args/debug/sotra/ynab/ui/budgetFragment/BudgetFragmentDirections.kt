package sotra.ynab.ui.budgetFragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import sotra.ynab.R
import sotra.ynab.`data`.budgets.Budget

public class BudgetFragmentDirections private constructor() {
  private data class ActionNavGraphToAccountFragment(
    public val budgetArg: Budget
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_nav_graph_to_accountFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Budget::class.java)) {
        result.putParcelable("budgetArg", this.budgetArg as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Budget::class.java)) {
        result.putSerializable("budgetArg", this.budgetArg as Serializable)
      } else {
        throw UnsupportedOperationException(Budget::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  private data class ActionBudgetFragmentToTransactionsFragment2(
    public val budgetId: String,
    public val payeeId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_budgetFragment_to_transactionsFragment2

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("budgetId", this.budgetId)
      result.putString("payeeId", this.payeeId)
      return result
    }
  }

  public companion object {
    public fun actionNavGraphToAccountFragment(budgetArg: Budget): NavDirections =
        ActionNavGraphToAccountFragment(budgetArg)

    public fun actionBudgetFragmentToTransactionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_budgetFragment_to_transactionsFragment)

    public fun actionBudgetFragmentToTransactionsFragment2(budgetId: String, payeeId: String):
        NavDirections = ActionBudgetFragmentToTransactionsFragment2(budgetId, payeeId)
  }
}
