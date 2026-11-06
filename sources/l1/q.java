package l1;

import android.os.SystemClock;
import android.util.Log;
import com.onesignal.C0598v;
import j1.EnumC0843a;
import java.util.Map;
import java.util.concurrent.Executor;
import n1.AbstractC1147c;
import n1.C1149e;
import n1.InterfaceC1150f;
import p3.C1251c;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class q implements v, InterfaceC1150f, x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f9963h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0924C f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V0.m f9965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1149e f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1251c f9967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0598v f9968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F.d f9969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0929c f9970g;

    public q(C1149e c1149e, AbstractC1147c abstractC1147c, o1.d dVar, o1.d dVar2, o1.d dVar3, o1.d dVar4) {
        this.f9966c = c1149e;
        U1.i iVar = new U1.i(abstractC1147c);
        C0929c c0929c = new C0929c();
        this.f9970g = c0929c;
        synchronized (this) {
            synchronized (c0929c) {
                c0929c.f9886d = this;
            }
        }
        this.f9965b = new V0.m(6);
        this.f9964a = new C0924C(0);
        this.f9967d = new C1251c(dVar, dVar2, dVar3, dVar4, this, this);
        this.f9969f = new F.d(iVar);
        this.f9968e = new C0598v();
        c1149e.f11690e = this;
    }

    public static void c(String str, long j6, j1.i iVar) {
        Log.v("Engine", str + " in " + C1.h.a(j6) + "ms, key: " + iVar);
    }

    public static void f(F f6) {
        if (!(f6 instanceof y)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((y) f6).e();
    }

    public final k a(com.bumptech.glide.f fVar, Object obj, j1.i iVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.g gVar, p pVar, C1.c cVar, boolean z5, boolean z6, j1.m mVar, boolean z7, boolean z8, boolean z9, boolean z10, y1.g gVar2, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f9963h) {
            int i8 = C1.h.f123b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j6 = jElapsedRealtimeNanos;
        this.f9965b.getClass();
        w wVar = new w(obj, iVar, i6, i7, cVar, cls, cls2, mVar);
        synchronized (this) {
            try {
                y yVarB = b(wVar, z7, j6);
                if (yVarB == null) {
                    return g(fVar, obj, iVar, i6, i7, cls, cls2, gVar, pVar, cVar, z5, z6, mVar, z7, z8, z9, z10, gVar2, executor, wVar, j6);
                }
                ((y1.h) gVar2).k(yVarB, EnumC0843a.f9422A, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y b(w wVar, boolean z5, long j6) {
        y yVar;
        Object obj;
        if (!z5) {
            return null;
        }
        C0929c c0929c = this.f9970g;
        synchronized (c0929c) {
            C0928b c0928b = (C0928b) c0929c.f9884b.get(wVar);
            if (c0928b == null) {
                yVar = null;
            } else {
                yVar = (y) c0928b.get();
                if (yVar == null) {
                    c0929c.b(c0928b);
                }
            }
        }
        if (yVar != null) {
            yVar.b();
        }
        if (yVar != null) {
            if (f9963h) {
                c("Loaded resource from active resources", j6, wVar);
            }
            return yVar;
        }
        C1149e c1149e = this.f9966c;
        synchronized (c1149e) {
            C1.i iVar = (C1.i) c1149e.f126a.remove(wVar);
            if (iVar == null) {
                obj = null;
            } else {
                c1149e.f128c -= (long) iVar.f125b;
                obj = iVar.f124a;
            }
        }
        F f6 = (F) obj;
        y yVar2 = f6 == null ? null : f6 instanceof y ? (y) f6 : new y(f6, true, true, wVar, this);
        if (yVar2 != null) {
            yVar2.b();
            this.f9970g.a(wVar, yVar2);
        }
        if (yVar2 == null) {
            return null;
        }
        if (f9963h) {
            c("Loaded resource from cache", j6, wVar);
        }
        return yVar2;
    }

    public final synchronized void d(u uVar, j1.i iVar, y yVar) {
        if (yVar != null) {
            try {
                if (yVar.f10015w) {
                    this.f9970g.a(iVar, yVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0924C c0924c = this.f9964a;
        c0924c.getClass();
        Map map = uVar.f9989L ? c0924c.f9843b : c0924c.f9842a;
        if (uVar.equals(map.get(iVar))) {
            map.remove(iVar);
        }
    }

    public final void e(j1.i iVar, y yVar) {
        C0929c c0929c = this.f9970g;
        synchronized (c0929c) {
            C0928b c0928b = (C0928b) c0929c.f9884b.remove(iVar);
            if (c0928b != null) {
                c0928b.f9882c = null;
                c0928b.clear();
            }
        }
        if (yVar.f10015w) {
        } else {
            this.f9968e.a(yVar, false);
        }
    }

    public final k g(com.bumptech.glide.f fVar, Object obj, j1.i iVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.g gVar, p pVar, C1.c cVar, boolean z5, boolean z6, j1.m mVar, boolean z7, boolean z8, boolean z9, boolean z10, y1.g gVar2, Executor executor, w wVar, long j6) {
        C0924C c0924c = this.f9964a;
        u uVar = (u) (z10 ? c0924c.f9843b : c0924c.f9842a).get(wVar);
        if (uVar != null) {
            uVar.a(gVar2, executor);
            if (f9963h) {
                c("Added to existing load", j6, wVar);
            }
            return new k(this, gVar2, uVar);
        }
        u uVar2 = (u) ((M.b) this.f9967d.f12324h).h();
        AbstractC1332d.l(uVar2, "Argument must not be null");
        synchronized (uVar2) {
            uVar2.f9985H = wVar;
            uVar2.f9986I = z7;
            uVar2.f9987J = z8;
            uVar2.f9988K = z9;
            uVar2.f9989L = z10;
        }
        F.d dVar = this.f9969f;
        m mVar2 = (m) ((M.b) dVar.f435z).h();
        AbstractC1332d.l(mVar2, "Argument must not be null");
        int i8 = dVar.f433x;
        dVar.f433x = i8 + 1;
        C0935i c0935i = mVar2.f9950w;
        c0935i.f9900c = fVar;
        c0935i.f9901d = obj;
        c0935i.f9911n = iVar;
        c0935i.f9902e = i6;
        c0935i.f9903f = i7;
        c0935i.f9913p = pVar;
        c0935i.f9904g = cls;
        c0935i.f9905h = mVar2.f9953z;
        c0935i.f9908k = cls2;
        c0935i.f9912o = gVar;
        c0935i.f9906i = mVar;
        c0935i.f9907j = cVar;
        c0935i.f9914q = z5;
        c0935i.f9915r = z6;
        mVar2.f9925D = fVar;
        mVar2.f9926E = iVar;
        mVar2.f9927F = gVar;
        mVar2.f9928G = wVar;
        mVar2.f9929H = i6;
        mVar2.f9930I = i7;
        mVar2.f9931J = pVar;
        mVar2.f9936O = z10;
        mVar2.f9932K = mVar;
        mVar2.f9933L = uVar2;
        mVar2.f9934M = i8;
        mVar2.f9949b0 = 1;
        mVar2.f9937P = obj;
        C0924C c0924c2 = this.f9964a;
        c0924c2.getClass();
        (uVar2.f9989L ? c0924c2.f9843b : c0924c2.f9842a).put(wVar, uVar2);
        uVar2.a(gVar2, executor);
        synchronized (uVar2) {
            uVar2.f9996S = mVar2;
            int i9 = mVar2.i(1);
            ((i9 == 2 || i9 == 3) ? uVar2.f9980C : uVar2.f9987J ? uVar2.f9982E : uVar2.f9988K ? uVar2.f9983F : uVar2.f9981D).execute(mVar2);
        }
        if (f9963h) {
            c("Started new load", j6, wVar);
        }
        return new k(this, gVar2, uVar2);
    }
}
