package com.example.busrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    TextView user;
    Button lvl, board, opt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        user = findViewById(R.id.userName);
        lvl = findViewById(R.id.lvl_btn);
        board = findViewById(R.id.leboard_btn);
        opt = findViewById(R.id.option_btn);

        Intent welcome = getIntent();
        user.setText(welcome.getStringExtra("user"));

        lvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent golvl = new Intent(Menu.this, level_select.class);
                startActivity(golvl);
            }
        });

        board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goboard = new Intent(Menu.this, Leaderboard.class);
                startActivity(goboard);
            }
        });

        opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goopt = new Intent(Menu.this, options.class);
                startActivity(goopt);
            }
        });



    }
}