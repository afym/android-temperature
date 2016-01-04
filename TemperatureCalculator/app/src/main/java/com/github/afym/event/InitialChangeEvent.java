package com.github.afym.event;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;

import com.github.afym.form.TemperatureForm;

public class InitialChangeEvent implements TextWatcher {
    private TemperatureForm temperatureForm;

    public InitialChangeEvent(TemperatureForm temperatureForm) {
        this.temperatureForm = temperatureForm;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        this.changeUI();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.changeUI();
    }

    @Override
    public void afterTextChanged(Editable s) {
        this.changeUI();
    }

    private void changeUI(){
        String initial = this.temperatureForm.getInitialEditText().getText().toString();
        LinearLayout finalLinear = this.temperatureForm.getFinalLinear();

        if (initial != null && !initial.equals("")) {
            finalLinear.setVisibility(View.VISIBLE);
        } else {
            finalLinear.setVisibility(View.GONE);
        }
    }
}
