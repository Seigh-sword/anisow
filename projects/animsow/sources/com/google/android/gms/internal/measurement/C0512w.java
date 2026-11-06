package com.google.android.gms.internal.measurement;

import i.C0803c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import u1.C1358b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0512w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J3.w f6981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P0.h f6982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0803c f6983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1358b f6984d;

    public C0512w() {
        J3.w wVar = new J3.w(9);
        this.f6981a = wVar;
        this.f6982b = ((P0.h) wVar.f1442b).h();
        this.f6983c = new C0803c(26);
        this.f6984d = new C1358b(19);
        final int i6 = 0;
        ((I0.f) wVar.f1444d).f1097a.put("internal.registerCallback", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0512w f6758b;

            {
                this.f6758b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C0512w c0512w = this.f6758b;
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        return new O2(c0512w.f6984d);
                    default:
                        return new O2(c0512w.f6983c);
                }
            }
        });
        final int i7 = 1;
        ((I0.f) wVar.f1444d).f1097a.put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0512w f6758b;

            {
                this.f6758b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C0512w c0512w = this.f6758b;
                switch (i7) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        return new O2(c0512w.f6984d);
                    default:
                        return new O2(c0512w.f6983c);
                }
            }
        });
    }

    public final void a(N1 n12) {
        AbstractC0435j abstractC0435j;
        J3.w wVar = this.f6981a;
        try {
            this.f6982b = ((P0.h) wVar.f1442b).h();
            if (wVar.t(this.f6982b, (O1[]) n12.r().toArray(new O1[0])) instanceof C0423h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (M1 m12 : n12.p().s()) {
                R2 r2R = m12.r();
                String strQ = m12.q();
                Iterator it = r2R.iterator();
                while (it.hasNext()) {
                    InterfaceC0459n interfaceC0459nT = wVar.t(this.f6982b, (O1) it.next());
                    if (!(interfaceC0459nT instanceof C0453m)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    P0.h hVar = this.f6982b;
                    if (hVar.m(strQ)) {
                        InterfaceC0459n interfaceC0459nK = hVar.k(strQ);
                        if (!(interfaceC0459nK instanceof AbstractC0435j)) {
                            throw new IllegalStateException("Invalid function name: " + strQ);
                        }
                        abstractC0435j = (AbstractC0435j) interfaceC0459nK;
                    } else {
                        abstractC0435j = null;
                    }
                    if (abstractC0435j == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strQ);
                    }
                    abstractC0435j.a(this.f6982b, Collections.singletonList(interfaceC0459nT));
                }
            }
        } catch (Throwable th) {
            throw new K(th);
        }
    }

    public final boolean b(C0393c c0393c) throws K {
        C0803c c0803c = this.f6983c;
        try {
            c0803c.f9277x = c0393c;
            c0803c.f9278y = (C0393c) c0393c.clone();
            ((List) c0803c.f9279z).clear();
            ((P0.h) this.f6981a.f1443c).n("runtime.counter", new C0417g(Double.valueOf(0.0d)));
            this.f6984d.m(this.f6982b.h(), c0803c);
            C0803c c0803c2 = this.f6983c;
            if (!(!((C0393c) c0803c2.f9278y).equals((C0393c) c0803c2.f9277x))) {
                if (!(!((List) this.f6983c.f9279z).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw new K(th);
        }
    }
}
