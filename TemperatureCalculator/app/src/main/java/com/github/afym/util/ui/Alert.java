package com.github.afym.util.ui;

import android.app.Activity;
import android.app.AlertDialog;

public class Alert {
    private AlertDialog alert;
    private Activity activity;

    public Alert(Activity activity) {
        this.activity = activity;
        this.alert = new AlertDialog.Builder(activity).create();
    }

    public void setValues(int title, int body) {
        this.alert.setTitle(this.activity.getString(title));
        this.alert.setMessage(this.activity.getString(body));
    }

    public void show(){
        this.alert.show();
    }
}
