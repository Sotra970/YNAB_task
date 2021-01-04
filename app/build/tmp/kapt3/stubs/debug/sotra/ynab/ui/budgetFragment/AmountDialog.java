package sotra.ynab.ui.budgetFragment;

import java.lang.System;

/**
 * Created by ahmed on 17/11/2017.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lsotra/ynab/ui/budgetFragment/AmountDialog;", "Lsotra/ynab/util/BaseDialog;", "()V", "callback", "Lsotra/ynab/ui/budgetFragment/AmountDialog$Callback;", "dialog_acc_balance_input", "Lcom/google/android/material/textfield/TextInputEditText;", "dialog_acc_balance_input_layout", "Lcom/google/android/material/textfield/TextInputLayout;", "confirm", "", "createDialogView", "Landroid/view/View;", "isValidInput", "", "editText", "Landroid/widget/EditText;", "inputLayout", "Callback", "Companion", "app_debug"})
public final class AmountDialog extends sotra.ynab.util.BaseDialog {
    private com.google.android.material.textfield.TextInputEditText dialog_acc_balance_input;
    private com.google.android.material.textfield.TextInputLayout dialog_acc_balance_input_layout;
    private sotra.ynab.ui.budgetFragment.AmountDialog.Callback callback;
    public static final sotra.ynab.ui.budgetFragment.AmountDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View createDialogView() {
        return null;
    }
    
    public final void confirm() {
    }
    
    public final boolean isValidInput(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout inputLayout) {
        return false;
    }
    
    public AmountDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsotra/ynab/ui/budgetFragment/AmountDialog$Callback;", "", "deliverValue", "", "balance", "", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void deliverValue(int balance);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsotra/ynab/ui/budgetFragment/AmountDialog$Companion;", "", "()V", "getInstance", "Lsotra/ynab/ui/budgetFragment/AmountDialog;", "callback", "Lsotra/ynab/ui/budgetFragment/AmountDialog$Callback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final sotra.ynab.ui.budgetFragment.AmountDialog getInstance(@org.jetbrains.annotations.Nullable()
        sotra.ynab.ui.budgetFragment.AmountDialog.Callback callback) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}