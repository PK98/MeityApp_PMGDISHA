package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Assessment3 extends AppCompatActivity {
    Toolbar toolbar;
    Button res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment3);
        toolbar=(Toolbar)findViewById(R.id.toolbara3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Assessment 3");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MODULE3.class));
            }
        });

        res1=(Button)findViewById(R.id.ASbtn3);
        res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As3=new Intent(Assessment3.this,AssessmentResult3.class);
                startActivity(As3);
            }
        });

    }
}
