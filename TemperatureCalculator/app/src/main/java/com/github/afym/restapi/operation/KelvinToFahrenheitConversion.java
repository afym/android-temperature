package com.github.afym.restapi.operation;

import com.github.afym.R;
import com.github.afym.form.TemperatureForm;
import com.github.afym.restapi.ContractConversion;

public class KelvinToFahrenheitConversion extends ContractConversion {
    public KelvinToFahrenheitConversion(TemperatureForm temperatureForm){
        super(temperatureForm);
    }

    @Override
    public void buildOperation() {
        this.url.append(this.temperatureForm.getActivity().getString(R.string.ws_temperature_operation_ktf));
    }
}


