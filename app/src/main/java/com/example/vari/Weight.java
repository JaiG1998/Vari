package com.example.vari;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Weight extends AppCompatActivity {

    private EditText weightEditText;
    private Button jobButton;

    private float fWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);

        weightEditText = (EditText)findViewById(R.id.ed1);
        jobButton = findViewById(R.id.jobButton);

        String strWeight;

        strWeight = weightEditText.getText().toString();

        jobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent job = new Intent(Weight.this, Job.class);
                startActivity(job);
            }
        });


    }
}