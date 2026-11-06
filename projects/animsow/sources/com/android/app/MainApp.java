package com.android.app;

import P2.e;
import V0.l;
import android.content.Context;
import com.google.android.gms.internal.measurement.C0466o0;
import com.google.android.gms.internal.measurement.C0472p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.AbstractC0603w1;
import com.xo.anilab.R;
import i.AbstractC0818s;
import i.H;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import m2.C0;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public class MainApp extends l {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Context f6264y;

    @Override // V0.l, android.app.Application
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        AbstractC1305a.n(applicationContext, "getApplicationContext(...)");
        f6264y = applicationContext;
        if (AbstractC0818s.f9338x != 2) {
            AbstractC0818s.f9338x = 2;
            synchronized (AbstractC0818s.f9335D) {
                try {
                    Iterator it = AbstractC0818s.f9334C.iterator();
                    while (it.hasNext()) {
                        AbstractC0818s abstractC0818s = (AbstractC0818s) ((WeakReference) it.next()).get();
                        if (abstractC0818s != null) {
                            ((H) abstractC0818s).m(true, true);
                        }
                    }
                } finally {
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        Boolean bool = Boolean.TRUE;
        C0466o0 c0466o0 = firebaseAnalytics.f7426a;
        c0466o0.getClass();
        c0466o0.b(new C0472p0(c0466o0, bool, 1));
        try {
            String string = getString(R.string.one_signal_app_id);
            AbstractC1305a.n(string, "getString(...)");
            if (AbstractC1305a.c(string, "")) {
                return;
            }
            Context context = f6264y;
            if (context == null) {
                AbstractC1305a.W("appContext");
                throw null;
            }
            AbstractC0603w1.B(context);
            AbstractC0603w1.Q(string);
            AbstractC0603w1.f8047m = new e();
            if (AbstractC0603w1.f8048n) {
                AbstractC0603w1.h();
            }
        } catch (Exception e6) {
            C0.h().a(e6);
            AbstractC1332d.X(String.valueOf(e6.getMessage()));
            e6.printStackTrace();
        }
    }
}
