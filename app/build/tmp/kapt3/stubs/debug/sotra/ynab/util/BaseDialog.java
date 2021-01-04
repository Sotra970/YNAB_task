package sotra.ynab.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH$J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lsotra/ynab/util/BaseDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "cancelCallback", "Lsotra/ynab/util/BaseDialog$OnDialogCancelCallback;", "getCancelCallback", "()Lsotra/ynab/util/BaseDialog$OnDialogCancelCallback;", "setCancelCallback", "(Lsotra/ynab/util/BaseDialog$OnDialogCancelCallback;)V", "cancel", "", "createDialogView", "Landroid/view/View;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "OnDialogCancelCallback", "app_debug"})
public abstract class BaseDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private sotra.ynab.util.BaseDialog.OnDialogCancelCallback cancelCallback;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final sotra.ynab.util.BaseDialog.OnDialogCancelCallback getCancelCallback() {
        return null;
    }
    
    public final void setCancelCallback(@org.jetbrains.annotations.Nullable()
    sotra.ynab.util.BaseDialog.OnDialogCancelCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.view.View createDialogView();
    
    public final void cancel() {
    }
    
    public BaseDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lsotra/ynab/util/BaseDialog$OnDialogCancelCallback;", "", "onDialogCancelled", "", "app_debug"})
    public static abstract interface OnDialogCancelCallback {
        
        public abstract void onDialogCancelled();
    }
}