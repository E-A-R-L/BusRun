 package com.example.busrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button logIn,signup;
    EditText usr_txt, pass_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logIn = findViewById(R.id.btn_Login);
        signup = findViewById(R.id.btn_SignUp);
        usr_txt = findViewById(R.id.user_input);
        pass_txt = findViewById(R.id.pass_input);

        Intent create = getIntent();
        usr_txt.setText(create.getStringExtra("user"));
        pass_txt.setText(create.getStringExtra("pass"));


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(MainActivity.this,com.example.busrun.signup.class);
                startActivity(sign);

            }
        });
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = usr_txt.getText().toString();

                Intent log = new Intent(MainActivity.this, Menu.class);
                log.putExtra("user", user);
                startActivity(log);

            }
        });








    }
}