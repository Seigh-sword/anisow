package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o1.C1224a;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548e implements InterfaceC0538a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f7785d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f7786e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f7787f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0546d0 f7788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f7789b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7790c = false;

    public C0548e(C0546d0 c0546d0) {
        this.f7788a = c0546d0;
    }

    public final void a() {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        AbstractC0603w1.b(enumC0600v1, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f7790c, null);
        C0546d0 c0546d0 = this.f7788a;
        c0546d0.getClass();
        int i6 = 1;
        if (!C0546d0.f7781c && !this.f7790c) {
            AbstractC0603w1.b(enumC0600v1, "ActivityLifecycleHandler cancel background lost focus worker", null);
            Context context = AbstractC0603w1.f8028b;
            AbstractC1305a.o(context, "context");
            J0.k kVarQ = AbstractC0571l1.q(context);
            kVarQ.f1209k.p(new S0.a(kVarQ, "FOCUS_LOST_WORKER_TAG", i6));
            return;
        }
        AbstractC0603w1.b(enumC0600v1, "ActivityLifecycleHandler reset background state, call app focus", null);
        this.f7790c = false;
        C0546d0.f7780b = false;
        RunnableC0604x runnableC0604x = c0546d0.f7783a;
        if (runnableC0604x != null) {
            HandlerThreadC0556g1.b().a(runnableC0604x);
        }
        C0546d0.f7781c = false;
        AbstractC0603w1.b(enumC0600v1, "OSFocusHandler running onAppFocus", null);
        AbstractC0603w1.b(enumC0600v1, "Application on focus", null);
        AbstractC0603w1.f8049o = true;
        if (!u.h.a(AbstractC0603w1.f8043i0, 1)) {
            int i7 = AbstractC0603w1.f8043i0;
            for (L0 l02 : new ArrayList(AbstractC0603w1.f8026a)) {
                l02.getClass();
                AbstractC0603w1.b(enumC0600v1, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: ".concat(H1.a.y(i7)), null);
                l02.a(u.h.a(3, i7));
            }
            if (!u.h.a(AbstractC0603w1.f8043i0, 1)) {
                AbstractC0603w1.f8043i0 = 2;
            }
        }
        M.g();
        if (X.f7726b) {
            X.f7726b = false;
            X.c(OSUtils.a());
        }
        if (AbstractC0603w1.f8032d == null) {
            AbstractC0603w1.b(EnumC0600v1.f7991A, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.", null);
        } else if (((G1) AbstractC0603w1.f8057w.f7497b) != null) {
            AbstractC0603w1.H();
        } else {
            AbstractC0603w1.b(enumC0600v1, "Delay onAppFocus logic due to missing remote params", null);
            AbstractC0603w1.F(AbstractC0603w1.f8032d, AbstractC0603w1.v(), false);
        }
    }

    public final void b() {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "ActivityLifecycleHandler Handling lost focus", null);
        C0546d0 c0546d0 = this.f7788a;
        if (c0546d0 != null) {
            c0546d0.getClass();
            if (C0546d0.f7781c) {
                c0546d0.getClass();
                if (!C0546d0.f7782d) {
                    return;
                }
            }
            new C1224a(2, this).start();
        }
    }

    public final void c() {
        String str;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        StringBuilder sb = new StringBuilder("curActivity is NOW: ");
        if (this.f7789b != null) {
            str = "" + this.f7789b.getClass().getName() + ":" + this.f7789b;
        } else {
            str = "null";
        }
        sb.append(str);
        AbstractC0603w1.b(enumC0600v1, sb.toString(), null);
    }

    public final void d(Activity activity) {
        this.f7789b = activity;
        Iterator it = f7785d.entrySet().iterator();
        while (it.hasNext()) {
            ((AbstractC0542c) ((Map.Entry) it.next()).getValue()).a(this.f7789b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f7789b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : f7786e.entrySet()) {
                ViewTreeObserverOnGlobalLayoutListenerC0545d viewTreeObserverOnGlobalLayoutListenerC0545d = new ViewTreeObserverOnGlobalLayoutListenerC0545d(this, (InterfaceC0541b1) entry.getValue(), (String) entry.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0545d);
                f7787f.put((String) entry.getKey(), viewTreeObserverOnGlobalLayoutListenerC0545d);
            }
        } catch (RuntimeException e6) {
            e6.printStackTrace();
        }
    }
}
