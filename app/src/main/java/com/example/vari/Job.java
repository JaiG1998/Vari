package com.example.vari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Job extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button nextButton1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job);

        radioGroup = findViewById(R.id.radioGroupId);
        nextButton1 = findViewById(R.id.button2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioButton = findViewById(checkedId);

                switch (radioButton.getId()){
                    case R.id.engineerId:{

                    }
                    break;
                    case R.id.doctorId:{

                    }
                    break;
                    case R.id.otherId:{

                    }
                    break;
                    case R.id.lawyerId:{

                    }
                    break;
                    case R.id.businessId:{

                    }
                    break;
                    case R.id.teacherId:{

                    }
                    break;
                    case R.id.studentId:{

                    }
                    break;


                }
            }
        });

        nextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Job.this, Upload.class);
                startActivity(i);
            }
        });







    }
}
