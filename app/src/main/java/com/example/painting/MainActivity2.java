package com.example.painting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        Handler handler = new Handler();
        handler. postDelayed(new Runnable() {
            public void run() {
                progressBar.setVisibility(View.INVISIBLE);
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        }, 2000);
    }
    @Override
    public void onBackPressed(){

    }
}
