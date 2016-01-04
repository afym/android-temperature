package com.github.afym.util.activity;

import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    public void hideActionBar(){
        this.getSupportActionBar().hide();
    }
}
