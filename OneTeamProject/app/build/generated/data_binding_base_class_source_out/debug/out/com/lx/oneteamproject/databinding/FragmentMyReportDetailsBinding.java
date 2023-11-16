// Generated by view binder compiler. Do not edit!
package com.lx.oneteamproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.lx.oneteamproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyReportDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView13;

  @NonNull
  public final ImageView imageView14;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final TextView location;

  @NonNull
  public final TextView myreportlisttitle;

  @NonNull
  public final ViewPager2 myreportpager;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView22;

  private FragmentMyReportDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView10, @NonNull ImageView imageView13,
      @NonNull ImageView imageView14, @NonNull ImageView imageView15,
      @NonNull ImageView imageView16, @NonNull TextView location,
      @NonNull TextView myreportlisttitle, @NonNull ViewPager2 myreportpager,
      @NonNull ProgressBar progressBar2, @NonNull TextView textView16, @NonNull TextView textView18,
      @NonNull TextView textView19, @NonNull TextView textView20, @NonNull TextView textView21,
      @NonNull TextView textView22) {
    this.rootView = rootView;
    this.imageView10 = imageView10;
    this.imageView13 = imageView13;
    this.imageView14 = imageView14;
    this.imageView15 = imageView15;
    this.imageView16 = imageView16;
    this.location = location;
    this.myreportlisttitle = myreportlisttitle;
    this.myreportpager = myreportpager;
    this.progressBar2 = progressBar2;
    this.textView16 = textView16;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView20 = textView20;
    this.textView21 = textView21;
    this.textView22 = textView22;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyReportDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyReportDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_report_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyReportDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView13;
      ImageView imageView13 = ViewBindings.findChildViewById(rootView, id);
      if (imageView13 == null) {
        break missingId;
      }

      id = R.id.imageView14;
      ImageView imageView14 = ViewBindings.findChildViewById(rootView, id);
      if (imageView14 == null) {
        break missingId;
      }

      id = R.id.imageView15;
      ImageView imageView15 = ViewBindings.findChildViewById(rootView, id);
      if (imageView15 == null) {
        break missingId;
      }

      id = R.id.imageView16;
      ImageView imageView16 = ViewBindings.findChildViewById(rootView, id);
      if (imageView16 == null) {
        break missingId;
      }

      id = R.id.location;
      TextView location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.myreportlisttitle;
      TextView myreportlisttitle = ViewBindings.findChildViewById(rootView, id);
      if (myreportlisttitle == null) {
        break missingId;
      }

      id = R.id.myreportpager;
      ViewPager2 myreportpager = ViewBindings.findChildViewById(rootView, id);
      if (myreportpager == null) {
        break missingId;
      }

      id = R.id.progressBar2;
      ProgressBar progressBar2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar2 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      return new FragmentMyReportDetailsBinding((ConstraintLayout) rootView, imageView10,
          imageView13, imageView14, imageView15, imageView16, location, myreportlisttitle,
          myreportpager, progressBar2, textView16, textView18, textView19, textView20, textView21,
          textView22);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}