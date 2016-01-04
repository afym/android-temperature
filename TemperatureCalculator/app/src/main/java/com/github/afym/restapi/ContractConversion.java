package com.github.afym.restapi;

import android.app.Activity;

import com.github.afym.R;
import com.github.afym.form.TemperatureForm;

public abstract class ContractConversion {
    protected TemperatureForm temperatureForm;
    protected StringBuilder url;

    public ContractConversion(TemperatureForm temperatureForm) {
        this.temperatureForm = temperatureForm;
        Activity activity = this.temperatureForm.getActivity();
        this.url = new StringBuilder();
        this.url.append(activity.getString(R.string.ws_service_host))
                .append(activity.getString(R.string.ws_service_contract))
                .append("/");
    }

    public String getUrl(String temperature){
        return this.url.append("/").append(temperature).toString();
    }

    public abstract void buildOperation();
}
