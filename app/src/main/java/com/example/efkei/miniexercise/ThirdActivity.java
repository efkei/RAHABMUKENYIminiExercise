package com.example.efkei.miniexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button next = (Button) findViewById(R.id.thirdBtn);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
                Intent myIntent = new Intent( view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
