package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}