package com.github.fernandodev.easyratingdialog.samplewithdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.fernandodev.easyratingdialog.library.EasyRatingDialog;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
  @Inject
  EasyRatingDialog easyRatingDialog;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Sample app = (Sample) getApplication();
    app.injectActivity(this);
  }

  @Override
  protected void onStart() {
    super.onStart();
    easyRatingDialog.onStart();
  }

  @Override
  protected void onResume() {
    super.onResume();
    easyRatingDialog.showIfNeeded();
  }
}
