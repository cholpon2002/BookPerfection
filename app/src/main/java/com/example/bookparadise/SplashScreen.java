package com.example.bookparadise;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,HomeActivity.class));
            }
        },3000);


//        logo.animate().alpha(1f).setDuration(5000).withEndAction(new Runnable() {
//            @Override
//            public void run() {
//                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//                Intent j = new Intent(this,MainActivity.class);
//                startActivity(j);
//            }
//        });



    }
}