package com.github.afym.task;

import android.os.AsyncTask;

import com.github.afym.R;
import com.github.afym.form.TemperatureForm;
import com.github.afym.restapi.RequestConversion;
import com.github.afym.restapi.ResponseConversion;
import com.github.afym.restapi.parse.ResultContainer;
import com.github.afym.util.ui.Alert;
import com.github.afym.util.ui.Loader;

public class ConverterTask extends AsyncTask<Void, Void, Void> {
    private TemperatureForm temperatureForm;
    private ResultContainer resultContainer;
    private Loader loader;

    public ConverterTask(TemperatureForm temperatureForm) {
        this.temperatureForm = temperatureForm;
        this.loader = new Loader(this.temperatureForm.getActivity(), R.string.temperature_loader_message);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        this.loader.show();
    }

    @Override
    protected Void doInBackground(Void... params) {
        RequestConversion requestConversion = new RequestConversion(this.temperatureForm);
        String get = requestConversion.get();
        ResponseConversion responseConversion = new ResponseConversion(get);
        this.resultContainer = responseConversion.getResultContainer();

        return null;
    }

    @Override
    protected void onPostExecute(Void Void) {
        super.onPostExecute(Void);
        this.loader.hide();

        if (!this.resultContainer.Response.Status) {
            Alert alert = new Alert(this.temperatureForm.getActivity());
            alert.setValues(R.string.temperature_alert_title_ws, R.string.temperature_alert_message_ws);
            alert.show();
        } else {
            Double temperature = this.resultContainer.Response.Result;
            this.temperatureForm.getFinalEditText().setText(temperature.toString());
        }
    }
}
