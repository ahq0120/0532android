package com.example.traveling2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ParisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}