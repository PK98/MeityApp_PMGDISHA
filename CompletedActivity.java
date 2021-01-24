package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class CompletedActivity extends AppCompatActivity {
Toolbar toolbar;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);
        toolbar=(Toolbar)findViewById(R.id.toolbarlast);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("End");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btn=(Button)findViewById(R.id.home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CompletedActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
