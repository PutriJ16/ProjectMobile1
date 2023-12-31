// Generated by view binder compiler. Do not edit!
package com.example.projectmobile1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectmobile1.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final BottomAppBar bottomAppBar;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final NavigationView navigationDrawer;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMain2Binding(@NonNull DrawerLayout rootView, @NonNull BottomAppBar bottomAppBar,
      @NonNull BottomNavigationView bottomNavigation, @NonNull DrawerLayout drawerLayout,
      @NonNull FrameLayout fragmentContainer, @NonNull NavigationView navigationDrawer,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.bottomAppBar = bottomAppBar;
    this.bottomNavigation = bottomNavigation;
    this.drawerLayout = drawerLayout;
    this.fragmentContainer = fragmentContainer;
    this.navigationDrawer = navigationDrawer;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomAppBar;
      BottomAppBar bottomAppBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomAppBar == null) {
        break missingId;
      }

      id = R.id.bottom_navigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.fragment_container;
      FrameLayout fragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainer == null) {
        break missingId;
      }

      id = R.id.navigation_drawer;
      NavigationView navigationDrawer = ViewBindings.findChildViewById(rootView, id);
      if (navigationDrawer == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMain2Binding((DrawerLayout) rootView, bottomAppBar, bottomNavigation,
          drawerLayout, fragmentContainer, navigationDrawer, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
