package l1;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0396c2;
import d.AbstractC0628i;
import j1.EnumC0843a;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC0933g, Runnable, Comparable, D1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final M.b f9922A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public com.bumptech.glide.f f9925D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public j1.i f9926E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public com.bumptech.glide.g f9927F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public w f9928G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9929H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9930I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p f9931J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public j1.m f9932K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public InterfaceC0936j f9933L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9934M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f9935N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f9936O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Object f9937P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Thread f9938Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public j1.i f9939R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public j1.i f9940S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Object f9941T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public EnumC0843a f9942U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f9943V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public volatile InterfaceC0934h f9944W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public volatile boolean f9945X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile boolean f9946Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f9947Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f9948a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f9949b0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U1.i f9953z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0935i f9950w = new C0935i();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f9951x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final D1.e f9952y = new D1.e();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k f9923B = new k();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f9924C = new l();

    public m(U1.i iVar, M.b bVar) {
        this.f9953z = iVar;
        this.f9922A = bVar;
    }

    public final F a(com.bumptech.glide.load.data.e eVar, Object obj, EnumC0843a enumC0843a) {
        if (obj == null) {
            return null;
        }
        try {
            int i6 = C1.h.f123b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            F f6 = f(obj, enumC0843a);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(jElapsedRealtimeNanos, "Decoded result " + f6, null);
            }
            return f6;
        } finally {
            eVar.c();
        }
    }

    @Override // l1.InterfaceC0933g
    public final void b() {
        n(2);
    }

    @Override // l1.InterfaceC0933g
    public final void c(j1.i iVar, Object obj, com.bumptech.glide.load.data.e eVar, EnumC0843a enumC0843a, j1.i iVar2) {
        this.f9939R = iVar;
        this.f9941T = obj;
        this.f9943V = eVar;
        this.f9942U = enumC0843a;
        this.f9940S = iVar2;
        this.f9947Z = iVar != this.f9950w.a().get(0);
        if (Thread.currentThread() != this.f9938Q) {
            n(3);
        } else {
            g();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int iOrdinal = this.f9927F.ordinal() - mVar.f9927F.ordinal();
        return iOrdinal == 0 ? this.f9934M - mVar.f9934M : iOrdinal;
    }

    @Override // l1.InterfaceC0933g
    public final void d(j1.i iVar, Exception exc, com.bumptech.glide.load.data.e eVar, EnumC0843a enumC0843a) {
        eVar.c();
        C0922A c0922a = new C0922A("Fetching data failed", Collections.singletonList(exc));
        Class clsB = eVar.b();
        c0922a.f9839x = iVar;
        c0922a.f9840y = enumC0843a;
        c0922a.f9841z = clsB;
        this.f9951x.add(c0922a);
        if (Thread.currentThread() != this.f9938Q) {
            n(2);
        } else {
            o();
        }
    }

    @Override // D1.b
    public final D1.e e() {
        return this.f9952y;
    }

    public final F f(Object obj, EnumC0843a enumC0843a) {
        Class<?> cls = obj.getClass();
        C0935i c0935i = this.f9950w;
        C0925D c0925dC = c0935i.c(cls);
        j1.m mVar = this.f9932K;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z5 = enumC0843a == EnumC0843a.f9427z || c0935i.f9915r;
            j1.l lVar = s1.r.f12589i;
            Boolean bool = (Boolean) mVar.c(lVar);
            if (bool == null || (bool.booleanValue() && !z5)) {
                mVar = new j1.m();
                C1.c cVar = this.f9932K.f9442b;
                C1.c cVar2 = mVar.f9442b;
                cVar2.i(cVar);
                cVar2.put(lVar, Boolean.valueOf(z5));
            }
        }
        j1.m mVar2 = mVar;
        com.bumptech.glide.load.data.g gVarF = this.f9925D.a().f(obj);
        try {
            return c0925dC.a(this.f9929H, this.f9930I, mVar2, gVarF, new C0396c2(this, enumC0843a, 19));
        } finally {
            gVarF.c();
        }
    }

    public final void g() {
        F fA;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            j(this.f9935N, "Retrieved data", "data: " + this.f9941T + ", cache key: " + this.f9939R + ", fetcher: " + this.f9943V);
        }
        C0926E c0926e = null;
        try {
            fA = a(this.f9943V, this.f9941T, this.f9942U);
        } catch (C0922A e6) {
            j1.i iVar = this.f9940S;
            EnumC0843a enumC0843a = this.f9942U;
            e6.f9839x = iVar;
            e6.f9840y = enumC0843a;
            e6.f9841z = null;
            this.f9951x.add(e6);
            fA = null;
        }
        if (fA == null) {
            o();
            return;
        }
        EnumC0843a enumC0843a2 = this.f9942U;
        boolean z5 = this.f9947Z;
        if (fA instanceof InterfaceC0923B) {
            ((InterfaceC0923B) fA).b();
        }
        if (((C0926E) this.f9923B.f9918c) != null) {
            c0926e = (C0926E) C0926E.f9847A.h();
            c0926e.f9851z = false;
            c0926e.f9850y = true;
            c0926e.f9849x = fA;
            fA = c0926e;
        }
        k(fA, enumC0843a2, z5);
        this.f9948a0 = 5;
        try {
            k kVar = this.f9923B;
            if (((C0926E) kVar.f9918c) != null) {
                kVar.a(this.f9953z, this.f9932K);
            }
            l lVar = this.f9924C;
            synchronized (lVar) {
                lVar.f9920b = true;
                zA = lVar.a();
            }
            if (zA) {
                m();
            }
        } finally {
            if (c0926e != null) {
                c0926e.b();
            }
        }
    }

    public final InterfaceC0934h h() {
        int iB = u.h.b(this.f9948a0);
        C0935i c0935i = this.f9950w;
        if (iB == 1) {
            return new G(c0935i, this);
        }
        if (iB == 2) {
            return new C0931e(c0935i.a(), c0935i, this);
        }
        if (iB == 3) {
            return new J(c0935i, this);
        }
        if (iB == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0628i.x(this.f9948a0)));
    }

    public final int i(int i6) {
        int iB = u.h.b(i6);
        if (iB == 0) {
            switch (((o) this.f9931J).f9959d) {
                case 1:
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    return i(2);
                default:
                    return 2;
            }
        }
        if (iB == 1) {
            switch (((o) this.f9931J).f9959d) {
                case 1:
                    return i(3);
                default:
                    return 3;
            }
        }
        if (iB == 2) {
            return this.f9936O ? 6 : 4;
        }
        if (iB == 3 || iB == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0628i.x(i6)));
    }

    public final void j(long j6, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1.h.a(j6));
        sb.append(", load key: ");
        sb.append(this.f9928G);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final void k(F f6, EnumC0843a enumC0843a, boolean z5) {
        q();
        u uVar = (u) this.f9933L;
        synchronized (uVar) {
            uVar.f9990M = f6;
            uVar.f9991N = enumC0843a;
            uVar.f9998U = z5;
        }
        synchronized (uVar) {
            try {
                uVar.f10000x.a();
                if (uVar.f9997T) {
                    uVar.f9990M.f();
                    uVar.g();
                    return;
                }
                if (uVar.f9999w.f9976w.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (uVar.f9992O) {
                    throw new IllegalStateException("Already have resource");
                }
                I0.o oVar = uVar.f9978A;
                F f7 = uVar.f9990M;
                boolean z6 = uVar.f9986I;
                j1.i iVar = uVar.f9985H;
                x xVar = uVar.f10001y;
                oVar.getClass();
                uVar.f9995R = new y(f7, z6, true, iVar, xVar);
                int i6 = 1;
                uVar.f9992O = true;
                t tVar = uVar.f9999w;
                tVar.getClass();
                ArrayList<s> arrayList = new ArrayList(tVar.f9976w);
                uVar.d(arrayList.size() + 1);
                ((q) uVar.f9979B).d(uVar, uVar.f9985H, uVar.f9995R);
                for (s sVar : arrayList) {
                    sVar.f9975b.execute(new r(uVar, sVar.f9974a, i6));
                }
                uVar.c();
            } finally {
            }
        }
    }

    public final void l() {
        boolean zA;
        q();
        C0922A c0922a = new C0922A("Failed to load resource", new ArrayList(this.f9951x));
        u uVar = (u) this.f9933L;
        synchronized (uVar) {
            uVar.f9993P = c0922a;
        }
        synchronized (uVar) {
            try {
                uVar.f10000x.a();
                if (uVar.f9997T) {
                    uVar.g();
                } else {
                    if (uVar.f9999w.f9976w.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (uVar.f9994Q) {
                        throw new IllegalStateException("Already failed once");
                    }
                    uVar.f9994Q = true;
                    j1.i iVar = uVar.f9985H;
                    t tVar = uVar.f9999w;
                    tVar.getClass();
                    ArrayList<s> arrayList = new ArrayList(tVar.f9976w);
                    uVar.d(arrayList.size() + 1);
                    ((q) uVar.f9979B).d(uVar, iVar, null);
                    for (s sVar : arrayList) {
                        sVar.f9975b.execute(new r(uVar, sVar.f9974a, 0));
                    }
                    uVar.c();
                }
            } finally {
            }
        }
        l lVar = this.f9924C;
        synchronized (lVar) {
            lVar.f9921c = true;
            zA = lVar.a();
        }
        if (zA) {
            m();
        }
    }

    public final void m() {
        l lVar = this.f9924C;
        synchronized (lVar) {
            lVar.f9920b = false;
            lVar.f9919a = false;
            lVar.f9921c = false;
        }
        k kVar = this.f9923B;
        kVar.f9916a = null;
        kVar.f9917b = null;
        kVar.f9918c = null;
        C0935i c0935i = this.f9950w;
        c0935i.f9900c = null;
        c0935i.f9901d = null;
        c0935i.f9911n = null;
        c0935i.f9904g = null;
        c0935i.f9908k = null;
        c0935i.f9906i = null;
        c0935i.f9912o = null;
        c0935i.f9907j = null;
        c0935i.f9913p = null;
        c0935i.f9898a.clear();
        c0935i.f9909l = false;
        c0935i.f9899b.clear();
        c0935i.f9910m = false;
        this.f9945X = false;
        this.f9925D = null;
        this.f9926E = null;
        this.f9932K = null;
        this.f9927F = null;
        this.f9928G = null;
        this.f9933L = null;
        this.f9948a0 = 0;
        this.f9944W = null;
        this.f9938Q = null;
        this.f9939R = null;
        this.f9941T = null;
        this.f9942U = null;
        this.f9943V = null;
        this.f9935N = 0L;
        this.f9946Y = false;
        this.f9951x.clear();
        this.f9922A.d(this);
    }

    public final void n(int i6) {
        this.f9949b0 = i6;
        u uVar = (u) this.f9933L;
        (uVar.f9987J ? uVar.f9982E : uVar.f9988K ? uVar.f9983F : uVar.f9981D).execute(this);
    }

    public final void o() {
        this.f9938Q = Thread.currentThread();
        int i6 = C1.h.f123b;
        this.f9935N = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.f9946Y && this.f9944W != null && !(zA = this.f9944W.a())) {
            this.f9948a0 = i(this.f9948a0);
            this.f9944W = h();
            if (this.f9948a0 == 4) {
                n(2);
                return;
            }
        }
        if ((this.f9948a0 == 6 || this.f9946Y) && !zA) {
            l();
        }
    }

    public final void p() {
        int iB = u.h.b(this.f9949b0);
        if (iB == 0) {
            this.f9948a0 = i(1);
            this.f9944W = h();
        } else if (iB != 1) {
            if (iB != 2) {
                throw new IllegalStateException("Unrecognized run reason: ".concat(AbstractC0628i.w(this.f9949b0)));
            }
            g();
            return;
        }
        o();
    }

    public final void q() {
        Throwable th;
        this.f9952y.a();
        if (!this.f9945X) {
            this.f9945X = true;
            return;
        }
        if (this.f9951x.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f9951x;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f9943V;
        try {
            try {
                if (this.f9946Y) {
                    l();
                    if (eVar != null) {
                        eVar.c();
                        return;
                    }
                    return;
                }
                p();
                if (eVar != null) {
                    eVar.c();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.c();
                }
                throw th;
            }
        } catch (C0930d e6) {
            throw e6;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f9946Y + ", stage: " + AbstractC0628i.x(this.f9948a0), th2);
            }
            if (this.f9948a0 != 5) {
                this.f9951x.add(th2);
                l();
            }
            if (!this.f9946Y) {
                throw th2;
            }
            throw th2;
        }
    }
}
