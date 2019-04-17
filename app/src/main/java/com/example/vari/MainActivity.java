package com.example.vari;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i = new Intent(MainActivity.this, Name.class);
               startActivity(i);
           }
       },2000);



    }
}


