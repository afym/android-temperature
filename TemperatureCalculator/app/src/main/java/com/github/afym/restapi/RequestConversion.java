package com.github.afym.restapi;

import com.github.afym.form.TemperatureForm;
import com.github.kevinsawicki.http.HttpRequest;

import java.lang.reflect.Constructor;

public class RequestConversion {
    private TemperatureForm temperatureForm;

    public RequestConversion(TemperatureForm temperatureForm){
        this.temperatureForm = temperatureForm;
    }

    public String get(){
        String response = null;

        try {
            response =  HttpRequest.get(this.getUrlRequest()).body().toString();
        } catch (Exception e) {

        }

        return response;
    }

    private String getUrlRequest(){
        try {
            Constructor className = Class.forName(this.getClassNameFromSpinner()).getConstructor(TemperatureForm.class);
            ContractConversion contractConversion = (ContractConversion)className.newInstance(this.temperatureForm);
            contractConversion.buildOperation();
            String initial = this.temperatureForm.getInitialEditText().getText().toString();
            return contractConversion.getUrl(initial);

        } catch (Exception e) {
           return "";
        }
    }

    private String getClassNameFromSpinner(){
        StringBuilder className = new StringBuilder();
        String initialScale = this.temperatureForm.getInitialSpinner().getSelectedItem().toString();
        String finalScale = this.temperatureForm.getFinalSpinner().getSelectedItem().toString();
        initialScale = initialScale.substring(0, 1).toUpperCase() + initialScale.substring(1);
        finalScale = finalScale.substring(0, 1).toUpperCase() + finalScale.substring(1);

        className.append("com.github.afym.restapi.operation")
                .append(".")
                .append(initialScale)
                .append("To")
                .append(finalScale)
                .append("Conversion");

        return className.toString();
    }
}
