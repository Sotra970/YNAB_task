package sotra.ynab.databinding;
import sotra.ynab.R;
import sotra.ynab.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BudgetItemBindingImpl extends BudgetItemBinding implements sotra.ynab.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BudgetItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private BudgetItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            );
        this.createAcc.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.showPayees.setTag(null);
        this.viewAccounts.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new sotra.ynab.generated.callback.OnClickListener(this, 2);
        mCallback4 = new sotra.ynab.generated.callback.OnClickListener(this, 3);
        mCallback2 = new sotra.ynab.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setItem((sotra.ynab.data.budgets.Budget) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((sotra.ynab.ui.budgetFragment.BudgetListItemCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable sotra.ynab.data.budgets.Budget Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setCallback(@Nullable sotra.ynab.ui.budgetFragment.BudgetListItemCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
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
        java.lang.String itemLastMonth = null;
        sotra.ynab.data.budgets.Budget item = mItem;
        java.lang.String itemName = null;
        java.lang.String itemFirstMonth = null;
        sotra.ynab.ui.budgetFragment.BudgetListItemCallback callback = mCallback;
        java.lang.String itemLastModifiedOn = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.last_month
                    itemLastMonth = item.getLast_month();
                    // read item.name
                    itemName = item.getName();
                    // read item.first_month
                    itemFirstMonth = item.getFirst_month();
                    // read item.last_modified_on
                    itemLastModifiedOn = item.getLast_modified_on();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.createAcc.setOnClickListener(mCallback3);
            this.showPayees.setOnClickListener(mCallback2);
            this.viewAccounts.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemLastModifiedOn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemFirstMonth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemLastMonth);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // item
                sotra.ynab.data.budgets.Budget item = mItem;
                // callback
                sotra.ynab.ui.budgetFragment.BudgetListItemCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.addAccount(item);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // item
                sotra.ynab.data.budgets.Budget item = mItem;
                // callback
                sotra.ynab.ui.budgetFragment.BudgetListItemCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.viewAccounts(item);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // item
                sotra.ynab.data.budgets.Budget item = mItem;
                // callback
                sotra.ynab.ui.budgetFragment.BudgetListItemCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.payees(item);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}