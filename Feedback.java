package com.example.welcome.navigation_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {
    EditText ed;
    private boolean isReached=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        /*ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (ed.getText().length() == 10 && !isReached) {
                    ed.append("\n");
                    isReached = true;
                }
                if (ed.getText().length() < 10 && isReached) isReached = false;
            }
        });*/

    }
}
