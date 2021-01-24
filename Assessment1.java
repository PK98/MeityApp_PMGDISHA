package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Assessment1 extends AppCompatActivity {
    Toolbar toolbar1;
    Button res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment1);
        toolbar1=(Toolbar)findViewById(R.id.toolbara1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("Assessment 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MODULE1.class));
            }
        });

       res1=(Button)findViewById(R.id.AS1btn);
        res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As1=new Intent(Assessment1.this,AssessmentResult1.class);
                startActivity(As1);
            }
        });


    }
        }





