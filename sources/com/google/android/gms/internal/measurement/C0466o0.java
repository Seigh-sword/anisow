package com.google.android.gms.internal.measurement;

import X1.C0247o;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import b2.C0337b;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C0466o0 f6907i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6908a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0337b f6909b = C0337b.f5915a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f6910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K1.b f6911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Y f6915h;

    public C0466o0(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0495t0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6910c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6911d = new K1.b(4, this);
        this.f6912e = new ArrayList();
        int i6 = 0;
        try {
            String strB = C0247o.b(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strB)) {
                strB = C0247o.b(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", strB);
            String string = null;
            if (identifier != 0) {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0466o0.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f6914g = true;
                    Log.w(this.f6908a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        if (!true) {
            Log.w(this.f6908a, "Specified origin or custom app id is null. Both parameters will be ignored.");
        }
        b(new C0442k0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f6908a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0460n0(i6, this));
        }
    }

    public static C0466o0 a(Context context, Bundle bundle) {
        AbstractC1332d.m(context);
        if (f6907i == null) {
            synchronized (C0466o0.class) {
                try {
                    if (f6907i == null) {
                        f6907i = new C0466o0(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f6907i;
    }

    public final void b(AbstractRunnableC0448l0 abstractRunnableC0448l0) {
        this.f6910c.execute(abstractRunnableC0448l0);
    }

    public final void c(Exception exc, boolean z5, boolean z6) {
        this.f6914g |= z5;
        String str = this.f6908a;
        if (z5) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z6) {
            b(new C0513w0(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }
}
