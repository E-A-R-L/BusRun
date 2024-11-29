package com.example.busrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class level_select extends AppCompatActivity {

    Button back;
    ArrayList<levels> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);

        RecyclerView recView = findViewById(R.id.recView);

        arrayList.add(new levels(("Rooftop Rush")));
        arrayList.add(new levels(("Subway Scramble")));
        arrayList.add(new levels(("Market Mayhem")));
        arrayList.add(new levels(("Industrial Escape")));
        arrayList.add(new levels(("Neon Nights")));
        arrayList.add(new levels(("Bridge Blitz")));

        Level_adapter adapter = new Level_adapter(this, arrayList);

        recView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recView.setLayoutManager(linearLayoutManager);


        back = findViewById(R.id.ls_back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback = new Intent(level_select.this, android.R.menu.class);
                startActivity(goback);
            }
        });

    }
}