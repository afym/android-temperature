package com.github.afym.util.ui;

import android.app.Activity;
import android.app.ProgressDialog;

public class Loader extends ProgressDialog {
    private Activity activity;
    private int stringId;

    public Loader(Activity activity, int stringId){
        super(activity);
        this.activity = activity;
        this.stringId = stringId;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void show(){
        this.buildProgressDialog();
        super.show();
    }

    @Override
    public void dismiss(){
        super.dismiss();
    }

    private void buildProgressDialog(){
        this.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        this.setMessage(this.activity.getString(this.stringId));
        this.setCancelable(false);
        this.setIndeterminate(true);
    }
}

