 package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext;

        btnNext = findViewById(R.id.btnNext);

        Intent iNext;

        iNext = new Intent(MainActivity.this,MainActivity2.class);
        iNext.putExtra("title" , "Home");
        iNext.putExtra("StudentName" , "Raman");
        iNext.putExtra("Roll No" , 10);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(iNext);
            }
        });
    }
}