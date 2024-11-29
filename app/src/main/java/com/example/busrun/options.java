package com.example.busrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class options extends AppCompatActivity {

    Button back,credits;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options2);

        credits = findViewById(R.id.crdt_btn);
        back = findViewById(R.id.opt_back_btn);
        img = findViewById(R.id.imageButton);

        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCred = new Intent(options.this, Credits.class);
                startActivity(goCred);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "BusRun@Developers.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Service");
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback = new Intent(options.this, android.R.menu.class);
                startActivity(goback);


            }
        });

    }
}