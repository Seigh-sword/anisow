package W1;

import X1.C0239g;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class A implements L, Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f4211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Condition f4212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f4213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U1.f f4214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerC0227v f4215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f4216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f4217i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0239g f4218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f4219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f2.h f4220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile InterfaceC0230y f4221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0229x f4223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J f4224p;

    public A(Context context, C0229x c0229x, Lock lock, Looper looper, U1.e eVar, Map map, C0239g c0239g, Map map2, f2.h hVar, ArrayList arrayList, J j6) {
        this.f4213e = context;
        this.f4211c = lock;
        this.f4214f = eVar;
        this.f4216h = map;
        this.f4218j = c0239g;
        this.f4219k = map2;
        this.f4220l = hVar;
        this.f4223o = c0229x;
        this.f4224p = j6;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((Y) arrayList.get(i6)).f4282e = this;
        }
        this.f4215g = new HandlerC0227v(this, looper, 1);
        this.f4212d = lock.newCondition();
        this.f4221m = new C0215i(this);
    }

    @Override // W1.InterfaceC0210d
    public final void D(Bundle bundle) {
        this.f4211c.lock();
        try {
            this.f4221m.d(bundle);
        } finally {
            this.f4211c.unlock();
        }
    }

    @Override // W1.L
    public final void a() {
        if (this.f4221m.e()) {
            this.f4217i.clear();
        }
    }

    @Override // W1.InterfaceC0210d
    public final void b(int i6) {
        this.f4211c.lock();
        try {
            this.f4221m.f(i6);
        } finally {
            this.f4211c.unlock();
        }
    }

    @Override // W1.L
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f4221m);
        for (V1.d dVar : this.f4219k.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) dVar.f3706c).println(":");
            V1.b bVar = (V1.b) this.f4216h.get(dVar.f3705b);
            AbstractC1332d.m(bVar);
            bVar.b(strValueOf.concat("  "), printWriter);
        }
    }

    @Override // W1.L
    public final boolean d() {
        return this.f4221m instanceof C0221o;
    }

    @Override // W1.L
    public final void e() {
        this.f4221m.b();
    }

    public final void f() {
        this.f4211c.lock();
        try {
            this.f4221m = new C0215i(this);
            this.f4221m.g();
            this.f4212d.signalAll();
        } finally {
            this.f4211c.unlock();
        }
    }

    @Override // W1.Z
    public final void s(U1.b bVar, V1.d dVar, boolean z5) {
        this.f4211c.lock();
        try {
            this.f4221m.c(bVar, dVar, z5);
        } finally {
            this.f4211c.unlock();
        }
    }
}
