package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AssessmentResult1 extends AppCompatActivity {
Toolbar toolbar1;
    Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_result1);
        toolbar1=(Toolbar)findViewById(R.id.toolbarres1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("Answer_Key 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        next1=(Button)findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As1=new Intent(AssessmentResult1.this,MODULE2.class);
                startActivity(As1);
            }
        });


    }
}
