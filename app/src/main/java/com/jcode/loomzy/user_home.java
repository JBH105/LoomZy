package com.jcode.loomzy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jcode.loomzy.bookservice.BookServiceActivity;

public class user_home extends AppCompatActivity {
CardView vehiclesCardViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_home);

        vehiclesCardViewHome=findViewById(R.id.vehiclesCardViewHome);

        vehiclesCardViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BookServiceActivity.class));
            }
        });
    }
}