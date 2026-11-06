package com.onesignal;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import d.RunnableC0637r;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class R1 implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0594t1 f7692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f7693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y2.g f7695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f7696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J3.t f7697f;

    public R1(Context context, J3.t tVar) {
        this.f7696e = context;
        if (tVar == null) {
            this.f7697f = new J3.t(null, null, null);
        } else {
            this.f7697f = tVar;
        }
    }

    public static int d(Throwable th) {
        Throwable cause = th;
        while (cause.getCause() != null && cause.getCause() != cause) {
            cause = cause.getCause();
        }
        String message = cause.getMessage();
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(message)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(message) ? -29 : -11;
    }

    @Override // com.onesignal.P1
    public final void a(Context context, String str, C0594t1 c0594t1) {
        this.f7692a = c0594t1;
        try {
            Float.parseFloat(str);
            try {
                if (!OSUtils.s("com.google.android.gms")) {
                    AbstractC0571l1.W();
                    AbstractC0603w1.b(EnumC0600v1.f7997y, "'Google Play services' app not installed or disabled on the device.", null);
                    this.f7692a.getClass();
                    C0594t1.c(-7, null);
                    return;
                }
                synchronized (this) {
                    Thread thread = this.f7693b;
                    if (thread == null || !thread.isAlive()) {
                        Thread thread2 = new Thread(new RunnableC0570l0(this, 2, str));
                        this.f7693b = thread2;
                        thread2.start();
                    }
                }
            } catch (Throwable th) {
                AbstractC0603w1.b(EnumC0600v1.f7997y, "Could not register with FCM due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                this.f7692a.getClass();
                C0594t1.c(-8, null);
            }
        } catch (Throwable unused) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null);
            C0594t1.c(-6, null);
        }
    }

    public final String b(String str) {
        if (this.f7695d == null) {
            J3.t tVar = this.f7697f;
            String str2 = tVar.f1434b;
            AbstractC1332d.h("ApplicationId must be set.", str2);
            String str3 = tVar.f1435c;
            AbstractC1332d.h("ApiKey must be set.", str3);
            this.f7695d = Y2.g.g(this.f7696e, new Y2.i(str2, str3, null, null, str, null, tVar.f1433a), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
        try {
            return c();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            AbstractC0603w1.b(EnumC0600v1.f7991A, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken", null);
            try {
                Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", Y2.g.class).invoke(null, this.f7695d);
                return (String) objInvoke.getClass().getMethod("getToken", String.class, String.class).invoke(objInvoke, str, "FCM");
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e6);
            }
        }
    }

    public final String c() throws Exception {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f7695d.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        q2.j jVar = new q2.j();
        firebaseMessaging.f7445f.execute(new RunnableC0637r(firebaseMessaging, 18, jVar));
        q2.s sVar = jVar.f12351a;
        try {
            return (String) f2.h.b(sVar);
        } catch (ExecutionException unused) {
            throw sVar.c();
        }
    }
}
