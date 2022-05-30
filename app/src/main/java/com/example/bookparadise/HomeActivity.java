package com.example.bookparadise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button move,reviews, aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        move = findViewById(R.id.buttonMove);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        reviews = findViewById(R.id.buttonMove2);
        reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Reviews_activity.class);
                startActivity(intent);
            }
        });

        aboutus = findViewById(R.id.buttonMove3);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });


//        aboutus = findViewById(R.id.buttonMove4);
//        aboutus.setOnClickListener(new  View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
//                startActivity(intent);
//
//            }
//        });

    }
}