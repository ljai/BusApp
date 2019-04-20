package com.jailalwani.busapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendriver_registration();
            }
        });

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuser_registration();
            }
        });
    }
    public void opendriver_registration(){
        Intent intent = new Intent(this, driver_registration.class);
        startActivity(intent);
    }
    public void openuser_registration(){
        Intent intent = new Intent(this, user_registration.class);
        startActivity(intent);
    }
}
