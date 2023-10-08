package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtAnim;
Button btnTraslate ,btnAlpha , btnRotate , btnScale;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtAnim);
        btnTraslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);


        Animation move = AnimationUtils.loadAnimation(getApplicationContext()  , R.anim.move);

        btnTraslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnim.startAnimation(move);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
            txtAnim.startAnimation(rotate);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Animation scale = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.scale) ;
               txtAnim.startAnimation(scale);
            }
        });


        }
    }
