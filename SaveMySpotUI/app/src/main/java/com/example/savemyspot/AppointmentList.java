package com.example.savemyspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class AppointmentList extends AppCompatActivity {

    private Spinner sortDropdown, filterDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_reservations);

        sortDropdown = findViewById(R.id.sortDropdown);
        filterDropdown = findViewById(R.id.filterDrowdown);

        String[] sortOptions = {"Person", "Type", "Date"};
        String[] filterOptions = {"All", "Papa Bear", "MamaBear", "Dental Appointment", "Medical"};

        ArrayAdapter<String> sortAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, sortOptions);
        ArrayAdapter<String> filterAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, filterOptions);

        sortDropdown.setAdapter(sortAdapter);
        filterDropdown.setAdapter(filterAdapter);

        ImageButton backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppointmentList.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppointmentList.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppointmentList.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppointmentList.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button buttonReserve = findViewById(R.id.btn_make_new_res);
        buttonReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppointmentList.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }

}
