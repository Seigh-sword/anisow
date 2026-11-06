package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class OSNotificationWorkManager$NotificationWorker extends Worker {
    public OSNotificationWorkManager$NotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final I0.n g() {
        WorkerParameters workerParameters = this.f5825x;
        I0.g gVar = workerParameters.f5831b;
        try {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "NotificationWorker running doWork with data: " + gVar, null);
            Object obj = gVar.f1100a.get("android_notif_id");
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
            Object obj2 = gVar.f1100a.get("json_payload");
            JSONObject jSONObject = new JSONObject(obj2 instanceof String ? (String) obj2 : null);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap map = gVar.f1100a;
            Object obj3 = map.get("timestamp");
            if (obj3 instanceof Long) {
                jCurrentTimeMillis = ((Long) obj3).longValue();
            }
            Object obj4 = map.get("is_restoring");
            boolean zBooleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
            Context context = this.f5824w;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            B0 b02 = new B0(null, jSONObject, iIntValue);
            M0 m02 = new M0(new D0(context, b02, jSONObject, zBooleanValue, lValueOf), b02);
            AbstractC0603w1.b(EnumC0600v1.f7998z, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification", null);
            m02.a(b02);
            return new I0.m(I0.g.f1099c);
        } catch (JSONException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Error occurred doing work for job with id: " + workerParameters.f5830a.toString(), null);
            e6.printStackTrace();
            return new I0.k();
        }
    }
}
