package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AssessmentResult5 extends AppCompatActivity {
Button res5;
    Toolbar toolbar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_result5);
        toolbar5=(Toolbar)findViewById(R.id.toolbarres5);
        setSupportActionBar(toolbar5);
        getSupportActionBar().setTitle("Answer_Key 5");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        res5=(Button)findViewById(R.id.next5);
        res5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fin=new Intent(AssessmentResult5.this,CompletedActivity.class);
                startActivity(fin);
            }
        });

    }
}
