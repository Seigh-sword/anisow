package com.android.app.fcm;

import B3.h;
import D.t;
import E.b;
import E.f;
import J3.u;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import com.android.app.activities.HomeActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public class MessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(u uVar) {
        if (uVar.b() != null) {
            String string = uVar.b().f1433a != null ? uVar.b().f1433a : getString(R.string.app_name);
            String str = uVar.b().f1434b != null ? uVar.b().f1434b : "";
            String str2 = uVar.b().f1435c;
            String string2 = getString(R.string.fcm_default_notification_channel_id);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    notificationManager.createNotificationChannel(h.d(string2, getString(R.string.fcm_default_notification_channel_title)));
                }
                Object obj = f.f379a;
                int iA = b.a(this, R.color.color_accent);
                t tVar = new t(this, string2);
                tVar.f240v.icon = R.drawable.ic_stat_notification;
                tVar.f223e = t.b(string);
                tVar.f224f = t.b(str);
                tVar.f235q = iA;
                tVar.d(16, true);
                tVar.f225g = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) HomeActivity.class), 1140850688);
                if (str2 != null) {
                    tVar.f(RingtoneManager.getDefaultUri(2));
                }
                notificationManager.notify(0, tVar.a());
            }
        }
    }
}
