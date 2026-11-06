package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class OSReceiveReceiptController$ReceiveReceiptWorker extends Worker {
    public OSReceiveReceiptController$ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final I0.n g() {
        Integer numValueOf;
        Object obj = this.f5825x.f5831b.f1100a.get("os_notification_id");
        String str = obj instanceof String ? (String) obj : null;
        String str2 = AbstractC0603w1.f8032d;
        String strT = (str2 == null || str2.isEmpty()) ? AbstractC0603w1.t(AbstractC0603w1.f8028b) : AbstractC0603w1.f8032d;
        String strV = AbstractC0603w1.v();
        try {
            numValueOf = Integer.valueOf(OSUtils.b());
        } catch (NullPointerException e6) {
            e6.printStackTrace();
            numValueOf = null;
        }
        AbstractC0603w1.b(EnumC0600v1.f7992B, "ReceiveReceiptWorker: Device Type is: " + numValueOf, null);
        T0 t02 = new T0(this, 0, str);
        try {
            JSONObject jSONObjectPut = new JSONObject().put("app_id", strT).put("player_id", strV);
            if (numValueOf != null) {
                jSONObjectPut.put("device_type", numValueOf);
            }
            new Thread(new I1("notifications/" + str + "/report_received", jSONObjectPut, t02, 0), "OS_REST_ASYNC_PUT").start();
        } catch (JSONException e7) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Generating direct receive receipt:JSON Failed.", e7);
        }
        return new I0.m(I0.g.f1099c);
    }
}
