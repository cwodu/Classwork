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

public class ConfirmAppointmentActivity extends AppCompatActivity {

    // Declare dropdownMenu as Spinner
    Spinner dropdownMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_time);

        // Create a String array for the dropdown items
        String[] items = {"Select Appointee:", "Mama Bear", "Papa Bear"};

        // Initialize dropdownMenu after layout is set
        dropdownMenu = findViewById(R.id.dropdown_menu);

        // Create an ArrayAdapter to bind the items to the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapter to the Spinner
        dropdownMenu.setAdapter(adapter);

        // Set a listener to handle item selection
        dropdownMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = items[position];
                // Handle the selected item
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle the case when no item is selected (if needed)
            }
        });

        // Set up the back button functionality
        ImageButton backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the activity
            }
        });

        Button confirmButton = findViewById(R.id.btn_confirm_booking);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmAppointmentActivity.this, ViewAppointmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
