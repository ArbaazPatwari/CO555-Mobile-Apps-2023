package com.example.chainmail_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class sign_in_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_page);

        TextView email = (TextView) findViewById(R.id.emailField);
        TextView password = (TextView) findViewById(R.id.passwordField);

        Button login = (Button) findViewById(R.id.loginButton);


    }
}