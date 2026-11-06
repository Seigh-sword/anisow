package L;

import C1.n;
import V0.m;
import android.content.Context;
import android.view.View;
import b2.InterfaceC0336a;
import h0.s0;
import java.util.ArrayDeque;
import java.util.Queue;
import m1.InterfaceC1013k;
import m2.C1032e;
import m2.C1042h0;
import m2.C1051k0;
import m2.InterfaceC1079w0;
import m2.K;
import m2.K1;
import m2.N;
import m2.Y;
import p1.C1234C;
import p1.C1239e;
import p1.x;
import p1.y;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements y, InterfaceC1079w0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f1668w;

    public i() {
        char[] cArr = n.f134a;
        this.f1668w = new ArrayDeque(20);
    }

    @Override // m2.InterfaceC1079w0
    public final Context a() {
        return ((C1051k0) this.f1668w).f11009w;
    }

    @Override // m2.InterfaceC1079w0
    public final m c() {
        return ((C1051k0) this.f1668w).f10980B;
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        return new C1239e(2, (p1.n) this.f1668w);
    }

    public abstract boolean e();

    @Override // m2.InterfaceC1079w0
    public final N f() {
        N n5 = ((C1051k0) this.f1668w).f10983E;
        C1051k0.i(n5);
        return n5;
    }

    @Override // m2.InterfaceC1079w0
    public final C1042h0 g() {
        C1042h0 c1042h0 = ((C1051k0) this.f1668w).f10984F;
        C1051k0.i(c1042h0);
        return c1042h0;
    }

    @Override // m2.InterfaceC1079w0
    public final InterfaceC0336a h() {
        return ((C1051k0) this.f1668w).f10988J;
    }

    public abstract float i(Object obj);

    public final boolean j(CharSequence charSequence, int i6) {
        if (charSequence == null || i6 < 0 || charSequence.length() - i6 < 0) {
            throw new IllegalArgumentException();
        }
        h hVar = (h) this.f1668w;
        if (hVar == null) {
            return e();
        }
        int iA = hVar.a(charSequence, i6);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return e();
        }
        return false;
    }

    public final boolean k() {
        s0 s0Var = (s0) this.f1668w;
        View view = s0Var.f8888c.f8618c0;
        int iA = view != null ? Y2.b.a(view) : 0;
        int i6 = s0Var.f8886a;
        return iA == i6 || !(iA == 2 || i6 == 2);
    }

    public final void l(InterfaceC1013k interfaceC1013k) {
        Object obj = this.f1668w;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(interfaceC1013k);
        }
    }

    public abstract void m(Object obj, float f6);

    public final C1032e n() {
        return ((C1051k0) this.f1668w).f10981C;
    }

    public final K o() {
        return ((C1051k0) this.f1668w).f10987I;
    }

    public final Y p() {
        Y y5 = ((C1051k0) this.f1668w).f10982D;
        C1051k0.e(y5);
        return y5;
    }

    public final K1 q() {
        K1 k12 = ((C1051k0) this.f1668w).f10986H;
        C1051k0.e(k12);
        return k12;
    }

    public void r() {
        C1042h0 c1042h0 = ((C1051k0) this.f1668w).f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
    }

    public i(s0 s0Var) {
        AbstractC1305a.o(s0Var, "operation");
        this.f1668w = s0Var;
    }

    public /* synthetic */ i(Object obj) {
        this.f1668w = obj;
    }

    public i(C1051k0 c1051k0) {
        AbstractC1332d.m(c1051k0);
        this.f1668w = c1051k0;
    }
}
