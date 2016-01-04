package com.github.afym.form.validator;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;

import com.github.afym.R;
import com.github.afym.form.TemperatureForm;
import com.github.afym.util.form.validator.IValidate;
import com.github.afym.util.ui.Alert;

public class TemperatureValidator implements IValidate {
    private TemperatureForm temperatureForm;

    public TemperatureValidator(TemperatureForm temperatureForm) {
        this.temperatureForm = temperatureForm;
    }

    @Override
    public boolean isValid() {
        return this.isEmpty();
    }

    private boolean isEmpty() {
        String initial = this.temperatureForm.getInitialEditText().getText().toString();
        String initialScale = this.temperatureForm.getInitialSpinner().getSelectedItem().toString();
        String finalScale = this.temperatureForm.getFinalSpinner().getSelectedItem().toString();

        if (initial == null || initial.equals("")) {
            this.temperatureForm.getInitialEditText().getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
            return false;
        }

        if (initialScale.equals(finalScale)) {
            this.showAlertDialog();
            return false;
        }

        this.temperatureForm.getFinalLinear().setVisibility(View.VISIBLE);

        return true;
    }

    private void showAlertDialog() {
        Alert alert = new Alert(this.temperatureForm.getActivity());
        alert.setValues(R.string.temperature_alert_title, R.string.temperature_alert_message);
        alert.show();
    }
}