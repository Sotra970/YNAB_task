package sotra.ynab;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import sotra.ynab.databinding.AccountFragmentBindingImpl;
import sotra.ynab.databinding.AccountItemBindingImpl;
import sotra.ynab.databinding.BudgetFragmentBindingImpl;
import sotra.ynab.databinding.BudgetItemBindingImpl;
import sotra.ynab.databinding.EmptyLayoutBindingImpl;
import sotra.ynab.databinding.LoadingLayoutBindingImpl;
import sotra.ynab.databinding.NoInternetLayoutBindingImpl;
import sotra.ynab.databinding.TransactionFragmentBindingImpl;
import sotra.ynab.databinding.TransactionItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACCOUNTFRAGMENT = 1;

  private static final int LAYOUT_ACCOUNTITEM = 2;

  private static final int LAYOUT_BUDGETFRAGMENT = 3;

  private static final int LAYOUT_BUDGETITEM = 4;

  private static final int LAYOUT_EMPTYLAYOUT = 5;

  private static final int LAYOUT_LOADINGLAYOUT = 6;

  private static final int LAYOUT_NOINTERNETLAYOUT = 7;

  private static final int LAYOUT_RANSACTIONFRAGMENT = 8;

  private static final int LAYOUT_TRANSACTIONITEM = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.account_fragment, LAYOUT_ACCOUNTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.account_item, LAYOUT_ACCOUNTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.budget_fragment, LAYOUT_BUDGETFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.budget_item, LAYOUT_BUDGETITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.empty_layout, LAYOUT_EMPTYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.loading_layout, LAYOUT_LOADINGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.no_internet_layout, LAYOUT_NOINTERNETLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.ransaction_fragment, LAYOUT_RANSACTIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(sotra.ynab.R.layout.transaction_item, LAYOUT_TRANSACTIONITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACCOUNTFRAGMENT: {
          if ("layout/account_fragment_0".equals(tag)) {
            return new AccountFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for account_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACCOUNTITEM: {
          if ("layout/account_item_0".equals(tag)) {
            return new AccountItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for account_item is invalid. Received: " + tag);
        }
        case  LAYOUT_BUDGETFRAGMENT: {
          if ("layout/budget_fragment_0".equals(tag)) {
            return new BudgetFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for budget_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_BUDGETITEM: {
          if ("layout/budget_item_0".equals(tag)) {
            return new BudgetItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for budget_item is invalid. Received: " + tag);
        }
        case  LAYOUT_EMPTYLAYOUT: {
          if ("layout/empty_layout_0".equals(tag)) {
            return new EmptyLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for empty_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADINGLAYOUT: {
          if ("layout/loading_layout_0".equals(tag)) {
            return new LoadingLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loading_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_NOINTERNETLAYOUT: {
          if ("layout/no_internet_layout_0".equals(tag)) {
            return new NoInternetLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for no_internet_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RANSACTIONFRAGMENT: {
          if ("layout/ransaction_fragment_0".equals(tag)) {
            return new TransactionFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for ransaction_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_TRANSACTIONITEM: {
          if ("layout/transaction_item_0".equals(tag)) {
            return new TransactionItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for transaction_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "callback");
      sKeys.put(3, "item");
      sKeys.put(4, "noInternetRetryCallback");
      sKeys.put(5, "retryCallback");
      sKeys.put(6, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/account_fragment_0", sotra.ynab.R.layout.account_fragment);
      sKeys.put("layout/account_item_0", sotra.ynab.R.layout.account_item);
      sKeys.put("layout/budget_fragment_0", sotra.ynab.R.layout.budget_fragment);
      sKeys.put("layout/budget_item_0", sotra.ynab.R.layout.budget_item);
      sKeys.put("layout/empty_layout_0", sotra.ynab.R.layout.empty_layout);
      sKeys.put("layout/loading_layout_0", sotra.ynab.R.layout.loading_layout);
      sKeys.put("layout/no_internet_layout_0", sotra.ynab.R.layout.no_internet_layout);
      sKeys.put("layout/ransaction_fragment_0", sotra.ynab.R.layout.ransaction_fragment);
      sKeys.put("layout/transaction_item_0", sotra.ynab.R.layout.transaction_item);
    }
  }
}
