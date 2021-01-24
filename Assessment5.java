package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Assessment5 extends AppCompatActivity {
Toolbar toolbar;
    Button res5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment5);
        toolbar=(Toolbar)findViewById(R.id.toolbara5);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Assessment 5");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MODULE5.class));
            }
        });

        res5=(Button)findViewById(R.id.ASbtn5);
        res5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As5=new Intent(Assessment5.this,AssessmentResult5.class);
                startActivity(As5);
            }
        });

    }
}
