package androidx.work.impl;

import A0.b;
import A0.d;
import J3.w;
import R0.c;
import R0.g;
import R0.k;
import T1.j;
import android.content.Context;
import i.C0803c;
import java.util.HashMap;
import m.E;
import w0.C1446a;
import w0.C1454i;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f5836s = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile k f5837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile c f5838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile c f5839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile C0803c f5840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile c f5841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile w f5842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile c f5843r;

    @Override // w0.p
    public final C1454i d() {
        return new C1454i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // w0.p
    public final d e(C1446a c1446a) {
        j jVar = new j();
        jVar.f3425x = this;
        jVar.f3424w = 12;
        E e6 = new E();
        e6.f10110a = 12;
        e6.f10111b = c1446a;
        e6.f10112c = jVar;
        e6.f10113d = "c103703e120ae8cc73c9248622f3cd1e";
        e6.f10114e = "49f946663a8deb7054212b8adda248c6";
        Context context = c1446a.f13491b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        b bVar = new b();
        bVar.f2a = context;
        bVar.f3b = c1446a.f13492c;
        bVar.f4c = e6;
        bVar.f5d = false;
        return c1446a.f13490a.j(bVar);
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c i() {
        c cVar;
        if (this.f5838m != null) {
            return this.f5838m;
        }
        synchronized (this) {
            try {
                if (this.f5838m == null) {
                    this.f5838m = new c(this, 0);
                }
                cVar = this.f5838m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c j() {
        c cVar;
        if (this.f5843r != null) {
            return this.f5843r;
        }
        synchronized (this) {
            try {
                if (this.f5843r == null) {
                    this.f5843r = new c(this, 1);
                }
                cVar = this.f5843r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0803c k() {
        C0803c c0803c;
        if (this.f5840o != null) {
            return this.f5840o;
        }
        synchronized (this) {
            try {
                if (this.f5840o == null) {
                    this.f5840o = new C0803c(this);
                }
                c0803c = this.f5840o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0803c;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c l() {
        c cVar;
        if (this.f5841p != null) {
            return this.f5841p;
        }
        synchronized (this) {
            try {
                if (this.f5841p == null) {
                    this.f5841p = new c(this, 2);
                }
                cVar = this.f5841p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final w m() {
        w wVar;
        if (this.f5842q != null) {
            return this.f5842q;
        }
        synchronized (this) {
            try {
                if (this.f5842q == null) {
                    w wVar2 = new w();
                    wVar2.f1441a = this;
                    wVar2.f1442b = new R0.b(wVar2, this, 4);
                    wVar2.f1443c = new g(wVar2, this, 0);
                    wVar2.f1444d = new g(wVar2, this, 1);
                    this.f5842q = wVar2;
                }
                wVar = this.f5842q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k n() {
        k kVar;
        if (this.f5837l != null) {
            return this.f5837l;
        }
        synchronized (this) {
            try {
                if (this.f5837l == null) {
                    this.f5837l = new k(this);
                }
                kVar = this.f5837l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c o() {
        c cVar;
        if (this.f5839n != null) {
            return this.f5839n;
        }
        synchronized (this) {
            try {
                if (this.f5839n == null) {
                    this.f5839n = new c(this, 3);
                }
                cVar = this.f5839n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
