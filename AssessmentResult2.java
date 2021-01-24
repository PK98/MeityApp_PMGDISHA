package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AssessmentResult2 extends AppCompatActivity {
Toolbar toolbar;
    Button res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_result2);
        toolbar=(Toolbar)findViewById(R.id.toolbarres2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Answer_Key 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        res2=(Button)findViewById(R.id.next2);
        res2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As1=new Intent(AssessmentResult2.this,MODULE3.class);
                startActivity(As1);
            }
        });

    }
}
