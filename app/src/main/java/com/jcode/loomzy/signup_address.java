package com.jcode.loomzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signup_address extends AppCompatActivity {
    TextInputEditText address_first,address_second,city,zip;
    Button adsignup;
    String name, email, pas, Number, first, second, City, Zip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_address);

        address_first=findViewById(R.id.address_first);
        address_second=findViewById(R.id.address_second);
        city=findViewById(R.id.city);
        zip=findViewById(R.id.zip);
        adsignup=findViewById(R.id.adsignup);
    //    progressBar = findViewById(R.id.progressBar);

        Intent intent = getIntent();
        name = intent.getStringExtra("username");
        email = intent.getStringExtra("email");
        pas = intent.getStringExtra("password");
        Number = intent.getStringExtra("number");



        adsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = address_first.getText().toString().trim();
                second = address_second.getText().toString().trim();
                City = city.getText().toString().trim();
                Zip = zip.getText().toString().trim();

                if (first.isEmpty()){
                    address_first.setError("Address is Requird");
                    return;
                }
                if (second.isEmpty()){
//                    address_second.setError("Address is Requird");
                    second ="";
//                    return;
                }
                if (City.isEmpty()){
                    city.setError("City is Requird");
                    return;
                }
                if (Zip.isEmpty()){
                    zip.setError("Zip code is Requird");
                    return;
                }
                if (Zip.length()<6){
                    zip.setError("Zip code must be at least 6 characters");
                    return;
                }
  //              progressBar.setVisibility(View.VISIBLE);
//                usermethod();
                //startActivity(new Intent(getApplicationContext(),signup_password.class));
            }
        });
    }

}
