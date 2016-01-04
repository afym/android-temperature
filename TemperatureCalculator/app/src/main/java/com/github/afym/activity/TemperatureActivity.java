package com.github.afym.activity;

import android.os.Bundle;
import com.github.afym.R;
import com.github.afym.form.TemperatureForm;
import com.github.afym.util.activity.BaseActivity;

public class TemperatureActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        TemperatureForm temperatureForm = new TemperatureForm();
        temperatureForm.startForm(this);
    }
}
