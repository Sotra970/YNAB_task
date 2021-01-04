// Generated by view binder compiler. Do not edit!
package sotra.ynab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import sotra.ynab.R;

public final class AccountDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText dialogAccBalanceInput;

  @NonNull
  public final TextInputLayout dialogAccBalanceInputLayout;

  @NonNull
  public final TextInputEditText dialogAccNameInput;

  @NonNull
  public final TextInputLayout dialogAccNameInputLayout;

  @NonNull
  public final MaterialButton dialogCancel;

  @NonNull
  public final MaterialButton dialogConfirm;

  @NonNull
  public final RadioGroup radioGroup;

  private AccountDialogBinding(@NonNull LinearLayout rootView,
      @NonNull TextInputEditText dialogAccBalanceInput,
      @NonNull TextInputLayout dialogAccBalanceInputLayout,
      @NonNull TextInputEditText dialogAccNameInput,
      @NonNull TextInputLayout dialogAccNameInputLayout, @NonNull MaterialButton dialogCancel,
      @NonNull MaterialButton dialogConfirm, @NonNull RadioGroup radioGroup) {
    this.rootView = rootView;
    this.dialogAccBalanceInput = dialogAccBalanceInput;
    this.dialogAccBalanceInputLayout = dialogAccBalanceInputLayout;
    this.dialogAccNameInput = dialogAccNameInput;
    this.dialogAccNameInputLayout = dialogAccNameInputLayout;
    this.dialogCancel = dialogCancel;
    this.dialogConfirm = dialogConfirm;
    this.radioGroup = radioGroup;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AccountDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AccountDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.account_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AccountDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog_acc_balance_input;
      TextInputEditText dialogAccBalanceInput = rootView.findViewById(id);
      if (dialogAccBalanceInput == null) {
        break missingId;
      }

      id = R.id.dialog_acc_balance_input_layout;
      TextInputLayout dialogAccBalanceInputLayout = rootView.findViewById(id);
      if (dialogAccBalanceInputLayout == null) {
        break missingId;
      }

      id = R.id.dialog_acc_name_input;
      TextInputEditText dialogAccNameInput = rootView.findViewById(id);
      if (dialogAccNameInput == null) {
        break missingId;
      }

      id = R.id.dialog_acc_name_input_layout;
      TextInputLayout dialogAccNameInputLayout = rootView.findViewById(id);
      if (dialogAccNameInputLayout == null) {
        break missingId;
      }

      id = R.id.dialog_cancel;
      MaterialButton dialogCancel = rootView.findViewById(id);
      if (dialogCancel == null) {
        break missingId;
      }

      id = R.id.dialog_confirm;
      MaterialButton dialogConfirm = rootView.findViewById(id);
      if (dialogConfirm == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = rootView.findViewById(id);
      if (radioGroup == null) {
        break missingId;
      }

      return new AccountDialogBinding((LinearLayout) rootView, dialogAccBalanceInput,
          dialogAccBalanceInputLayout, dialogAccNameInput, dialogAccNameInputLayout, dialogCancel,
          dialogConfirm, radioGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
