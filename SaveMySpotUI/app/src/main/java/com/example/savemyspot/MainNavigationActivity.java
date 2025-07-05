package com.example.savemyspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainNavigationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_navigation);

        Button viewReservationsButton = findViewById(R.id.btn_view_reservations);
        Button makeNewReservationButton = findViewById(R.id.btn_make_new_res);
        Button updateProfileButton = findViewById(R.id.btn_update_profile);

        viewReservationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, AppointmentList.class);
                startActivity(intent);
            }
        });

        makeNewReservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        updateProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, PersonInfo.class);
                startActivity(intent);
            }
        });


    }

}
