package com.aaxena.spandanssecondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView political = findViewById(R.id.image);
        political.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                political.setImageResource(R.drawable.narendra);
            }
        });
    }
}