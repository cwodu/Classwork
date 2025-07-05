package com.example.savemyspot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;

public class PersonInfo extends AppCompatActivity {

    EditText dateOfBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info);

        ImageButton backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Find the Date of Birth EditText
        dateOfBirth = findViewById(R.id.dateOfBirth1);

        // Set an OnClickListener to open the DatePickerDialog
        dateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current date
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

                // Create and show the DatePickerDialog
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        PersonInfo.this,
                        (view, year1, month1, dayOfMonth1) -> {
                            // Set the selected date in the EditText
                            dateOfBirth.setText(dayOfMonth1 + "/" + (month1 + 1) + "/" + year1);
                        },
                        year, month, dayOfMonth
                );
                datePickerDialog.show();
            }
        });
    }
}
