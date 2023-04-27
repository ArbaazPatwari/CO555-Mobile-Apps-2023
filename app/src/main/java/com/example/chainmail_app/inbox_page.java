package com.example.chainmail_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class inbox_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox_page);

        Toolbar toolbar = findViewById(R.id.inbox_toolbar);
        setSupportActionBar(toolbar);
    }
}