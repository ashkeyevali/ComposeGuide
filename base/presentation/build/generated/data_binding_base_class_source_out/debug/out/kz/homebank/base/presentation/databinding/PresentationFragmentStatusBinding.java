// Generated by view binder compiler. Do not edit!
package kz.homebank.base.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kz.homebank.base.presentation.R;

public final class PresentationFragmentStatusBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnPrimary;

  @NonNull
  public final Button btnSecondary;

  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final TextView tvSubtitle;

  @NonNull
  public final TextView tvTitle;

  private PresentationFragmentStatusBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnPrimary, @NonNull Button btnSecondary, @NonNull ImageView ivIcon,
      @NonNull TextView tvSubtitle, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnPrimary = btnPrimary;
    this.btnSecondary = btnSecondary;
    this.ivIcon = ivIcon;
    this.tvSubtitle = tvSubtitle;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PresentationFragmentStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PresentationFragmentStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.presentation_fragment_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PresentationFragmentStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPrimary;
      Button btnPrimary = ViewBindings.findChildViewById(rootView, id);
      if (btnPrimary == null) {
        break missingId;
      }

      id = R.id.btnSecondary;
      Button btnSecondary = ViewBindings.findChildViewById(rootView, id);
      if (btnSecondary == null) {
        break missingId;
      }

      id = R.id.ivIcon;
      ImageView ivIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivIcon == null) {
        break missingId;
      }

      id = R.id.tvSubtitle;
      TextView tvSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (tvSubtitle == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new PresentationFragmentStatusBinding((LinearLayout) rootView, btnPrimary,
          btnSecondary, ivIcon, tvSubtitle, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
