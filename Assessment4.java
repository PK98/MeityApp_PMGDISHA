package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Assessment4 extends AppCompatActivity {
Toolbar toolbar;
    Button res4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment4);
        toolbar=(Toolbar)findViewById(R.id.toolbara4);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Assessment 4");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MODULE4.class));
            }
        });

        res4=(Button)findViewById(R.id.ASbtn4);
        res4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As4=new Intent(Assessment4.this,AssessmentResult4.class);
                startActivity(As4);
            }
        });

    }
}



