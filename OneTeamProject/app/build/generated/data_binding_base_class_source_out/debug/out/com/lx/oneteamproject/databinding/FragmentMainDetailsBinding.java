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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.lx.oneteamproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imgWeather;

  @NonNull
  public final LinearLayout linearLayout10;

  @NonNull
  public final LinearLayout linearLayout20;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final LinearLayout linearLayout7;

  @NonNull
  public final LinearLayout linearLayout8;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final ViewPager2 mainActionArticlePager;

  @NonNull
  public final TextView mainLocation;

  @NonNull
  public final ViewPager2 mainPublicAdPager;

  @NonNull
  public final LinearLayout mainReportButton;

  @NonNull
  public final TextView mainStatisticsNaturalOutput;

  @NonNull
  public final TextView mainStatisticsRiskInformOutput;

  @NonNull
  public final TextView mainStatisticsSafetyOutput;

  @NonNull
  public final TextView mainStatisticsSocialOutput;

  @NonNull
  public final LinearLayout myLetterBox;

  @NonNull
  public final LinearLayout naturalButton;

  @NonNull
  public final LinearLayout riskButton;

  @NonNull
  public final LinearLayout safetyButton;

  @NonNull
  public final LinearLayout situationButton;

  @NonNull
  public final LinearLayout socialButton;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView tvTemp;

  private FragmentMainDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView17, @NonNull ImageView imageView18, @NonNull ImageView imageView2,
      @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5,
      @NonNull ImageView imageView6, @NonNull ImageView imgWeather,
      @NonNull LinearLayout linearLayout10, @NonNull LinearLayout linearLayout20,
      @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4,
      @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout7,
      @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9,
      @NonNull ViewPager2 mainActionArticlePager, @NonNull TextView mainLocation,
      @NonNull ViewPager2 mainPublicAdPager, @NonNull LinearLayout mainReportButton,
      @NonNull TextView mainStatisticsNaturalOutput,
      @NonNull TextView mainStatisticsRiskInformOutput,
      @NonNull TextView mainStatisticsSafetyOutput, @NonNull TextView mainStatisticsSocialOutput,
      @NonNull LinearLayout myLetterBox, @NonNull LinearLayout naturalButton,
      @NonNull LinearLayout riskButton, @NonNull LinearLayout safetyButton,
      @NonNull LinearLayout situationButton, @NonNull LinearLayout socialButton,
      @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12,
      @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView6,
      @NonNull TextView textView7, @NonNull TextView textView9, @NonNull TextView tvTemp) {
    this.rootView = rootView;
    this.imageView17 = imageView17;
    this.imageView18 = imageView18;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imgWeather = imgWeather;
    this.linearLayout10 = linearLayout10;
    this.linearLayout20 = linearLayout20;
    this.linearLayout3 = linearLayout3;
    this.linearLayout4 = linearLayout4;
    this.linearLayout5 = linearLayout5;
    this.linearLayout7 = linearLayout7;
    this.linearLayout8 = linearLayout8;
    this.linearLayout9 = linearLayout9;
    this.mainActionArticlePager = mainActionArticlePager;
    this.mainLocation = mainLocation;
    this.mainPublicAdPager = mainPublicAdPager;
    this.mainReportButton = mainReportButton;
    this.mainStatisticsNaturalOutput = mainStatisticsNaturalOutput;
    this.mainStatisticsRiskInformOutput = mainStatisticsRiskInformOutput;
    this.mainStatisticsSafetyOutput = mainStatisticsSafetyOutput;
    this.mainStatisticsSocialOutput = mainStatisticsSocialOutput;
    this.myLetterBox = myLetterBox;
    this.naturalButton = naturalButton;
    this.riskButton = riskButton;
    this.safetyButton = safetyButton;
    this.situationButton = situationButton;
    this.socialButton = socialButton;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView9 = textView9;
    this.tvTemp = tvTemp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      id = R.id.imageView18;
      ImageView imageView18 = ViewBindings.findChildViewById(rootView, id);
      if (imageView18 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imgWeather;
      ImageView imgWeather = ViewBindings.findChildViewById(rootView, id);
      if (imgWeather == null) {
        break missingId;
      }

      id = R.id.linearLayout10;
      LinearLayout linearLayout10 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout10 == null) {
        break missingId;
      }

      id = R.id.linearLayout20;
      LinearLayout linearLayout20 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout20 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.linearLayout7;
      LinearLayout linearLayout7 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout7 == null) {
        break missingId;
      }

      id = R.id.linearLayout8;
      LinearLayout linearLayout8 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout8 == null) {
        break missingId;
      }

      id = R.id.linearLayout9;
      LinearLayout linearLayout9 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout9 == null) {
        break missingId;
      }

      id = R.id.mainActionArticlePager;
      ViewPager2 mainActionArticlePager = ViewBindings.findChildViewById(rootView, id);
      if (mainActionArticlePager == null) {
        break missingId;
      }

      id = R.id.mainLocation;
      TextView mainLocation = ViewBindings.findChildViewById(rootView, id);
      if (mainLocation == null) {
        break missingId;
      }

      id = R.id.mainPublicAdPager;
      ViewPager2 mainPublicAdPager = ViewBindings.findChildViewById(rootView, id);
      if (mainPublicAdPager == null) {
        break missingId;
      }

      id = R.id.mainReportButton;
      LinearLayout mainReportButton = ViewBindings.findChildViewById(rootView, id);
      if (mainReportButton == null) {
        break missingId;
      }

      id = R.id.mainStatisticsNaturalOutput;
      TextView mainStatisticsNaturalOutput = ViewBindings.findChildViewById(rootView, id);
      if (mainStatisticsNaturalOutput == null) {
        break missingId;
      }

      id = R.id.mainStatisticsRiskInformOutput;
      TextView mainStatisticsRiskInformOutput = ViewBindings.findChildViewById(rootView, id);
      if (mainStatisticsRiskInformOutput == null) {
        break missingId;
      }

      id = R.id.mainStatisticsSafetyOutput;
      TextView mainStatisticsSafetyOutput = ViewBindings.findChildViewById(rootView, id);
      if (mainStatisticsSafetyOutput == null) {
        break missingId;
      }

      id = R.id.mainStatisticsSocialOutput;
      TextView mainStatisticsSocialOutput = ViewBindings.findChildViewById(rootView, id);
      if (mainStatisticsSocialOutput == null) {
        break missingId;
      }

      id = R.id.myLetterBox;
      LinearLayout myLetterBox = ViewBindings.findChildViewById(rootView, id);
      if (myLetterBox == null) {
        break missingId;
      }

      id = R.id.naturalButton;
      LinearLayout naturalButton = ViewBindings.findChildViewById(rootView, id);
      if (naturalButton == null) {
        break missingId;
      }

      id = R.id.riskButton;
      LinearLayout riskButton = ViewBindings.findChildViewById(rootView, id);
      if (riskButton == null) {
        break missingId;
      }

      id = R.id.safetyButton;
      LinearLayout safetyButton = ViewBindings.findChildViewById(rootView, id);
      if (safetyButton == null) {
        break missingId;
      }

      id = R.id.situationButton;
      LinearLayout situationButton = ViewBindings.findChildViewById(rootView, id);
      if (situationButton == null) {
        break missingId;
      }

      id = R.id.socialButton;
      LinearLayout socialButton = ViewBindings.findChildViewById(rootView, id);
      if (socialButton == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.tvTemp;
      TextView tvTemp = ViewBindings.findChildViewById(rootView, id);
      if (tvTemp == null) {
        break missingId;
      }

      return new FragmentMainDetailsBinding((ConstraintLayout) rootView, imageView17, imageView18,
          imageView2, imageView3, imageView4, imageView5, imageView6, imgWeather, linearLayout10,
          linearLayout20, linearLayout3, linearLayout4, linearLayout5, linearLayout7, linearLayout8,
          linearLayout9, mainActionArticlePager, mainLocation, mainPublicAdPager, mainReportButton,
          mainStatisticsNaturalOutput, mainStatisticsRiskInformOutput, mainStatisticsSafetyOutput,
          mainStatisticsSocialOutput, myLetterBox, naturalButton, riskButton, safetyButton,
          situationButton, socialButton, textView10, textView11, textView12, textView13, textView14,
          textView2, textView3, textView4, textView6, textView7, textView9, tvTemp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
