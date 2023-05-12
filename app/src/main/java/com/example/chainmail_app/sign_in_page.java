package com.example.chainmail_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class sign_in_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_page);

        EditText em1 = (EditText) findViewById(R.id.emailField);
        EditText ps1 = (EditText) findViewById(R.id.passwordField);
        Button btn1 = (Button) findViewById(R.id.loginButton);

        String exampleEmail = "admin@android.com";
        String examplePassword = "admin";

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                System.out.println(em1.getText());
                System.out.println(ps1.getText());

                String inputEmail = em1.getText().toString();
                String inputPassword = ps1.getText().toString();

                String exampleEmail = "admin@android.com";
                String examplePassword = "admin";

                if ((inputEmail.equals(exampleEmail) && inputPassword.equals(examplePassword)))
                {
                    System.out.println("Correct credentials");
                    Intent intent = new Intent(sign_in_page.this, inbox_page.class);
                    startActivity(intent);
                }
                else
                {
                    System.out.println("Your credentials are not correct");
                }
            }
        });

    }
}