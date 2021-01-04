package sotra.ynab.databinding;
import sotra.ynab.R;
import sotra.ynab.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TransactionFragmentBindingImpl extends TransactionFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"loading_layout", "empty_layout", "no_internet_layout"},
            new int[] {2, 3, 4},
            new int[] {sotra.ynab.R.layout.loading_layout,
                sotra.ynab.R.layout.empty_layout,
                sotra.ynab.R.layout.no_internet_layout});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TransactionFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private TransactionFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (sotra.ynab.databinding.EmptyLayoutBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (sotra.ynab.databinding.LoadingLayoutBinding) bindings[2]
            , (sotra.ynab.databinding.NoInternetLayoutBinding) bindings[4]
            );
        setContainedBinding(this.emptyLayout);
        this.list.setTag(null);
        setContainedBinding(this.loading);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.network);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        loading.invalidateAll();
        emptyLayout.invalidateAll();
        network.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (loading.hasPendingBindings()) {
            return true;
        }
        if (emptyLayout.hasPendingBindings()) {
            return true;
        }
        if (network.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.retryCallback == variableId) {
            setRetryCallback((sotra.ynab.util.RetryCallback) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((sotra.ynab.ui.transactions.TransactionsAdapter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((sotra.ynab.ui.transactions.TransactionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRetryCallback(@Nullable sotra.ynab.util.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.retryCallback);
        super.requestRebind();
    }
    public void setAdapter(@Nullable sotra.ynab.ui.transactions.TransactionsAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable sotra.ynab.ui.transactions.TransactionsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        loading.setLifecycleOwner(lifecycleOwner);
        emptyLayout.setLifecycleOwner(lifecycleOwner);
        network.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoading((sotra.ynab.databinding.LoadingLayoutBinding) object, fieldId);
            case 1 :
                return onChangeViewModelLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelEmpty((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeEmptyLayout((sotra.ynab.databinding.EmptyLayoutBinding) object, fieldId);
            case 4 :
                return onChangeNetwork((sotra.ynab.databinding.NoInternetLayoutBinding) object, fieldId);
            case 5 :
                return onChangeViewModelNetworkStatus((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoading(sotra.ynab.databinding.LoadingLayoutBinding Loading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmpty(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEmptyLayout(sotra.ynab.databinding.EmptyLayoutBinding EmptyLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeNetwork(sotra.ynab.databinding.NoInternetLayoutBinding Network, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNetworkStatus(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelNetworkStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
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
        sotra.ynab.util.RetryCallback retryCallback = mRetryCallback;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoading = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelEmpty = null;
        java.lang.Boolean viewModelEmptyGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelNetworkStatus = null;
        java.lang.Boolean viewModelLoadingGetValue = null;
        sotra.ynab.ui.transactions.TransactionsAdapter adapter = mAdapter;
        java.lang.Boolean viewModelNetworkStatusGetValue = null;
        sotra.ynab.ui.transactions.TransactionsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x326L) != 0) {


            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loading
                        viewModelLoading = viewModel.getLoading();
                    }
                    updateLiveDataRegistration(1, viewModelLoading);


                    if (viewModelLoading != null) {
                        // read viewModel.loading.getValue()
                        viewModelLoadingGetValue = viewModelLoading.getValue();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.empty
                        viewModelEmpty = viewModel.getEmpty();
                    }
                    updateLiveDataRegistration(2, viewModelEmpty);


                    if (viewModelEmpty != null) {
                        // read viewModel.empty.getValue()
                        viewModelEmptyGetValue = viewModelEmpty.getValue();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.networkStatus
                        viewModelNetworkStatus = viewModel.getNetworkStatus();
                    }
                    updateLiveDataRegistration(5, viewModelNetworkStatus);


                    if (viewModelNetworkStatus != null) {
                        // read viewModel.networkStatus.getValue()
                        viewModelNetworkStatusGetValue = viewModelNetworkStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            sotra.ynab.util.BindingAdapterUtils.setViewModelVisible(this.emptyLayout.getRoot(), viewModelEmpty);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.list.setAdapter(adapter);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            sotra.ynab.util.BindingAdapterUtils.setViewModelVisible(this.loading.getRoot(), viewModelLoading);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            sotra.ynab.util.BindingAdapterUtils.setViewModelVisible(this.network.getRoot(), viewModelNetworkStatus);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            sotra.ynab.util.BindingAdapterUtils.setRetryCallback(this.network.getRoot(), retryCallback);
        }
        executeBindingsOn(loading);
        executeBindingsOn(emptyLayout);
        executeBindingsOn(network);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loading
        flag 1 (0x2L): viewModel.loading
        flag 2 (0x3L): viewModel.empty
        flag 3 (0x4L): emptyLayout
        flag 4 (0x5L): network
        flag 5 (0x6L): viewModel.networkStatus
        flag 6 (0x7L): retryCallback
        flag 7 (0x8L): adapter
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}