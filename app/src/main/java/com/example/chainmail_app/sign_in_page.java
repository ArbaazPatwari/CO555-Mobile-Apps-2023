package com.example.chainmail_app;

import androidx.appcompat.app.AppCompatActivity;

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
            @Override
            public void onClick(View view) {
               System.out.println(em1.getText());
               loginCheck();
            }

            public void loginCheck() {
                boolean pass1 = false;

                if (exampleEmail.equals(em1.getText()))
                {
                    System.out.println("Email correct");
                    pass1 = true;
                }
                else if (examplePassword.equals(ps1.getText()))
                {
                    System.out.print("Password correct");
                    pass1 = false;
                }
                else
                {
                    System.out.println("No information entered");
                    pass1 = false;
                }
            }
        });

    }
}