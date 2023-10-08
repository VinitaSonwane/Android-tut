package com.example.alertdialogboxexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        alertDialog.setTitle("Terms & Condition");
        alertDialog.setIcon(R.drawable.baseline_info_24);
        alertDialog.setMessage("Have you read all the T & C");
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Your message goes here");

// Set a positive button with a custom text
        alertDialogBuilder.setPositiveButton(getString(R.string.yes_i_ve_read), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Yes, You can Proceed.", Toast.LENGTH_SHORT).show();
            }
        });

// Create and show the AlertDialog
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();




        alertDialog.show();

           AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this );
           delDialog.setTitle("Delete");
           delDialog.setIcon(R.drawable.baseline_delete_24 );
           delDialog.setMessage("Are you sure want to delete");


           delDialog.setPositiveButton("Yes" , new DialogInterface.OnClickListener(){
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   //for yes
                   Toast.makeText(MainActivity.this, "Item deleted", Toast.LENGTH_SHORT).show();
               }
           });
           delDialog.setNegativeButton("No" , new DialogInterface.OnClickListener(){
              //for NO
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   Toast.makeText(MainActivity.this, "Item not deleted", Toast.LENGTH_SHORT).show();

               }
           });
           delDialog.show();
        }
        @Override
    public void onBackPressed(){
        AlertDialog.Builder exitDialog = new AlertDialog.Builder(this);

        exitDialog.setTitle("Exit?");
        exitDialog.setMessage("Are you sure want to exit?");
        exitDialog.setIcon(R.drawable.baseline_exit_to_app_24);

        exitDialog.setPositiveButton("No" ,new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Welcome Back!", Toast.LENGTH_SHORT).show();
            }
        });
        exitDialog.setNegativeButton("Yes" , new DialogInterface.OnClickListener(){

                @Override
                public void onClick(DialogInterface dialog, int which) {
                  MainActivity.super.onBackPressed();
                }
            });
        exitDialog.setNeutralButton("cancel" , new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Operation Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        exitDialog.show();
        }
    }
