package sotra.ynab.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lsotra/ynab/util/BindingAdapterUtils;", "", "()V", "Companion", "app_debug"})
public final class BindingAdapterUtils {
    public static final sotra.ynab.util.BindingAdapterUtils.Companion Companion = null;
    
    public BindingAdapterUtils() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:dateText"})
    public static final void formatServerDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    sotra.ynab.data.budgets.Budget item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:viewModelVisible"})
    public static final void setViewModelVisible(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:viewModelVisible"})
    public static final void setViewModelVisible(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVisible) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.BindingAdapter(value = {"app:retryCallback"})
    public static final sotra.ynab.util.RetryCallback setRetryCallback(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    sotra.ynab.util.RetryCallback retryCallback) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:visibility"})
    public static final void setVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\nH\u0007J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"Lsotra/ynab/util/BindingAdapterUtils$Companion;", "", "()V", "formatServerDate", "", "view", "Landroid/widget/TextView;", "item", "Lsotra/ynab/data/budgets/Budget;", "setRetryCallback", "Lsotra/ynab/util/RetryCallback;", "Landroid/view/View;", "retryCallback", "setViewModelVisible", "isVisible", "Landroidx/lifecycle/MutableLiveData;", "", "Landroid/view/ViewGroup;", "setVisibility", "value", "", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"app:dateText"})
        public final void formatServerDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView view, @org.jetbrains.annotations.NotNull()
        sotra.ynab.data.budgets.Budget item) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"app:viewModelVisible"})
        public final void setViewModelVisible(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVisible) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"app:viewModelVisible"})
        public final void setViewModelVisible(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup view, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVisible) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.databinding.BindingAdapter(value = {"app:retryCallback"})
        public final sotra.ynab.util.RetryCallback setRetryCallback(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        sotra.ynab.util.RetryCallback retryCallback) {
            return null;
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:visibility"})
        public final void setVisibility(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
        }
        
        private Companion() {
            super();
        }
    }
}