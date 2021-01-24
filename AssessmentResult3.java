package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AssessmentResult3 extends AppCompatActivity {
Toolbar toolbar1;
    Button next3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_result3);
        toolbar1=(Toolbar)findViewById(R.id.toolbarres3);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("Answer_Key 3");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        next3=(Button)findViewById(R.id.next3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As1=new Intent(AssessmentResult3.this,MODULE4.class);
                startActivity(As1);
            }
        });

    }
}


