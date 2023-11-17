// Generated by view binder compiler. Do not edit!
package com.lx.oneteamproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lx.oneteamproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NearStatiticsMapFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FragmentContainerView NearStatiticsFragmentMap;

  @NonNull
  public final LinearLayout bookmarkLayout;

  @NonNull
  public final ImageView imgWeather;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final TextView mainLocation;

  @NonNull
  public final CardView mapCardView;

  @NonNull
  public final ImageView statisticsNatural;

  @NonNull
  public final ImageView statisticsRisk;

  @NonNull
  public final ImageView statisticsSafety;

  @NonNull
  public final ImageView statisticsSocial;

  @NonNull
  public final TextView tvTemp;

  private NearStatiticsMapFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull FragmentContainerView NearStatiticsFragmentMap, @NonNull LinearLayout bookmarkLayout,
      @NonNull ImageView imgWeather, @NonNull LinearLayout linearLayout5,
      @NonNull TextView mainLocation, @NonNull CardView mapCardView,
      @NonNull ImageView statisticsNatural, @NonNull ImageView statisticsRisk,
      @NonNull ImageView statisticsSafety, @NonNull ImageView statisticsSocial,
      @NonNull TextView tvTemp) {
    this.rootView = rootView;
    this.NearStatiticsFragmentMap = NearStatiticsFragmentMap;
    this.bookmarkLayout = bookmarkLayout;
    this.imgWeather = imgWeather;
    this.linearLayout5 = linearLayout5;
    this.mainLocation = mainLocation;
    this.mapCardView = mapCardView;
    this.statisticsNatural = statisticsNatural;
    this.statisticsRisk = statisticsRisk;
    this.statisticsSafety = statisticsSafety;
    this.statisticsSocial = statisticsSocial;
    this.tvTemp = tvTemp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NearStatiticsMapFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NearStatiticsMapFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.near_statitics_map_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NearStatiticsMapFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.NearStatiticsFragmentMap;
      FragmentContainerView NearStatiticsFragmentMap = ViewBindings.findChildViewById(rootView, id);
      if (NearStatiticsFragmentMap == null) {
        break missingId;
      }

      id = R.id.bookmarkLayout;
      LinearLayout bookmarkLayout = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkLayout == null) {
        break missingId;
      }

      id = R.id.imgWeather;
      ImageView imgWeather = ViewBindings.findChildViewById(rootView, id);
      if (imgWeather == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.mainLocation;
      TextView mainLocation = ViewBindings.findChildViewById(rootView, id);
      if (mainLocation == null) {
        break missingId;
      }

      id = R.id.mapCardView;
      CardView mapCardView = ViewBindings.findChildViewById(rootView, id);
      if (mapCardView == null) {
        break missingId;
      }

      id = R.id.statisticsNatural;
      ImageView statisticsNatural = ViewBindings.findChildViewById(rootView, id);
      if (statisticsNatural == null) {
        break missingId;
      }

      id = R.id.statisticsRisk;
      ImageView statisticsRisk = ViewBindings.findChildViewById(rootView, id);
      if (statisticsRisk == null) {
        break missingId;
      }

      id = R.id.statisticsSafety;
      ImageView statisticsSafety = ViewBindings.findChildViewById(rootView, id);
      if (statisticsSafety == null) {
        break missingId;
      }

      id = R.id.statisticsSocial;
      ImageView statisticsSocial = ViewBindings.findChildViewById(rootView, id);
      if (statisticsSocial == null) {
        break missingId;
      }

      id = R.id.tvTemp;
      TextView tvTemp = ViewBindings.findChildViewById(rootView, id);
      if (tvTemp == null) {
        break missingId;
      }

      return new NearStatiticsMapFragmentBinding((ConstraintLayout) rootView,
          NearStatiticsFragmentMap, bookmarkLayout, imgWeather, linearLayout5, mainLocation,
          mapCardView, statisticsNatural, statisticsRisk, statisticsSafety, statisticsSocial,
          tvTemp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
