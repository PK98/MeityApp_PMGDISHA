package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AssessmentResult4 extends AppCompatActivity {
    Toolbar toolbar4;
    Button next4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_result4);
        toolbar4=(Toolbar)findViewById(R.id.toolbarres4);
        setSupportActionBar(toolbar4);
        getSupportActionBar().setTitle("Answer_Key 4");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        next4=(Button)findViewById(R.id.next4);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As1=new Intent(AssessmentResult4.this,MODULE5.class);
                startActivity(As1);
            }
        });


    }
}
