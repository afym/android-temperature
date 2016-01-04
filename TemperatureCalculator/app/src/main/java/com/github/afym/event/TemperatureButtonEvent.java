package com.github.afym.event;

import android.view.View;

import com.github.afym.R;
import com.github.afym.form.TemperatureForm;
import com.github.afym.form.validator.TemperatureValidator;
import com.github.afym.task.ConverterTask;
import com.github.afym.util.network.Detector;
import com.github.afym.util.ui.Alert;

public class TemperatureButtonEvent implements View.OnClickListener {
    private TemperatureForm temperatureForm;

    public TemperatureButtonEvent(TemperatureForm temperatureForm) {
        this.temperatureForm = temperatureForm;
    }

    @Override
    public void onClick(View v) {
        TemperatureValidator temperatureValidator = new TemperatureValidator(this.temperatureForm);
        Detector detector = Detector.getInstance(this.temperatureForm.getActivity());

        if (!detector.isAvailable()) {
            Alert alert = new Alert(this.temperatureForm.getActivity());
            alert.setValues(R.string.temperature_alert_title_net, R.string.temperature_alert_message_net);
            alert.show();
        } else {
            if (temperatureValidator.isValid()) {
                ConverterTask converterTask = new ConverterTask(this.temperatureForm);
                converterTask.execute();
            }
        }
    }
}
