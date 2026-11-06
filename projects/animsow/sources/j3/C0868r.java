package j3;

import a3.C0261b;
import android.content.Context;
import android.util.Log;
import f3.C0700a;
import g3.C0730b;
import g3.InterfaceC0729a;
import h3.InterfaceC0773a;
import i3.InterfaceC0833a;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import k3.C0899e;
import p3.C1251c;

/* JADX INFO: renamed from: j3.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0868r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0871u f9514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0261b f9515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0261b f9517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0261b f9518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0863m f9519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0875y f9520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1251c f9521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0833a f9522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0773a f9523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0860j f9524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0729a f9525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final K1.b f9526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0899e f9527o;

    public C0868r(Y2.g gVar, C0875y c0875y, C0730b c0730b, C0871u c0871u, C0700a c0700a, C0700a c0700a2, C1251c c1251c, C0860j c0860j, K1.b bVar, C0899e c0899e) {
        this.f9514b = c0871u;
        gVar.a();
        this.f9513a = gVar.f4816a;
        this.f9520h = c0875y;
        this.f9525m = c0730b;
        this.f9522j = c0700a;
        this.f9523k = c0700a2;
        this.f9521i = c1251c;
        this.f9524l = c0860j;
        this.f9526n = bVar;
        this.f9527o = c0899e;
        this.f9516d = System.currentTimeMillis();
        this.f9515c = new C0261b(6);
    }

    public final void a(J0.l lVar) {
        C0899e.a();
        C0899e.a();
        this.f9517e.d();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f9522j.c(new C0866p(this));
                this.f9519g.g();
            } catch (Exception e6) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e6);
            }
            if (!lVar.c().f12474b.f9919a) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f9519g.d(lVar)) {
                Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
            }
            this.f9519g.h(((q2.j) ((AtomicReference) lVar.f1223i).get()).f12351a);
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(J0.l lVar) {
        String str;
        Future<?> futureSubmit = this.f9527o.f9655a.f9647w.submit(new RunnableC0864n(this, lVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e6);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            e = e7;
            str = "Crashlytics encountered a problem during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (TimeoutException e8) {
            e = e8;
            str = "Crashlytics timed out during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        }
    }

    public final void c() {
        C0899e.a();
        try {
            C0261b c0261b = this.f9517e;
            C1251c c1251c = (C1251c) c0261b.f5012y;
            String str = (String) c0261b.f5011x;
            c1251c.getClass();
            if (new File((File) c1251c.f12320d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e6) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e6);
        }
    }
}
