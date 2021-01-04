package sotra.ynab.ui.budgetFragment;

import java.lang.System;

/**
 * Created by ahmed on 17/11/2017.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lsotra/ynab/ui/budgetFragment/AccountDialog;", "Lsotra/ynab/util/BaseDialog;", "()V", "callback", "Lsotra/ynab/ui/budgetFragment/AccountDialog$Callback;", "dialog_acc_balance_input", "Lcom/google/android/material/textfield/TextInputEditText;", "dialog_acc_balance_input_layout", "Lcom/google/android/material/textfield/TextInputLayout;", "dialog_acc_name_input", "dialog_acc_name_input_layout", "radioButtons", "", "", "[Ljava/lang/String;", "radioGroup", "Landroid/widget/RadioGroup;", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "confirm", "", "createDialgsRadioButtons", "v", "Landroid/view/View;", "createDialogView", "isValidInput", "", "editText", "Landroid/widget/EditText;", "inputLayout", "Callback", "Companion", "app_debug"})
public final class AccountDialog extends sotra.ynab.util.BaseDialog {
    private android.widget.RadioGroup radioGroup;
    private com.google.android.material.textfield.TextInputEditText dialog_acc_name_input;
    private com.google.android.material.textfield.TextInputEditText dialog_acc_balance_input;
    private com.google.android.material.textfield.TextInputLayout dialog_acc_balance_input_layout;
    private com.google.android.material.textfield.TextInputLayout dialog_acc_name_input_layout;
    private final java.lang.String[] radioButtons = {"checking", "savings", "creditCard", "cash", "lineOfCredit", "otherAsset", "otherLiability"};
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private sotra.ynab.ui.budgetFragment.AccountDialog.Callback callback;
    public static final sotra.ynab.ui.budgetFragment.AccountDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View createDialogView() {
        return null;
    }
    
    public final void createDialgsRadioButtons(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void confirm() {
    }
    
    public final boolean isValidInput(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout inputLayout) {
        return false;
    }
    
    public AccountDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lsotra/ynab/ui/budgetFragment/AccountDialog$Callback;", "", "deliverValue", "", "name", "", "accType", "balance", "", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void deliverValue(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String accType, int balance);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsotra/ynab/ui/budgetFragment/AccountDialog$Companion;", "", "()V", "getInstance", "Lsotra/ynab/ui/budgetFragment/AccountDialog;", "callback", "Lsotra/ynab/ui/budgetFragment/AccountDialog$Callback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final sotra.ynab.ui.budgetFragment.AccountDialog getInstance(@org.jetbrains.annotations.Nullable()
        sotra.ynab.ui.budgetFragment.AccountDialog.Callback callback) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}