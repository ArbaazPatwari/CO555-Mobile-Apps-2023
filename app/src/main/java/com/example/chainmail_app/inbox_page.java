package com.example.chainmail_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.Image;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class inbox_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox_page);

        HorizontalScrollView scrollNav = (HorizontalScrollView) findViewById(R.id.horizontalScroller);
        ImageView expandBtn = (ImageView) findViewById(R.id.expandBtn);
        expandBtn.setClickable(true);
        boolean clicked = false;

        expandBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });

    }
}