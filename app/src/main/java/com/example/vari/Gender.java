package com.example.vari;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Gender extends AppCompatActivity {

    private ImageButton male;
    private ImageButton female;
    private TextView gender;
    public int Value = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender);

        male = (ImageButton) findViewById(R.id.maleButton);
        female = (ImageButton) findViewById(R.id.femaleButton);
        gender = (TextView) findViewById(R.id.genderTextView);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value = 0;
                Intent maleIntent = new Intent(Gender.this, Birthday.class );
                startActivity(maleIntent);

            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value = 1;
                Intent femaleIntent = new Intent(Gender.this, Birthday.class );
                startActivity(femaleIntent);
            }
        });


    }
}
