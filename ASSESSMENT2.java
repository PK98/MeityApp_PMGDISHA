package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ASSESSMENT2 extends AppCompatActivity {
    Toolbar toolbar;
    Button res1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment2);
        toolbar=(Toolbar)findViewById(R.id.toolbara2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Assessment 2");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MODULE2.class));
            }
        });

        res1=(Button)findViewById(R.id.ASbtn2);
        res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent As2=new Intent(ASSESSMENT2.this,AssessmentResult1.class);
                startActivity(As2);
            }
        });

    }
}
