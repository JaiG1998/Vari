package com.example.vari;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class Birthday extends AppCompatActivity {

    private DatePicker date;
    private TextView birth;
    private Button nextButton;



    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birthday);

        nextButton = findViewById(R.id.button);
        birth = findViewById(R.id.birthTextView);
        date = findViewById(R.id.date);


        date.init(1990, 1,1,null);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent birth = new Intent(Birthday.this, Weight.class);
                startActivity(birth);



            }
        });



    }
}