package com.example.savemyspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ViewAppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_details);

        // Back button to finish the current activity
        ImageButton backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Book another with same [doctor]
        Button anotherButton = findViewById(R.id.btn_book_another);
        anotherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewAppointmentActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        // Book another with same [doctor]
        Button cancelButton = findViewById(R.id.btn_cancel_booking);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewAppointmentActivity.this, MainNavigationActivity.class);
                startActivity(intent);
            }
        });
    }


}
