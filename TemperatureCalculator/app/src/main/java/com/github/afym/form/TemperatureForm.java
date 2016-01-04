package com.github.afym.form;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.afym.adapters.ScaleAdapter;
import com.github.afym.event.InitialChangeEvent;
import com.github.afym.event.TemperatureButtonEvent;
import com.github.afym.util.form.IFormAddtEvents;
import com.github.afym.util.form.IForm;
import com.github.afym.R;

public class TemperatureForm implements IForm, IFormAddtEvents {
    private Activity activity;
    private TextView initialTextView;
    private EditText initialEditText;
    private Spinner initialSpinner;
    private LinearLayout finalLinear;
    private TextView finalTextView;
    private EditText finalEditText;
    private Spinner finalSpinner;
    private Button temperatureButton;

    public Activity getActivity() {
        return activity;
    }

    public TextView getInitialTextView() {
        return initialTextView;
    }

    public EditText getInitialEditText() {
        return initialEditText;
    }

    public Spinner getInitialSpinner() {
        return initialSpinner;
    }

    public LinearLayout getFinalLinear() {
        return finalLinear;
    }

    public TextView getFinalTextView() {
        return finalTextView;
    }

    public EditText getFinalEditText() {
        return finalEditText;
    }

    public Spinner getFinalSpinner() {
        return finalSpinner;
    }

    public Button getTemperatureButton() {
        return temperatureButton;
    }

    @Override
    public void startForm(Activity activity){
        this.initElements(activity);
        this.initSpinners();
        this.addEvents();

    }

    @Override
    public void addEvents() {
        this.temperatureButton.setOnClickListener(new TemperatureButtonEvent(this));
        this.initialEditText.addTextChangedListener(new InitialChangeEvent(this));
    }

    private void initElements(Activity activity) {
        this.activity = activity;
        this.initialTextView = (TextView)activity.findViewById(R.id.initial_temperature_text_view);
        this.initialEditText = (EditText)activity.findViewById(R.id.initial_temperature_edit_text);
        this.initialSpinner = (Spinner)activity.findViewById(R.id.initial_temperature_spinner);
        this.finalLinear = (LinearLayout)activity.findViewById(R.id.final_temperature_linear);
        this.finalTextView = (TextView)activity.findViewById(R.id.initial_temperature_text_view);
        this.finalEditText = (EditText)activity.findViewById(R.id.final_temperature_edit_text);
        this.temperatureButton = (Button)activity.findViewById(R.id.temperature_button);
        this.finalSpinner = (Spinner)activity.findViewById(R.id.final_temperature_spinner);
    }

    private void initSpinners() {
        this.initialSpinner.setAdapter(new ScaleAdapter(this.activity));
        this.finalSpinner.setAdapter(new ScaleAdapter(this.activity));
    }
}
