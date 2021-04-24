package com.jcode.loomzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class signup extends AppCompatActivity {
    TextInputEditText username,email,number;
    TextInputEditText password,copassword;
    Button next;
    Switch aSwitch;

    String name, Email, Number, pas, copas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        number = findViewById(R.id.number);
        next = findViewById(R.id.next);
        password=findViewById(R.id.password);
        copassword=findViewById(R.id.copassword);
        aSwitch = findViewById(R.id.signupSwitch);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = username.getText().toString();
                Email = email.getText().toString();
                Number = number.getText().toString();
                pas = password.getText().toString().trim();
                copas = copassword.getText().toString().trim();

                if (name.isEmpty()){
                    username.setError("Username is Requird");
                    return;
                }
                if (Email.isEmpty()){
                    email.setError("Email is Requird");
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches())
                {
                    Toast.makeText(getApplicationContext(),"Enter Valid Email address",Toast.LENGTH_LONG).show();
                    return;
                }
                if (Number.isEmpty()|| number.length()<10){
                    number.setError("Number is Requird");
                    return;
                }
                if (pas.isEmpty()){
                    password.setError("Password is Requird");
                    return;
                }
                if (pas.length()<8)
                {
                    password.setError("Password must be atleast 8 characters");
                    return;
                }

                if (copas.isEmpty()){
                    copassword.setError("Password is Requird");
                    return;
                }

                if (!pas.equals(copas)) {
                    copassword.setError("Password and Confirm Password does NOT match!!");
                    return;
                }

                //progressBar.setVisibility(View.VISIBLE);
                if (aSwitch.isChecked()) {
                  //  progressBar.setVisibility(View.GONE);
                    Intent intent = new Intent(getApplicationContext(), signup_address.class);
                    intent.putExtra("username", name);
                    intent.putExtra("email", Email);
                    intent.putExtra("password", pas);
                    intent.putExtra("number", Number);
                    startActivity(intent);
                }

                   // usermethod();
            }
        });

    }
}