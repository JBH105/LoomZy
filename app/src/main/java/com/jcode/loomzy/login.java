package com.jcode.loomzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {

    TextView textsignup;
    TextInputEditText username,password;
    Button loginbtn;
    String name, pass;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginbtn=findViewById(R.id.loginbtn);
        signup=findViewById(R.id.textsignup);
       // progressBar = findViewById(R.id.progressBar);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),signup.class));
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=username.getText().toString().trim();
                pass = password.getText().toString().trim();

                if (name.isEmpty())
                {
                    username.setError("Username is Requird");
                    return;
                }

                if (pass.isEmpty())
                {
                    password.setError("Password is Requird");
                    return;
                }
                if (pass.length()<8)
                {
                    password.setError("Password must be at least 8 characters");
                    return;
                }
//                progressBar.setVisibility(View.VISIBLE);
//                signinmethod();
              startActivity(new Intent(getApplicationContext(),user_home.class));

            }
        });
    }

    }