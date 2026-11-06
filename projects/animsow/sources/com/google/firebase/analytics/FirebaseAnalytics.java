package com.google.firebase.analytics;

import E3.c;
import E3.d;
import Y2.g;
import Z2.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0466o0;
import com.google.android.gms.internal.measurement.C0489s0;
import f2.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m2.Q0;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f7425b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0466o0 f7426a;

    public FirebaseAnalytics(C0466o0 c0466o0) {
        AbstractC1332d.m(c0466o0);
        this.f7426a = c0466o0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f7425b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f7425b == null) {
                        f7425b = new FirebaseAnalytics(C0466o0.a(context, null));
                    }
                } finally {
                }
            }
        }
        return f7425b;
    }

    @Keep
    public static Q0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0466o0 c0466o0A = C0466o0.a(context, bundle);
        if (c0466o0A == null) {
            return null;
        }
        return new a(c0466o0A);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = c.f399m;
            return (String) h.c(((c) g.c().b(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            throw new IllegalStateException(e6);
        } catch (ExecutionException e7) {
            throw new IllegalStateException(e7.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C0466o0 c0466o0 = this.f7426a;
        c0466o0.getClass();
        c0466o0.b(new C0489s0(c0466o0, activity, str, str2));
    }
}
