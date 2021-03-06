// Generated by view binder compiler. Do not edit!
package com.nombre.testeotecnico.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nombre.testeotecnico.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Conetido2Binding conten;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final Toolbar toolbar1;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView, @NonNull Conetido2Binding conten,
      @NonNull FloatingActionButton fab, @NonNull Toolbar toolbar1) {
    this.rootView = rootView;
    this.conten = conten;
    this.fab = fab;
    this.toolbar1 = toolbar1;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.conten;
      View conten = ViewBindings.findChildViewById(rootView, id);
      if (conten == null) {
        break missingId;
      }
      Conetido2Binding binding_conten = Conetido2Binding.bind(conten);

      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.toolbar1;
      Toolbar toolbar1 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar1 == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, binding_conten, fab, toolbar1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
