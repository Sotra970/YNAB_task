package sotra.ynab.databinding;
import sotra.ynab.R;
import sotra.ynab.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TransactionItemBindingImpl extends TransactionItemBinding  {

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
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TransactionItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private TransactionItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
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
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setItem((sotra.ynab.data.transaction.Transaction) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable sotra.ynab.data.transaction.Transaction Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        sotra.ynab.data.transaction.Transaction item = mItem;
        java.lang.String itemAccountName = null;
        java.lang.String integerToStringItemAmount = null;
        java.lang.String itemApprovedMboundView3AndroidStringYesMboundView3AndroidStringNo = null;
        java.lang.String itemCategoryName = null;
        int itemAmount = 0;
        boolean itemApproved = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.account_name
                    itemAccountName = item.getAccount_name();
                    // read item.category_name
                    itemCategoryName = item.getCategory_name();
                    // read item.amount
                    itemAmount = item.getAmount();
                    // read item.approved
                    itemApproved = item.getApproved();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(itemApproved) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read Integer.toString(item.amount)
                integerToStringItemAmount = java.lang.Integer.toString(itemAmount);
                // read item.approved ? @android:string/yes : @android:string/no
                itemApprovedMboundView3AndroidStringYesMboundView3AndroidStringNo = ((itemApproved) ? (mboundView3.getResources().getString(R.string.yes)) : (mboundView3.getResources().getString(R.string.no)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemAccountName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, integerToStringItemAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemApprovedMboundView3AndroidStringYesMboundView3AndroidStringNo);
            sotra.ynab.util.BindingAdapterUtils.setVisibility(this.mboundView4, itemCategoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemCategoryName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
        flag 2 (0x3L): item.approved ? @android:string/yes : @android:string/no
        flag 3 (0x4L): item.approved ? @android:string/yes : @android:string/no
    flag mapping end*/
    //end
}