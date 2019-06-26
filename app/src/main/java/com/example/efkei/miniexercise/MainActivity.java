package com.example.efkei.miniexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next = (Button) findViewById(R.id.firstBtn);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), SecondScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next2 = (Button) findViewById(R.id.secondBtn);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ThirdActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next3 = (Button) findViewById(R.id.thirdBtn);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ForthActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
            }

}
