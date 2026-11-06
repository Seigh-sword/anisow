package O4;

import M4.C0063h;
import M4.y0;
import R4.u;
import R4.v;
import W.d0;
import j3.C0848A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements y0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f2346w = e.f2376p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0063h f2347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f2348y;

    public b(c cVar) {
        this.f2348y = cVar;
    }

    @Override // M4.y0
    public final void a(u uVar, int i6) {
        C0063h c0063h = this.f2347x;
        if (c0063h != null) {
            c0063h.a(uVar, i6);
        }
    }

    public final Object b(InterfaceC1427e interfaceC1427e) throws Throwable {
        C0063h c0063h;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f2352D;
        c cVar = this.f2348y;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.v(true, c.f2356y.get(cVar))) {
                this.f2346w = e.f2372l;
                Throwable thQ = cVar.q();
                if (thQ == null) {
                    return Boolean.FALSE;
                }
                int i6 = v.f3042a;
                throw thQ;
            }
            long andIncrement = c.f2357z.getAndIncrement(cVar);
            long j6 = e.f2362b;
            long j7 = andIncrement / j6;
            int i7 = (int) (andIncrement % j6);
            if (kVar.f3041c != j7) {
                k kVarO = cVar.o(j7, kVar);
                if (kVarO == null) {
                    continue;
                } else {
                    kVar = kVarO;
                }
            }
            Object objD = cVar.D(kVar, i7, andIncrement, null);
            C0848A c0848a = e.f2373m;
            if (objD == c0848a) {
                throw new IllegalStateException("unreachable".toString());
            }
            C0848A c0848a2 = e.f2375o;
            if (objD != c0848a2) {
                if (objD != e.f2374n) {
                    kVar.a();
                    this.f2346w = objD;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f2348y;
                C0063h c0063hV = S3.a.v(AbstractC1305a.H(interfaceC1427e));
                try {
                    this.f2347x = c0063hV;
                    c0063h = c0063hV;
                } catch (Throwable th) {
                    th = th;
                    c0063h = c0063hV;
                }
                try {
                    Object objD2 = cVar2.D(kVar, i7, andIncrement, this);
                    if (objD2 == c0848a) {
                        a(kVar, i7);
                    } else {
                        d0 d0VarF = null;
                        InterfaceC1432j interfaceC1432j = c0063h.f1889A;
                        C4.l lVar = cVar2.f2359x;
                        if (objD2 == c0848a2) {
                            if (andIncrement < cVar2.t()) {
                                kVar.a();
                            }
                            k kVar2 = (k) c.f2352D.get(cVar2);
                            while (true) {
                                if (cVar2.v(true, c.f2356y.get(cVar2))) {
                                    C0063h c0063h2 = this.f2347x;
                                    AbstractC1305a.l(c0063h2);
                                    this.f2347x = null;
                                    this.f2346w = e.f2372l;
                                    Throwable thQ2 = cVar.q();
                                    c0063h2.o(thQ2 == null ? Boolean.FALSE : S3.a.m(thQ2));
                                } else {
                                    long andIncrement2 = c.f2357z.getAndIncrement(cVar2);
                                    long j8 = e.f2362b;
                                    long j9 = andIncrement2 / j8;
                                    int i8 = (int) (andIncrement2 % j8);
                                    if (kVar2.f3041c != j9) {
                                        k kVarO2 = cVar2.o(j9, kVar2);
                                        if (kVarO2 != null) {
                                            kVar2 = kVarO2;
                                        }
                                    }
                                    C4.l lVar2 = lVar;
                                    Object objD3 = cVar2.D(kVar2, i8, andIncrement2, this);
                                    if (objD3 == e.f2373m) {
                                        a(kVar2, i8);
                                        break;
                                    }
                                    if (objD3 == e.f2375o) {
                                        if (andIncrement2 < cVar2.t()) {
                                            kVar2.a();
                                        }
                                        lVar = lVar2;
                                    } else {
                                        if (objD3 == e.f2374n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        kVar2.a();
                                        this.f2346w = objD3;
                                        this.f2347x = null;
                                        bool = Boolean.TRUE;
                                        if (lVar2 != null) {
                                            d0VarF = AbstractC1305a.f(lVar2, objD3, interfaceC1432j);
                                        }
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f2346w = objD2;
                            this.f2347x = null;
                            bool = Boolean.TRUE;
                            if (lVar != null) {
                                d0VarF = AbstractC1305a.f(lVar, objD2, interfaceC1432j);
                            }
                        }
                        c0063h.D(bool, d0VarF);
                    }
                    return c0063h.u();
                } catch (Throwable th2) {
                    th = th2;
                    c0063h.C();
                    throw th;
                }
            }
            if (andIncrement < cVar.t()) {
                kVar.a();
            }
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f2346w;
        C0848A c0848a = e.f2376p;
        if (obj == c0848a) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.f2346w = c0848a;
        if (obj != e.f2372l) {
            return obj;
        }
        Throwable thR = this.f2348y.r();
        int i6 = v.f3042a;
        throw thR;
    }
}
