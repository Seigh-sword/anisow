package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7710a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r9, android.app.NotificationManager r10, org.json.JSONObject r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.U.a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    public static String b(I0 i02) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context context = i02.f7583b;
        JSONObject jSONObject = i02.f7584c;
        NotificationManager notificationManagerT = AbstractC0571l1.t(context);
        if (i02.f7585d) {
            notificationManagerT.createNotificationChannel(G.b());
            return "restored_OS_notifications";
        }
        if (jSONObject.has("oth_chnl")) {
            String strOptString = jSONObject.optString("oth_chnl");
            if (notificationManagerT.getNotificationChannel(strOptString) != null) {
                return strOptString;
            }
        }
        if (jSONObject.has("chnl")) {
            try {
                return a(context, notificationManagerT, jSONObject);
            } catch (JSONException e6) {
                AbstractC0603w1.b(EnumC0600v1.f7997y, "Could not create notification channel due to JSON payload error!", e6);
                return "fcm_fallback_notification_channel";
            }
        }
        NotificationChannel notificationChannelV = G.v();
        notificationChannelV.enableLights(true);
        notificationChannelV.enableVibration(true);
        notificationManagerT.createNotificationChannel(notificationChannelV);
        return "fcm_fallback_notification_channel";
    }
}
