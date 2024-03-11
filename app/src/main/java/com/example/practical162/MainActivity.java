package com.example.practical162;


import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText ed1 , ed2;

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.edit1);
        ed2 = (EditText) findViewById(R.id.edit2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                String dateString = dateFormat.format(new Date()).toString();
                ed1.setText(dateString);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateFormat dateFormat = new SimpleDateFormat("hh.mm.aa");
                String dateString = dateFormat.format(new Date()).toString();
                ed2.setText(dateString);
            }
        });

    }
}