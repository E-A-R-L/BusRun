package com.example.busrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signup extends AppCompatActivity {

    Button create;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        create = findViewById(R.id.create_btn);

        user = findViewById(R.id.usrname);
        pass = findViewById(R.id.passwrd);

        String username = user.getText().toString();

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String password = pass.getText().toString();

                Intent login = new Intent(signup.this, MainActivity.class);
                login.putExtra("user", username);
                login.putExtra("pass", password);
                startActivity(login);

            }
        });


    }
}