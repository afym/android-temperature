package com.github.afym.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.github.afym.R;
import com.github.afym.util.activity.BaseActivity;

public class LauncherActivity extends BaseActivity {
    private static final int SPLASH_DISPLAY_TIME = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        this.hideActionBar();
        this.launchTemperatureForm();
    }

    private void launchTemperatureForm() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(LauncherActivity.this, TemperatureActivity.class));
                finish();
            }
        }, SPLASH_DISPLAY_TIME);
    }
}
