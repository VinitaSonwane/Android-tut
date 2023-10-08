package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

import javax.xml.namespace.NamespaceContext;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent fromAct = getIntent();
        String title = fromAct.getStringExtra("title");
       String StudentName =  fromAct.getStringExtra("StudentName");
       int rollNo  = fromAct.getIntExtra("Roll No",0);

       TextView txtStudentInfo;
       txtStudentInfo = findViewById(R.id.txtStudentInfo);

       txtStudentInfo.setText("Roll No : "+rollNo+" , Name: "+ StudentName);

       getSupportActionBar().setTitle(title);
    }
}
