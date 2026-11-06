package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import j.RunnableC0835a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.C1459c;
import w1.C1467k;
import w1.C1474r;
import w1.C1475s;
import w1.InterfaceC1458b;
import w1.InterfaceC1463g;
import w1.InterfaceC1465i;
import w1.InterfaceC1470n;

/* JADX INFO: loaded from: classes.dex */
public class o implements ComponentCallbacks2, InterfaceC1465i {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final y1.f f6404G = (y1.f) ((y1.f) new y1.f().f(Bitmap.class)).m();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC1470n f6405A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1475s f6406B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RunnableC0835a f6407C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final InterfaceC1458b f6408D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f6409E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public y1.f f6410F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f6411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f6412x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC1463g f6413y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1474r f6414z;

    static {
    }

    public o(b bVar, InterfaceC1463g interfaceC1463g, InterfaceC1470n interfaceC1470n, Context context) {
        y1.f fVar;
        C1474r c1474r = new C1474r(1);
        V0.m mVar = bVar.f6294B;
        this.f6406B = new C1475s();
        RunnableC0835a runnableC0835a = new RunnableC0835a(15, this);
        this.f6407C = runnableC0835a;
        this.f6411w = bVar;
        this.f6413y = interfaceC1463g;
        this.f6405A = interfaceC1470n;
        this.f6414z = c1474r;
        this.f6412x = context;
        Context applicationContext = context.getApplicationContext();
        n nVar = new n(this, c1474r);
        mVar.getClass();
        boolean z5 = E.f.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z5 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC1458b c1459c = z5 ? new C1459c(applicationContext, nVar) : new C1467k();
        this.f6408D = c1459c;
        synchronized (bVar.f6295C) {
            if (bVar.f6295C.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f6295C.add(this);
        }
        char[] cArr = C1.n.f134a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            C1.n.f().post(runnableC0835a);
        } else {
            interfaceC1463g.p(this);
        }
        interfaceC1463g.p(c1459c);
        this.f6409E = new CopyOnWriteArrayList(bVar.f6298y.f6335e);
        f fVar2 = bVar.f6298y;
        synchronized (fVar2) {
            try {
                if (fVar2.f6340j == null) {
                    fVar2.f6334d.getClass();
                    y1.f fVar3 = new y1.f();
                    fVar3.f13733P = true;
                    fVar2.f6340j = fVar3;
                }
                fVar = fVar2.f6340j;
            } catch (Throwable th) {
                throw th;
            }
        }
        p(fVar);
    }

    @Override // w1.InterfaceC1465i
    public final synchronized void e() {
        this.f6406B.e();
        o();
    }

    @Override // w1.InterfaceC1465i
    public final synchronized void i() {
        synchronized (this) {
            this.f6414z.j();
        }
        this.f6406B.i();
    }

    @Override // w1.InterfaceC1465i
    public final synchronized void j() {
        this.f6406B.j();
        synchronized (this) {
            try {
                Iterator it = C1.n.e(this.f6406B.f13587w).iterator();
                while (it.hasNext()) {
                    n((z1.e) it.next());
                }
                this.f6406B.f13587w.clear();
            } finally {
            }
        }
        C1474r c1474r = this.f6414z;
        Iterator it2 = C1.n.e((Set) c1474r.f13584x).iterator();
        while (it2.hasNext()) {
            c1474r.b((y1.c) it2.next());
        }
        ((Set) c1474r.f13586z).clear();
        this.f6413y.g(this);
        this.f6413y.g(this.f6408D);
        C1.n.f().removeCallbacks(this.f6407C);
        this.f6411w.c(this);
    }

    public m l(Class cls) {
        return new m(this.f6411w, this, cls, this.f6412x);
    }

    public m m() {
        return l(Bitmap.class).a(f6404G);
    }

    public final void n(z1.e eVar) {
        if (eVar == null) {
            return;
        }
        boolean zQ = q(eVar);
        y1.c cVarF = eVar.f();
        if (zQ) {
            return;
        }
        b bVar = this.f6411w;
        synchronized (bVar.f6295C) {
            try {
                Iterator it = bVar.f6295C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((o) it.next()).q(eVar)) {
                        }
                    } else if (cVarF != null) {
                        eVar.b(null);
                        cVarF.clear();
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized void o() {
        C1474r c1474r = this.f6414z;
        c1474r.f13585y = true;
        for (y1.c cVar : C1.n.e((Set) c1474r.f13584x)) {
            if (cVar.isRunning()) {
                cVar.e();
                ((Set) c1474r.f13586z).add(cVar);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
    }

    public synchronized void p(y1.f fVar) {
        this.f6410F = (y1.f) ((y1.f) fVar.clone()).d();
    }

    public final synchronized boolean q(z1.e eVar) {
        y1.c cVarF = eVar.f();
        if (cVarF == null) {
            return true;
        }
        if (!this.f6414z.b(cVarF)) {
            return false;
        }
        this.f6406B.f13587w.remove(eVar);
        eVar.b(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6414z + ", treeNode=" + this.f6405A + "}";
    }
}
