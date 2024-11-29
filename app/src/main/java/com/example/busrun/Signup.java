package com.example.busrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    Button create;
    EditText user, pass, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        create = findViewById(R.id.create_btn);

        email= findViewById(R.id.email);
        user = findViewById(R.id.usrname);
        pass = findViewById(R.id.passwrd);


        create.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {

                    if (user.getText().toString().equals(""))
                    {
                        Toast.makeText(Signup.this, "Email required", Toast.LENGTH_SHORT).show();
                    }
                    else if (user.getText().toString().equals(""))
                    {
                        Toast.makeText(Signup.this, "user Name required", Toast.LENGTH_SHORT).show();
                    }
                    else if (pass.getText().toString().equals(""))
                    {
                        Toast.makeText(Signup.this, "PassWord required", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        String username = user.getText().toString();
                        String password = pass.getText().toString();

                        Intent login = new Intent(Signup.this, MainActivity.class);
                        login.putExtra("user", username);
                        login.putExtra("pass", password);
                        startActivity(login);

                    }
                }

        });


    }
}