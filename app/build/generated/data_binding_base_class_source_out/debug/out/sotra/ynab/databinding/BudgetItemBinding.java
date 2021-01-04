// Generated by data binding compiler. Do not edit!
package sotra.ynab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import sotra.ynab.R;
import sotra.ynab.data.budgets.Budget;
import sotra.ynab.ui.budgetFragment.BudgetListItemCallback;

public abstract class BudgetItemBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton createAcc;

  @NonNull
  public final MaterialButton showPayees;

  @NonNull
  public final MaterialButton viewAccounts;

  @Bindable
  protected Budget mItem;

  @Bindable
  protected BudgetListItemCallback mCallback;

  protected BudgetItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton createAcc, MaterialButton showPayees, MaterialButton viewAccounts) {
    super(_bindingComponent, _root, _localFieldCount);
    this.createAcc = createAcc;
    this.showPayees = showPayees;
    this.viewAccounts = viewAccounts;
  }

  public abstract void setItem(@Nullable Budget item);

  @Nullable
  public Budget getItem() {
    return mItem;
  }

  public abstract void setCallback(@Nullable BudgetListItemCallback callback);

  @Nullable
  public BudgetListItemCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static BudgetItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.budget_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BudgetItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BudgetItemBinding>inflateInternal(inflater, R.layout.budget_item, root, attachToRoot, component);
  }

  @NonNull
  public static BudgetItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.budget_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BudgetItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BudgetItemBinding>inflateInternal(inflater, R.layout.budget_item, null, false, component);
  }

  public static BudgetItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static BudgetItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (BudgetItemBinding)bind(component, view, R.layout.budget_item);
  }
}