package com.example.efkei.miniexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        Button next = (Button) findViewById(R.id.forthBtn);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent myIntent = new Intent( view.getContext(), MainActivity.class);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
