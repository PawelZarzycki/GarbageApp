package pl.example.android.garbageapp.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import pl.example.android.garbageapp.R;

/**
 * Created by miltomasz on 15/11/17.
 */

public class NotificationUtils {

    public static final String NOTIFICATION_SECTOR_COLOR = "NOTIFICATION_SECTOR_COLOR";

    private NotificationUtils() {}

    public static void showNotification(Context context, int notificationId, String contentText) {
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(context, NotificationChannel.DEFAULT_CHANNEL_ID)
                        .setSmallIcon(R.mipmap.ic_delete_sweep_black_24dp)
                        .setContentTitle("Informacja")
                        .setContentText(contentText);
        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notificationId, notificationBuilder.build());
    }
}