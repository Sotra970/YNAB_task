package sotra.ynab.databinding;
import sotra.ynab.R;
import sotra.ynab.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AccountItemBindingImpl extends AccountItemBinding implements sotra.ynab.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AccountItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private AccountItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[5]
            );
        this.add.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new sotra.ynab.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((sotra.ynab.data.budgets.Account) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((sotra.ynab.ui.accountsFragment.AccountListItemCallback) variable);
        }
        else if (BR.currency == variableId) {
            setCurrency((sotra.ynab.data.budgets.CurrencyFormat) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable sotra.ynab.data.budgets.Account Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setCallback(@Nullable sotra.ynab.ui.accountsFragment.AccountListItemCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setCurrency(@Nullable sotra.ynab.data.budgets.CurrencyFormat Currency) {
        this.mCurrency = Currency;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.currency);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        sotra.ynab.data.budgets.Account item = mItem;
        boolean currencyJavaLangObjectNull = false;
        java.lang.String integerToStringItemBalanceCurrencyJavaLangObjectNullJavaLangStringCurrencyCurrencySymbol = null;
        int itemBalance = 0;
        java.lang.String itemName = null;
        java.lang.String itemType = null;
        java.lang.String currencyJavaLangObjectNullJavaLangStringCurrencyCurrencySymbol = null;
        java.lang.String currencyCurrencySymbol = null;
        java.lang.String integerToStringItemBalance = null;
        sotra.ynab.ui.accountsFragment.AccountListItemCallback callback = mCallback;
        sotra.ynab.data.budgets.CurrencyFormat currency = mCurrency;

        if ((dirtyFlags & 0xdL) != 0) {



                if (item != null) {
                    // read item.balance
                    itemBalance = item.getBalance();
                }
                // read currency == null
                currencyJavaLangObjectNull = (currency) == (null);
            if((dirtyFlags & 0xdL) != 0) {
                if(currencyJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read Integer.toString(item.balance)
                integerToStringItemBalance = java.lang.Integer.toString(itemBalance);
            if ((dirtyFlags & 0x9L) != 0) {

                    if (item != null) {
                        // read item.name
                        itemName = item.getName();
                        // read item.type
                        itemType = item.getType();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (currency != null) {
                    // read currency.currency_symbol
                    currencyCurrencySymbol = currency.getCurrency_symbol();
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read currency == null ? "" : currency.currency_symbol
                currencyJavaLangObjectNullJavaLangStringCurrencyCurrencySymbol = ((currencyJavaLangObjectNull) ? ("") : (currencyCurrencySymbol));


                // read (Integer.toString(item.balance)) + (currency == null ? "" : currency.currency_symbol)
                integerToStringItemBalanceCurrencyJavaLangObjectNullJavaLangStringCurrencyCurrencySymbol = (integerToStringItemBalance) + (currencyJavaLangObjectNullJavaLangStringCurrencyCurrencySymbol);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.add.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemType);
            sotra.ynab.util.BindingAdapterUtils.setVisibility(this.mboundView4, itemType);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, integerToStringItemBalanceCurrencyJavaLangObjectNullJavaLangStringCurrencyCurrencySymbol);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        sotra.ynab.data.budgets.Account item = mItem;
        // callback
        sotra.ynab.ui.accountsFragment.AccountListItemCallback callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {



            callback.addTransaction(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): callback
        flag 2 (0x3L): currency
        flag 3 (0x4L): null
        flag 4 (0x5L): currency == null ? "" : currency.currency_symbol
        flag 5 (0x6L): currency == null ? "" : currency.currency_symbol
    flag mapping end*/
    //end
}