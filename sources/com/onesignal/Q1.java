package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f7688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0594t1 f7689x;

    public Q1(Context context, C0594t1 c0594t1) {
        this.f7688w = context;
        this.f7689x = c0594t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ADM adm = new ADM(this.f7688w);
        String registrationId = adm.getRegistrationId();
        if (registrationId == null) {
            adm.startRegister();
        } else {
            AbstractC0603w1.a(EnumC0600v1.f7992B, "ADM Already registered with ID:".concat(registrationId));
            this.f7689x.getClass();
            C0594t1.c(1, registrationId);
        }
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException unused) {
        }
        if (C0594t1.f7979b) {
            return;
        }
        AbstractC0603w1.a(EnumC0600v1.f7997y, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
        C0594t1.g(null);
    }
}
