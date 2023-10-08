package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private static final String CHANEL_ID= "My Chanel";
    private static final int NOTIFICATION_ID= 100;
    @SuppressLint("NotificationPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.new_icon,null);

        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Notification notification = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Notification.Builder builder = new Notification.Builder(this);
            builder.setLargeIcon(largeIcon);
            builder.setSmallIcon(R.drawable.new_icon);
            builder.setContentText("New Message");
            builder.setSubText("New Message from Raman");
            Notification.Builder builder1 = builder.setChannelId();
            notification = builder
                    .build();
             nm.createNotificationChannel(new NotificationChannel(CHANEL_ID , "New Chanel" , NotificationManager.IMPORTANCE_HIGH));
        }else{
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Notification.Builder builder = new Notification.Builder(this);
                builder.setLargeIcon(largeIcon);
                builder.setSmallIcon(R.drawable.new_icon);
                builder.setContentText("New Message");
                builder.setSubText("New Message from Raman");
                builder.setChannelId();
                
                notification = builder
                        .build();
            }
        }
        nm.notify(NOTIFICATION_ID , notification);
    }
}