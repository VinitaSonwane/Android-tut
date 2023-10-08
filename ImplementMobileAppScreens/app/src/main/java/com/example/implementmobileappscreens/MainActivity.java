package com.example.implementmobileappscreens;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views
        ImageButton btnHamburger = findViewById(R.id.btnHamburger);

        // Set click listener for hamburger button
        btnHamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle hamburger button click
                // For example, you can open a navigation drawer
                // or show a menu
            }
        });
    }
}
