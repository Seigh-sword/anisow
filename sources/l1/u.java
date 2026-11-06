package l1;

import j1.EnumC0843a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC0936j, D1.b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final I0.o f9977V = new I0.o(6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final I0.o f9978A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final v f9979B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final o1.d f9980C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final o1.d f9981D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final o1.d f9982E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final o1.d f9983F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final AtomicInteger f9984G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public j1.i f9985H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9986I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f9987J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f9988K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f9989L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public F f9990M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public EnumC0843a f9991N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f9992O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0922A f9993P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f9994Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public y f9995R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public m f9996S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public volatile boolean f9997T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f9998U;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f9999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final D1.e f10000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f10001y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final M.b f10002z;

    public u(o1.d dVar, o1.d dVar2, o1.d dVar3, o1.d dVar4, v vVar, x xVar, M.b bVar) {
        I0.o oVar = f9977V;
        this.f9999w = new t(new ArrayList(2));
        this.f10000x = new D1.e();
        this.f9984G = new AtomicInteger();
        this.f9980C = dVar;
        this.f9981D = dVar2;
        this.f9982E = dVar3;
        this.f9983F = dVar4;
        this.f9979B = vVar;
        this.f10001y = xVar;
        this.f10002z = bVar;
        this.f9978A = oVar;
    }

    public final synchronized void a(y1.g gVar, Executor executor) {
        r rVar;
        try {
            this.f10000x.a();
            t tVar = this.f9999w;
            tVar.getClass();
            tVar.f9976w.add(new s(gVar, executor));
            int i6 = 1;
            if (this.f9992O) {
                d(1);
                rVar = new r(this, gVar, i6);
            } else {
                int i7 = 0;
                if (this.f9994Q) {
                    d(1);
                    rVar = new r(this, gVar, i7);
                } else {
                    AbstractC1332d.b("Cannot add callbacks to a cancelled EngineJob", !this.f9997T);
                }
            }
            executor.execute(rVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f9997T = true;
        m mVar = this.f9996S;
        mVar.f9946Y = true;
        InterfaceC0934h interfaceC0934h = mVar.f9944W;
        if (interfaceC0934h != null) {
            interfaceC0934h.cancel();
        }
        v vVar = this.f9979B;
        j1.i iVar = this.f9985H;
        q qVar = (q) vVar;
        synchronized (qVar) {
            C0924C c0924c = qVar.f9964a;
            c0924c.getClass();
            Map map = this.f9989L ? c0924c.f9843b : c0924c.f9842a;
            if (equals(map.get(iVar))) {
                map.remove(iVar);
            }
        }
    }

    public final void c() {
        y yVar;
        synchronized (this) {
            try {
                this.f10000x.a();
                AbstractC1332d.b("Not yet complete!", f());
                int iDecrementAndGet = this.f9984G.decrementAndGet();
                AbstractC1332d.b("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    yVar = this.f9995R;
                    g();
                } else {
                    yVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.e();
        }
    }

    public final synchronized void d(int i6) {
        y yVar;
        AbstractC1332d.b("Not yet complete!", f());
        if (this.f9984G.getAndAdd(i6) == 0 && (yVar = this.f9995R) != null) {
            yVar.b();
        }
    }

    @Override // D1.b
    public final D1.e e() {
        return this.f10000x;
    }

    public final boolean f() {
        return this.f9994Q || this.f9992O || this.f9997T;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.f9985H == null) {
            throw new IllegalArgumentException();
        }
        this.f9999w.f9976w.clear();
        this.f9985H = null;
        this.f9995R = null;
        this.f9990M = null;
        this.f9994Q = false;
        this.f9997T = false;
        this.f9992O = false;
        this.f9998U = false;
        m mVar = this.f9996S;
        l lVar = mVar.f9924C;
        synchronized (lVar) {
            lVar.f9919a = true;
            zA = lVar.a();
        }
        if (zA) {
            mVar.m();
        }
        this.f9996S = null;
        this.f9993P = null;
        this.f9991N = null;
        this.f10002z.d(this);
    }

    public final synchronized void h(y1.g gVar) {
        try {
            this.f10000x.a();
            t tVar = this.f9999w;
            tVar.f9976w.remove(new s(gVar, C1.f.f121b));
            if (this.f9999w.f9976w.isEmpty()) {
                b();
                if (this.f9992O || this.f9994Q) {
                    if (this.f9984G.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
