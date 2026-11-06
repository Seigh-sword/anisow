package l2;

import V0.m;
import android.os.Bundle;
import android.os.SystemClock;
import b2.C0337b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m2.C1042h0;
import m2.C1051k0;
import m2.C1067q;
import m2.G0;
import m2.G1;
import m2.K1;
import m2.N;
import m2.N0;
import m2.S0;
import m2.U0;
import m2.V0;
import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0937a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1051k0 f10022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0 f10023b;

    public c(C1051k0 c1051k0) {
        AbstractC1332d.m(c1051k0);
        this.f10022a = c1051k0;
        G0 g02 = c1051k0.f10990L;
        C1051k0.d(g02);
        this.f10023b = g02;
    }

    @Override // m2.Q0
    public final void a(String str, String str2, Bundle bundle) {
        G0 g02 = this.f10022a.f10990L;
        C1051k0.d(g02);
        g02.F(str, str2, bundle);
    }

    @Override // m2.Q0
    public final int b(String str) {
        AbstractC1332d.g(str);
        return 25;
    }

    @Override // m2.Q0
    public final void c(String str, String str2, Bundle bundle) {
        G0 g02 = this.f10023b;
        ((C0337b) g02.h()).getClass();
        g02.G(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // m2.Q0
    public final void d(Bundle bundle) {
        G0 g02 = this.f10023b;
        ((C0337b) g02.h()).getClass();
        g02.W(bundle, System.currentTimeMillis());
    }

    @Override // m2.Q0
    public final void e(String str) {
        C1051k0 c1051k0 = this.f10022a;
        C1067q c1067qM = c1051k0.m();
        c1051k0.f10988J.getClass();
        c1067qM.C(str, SystemClock.elapsedRealtime());
    }

    @Override // m2.Q0
    public final String f() {
        return (String) this.f10023b.f10614C.get();
    }

    @Override // m2.Q0
    public final long g() {
        K1 k12 = this.f10022a.f10986H;
        C1051k0.e(k12);
        return k12.B0();
    }

    @Override // m2.Q0
    public final String h() {
        U0 u02 = ((C1051k0) this.f10023b.f1668w).f10989K;
        C1051k0.d(u02);
        V0 v02 = u02.f10779y;
        if (v02 != null) {
            return v02.f10785b;
        }
        return null;
    }

    @Override // m2.Q0
    public final List i(String str, String str2) {
        G0 g02 = this.f10023b;
        if (g02.g().C()) {
            g02.f().f10715B.d("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (m.h()) {
            g02.f().f10715B.d("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C1042h0 c1042h0 = ((C1051k0) g02.f1668w).f10984F;
        C1051k0.i(c1042h0);
        c1042h0.v(atomicReference, 5000L, "get conditional user properties", new S0(g02, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return K1.l0(list);
        }
        g02.f().f10715B.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // m2.Q0
    public final void j(String str) {
        C1051k0 c1051k0 = this.f10022a;
        C1067q c1067qM = c1051k0.m();
        c1051k0.f10988J.getClass();
        c1067qM.A(str, SystemClock.elapsedRealtime());
    }

    @Override // m2.Q0
    public final Map k(String str, String str2, boolean z5) {
        N nF;
        String str3;
        G0 g02 = this.f10023b;
        if (g02.g().C()) {
            nF = g02.f();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!m.h()) {
                AtomicReference atomicReference = new AtomicReference();
                C1042h0 c1042h0 = ((C1051k0) g02.f1668w).f10984F;
                C1051k0.i(c1042h0);
                c1042h0.v(atomicReference, 5000L, "get user properties", new N0(g02, atomicReference, str, str2, z5));
                List<G1> list = (List) atomicReference.get();
                if (list == null) {
                    N nF2 = g02.f();
                    nF2.f10715B.c(Boolean.valueOf(z5), "Timed out waiting for handle get user properties, includeInternal");
                    return Collections.emptyMap();
                }
                C1280b c1280b = new C1280b(list.size());
                for (G1 g12 : list) {
                    Object objA = g12.a();
                    if (objA != null) {
                        c1280b.put(g12.f10636x, objA);
                    }
                }
                return c1280b;
            }
            nF = g02.f();
            str3 = "Cannot get user properties from main thread";
        }
        nF.f10715B.d(str3);
        return Collections.emptyMap();
    }

    @Override // m2.Q0
    public final String l() {
        return (String) this.f10023b.f10614C.get();
    }

    @Override // m2.Q0
    public final String m() {
        U0 u02 = ((C1051k0) this.f10023b.f1668w).f10989K;
        C1051k0.d(u02);
        V0 v02 = u02.f10779y;
        if (v02 != null) {
            return v02.f10784a;
        }
        return null;
    }
}
