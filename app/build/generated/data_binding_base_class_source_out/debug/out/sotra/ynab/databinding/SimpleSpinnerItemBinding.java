// Generated by view binder compiler. Do not edit!
package sotra.ynab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import sotra.ynab.R;

public final class SimpleSpinnerItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView rowText;

  private SimpleSpinnerItemBinding(@NonNull LinearLayout rootView, @NonNull TextView rowText) {
    this.rootView = rootView;
    this.rowText = rowText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SimpleSpinnerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SimpleSpinnerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.simple_spinner_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SimpleSpinnerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.row_text;
      TextView rowText = rootView.findViewById(id);
      if (rowText == null) {
        break missingId;
      }

      return new SimpleSpinnerItemBinding((LinearLayout) rootView, rowText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
