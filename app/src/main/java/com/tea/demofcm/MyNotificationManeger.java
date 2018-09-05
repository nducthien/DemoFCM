package com.tea.demofcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class MyNotificationManeger {
    private Context context;
    private static MyNotificationManeger mInstance;

    public MyNotificationManeger(Context context) {
        this.context = context;
    }

    public static synchronized MyNotificationManeger getInstance(Context context){
        if (mInstance == null){
            mInstance = new MyNotificationManeger(context);
        }
        return mInstance;

    }

    public void displayNotification(String title, String body){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this.context, Contans.CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(body);

        Intent intent = new Intent(this.context, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this.context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);


        mBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) this.context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null){
            notificationManager.notify(1, mBuilder.build());
        }

    }
}
