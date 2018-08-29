package com.t3ch.shaj.androidtimepickerdialog;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TimePickerDialog timePickerDialog;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.TV_ID);
        button = findViewById(R.id.BT_ID);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TimePicker timePicker = new TimePicker(this);

        int hour = timePicker.getCurrentHour();
        int min = timePicker.getCurrentMinute();

        timePickerDialog = new TimePickerDialog(MainActivity.this,

                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textView.setText(hourOfDay + ":" + minute);
                    }
                }, hour, min, true);

        timePickerDialog.show();

    }
}
