package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;

/* JADX INFO: loaded from: classes.dex */
public final class T1 implements P1 {
    @Override // com.onesignal.P1
    public final void a(Context context, String str, C0594t1 c0594t1) {
        new Thread(new S1(this, context, c0594t1), "OS_HMS_GET_TOKEN").start();
    }

    public final synchronized void c(Context context, C0594t1 c0594t1) {
        if (!OSUtils.g()) {
            c0594t1.getClass();
            C0594t1.c(-28, null);
            return;
        }
        String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString("client/app_id"), "HCM");
        if (TextUtils.isEmpty(token)) {
            try {
                Thread.sleep(30000L);
            } catch (InterruptedException unused) {
            }
            AbstractC0603w1.b(EnumC0600v1.f7997y, "HmsMessageServiceOneSignal.onNewToken timed out.", null);
            c0594t1.getClass();
            C0594t1.c(-25, null);
        } else {
            AbstractC0603w1.a(EnumC0600v1.f7991A, "Device registered for HMS, push token = " + token);
            c0594t1.getClass();
            C0594t1.c(1, token);
        }
    }
}
