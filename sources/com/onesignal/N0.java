package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7645a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7646b = OSNotificationRestoreWorkManager$NotificationRestoreWorker.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7647c;

    public static void a(Context context, boolean z5) {
        AbstractC0571l1.q(context).I(f7646b, Collections.singletonList(new I0.p(OSNotificationRestoreWorkManager$NotificationRestoreWorker.class).b(z5 ? 15 : 0, TimeUnit.SECONDS).a()));
    }

    public static void b(Context context, Cursor cursor, int i6) throws Throwable {
        if (cursor.moveToFirst()) {
            do {
                O0.a(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true);
                if (i6 > 0) {
                    try {
                        Thread.sleep(i6);
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                }
            } while (cursor.moveToNext());
        }
    }
}
