package com.example.chainmail_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class inbox_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox_page);

        Toolbar toolbar = findViewById(R.id.inbox_toolbar);
        setSupportActionBar(toolbar);
    }
}