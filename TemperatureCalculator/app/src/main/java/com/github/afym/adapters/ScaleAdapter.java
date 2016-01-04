package com.github.afym.adapters;

import android.app.Activity;
import android.widget.ArrayAdapter;

import com.github.afym.adapters.data.ScaleData;

public class ScaleAdapter extends ArrayAdapter<String> {
    public ScaleAdapter(Activity activity) {
        super(activity, android.R.layout.simple_spinner_item, ScaleData.get());
    }
}
