package com.example.savemyspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.List;
import java.util.ArrayList;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ChooseTimeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DateAdapter dateAdapter;
    private List<DateModel> dateList = new ArrayList<>();
    private String[] dates = {"06 Mar Mon", "07 Mar Tue", "08 Mar Wed", "09 Mar Thu", "10 Mar Fri"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_time);

        // Back button to finish the current activity
        ImageButton backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseTimeActivity.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

       Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseTimeActivity.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseTimeActivity.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseTimeActivity.this, ConfirmAppointmentActivity.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recyclerViewDates);

        // Initialize the list with some example dates and set the first date as selected
        for (String date : dates) {
            dateList.add(new DateModel(date, false));
        }
        dateList.get(0).setSelected(true); // Set the first date as active

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        dateAdapter = new DateAdapter(this, dateList);
        recyclerView.setAdapter(dateAdapter);


    }

}


  /*  // Create a RecyclerView with a Horizontal Layout Manager
    RecyclerView recyclerView = findViewById(R.id.date_carousel);
    recyclerView.setLayoutManager(new

    LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

    // Create a custom adapter to bind dates to views
    DateAdapter adapter = new ScrollDateAdapter(dates);
recyclerView.setAdapter(adapter);*/
