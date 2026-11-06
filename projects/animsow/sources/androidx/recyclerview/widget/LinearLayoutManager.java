package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0289n;
import com.bumptech.glide.d;
import d.AbstractC0628i;
import t0.AbstractC1332d;
import v0.AbstractC1397f0;
import v0.C1379H;
import v0.C1380I;
import v0.C1381J;
import v0.C1382K;
import v0.C1383L;
import v0.C1395e0;
import v0.P;
import v0.Q;
import v0.g0;
import v0.m0;
import v0.q0;
import v0.r0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1397f0 implements q0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1379H f5671A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1380I f5672B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f5673C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f5674D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1381J f5676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public P f5677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f5679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f5682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5684y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1382K f5685z;

    public LinearLayoutManager(int i6) {
        this.f5675p = 1;
        this.f5679t = false;
        this.f5680u = false;
        this.f5681v = false;
        this.f5682w = true;
        this.f5683x = -1;
        this.f5684y = Integer.MIN_VALUE;
        this.f5685z = null;
        this.f5671A = new C1379H();
        this.f5672B = new C1380I();
        this.f5673C = 2;
        this.f5674D = new int[2];
        a1(i6);
        c(null);
        if (this.f5679t) {
            this.f5679t = false;
            m0();
        }
    }

    @Override // v0.AbstractC1397f0
    public boolean A0() {
        return this.f5685z == null && this.f5678s == this.f5681v;
    }

    public void B0(r0 r0Var, int[] iArr) {
        int i6;
        int iG = r0Var.f13214a != -1 ? this.f5677r.g() : 0;
        if (this.f5676q.f13030f == -1) {
            i6 = 0;
        } else {
            i6 = iG;
            iG = 0;
        }
        iArr[0] = iG;
        iArr[1] = i6;
    }

    public void C0(r0 r0Var, C1381J c1381j, C0289n c0289n) {
        int i6 = c1381j.f13028d;
        if (i6 < 0 || i6 >= r0Var.b()) {
            return;
        }
        c0289n.a(i6, Math.max(0, c1381j.f13031g));
    }

    public final int D0(r0 r0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        P p5 = this.f5677r;
        boolean z5 = !this.f5682w;
        return AbstractC1332d.q(r0Var, p5, K0(z5), J0(z5), this, this.f5682w);
    }

    public final int E0(r0 r0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        P p5 = this.f5677r;
        boolean z5 = !this.f5682w;
        return AbstractC1332d.r(r0Var, p5, K0(z5), J0(z5), this, this.f5682w, this.f5680u);
    }

    public final int F0(r0 r0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        P p5 = this.f5677r;
        boolean z5 = !this.f5682w;
        return AbstractC1332d.s(r0Var, p5, K0(z5), J0(z5), this, this.f5682w);
    }

    public final int G0(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 17 ? i6 != 33 ? i6 != 66 ? (i6 == 130 && this.f5675p == 1) ? 1 : Integer.MIN_VALUE : this.f5675p == 0 ? 1 : Integer.MIN_VALUE : this.f5675p == 1 ? -1 : Integer.MIN_VALUE : this.f5675p == 0 ? -1 : Integer.MIN_VALUE : (this.f5675p != 1 && T0()) ? -1 : 1 : (this.f5675p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.f5676q == null) {
            C1381J c1381j = new C1381J();
            c1381j.f13025a = true;
            c1381j.f13032h = 0;
            c1381j.f13033i = 0;
            c1381j.f13035k = null;
            this.f5676q = c1381j;
        }
    }

    public final int I0(m0 m0Var, C1381J c1381j, r0 r0Var, boolean z5) {
        int i6;
        int i7 = c1381j.f13027c;
        int i8 = c1381j.f13031g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                c1381j.f13031g = i8 + i7;
            }
            W0(m0Var, c1381j);
        }
        int i9 = c1381j.f13027c + c1381j.f13032h;
        while (true) {
            if ((!c1381j.f13036l && i9 <= 0) || (i6 = c1381j.f13028d) < 0 || i6 >= r0Var.b()) {
                break;
            }
            C1380I c1380i = this.f5672B;
            c1380i.f13021a = 0;
            c1380i.f13022b = false;
            c1380i.f13023c = false;
            c1380i.f13024d = false;
            U0(m0Var, r0Var, c1381j, c1380i);
            if (!c1380i.f13022b) {
                int i10 = c1381j.f13026b;
                int i11 = c1380i.f13021a;
                c1381j.f13026b = (c1381j.f13030f * i11) + i10;
                if (!c1380i.f13023c || c1381j.f13035k != null || !r0Var.f13220g) {
                    c1381j.f13027c -= i11;
                    i9 -= i11;
                }
                int i12 = c1381j.f13031g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    c1381j.f13031g = i13;
                    int i14 = c1381j.f13027c;
                    if (i14 < 0) {
                        c1381j.f13031g = i13 + i14;
                    }
                    W0(m0Var, c1381j);
                }
                if (z5 && c1380i.f13024d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - c1381j.f13027c;
    }

    public final View J0(boolean z5) {
        int iV;
        int iV2;
        if (this.f5680u) {
            iV = 0;
            iV2 = v();
        } else {
            iV = v() - 1;
            iV2 = -1;
        }
        return N0(iV, iV2, z5);
    }

    public final View K0(boolean z5) {
        int iV;
        int iV2;
        if (this.f5680u) {
            iV = v() - 1;
            iV2 = -1;
        } else {
            iV = 0;
            iV2 = v();
        }
        return N0(iV, iV2, z5);
    }

    @Override // v0.AbstractC1397f0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View viewN0 = N0(v() - 1, -1, false);
        if (viewN0 == null) {
            return -1;
        }
        return AbstractC1397f0.H(viewN0);
    }

    public final View M0(int i6, int i7) {
        int i8;
        int i9;
        H0();
        if (i7 <= i6 && i7 >= i6) {
            return u(i6);
        }
        if (this.f5677r.d(u(i6)) < this.f5677r.f()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return (this.f5675p == 0 ? this.f13111c : this.f13112d).h(i6, i7, i8, i9);
    }

    public final View N0(int i6, int i7, boolean z5) {
        H0();
        return (this.f5675p == 0 ? this.f13111c : this.f13112d).h(i6, i7, z5 ? 24579 : 320, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View O0(v0.m0 r17, v0.r0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.H0()
            int r1 = r16.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            v0.P r7 = r0.f5677r
            int r7 = r7.f()
            v0.P r8 = r0.f5677r
            int r8 = r8.e()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = v0.AbstractC1397f0.H(r12)
            v0.P r14 = r0.f5677r
            int r14 = r14.d(r12)
            v0.P r15 = r0.f5677r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            v0.g0 r13 = (v0.g0) r13
            v0.u0 r13 = r13.f13125a
            boolean r13 = r13.j()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            goto L84
        L7f:
            if (r10 == 0) goto L83
            r9 = r10
            goto L84
        L83:
            r9 = r11
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.O0(v0.m0, v0.r0, boolean, boolean):android.view.View");
    }

    public final int P0(int i6, m0 m0Var, r0 r0Var, boolean z5) {
        int iE;
        int iE2 = this.f5677r.e() - i6;
        if (iE2 <= 0) {
            return 0;
        }
        int i7 = -Z0(-iE2, m0Var, r0Var);
        int i8 = i6 + i7;
        if (!z5 || (iE = this.f5677r.e() - i8) <= 0) {
            return i7;
        }
        this.f5677r.k(iE);
        return iE + i7;
    }

    public final int Q0(int i6, m0 m0Var, r0 r0Var, boolean z5) {
        int iF;
        int iF2 = i6 - this.f5677r.f();
        if (iF2 <= 0) {
            return 0;
        }
        int i7 = -Z0(iF2, m0Var, r0Var);
        int i8 = i6 + i7;
        if (!z5 || (iF = i8 - this.f5677r.f()) <= 0) {
            return i7;
        }
        this.f5677r.k(-iF);
        return i7 - iF;
    }

    public final View R0() {
        return u(this.f5680u ? 0 : v() - 1);
    }

    @Override // v0.AbstractC1397f0
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f5680u ? v() - 1 : 0);
    }

    @Override // v0.AbstractC1397f0
    public View T(View view, int i6, m0 m0Var, r0 r0Var) {
        int iG0;
        Y0();
        if (v() == 0 || (iG0 = G0(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        H0();
        c1(iG0, (int) (this.f5677r.g() * 0.33333334f), false, r0Var);
        C1381J c1381j = this.f5676q;
        c1381j.f13031g = Integer.MIN_VALUE;
        c1381j.f13025a = false;
        I0(m0Var, c1381j, r0Var, true);
        View viewM0 = iG0 == -1 ? this.f5680u ? M0(v() - 1, -1) : M0(0, v()) : this.f5680u ? M0(0, v()) : M0(v() - 1, -1);
        View viewS0 = iG0 == -1 ? S0() : R0();
        if (!viewS0.hasFocusable()) {
            return viewM0;
        }
        if (viewM0 == null) {
            return null;
        }
        return viewS0;
    }

    public final boolean T0() {
        return C() == 1;
    }

    @Override // v0.AbstractC1397f0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewN0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(viewN0 == null ? -1 : AbstractC1397f0.H(viewN0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(m0 m0Var, r0 r0Var, C1381J c1381j, C1380I c1380i) {
        int iE;
        int i6;
        int i7;
        int iL;
        View viewB = c1381j.b(m0Var);
        if (viewB == null) {
            c1380i.f13022b = true;
            return;
        }
        g0 g0Var = (g0) viewB.getLayoutParams();
        if (c1381j.f13035k == null) {
            if (this.f5680u == (c1381j.f13030f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f5680u == (c1381j.f13030f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        g0 g0Var2 = (g0) viewB.getLayoutParams();
        Rect rectJ = this.f13110b.J(viewB);
        int i8 = rectJ.left + rectJ.right;
        int i9 = rectJ.top + rectJ.bottom;
        int iW = AbstractC1397f0.w(d(), this.f13122n, this.f13120l, F() + E() + ((ViewGroup.MarginLayoutParams) g0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) g0Var2).rightMargin + i8, ((ViewGroup.MarginLayoutParams) g0Var2).width);
        int iW2 = AbstractC1397f0.w(e(), this.f13123o, this.f13121m, D() + G() + ((ViewGroup.MarginLayoutParams) g0Var2).topMargin + ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) g0Var2).height);
        if (v0(viewB, iW, iW2, g0Var2)) {
            viewB.measure(iW, iW2);
        }
        c1380i.f13021a = this.f5677r.c(viewB);
        if (this.f5675p == 1) {
            if (T0()) {
                iL = this.f13122n - F();
                iE = iL - this.f5677r.l(viewB);
            } else {
                iE = E();
                iL = this.f5677r.l(viewB) + iE;
            }
            if (c1381j.f13030f == -1) {
                i6 = c1381j.f13026b;
                i7 = i6 - c1380i.f13021a;
            } else {
                i7 = c1381j.f13026b;
                i6 = c1380i.f13021a + i7;
            }
        } else {
            int iG = G();
            int iL2 = this.f5677r.l(viewB) + iG;
            int i10 = c1381j.f13030f;
            int i11 = c1381j.f13026b;
            if (i10 == -1) {
                int i12 = i11 - c1380i.f13021a;
                iL = i11;
                i6 = iL2;
                iE = i12;
                i7 = iG;
            } else {
                int i13 = c1380i.f13021a + i11;
                iE = i11;
                i6 = iL2;
                i7 = iG;
                iL = i13;
            }
        }
        AbstractC1397f0.N(viewB, iE, i7, iL, i6);
        if (g0Var.f13125a.j() || g0Var.f13125a.m()) {
            c1380i.f13023c = true;
        }
        c1380i.f13024d = viewB.hasFocusable();
    }

    public final void W0(m0 m0Var, C1381J c1381j) {
        int i6;
        if (!c1381j.f13025a || c1381j.f13036l) {
            return;
        }
        int i7 = c1381j.f13031g;
        int i8 = c1381j.f13033i;
        if (c1381j.f13030f != -1) {
            if (i7 < 0) {
                return;
            }
            int i9 = i7 - i8;
            int iV = v();
            if (!this.f5680u) {
                for (int i10 = 0; i10 < iV; i10++) {
                    View viewU = u(i10);
                    if (this.f5677r.b(viewU) > i9 || this.f5677r.i(viewU) > i9) {
                        X0(m0Var, 0, i10);
                        return;
                    }
                }
                return;
            }
            int i11 = iV - 1;
            for (int i12 = i11; i12 >= 0; i12--) {
                View viewU2 = u(i12);
                if (this.f5677r.b(viewU2) > i9 || this.f5677r.i(viewU2) > i9) {
                    X0(m0Var, i11, i12);
                    return;
                }
            }
            return;
        }
        int iV2 = v();
        if (i7 < 0) {
            return;
        }
        P p5 = this.f5677r;
        int i13 = p5.f13058d;
        AbstractC1397f0 abstractC1397f0 = p5.f13059a;
        switch (i13) {
            case d.f6312l /* 0 */:
                i6 = abstractC1397f0.f13122n;
                break;
            default:
                i6 = abstractC1397f0.f13123o;
                break;
        }
        int i14 = (i6 - i7) + i8;
        if (this.f5680u) {
            for (int i15 = 0; i15 < iV2; i15++) {
                View viewU3 = u(i15);
                if (this.f5677r.d(viewU3) < i14 || this.f5677r.j(viewU3) < i14) {
                    X0(m0Var, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = iV2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View viewU4 = u(i17);
            if (this.f5677r.d(viewU4) < i14 || this.f5677r.j(viewU4) < i14) {
                X0(m0Var, i16, i17);
                return;
            }
        }
    }

    public final void X0(m0 m0Var, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        if (i7 <= i6) {
            while (i6 > i7) {
                View viewU = u(i6);
                k0(i6);
                m0Var.f(viewU);
                i6--;
            }
            return;
        }
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            View viewU2 = u(i8);
            k0(i8);
            m0Var.f(viewU2);
        }
    }

    public final void Y0() {
        this.f5680u = (this.f5675p == 1 || !T0()) ? this.f5679t : !this.f5679t;
    }

    public final int Z0(int i6, m0 m0Var, r0 r0Var) {
        if (v() == 0 || i6 == 0) {
            return 0;
        }
        H0();
        this.f5676q.f13025a = true;
        int i7 = i6 > 0 ? 1 : -1;
        int iAbs = Math.abs(i6);
        c1(i7, iAbs, true, r0Var);
        C1381J c1381j = this.f5676q;
        int iI0 = I0(m0Var, c1381j, r0Var, false) + c1381j.f13031g;
        if (iI0 < 0) {
            return 0;
        }
        if (iAbs > iI0) {
            i6 = i7 * iI0;
        }
        this.f5677r.k(-i6);
        this.f5676q.f13034j = i6;
        return i6;
    }

    @Override // v0.q0
    public final PointF a(int i6) {
        if (v() == 0) {
            return null;
        }
        int i7 = (i6 < AbstractC1397f0.H(u(0))) != this.f5680u ? -1 : 1;
        return this.f5675p == 0 ? new PointF(i7, 0.0f) : new PointF(0.0f, i7);
    }

    public final void a1(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(AbstractC0628i.f("invalid orientation:", i6));
        }
        c(null);
        if (i6 != this.f5675p || this.f5677r == null) {
            P pA = Q.a(this, i6);
            this.f5677r = pA;
            this.f5671A.f13016a = pA;
            this.f5675p = i6;
            m0();
        }
    }

    public void b1(boolean z5) {
        c(null);
        if (this.f5681v == z5) {
            return;
        }
        this.f5681v = z5;
        m0();
    }

    @Override // v0.AbstractC1397f0
    public final void c(String str) {
        if (this.f5685z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    @Override // v0.AbstractC1397f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c0(v0.m0 r18, v0.r0 r19) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c0(v0.m0, v0.r0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(int r7, int r8, boolean r9, v0.r0 r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c1(int, int, boolean, v0.r0):void");
    }

    @Override // v0.AbstractC1397f0
    public final boolean d() {
        return this.f5675p == 0;
    }

    @Override // v0.AbstractC1397f0
    public void d0(r0 r0Var) {
        this.f5685z = null;
        this.f5683x = -1;
        this.f5684y = Integer.MIN_VALUE;
        this.f5671A.d();
    }

    public final void d1(int i6, int i7) {
        this.f5676q.f13027c = this.f5677r.e() - i7;
        C1381J c1381j = this.f5676q;
        c1381j.f13029e = this.f5680u ? -1 : 1;
        c1381j.f13028d = i6;
        c1381j.f13030f = 1;
        c1381j.f13026b = i7;
        c1381j.f13031g = Integer.MIN_VALUE;
    }

    @Override // v0.AbstractC1397f0
    public final boolean e() {
        return this.f5675p == 1;
    }

    @Override // v0.AbstractC1397f0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof C1382K) {
            C1382K c1382k = (C1382K) parcelable;
            this.f5685z = c1382k;
            if (this.f5683x != -1) {
                c1382k.f13037w = -1;
            }
            m0();
        }
    }

    public final void e1(int i6, int i7) {
        this.f5676q.f13027c = i7 - this.f5677r.f();
        C1381J c1381j = this.f5676q;
        c1381j.f13028d = i6;
        c1381j.f13029e = this.f5680u ? 1 : -1;
        c1381j.f13030f = -1;
        c1381j.f13026b = i7;
        c1381j.f13031g = Integer.MIN_VALUE;
    }

    @Override // v0.AbstractC1397f0
    public final Parcelable f0() {
        C1382K c1382k = this.f5685z;
        if (c1382k != null) {
            C1382K c1382k2 = new C1382K();
            c1382k2.f13037w = c1382k.f13037w;
            c1382k2.f13038x = c1382k.f13038x;
            c1382k2.f13039y = c1382k.f13039y;
            return c1382k2;
        }
        C1382K c1382k3 = new C1382K();
        if (v() > 0) {
            H0();
            boolean z5 = this.f5678s ^ this.f5680u;
            c1382k3.f13039y = z5;
            if (z5) {
                View viewR0 = R0();
                c1382k3.f13038x = this.f5677r.e() - this.f5677r.b(viewR0);
                c1382k3.f13037w = AbstractC1397f0.H(viewR0);
            } else {
                View viewS0 = S0();
                c1382k3.f13037w = AbstractC1397f0.H(viewS0);
                c1382k3.f13038x = this.f5677r.d(viewS0) - this.f5677r.f();
            }
        } else {
            c1382k3.f13037w = -1;
        }
        return c1382k3;
    }

    @Override // v0.AbstractC1397f0
    public final void h(int i6, int i7, r0 r0Var, C0289n c0289n) {
        if (this.f5675p != 0) {
            i6 = i7;
        }
        if (v() == 0 || i6 == 0) {
            return;
        }
        H0();
        c1(i6 > 0 ? 1 : -1, Math.abs(i6), true, r0Var);
        C0(r0Var, this.f5676q, c0289n);
    }

    @Override // v0.AbstractC1397f0
    public final void i(int i6, C0289n c0289n) {
        boolean z5;
        int i7;
        C1382K c1382k = this.f5685z;
        if (c1382k == null || (i7 = c1382k.f13037w) < 0) {
            Y0();
            z5 = this.f5680u;
            i7 = this.f5683x;
            if (i7 == -1) {
                i7 = z5 ? i6 - 1 : 0;
            }
        } else {
            z5 = c1382k.f13039y;
        }
        int i8 = z5 ? -1 : 1;
        for (int i9 = 0; i9 < this.f5673C && i7 >= 0 && i7 < i6; i9++) {
            c0289n.a(i7, 0);
            i7 += i8;
        }
    }

    @Override // v0.AbstractC1397f0
    public final int j(r0 r0Var) {
        return D0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public int k(r0 r0Var) {
        return E0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public int l(r0 r0Var) {
        return F0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int m(r0 r0Var) {
        return D0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public int n(r0 r0Var) {
        return E0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public int n0(int i6, m0 m0Var, r0 r0Var) {
        if (this.f5675p == 1) {
            return 0;
        }
        return Z0(i6, m0Var, r0Var);
    }

    @Override // v0.AbstractC1397f0
    public int o(r0 r0Var) {
        return F0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final void o0(int i6) {
        this.f5683x = i6;
        this.f5684y = Integer.MIN_VALUE;
        C1382K c1382k = this.f5685z;
        if (c1382k != null) {
            c1382k.f13037w = -1;
        }
        m0();
    }

    @Override // v0.AbstractC1397f0
    public int p0(int i6, m0 m0Var, r0 r0Var) {
        if (this.f5675p == 0) {
            return 0;
        }
        return Z0(i6, m0Var, r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final View q(int i6) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i6 - AbstractC1397f0.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (AbstractC1397f0.H(viewU) == i6) {
                return viewU;
            }
        }
        return super.q(i6);
    }

    @Override // v0.AbstractC1397f0
    public g0 r() {
        return new g0(-2, -2);
    }

    @Override // v0.AbstractC1397f0
    public final boolean w0() {
        if (this.f13121m == 1073741824 || this.f13120l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i6 = 0; i6 < iV; i6++) {
            ViewGroup.LayoutParams layoutParams = u(i6).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // v0.AbstractC1397f0
    public void y0(RecyclerView recyclerView, int i6) {
        C1383L c1383l = new C1383L(recyclerView.getContext());
        c1383l.f13040a = i6;
        z0(c1383l);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f5675p = 1;
        this.f5679t = false;
        this.f5680u = false;
        this.f5681v = false;
        this.f5682w = true;
        this.f5683x = -1;
        this.f5684y = Integer.MIN_VALUE;
        this.f5685z = null;
        this.f5671A = new C1379H();
        this.f5672B = new C1380I();
        this.f5673C = 2;
        this.f5674D = new int[2];
        C1395e0 c1395e0I = AbstractC1397f0.I(context, attributeSet, i6, i7);
        a1(c1395e0I.f13099a);
        boolean z5 = c1395e0I.f13101c;
        c(null);
        if (z5 != this.f5679t) {
            this.f5679t = z5;
            m0();
        }
        b1(c1395e0I.f13102d);
    }

    public void V0(m0 m0Var, r0 r0Var, C1379H c1379h, int i6) {
    }
}
