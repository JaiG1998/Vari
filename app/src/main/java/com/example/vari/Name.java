package com.example.vari;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Name extends AppCompatActivity {

    private TextView nameText;
    private EditText nameEdit;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);

        nameText = (TextView)findViewById(R.id.nameTextView);
        nameEdit = (EditText)findViewById(R.id.nameEditText);
        nextButton = (Button)findViewById(R.id.genderButton);



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enterName;

                enterName = nameEdit.getText().toString();

                Intent next = new Intent(Name.this, Gender.class);
                startActivity(next);
            }
        });





    }
}