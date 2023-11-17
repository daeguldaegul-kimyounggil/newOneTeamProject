// Generated by view binder compiler. Do not edit!
package com.lx.oneteamproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lx.oneteamproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView ciSound;

  @NonNull
  public final View seeLine;

  @NonNull
  public final TextView seesaw;

  @NonNull
  public final ConstraintLayout viewGroup;

  private ActivityStartBinding(@NonNull ConstraintLayout rootView, @NonNull TextView ciSound,
      @NonNull View seeLine, @NonNull TextView seesaw, @NonNull ConstraintLayout viewGroup) {
    this.rootView = rootView;
    this.ciSound = ciSound;
    this.seeLine = seeLine;
    this.seesaw = seesaw;
    this.viewGroup = viewGroup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_start, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ciSound;
      TextView ciSound = ViewBindings.findChildViewById(rootView, id);
      if (ciSound == null) {
        break missingId;
      }

      id = R.id.seeLine;
      View seeLine = ViewBindings.findChildViewById(rootView, id);
      if (seeLine == null) {
        break missingId;
      }

      id = R.id.seesaw;
      TextView seesaw = ViewBindings.findChildViewById(rootView, id);
      if (seesaw == null) {
        break missingId;
      }

      id = R.id.viewGroup;
      ConstraintLayout viewGroup = ViewBindings.findChildViewById(rootView, id);
      if (viewGroup == null) {
        break missingId;
      }

      return new ActivityStartBinding((ConstraintLayout) rootView, ciSound, seeLine, seesaw,
          viewGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
