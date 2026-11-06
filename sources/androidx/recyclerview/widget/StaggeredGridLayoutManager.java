package androidx.recyclerview.widget;

import N.V;
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
import h5.C0786m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import t0.AbstractC1332d;
import v0.AbstractC1397f0;
import v0.B0;
import v0.C0;
import v0.C1378G;
import v0.C1383L;
import v0.C1395e0;
import v0.P;
import v0.Q;
import v0.RunnableC1415y;
import v0.g0;
import v0.m0;
import v0.q0;
import v0.r0;
import v0.y0;
import v0.z0;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1397f0 implements q0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0786m f5762B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f5763C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5764D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5765E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public B0 f5766F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f5767G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final y0 f5768H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f5769I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f5770J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RunnableC1415y f5771K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0[] f5773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q f5774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Q f5775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1378G f5778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5779w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f5781y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5780x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5782z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5761A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f5772p = -1;
        this.f5779w = false;
        C0786m c0786m = new C0786m(1);
        this.f5762B = c0786m;
        this.f5763C = 2;
        this.f5767G = new Rect();
        this.f5768H = new y0(this);
        this.f5769I = true;
        this.f5771K = new RunnableC1415y(1, this);
        C1395e0 c1395e0I = AbstractC1397f0.I(context, attributeSet, i6, i7);
        int i8 = c1395e0I.f13099a;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i8 != this.f5776t) {
            this.f5776t = i8;
            Q q5 = this.f5774r;
            this.f5774r = this.f5775s;
            this.f5775s = q5;
            m0();
        }
        int i9 = c1395e0I.f13100b;
        c(null);
        if (i9 != this.f5772p) {
            c0786m.f();
            m0();
            this.f5772p = i9;
            this.f5781y = new BitSet(this.f5772p);
            this.f5773q = new C0[this.f5772p];
            for (int i10 = 0; i10 < this.f5772p; i10++) {
                this.f5773q[i10] = new C0(this, i10);
            }
            m0();
        }
        boolean z5 = c1395e0I.f13101c;
        c(null);
        B0 b02 = this.f5766F;
        if (b02 != null && b02.f12942D != z5) {
            b02.f12942D = z5;
        }
        this.f5779w = z5;
        m0();
        C1378G c1378g = new C1378G();
        c1378g.f13007a = true;
        c1378g.f13012f = 0;
        c1378g.f13013g = 0;
        this.f5778v = c1378g;
        this.f5774r = Q.a(this, this.f5776t);
        this.f5775s = Q.a(this, 1 - this.f5776t);
    }

    public static int e1(int i6, int i7, int i8) {
        if (i7 == 0 && i8 == 0) {
            return i6;
        }
        int mode = View.MeasureSpec.getMode(i6);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i7) - i8), mode) : i6;
    }

    @Override // v0.AbstractC1397f0
    public final boolean A0() {
        return this.f5766F == null;
    }

    public final int B0(int i6) {
        if (v() == 0) {
            return this.f5780x ? 1 : -1;
        }
        return (i6 < L0()) != this.f5780x ? -1 : 1;
    }

    public final boolean C0() {
        int iL0;
        if (v() != 0 && this.f5763C != 0 && this.f13115g) {
            if (this.f5780x) {
                iL0 = M0();
                L0();
            } else {
                iL0 = L0();
                M0();
            }
            C0786m c0786m = this.f5762B;
            if (iL0 == 0 && Q0() != null) {
                c0786m.f();
                this.f13114f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int D0(r0 r0Var) {
        if (v() == 0) {
            return 0;
        }
        Q q5 = this.f5774r;
        boolean z5 = this.f5769I;
        return AbstractC1332d.q(r0Var, q5, I0(!z5), H0(!z5), this, this.f5769I);
    }

    public final int E0(r0 r0Var) {
        if (v() == 0) {
            return 0;
        }
        Q q5 = this.f5774r;
        boolean z5 = this.f5769I;
        return AbstractC1332d.r(r0Var, q5, I0(!z5), H0(!z5), this, this.f5769I, this.f5780x);
    }

    public final int F0(r0 r0Var) {
        if (v() == 0) {
            return 0;
        }
        Q q5 = this.f5774r;
        boolean z5 = this.f5769I;
        return AbstractC1332d.s(r0Var, q5, I0(!z5), H0(!z5), this, this.f5769I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int G0(m0 m0Var, C1378G c1378g, r0 r0Var) {
        C0 c02;
        ?? r6;
        int i6;
        int iH;
        int iC;
        int iF;
        int iC2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 1;
        this.f5781y.set(0, this.f5772p, true);
        C1378G c1378g2 = this.f5778v;
        int i13 = c1378g2.f13015i ? c1378g.f13011e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1378g.f13011e == 1 ? c1378g.f13013g + c1378g.f13008b : c1378g.f13012f - c1378g.f13008b;
        int i14 = c1378g.f13011e;
        for (int i15 = 0; i15 < this.f5772p; i15++) {
            if (!this.f5773q[i15].f12979a.isEmpty()) {
                d1(this.f5773q[i15], i14, i13);
            }
        }
        int iE = this.f5780x ? this.f5774r.e() : this.f5774r.f();
        boolean z5 = false;
        while (true) {
            int i16 = c1378g.f13009c;
            if (((i16 < 0 || i16 >= r0Var.b()) ? i11 : i12) == 0 || (!c1378g2.f13015i && this.f5781y.isEmpty())) {
                break;
            }
            View view = m0Var.i(c1378g.f13009c, Long.MAX_VALUE).f13248a;
            c1378g.f13009c += c1378g.f13010d;
            z0 z0Var = (z0) view.getLayoutParams();
            int iC3 = z0Var.f13125a.c();
            C0786m c0786m = this.f5762B;
            int[] iArr = (int[]) c0786m.f9112b;
            int i17 = (iArr == null || iC3 >= iArr.length) ? -1 : iArr[iC3];
            if (i17 == -1) {
                if (U0(c1378g.f13011e)) {
                    i10 = this.f5772p - i12;
                    i9 = -1;
                    i8 = -1;
                } else {
                    i8 = i12;
                    i9 = this.f5772p;
                    i10 = i11;
                }
                C0 c03 = null;
                if (c1378g.f13011e == i12) {
                    int iF2 = this.f5774r.f();
                    int i18 = Integer.MAX_VALUE;
                    while (i10 != i9) {
                        C0 c04 = this.f5773q[i10];
                        int iF3 = c04.f(iF2);
                        if (iF3 < i18) {
                            i18 = iF3;
                            c03 = c04;
                        }
                        i10 += i8;
                    }
                } else {
                    int iE2 = this.f5774r.e();
                    int i19 = Integer.MIN_VALUE;
                    while (i10 != i9) {
                        C0 c05 = this.f5773q[i10];
                        int iH2 = c05.h(iE2);
                        if (iH2 > i19) {
                            c03 = c05;
                            i19 = iH2;
                        }
                        i10 += i8;
                    }
                }
                c02 = c03;
                c0786m.g(iC3);
                ((int[]) c0786m.f9112b)[iC3] = c02.f12983e;
            } else {
                c02 = this.f5773q[i17];
            }
            z0Var.f13291e = c02;
            if (c1378g.f13011e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f5776t == 1) {
                i6 = 1;
                S0(view, AbstractC1397f0.w(r6, this.f5777u, this.f13120l, r6, ((ViewGroup.MarginLayoutParams) z0Var).width), AbstractC1397f0.w(true, this.f13123o, this.f13121m, D() + G(), ((ViewGroup.MarginLayoutParams) z0Var).height));
            } else {
                i6 = 1;
                S0(view, AbstractC1397f0.w(true, this.f13122n, this.f13120l, F() + E(), ((ViewGroup.MarginLayoutParams) z0Var).width), AbstractC1397f0.w(false, this.f5777u, this.f13121m, 0, ((ViewGroup.MarginLayoutParams) z0Var).height));
            }
            if (c1378g.f13011e == i6) {
                iC = c02.f(iE);
                iH = this.f5774r.c(view) + iC;
            } else {
                iH = c02.h(iE);
                iC = iH - this.f5774r.c(view);
            }
            if (c1378g.f13011e == 1) {
                C0 c06 = z0Var.f13291e;
                c06.getClass();
                z0 z0Var2 = (z0) view.getLayoutParams();
                z0Var2.f13291e = c06;
                ArrayList arrayList = c06.f12979a;
                arrayList.add(view);
                c06.f12981c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c06.f12980b = Integer.MIN_VALUE;
                }
                if (z0Var2.f13125a.j() || z0Var2.f13125a.m()) {
                    c06.f12982d = c06.f12984f.f5774r.c(view) + c06.f12982d;
                }
            } else {
                C0 c07 = z0Var.f13291e;
                c07.getClass();
                z0 z0Var3 = (z0) view.getLayoutParams();
                z0Var3.f13291e = c07;
                ArrayList arrayList2 = c07.f12979a;
                arrayList2.add(0, view);
                c07.f12980b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c07.f12981c = Integer.MIN_VALUE;
                }
                if (z0Var3.f13125a.j() || z0Var3.f13125a.m()) {
                    c07.f12982d = c07.f12984f.f5774r.c(view) + c07.f12982d;
                }
            }
            if (R0() && this.f5776t == 1) {
                iC2 = this.f5775s.e() - (((this.f5772p - 1) - c02.f12983e) * this.f5777u);
                iF = iC2 - this.f5775s.c(view);
            } else {
                iF = this.f5775s.f() + (c02.f12983e * this.f5777u);
                iC2 = this.f5775s.c(view) + iF;
            }
            if (this.f5776t == 1) {
                AbstractC1397f0.N(view, iF, iC, iC2, iH);
            } else {
                AbstractC1397f0.N(view, iC, iF, iH, iC2);
            }
            d1(c02, c1378g2.f13011e, i13);
            W0(m0Var, c1378g2);
            if (c1378g2.f13014h && view.hasFocusable()) {
                i7 = 0;
                this.f5781y.set(c02.f12983e, false);
            } else {
                i7 = 0;
            }
            i11 = i7;
            i12 = 1;
            z5 = true;
        }
        int i20 = i11;
        if (!z5) {
            W0(m0Var, c1378g2);
        }
        int iF4 = c1378g2.f13011e == -1 ? this.f5774r.f() - O0(this.f5774r.f()) : N0(this.f5774r.e()) - this.f5774r.e();
        return iF4 > 0 ? Math.min(c1378g.f13008b, iF4) : i20;
    }

    public final View H0(boolean z5) {
        int iF = this.f5774r.f();
        int iE = this.f5774r.e();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iD = this.f5774r.d(viewU);
            int iB = this.f5774r.b(viewU);
            if (iB > iF && iD < iE) {
                if (iB <= iE || !z5) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View I0(boolean z5) {
        int iF = this.f5774r.f();
        int iE = this.f5774r.e();
        int iV = v();
        View view = null;
        for (int i6 = 0; i6 < iV; i6++) {
            View viewU = u(i6);
            int iD = this.f5774r.d(viewU);
            if (this.f5774r.b(viewU) > iF && iD < iE) {
                if (iD >= iF || !z5) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void J0(m0 m0Var, r0 r0Var, boolean z5) {
        int iE;
        int iN0 = N0(Integer.MIN_VALUE);
        if (iN0 != Integer.MIN_VALUE && (iE = this.f5774r.e() - iN0) > 0) {
            int i6 = iE - (-a1(-iE, m0Var, r0Var));
            if (!z5 || i6 <= 0) {
                return;
            }
            this.f5774r.k(i6);
        }
    }

    public final void K0(m0 m0Var, r0 r0Var, boolean z5) {
        int iF;
        int iO0 = O0(Integer.MAX_VALUE);
        if (iO0 != Integer.MAX_VALUE && (iF = iO0 - this.f5774r.f()) > 0) {
            int iA1 = iF - a1(iF, m0Var, r0Var);
            if (!z5 || iA1 <= 0) {
                return;
            }
            this.f5774r.k(-iA1);
        }
    }

    @Override // v0.AbstractC1397f0
    public final boolean L() {
        return this.f5763C != 0;
    }

    public final int L0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC1397f0.H(u(0));
    }

    public final int M0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return AbstractC1397f0.H(u(iV - 1));
    }

    public final int N0(int i6) {
        int iF = this.f5773q[0].f(i6);
        for (int i7 = 1; i7 < this.f5772p; i7++) {
            int iF2 = this.f5773q[i7].f(i6);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // v0.AbstractC1397f0
    public final void O(int i6) {
        super.O(i6);
        for (int i7 = 0; i7 < this.f5772p; i7++) {
            C0 c02 = this.f5773q[i7];
            int i8 = c02.f12980b;
            if (i8 != Integer.MIN_VALUE) {
                c02.f12980b = i8 + i6;
            }
            int i9 = c02.f12981c;
            if (i9 != Integer.MIN_VALUE) {
                c02.f12981c = i9 + i6;
            }
        }
    }

    public final int O0(int i6) {
        int iH = this.f5773q[0].h(i6);
        for (int i7 = 1; i7 < this.f5772p; i7++) {
            int iH2 = this.f5773q[i7].h(i6);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // v0.AbstractC1397f0
    public final void P(int i6) {
        super.P(i6);
        for (int i7 = 0; i7 < this.f5772p; i7++) {
            C0 c02 = this.f5773q[i7];
            int i8 = c02.f12980b;
            if (i8 != Integer.MIN_VALUE) {
                c02.f12980b = i8 + i6;
            }
            int i9 = c02.f12981c;
            if (i9 != Integer.MIN_VALUE) {
                c02.f12981c = i9 + i6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f5780x
            if (r0 == 0) goto L9
            int r0 = r7.M0()
            goto Ld
        L9:
            int r0 = r7.L0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            h5.m r4 = r7.f5762B
            r4.i(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.l(r8, r5)
            r4.k(r9, r5)
            goto L3a
        L33:
            r4.l(r8, r9)
            goto L3a
        L37:
            r4.k(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f5780x
            if (r8 == 0) goto L46
            int r8 = r7.L0()
            goto L4a
        L46:
            int r8 = r7.M0()
        L4a:
            if (r3 > r8) goto L4f
            r7.m0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0(int, int, int):void");
    }

    @Override // v0.AbstractC1397f0
    public final void Q() {
        this.f5762B.f();
        for (int i6 = 0; i6 < this.f5772p; i6++) {
            this.f5773q[i6].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Q0() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0():android.view.View");
    }

    public final boolean R0() {
        return C() == 1;
    }

    @Override // v0.AbstractC1397f0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13110b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5771K);
        }
        for (int i6 = 0; i6 < this.f5772p; i6++) {
            this.f5773q[i6].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(View view, int i6, int i7) {
        RecyclerView recyclerView = this.f13110b;
        Rect rect = this.f5767G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        z0 z0Var = (z0) view.getLayoutParams();
        int iE1 = e1(i6, ((ViewGroup.MarginLayoutParams) z0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) z0Var).rightMargin + rect.right);
        int iE12 = e1(i7, ((ViewGroup.MarginLayoutParams) z0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin + rect.bottom);
        if (v0(view, iE1, iE12, z0Var)) {
            view.measure(iE1, iE12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    @Override // v0.AbstractC1397f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r9, int r10, v0.m0 r11, v0.r0 r12) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, v0.m0, v0.r0):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(v0.m0 r17, v0.r0 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0(v0.m0, v0.r0, boolean):void");
    }

    @Override // v0.AbstractC1397f0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewI0 = I0(false);
            View viewH0 = H0(false);
            if (viewI0 == null || viewH0 == null) {
                return;
            }
            int iH = AbstractC1397f0.H(viewI0);
            int iH2 = AbstractC1397f0.H(viewH0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final boolean U0(int i6) {
        if (this.f5776t == 0) {
            return (i6 == -1) != this.f5780x;
        }
        return ((i6 == -1) == this.f5780x) == R0();
    }

    public final void V0(int i6, r0 r0Var) {
        int iL0;
        int i7;
        if (i6 > 0) {
            iL0 = M0();
            i7 = 1;
        } else {
            iL0 = L0();
            i7 = -1;
        }
        C1378G c1378g = this.f5778v;
        c1378g.f13007a = true;
        c1(iL0, r0Var);
        b1(i7);
        c1378g.f13009c = iL0 + c1378g.f13010d;
        c1378g.f13008b = Math.abs(i6);
    }

    public final void W0(m0 m0Var, C1378G c1378g) {
        if (!c1378g.f13007a || c1378g.f13015i) {
            return;
        }
        if (c1378g.f13008b == 0) {
            if (c1378g.f13011e == -1) {
                X0(c1378g.f13013g, m0Var);
                return;
            } else {
                Y0(c1378g.f13012f, m0Var);
                return;
            }
        }
        int i6 = 1;
        if (c1378g.f13011e == -1) {
            int i7 = c1378g.f13012f;
            int iH = this.f5773q[0].h(i7);
            while (i6 < this.f5772p) {
                int iH2 = this.f5773q[i6].h(i7);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i6++;
            }
            int i8 = i7 - iH;
            X0(i8 < 0 ? c1378g.f13013g : c1378g.f13013g - Math.min(i8, c1378g.f13008b), m0Var);
            return;
        }
        int i9 = c1378g.f13013g;
        int iF = this.f5773q[0].f(i9);
        while (i6 < this.f5772p) {
            int iF2 = this.f5773q[i6].f(i9);
            if (iF2 < iF) {
                iF = iF2;
            }
            i6++;
        }
        int i10 = iF - c1378g.f13013g;
        Y0(i10 < 0 ? c1378g.f13012f : Math.min(i10, c1378g.f13008b) + c1378g.f13012f, m0Var);
    }

    @Override // v0.AbstractC1397f0
    public final void X(int i6, int i7) {
        P0(i6, i7, 1);
    }

    public final void X0(int i6, m0 m0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f5774r.d(viewU) < i6 || this.f5774r.j(viewU) < i6) {
                return;
            }
            z0 z0Var = (z0) viewU.getLayoutParams();
            z0Var.getClass();
            if (z0Var.f13291e.f12979a.size() == 1) {
                return;
            }
            C0 c02 = z0Var.f13291e;
            ArrayList arrayList = c02.f12979a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            z0 z0Var2 = (z0) view.getLayoutParams();
            z0Var2.f13291e = null;
            if (z0Var2.f13125a.j() || z0Var2.f13125a.m()) {
                c02.f12982d -= c02.f12984f.f5774r.c(view);
            }
            if (size == 1) {
                c02.f12980b = Integer.MIN_VALUE;
            }
            c02.f12981c = Integer.MIN_VALUE;
            j0(viewU, m0Var);
        }
    }

    @Override // v0.AbstractC1397f0
    public final void Y() {
        this.f5762B.f();
        m0();
    }

    public final void Y0(int i6, m0 m0Var) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f5774r.b(viewU) > i6 || this.f5774r.i(viewU) > i6) {
                return;
            }
            z0 z0Var = (z0) viewU.getLayoutParams();
            z0Var.getClass();
            if (z0Var.f13291e.f12979a.size() == 1) {
                return;
            }
            C0 c02 = z0Var.f13291e;
            ArrayList arrayList = c02.f12979a;
            View view = (View) arrayList.remove(0);
            z0 z0Var2 = (z0) view.getLayoutParams();
            z0Var2.f13291e = null;
            if (arrayList.size() == 0) {
                c02.f12981c = Integer.MIN_VALUE;
            }
            if (z0Var2.f13125a.j() || z0Var2.f13125a.m()) {
                c02.f12982d -= c02.f12984f.f5774r.c(view);
            }
            c02.f12980b = Integer.MIN_VALUE;
            j0(viewU, m0Var);
        }
    }

    @Override // v0.AbstractC1397f0
    public final void Z(int i6, int i7) {
        P0(i6, i7, 8);
    }

    public final void Z0() {
        this.f5780x = (this.f5776t == 1 || !R0()) ? this.f5779w : !this.f5779w;
    }

    @Override // v0.q0
    public final PointF a(int i6) {
        int iB0 = B0(i6);
        PointF pointF = new PointF();
        if (iB0 == 0) {
            return null;
        }
        if (this.f5776t == 0) {
            pointF.x = iB0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iB0;
        }
        return pointF;
    }

    @Override // v0.AbstractC1397f0
    public final void a0(int i6, int i7) {
        P0(i6, i7, 2);
    }

    public final int a1(int i6, m0 m0Var, r0 r0Var) {
        if (v() == 0 || i6 == 0) {
            return 0;
        }
        V0(i6, r0Var);
        C1378G c1378g = this.f5778v;
        int iG0 = G0(m0Var, c1378g, r0Var);
        if (c1378g.f13008b >= iG0) {
            i6 = i6 < 0 ? -iG0 : iG0;
        }
        this.f5774r.k(-i6);
        this.f5764D = this.f5780x;
        c1378g.f13008b = 0;
        W0(m0Var, c1378g);
        return i6;
    }

    @Override // v0.AbstractC1397f0
    public final void b0(int i6, int i7) {
        P0(i6, i7, 4);
    }

    public final void b1(int i6) {
        C1378G c1378g = this.f5778v;
        c1378g.f13011e = i6;
        c1378g.f13010d = this.f5780x != (i6 == -1) ? -1 : 1;
    }

    @Override // v0.AbstractC1397f0
    public final void c(String str) {
        if (this.f5766F == null) {
            super.c(str);
        }
    }

    @Override // v0.AbstractC1397f0
    public final void c0(m0 m0Var, r0 r0Var) {
        T0(m0Var, r0Var, true);
    }

    public final void c1(int i6, r0 r0Var) {
        int iG;
        int iG2;
        int i7;
        int i8;
        int i9;
        int i10;
        C1378G c1378g = this.f5778v;
        boolean z5 = false;
        c1378g.f13008b = 0;
        c1378g.f13009c = i6;
        C1383L c1383l = this.f13113e;
        if (!(c1383l != null && c1383l.f13044e) || (i10 = r0Var.f13214a) == -1) {
            iG = 0;
            iG2 = 0;
        } else {
            if (this.f5780x == (i10 < i6)) {
                iG = this.f5774r.g();
                iG2 = 0;
            } else {
                iG2 = this.f5774r.g();
                iG = 0;
            }
        }
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView == null || !recyclerView.f5693C) {
            P p5 = (P) this.f5774r;
            int i11 = p5.f13058d;
            AbstractC1397f0 abstractC1397f0 = p5.f13059a;
            switch (i11) {
                case d.f6312l /* 0 */:
                    i7 = abstractC1397f0.f13122n;
                    break;
                default:
                    i7 = abstractC1397f0.f13123o;
                    break;
            }
            c1378g.f13013g = i7 + iG;
            c1378g.f13012f = -iG2;
        } else {
            c1378g.f13012f = this.f5774r.f() - iG2;
            c1378g.f13013g = this.f5774r.e() + iG;
        }
        c1378g.f13014h = false;
        c1378g.f13007a = true;
        Q q5 = this.f5774r;
        P p6 = (P) q5;
        int i12 = p6.f13058d;
        AbstractC1397f0 abstractC1397f02 = p6.f13059a;
        switch (i12) {
            case d.f6312l /* 0 */:
                i8 = abstractC1397f02.f13120l;
                break;
            default:
                i8 = abstractC1397f02.f13121m;
                break;
        }
        if (i8 == 0) {
            P p7 = (P) q5;
            int i13 = p7.f13058d;
            AbstractC1397f0 abstractC1397f03 = p7.f13059a;
            switch (i13) {
                case d.f6312l /* 0 */:
                    i9 = abstractC1397f03.f13122n;
                    break;
                default:
                    i9 = abstractC1397f03.f13123o;
                    break;
            }
            if (i9 == 0) {
                z5 = true;
            }
        }
        c1378g.f13015i = z5;
    }

    @Override // v0.AbstractC1397f0
    public final boolean d() {
        return this.f5776t == 0;
    }

    @Override // v0.AbstractC1397f0
    public final void d0(r0 r0Var) {
        this.f5782z = -1;
        this.f5761A = Integer.MIN_VALUE;
        this.f5766F = null;
        this.f5768H.a();
    }

    public final void d1(C0 c02, int i6, int i7) {
        int i8 = c02.f12982d;
        int i9 = c02.f12983e;
        if (i6 == -1) {
            int i10 = c02.f12980b;
            if (i10 == Integer.MIN_VALUE) {
                View view = (View) c02.f12979a.get(0);
                z0 z0Var = (z0) view.getLayoutParams();
                c02.f12980b = c02.f12984f.f5774r.d(view);
                z0Var.getClass();
                i10 = c02.f12980b;
            }
            if (i10 + i8 > i7) {
                return;
            }
        } else {
            int i11 = c02.f12981c;
            if (i11 == Integer.MIN_VALUE) {
                c02.a();
                i11 = c02.f12981c;
            }
            if (i11 - i8 < i7) {
                return;
            }
        }
        this.f5781y.set(i9, false);
    }

    @Override // v0.AbstractC1397f0
    public final boolean e() {
        return this.f5776t == 1;
    }

    @Override // v0.AbstractC1397f0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof B0) {
            B0 b02 = (B0) parcelable;
            this.f5766F = b02;
            if (this.f5782z != -1) {
                b02.f12948z = null;
                b02.f12947y = 0;
                b02.f12945w = -1;
                b02.f12946x = -1;
                b02.f12948z = null;
                b02.f12947y = 0;
                b02.f12939A = 0;
                b02.f12940B = null;
                b02.f12941C = null;
            }
            m0();
        }
    }

    @Override // v0.AbstractC1397f0
    public final boolean f(g0 g0Var) {
        return g0Var instanceof z0;
    }

    @Override // v0.AbstractC1397f0
    public final Parcelable f0() {
        int iH;
        int iF;
        int[] iArr;
        B0 b02 = this.f5766F;
        if (b02 != null) {
            B0 b03 = new B0();
            b03.f12947y = b02.f12947y;
            b03.f12945w = b02.f12945w;
            b03.f12946x = b02.f12946x;
            b03.f12948z = b02.f12948z;
            b03.f12939A = b02.f12939A;
            b03.f12940B = b02.f12940B;
            b03.f12942D = b02.f12942D;
            b03.f12943E = b02.f12943E;
            b03.f12944F = b02.f12944F;
            b03.f12941C = b02.f12941C;
            return b03;
        }
        B0 b04 = new B0();
        b04.f12942D = this.f5779w;
        b04.f12943E = this.f5764D;
        b04.f12944F = this.f5765E;
        C0786m c0786m = this.f5762B;
        if (c0786m == null || (iArr = (int[]) c0786m.f9112b) == null) {
            b04.f12939A = 0;
        } else {
            b04.f12940B = iArr;
            b04.f12939A = iArr.length;
            b04.f12941C = (List) c0786m.f9113c;
        }
        if (v() > 0) {
            b04.f12945w = this.f5764D ? M0() : L0();
            View viewH0 = this.f5780x ? H0(true) : I0(true);
            b04.f12946x = viewH0 != null ? AbstractC1397f0.H(viewH0) : -1;
            int i6 = this.f5772p;
            b04.f12947y = i6;
            b04.f12948z = new int[i6];
            for (int i7 = 0; i7 < this.f5772p; i7++) {
                if (this.f5764D) {
                    iH = this.f5773q[i7].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iF = this.f5774r.e();
                        iH -= iF;
                    }
                } else {
                    iH = this.f5773q[i7].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iF = this.f5774r.f();
                        iH -= iF;
                    }
                }
                b04.f12948z[i7] = iH;
            }
        } else {
            b04.f12945w = -1;
            b04.f12946x = -1;
            b04.f12947y = 0;
        }
        return b04;
    }

    @Override // v0.AbstractC1397f0
    public final void g0(int i6) {
        if (i6 == 0) {
            C0();
        }
    }

    @Override // v0.AbstractC1397f0
    public final void h(int i6, int i7, r0 r0Var, C0289n c0289n) {
        C1378G c1378g;
        int iF;
        int iH;
        if (this.f5776t != 0) {
            i6 = i7;
        }
        if (v() == 0 || i6 == 0) {
            return;
        }
        V0(i6, r0Var);
        int[] iArr = this.f5770J;
        if (iArr == null || iArr.length < this.f5772p) {
            this.f5770J = new int[this.f5772p];
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f5772p;
            c1378g = this.f5778v;
            if (i8 >= i10) {
                break;
            }
            if (c1378g.f13010d == -1) {
                iF = c1378g.f13012f;
                iH = this.f5773q[i8].h(iF);
            } else {
                iF = this.f5773q[i8].f(c1378g.f13013g);
                iH = c1378g.f13013g;
            }
            int i11 = iF - iH;
            if (i11 >= 0) {
                this.f5770J[i9] = i11;
                i9++;
            }
            i8++;
        }
        Arrays.sort(this.f5770J, 0, i9);
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = c1378g.f13009c;
            if (i13 < 0 || i13 >= r0Var.b()) {
                return;
            }
            c0289n.a(c1378g.f13009c, this.f5770J[i12]);
            c1378g.f13009c += c1378g.f13010d;
        }
    }

    @Override // v0.AbstractC1397f0
    public final int j(r0 r0Var) {
        return D0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int k(r0 r0Var) {
        return E0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int l(r0 r0Var) {
        return F0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int m(r0 r0Var) {
        return D0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int n(r0 r0Var) {
        return E0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int n0(int i6, m0 m0Var, r0 r0Var) {
        return a1(i6, m0Var, r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final int o(r0 r0Var) {
        return F0(r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final void o0(int i6) {
        B0 b02 = this.f5766F;
        if (b02 != null && b02.f12945w != i6) {
            b02.f12948z = null;
            b02.f12947y = 0;
            b02.f12945w = -1;
            b02.f12946x = -1;
        }
        this.f5782z = i6;
        this.f5761A = Integer.MIN_VALUE;
        m0();
    }

    @Override // v0.AbstractC1397f0
    public final int p0(int i6, m0 m0Var, r0 r0Var) {
        return a1(i6, m0Var, r0Var);
    }

    @Override // v0.AbstractC1397f0
    public final g0 r() {
        return this.f5776t == 0 ? new z0(-2, -1) : new z0(-1, -2);
    }

    @Override // v0.AbstractC1397f0
    public final g0 s(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    @Override // v0.AbstractC1397f0
    public final void s0(Rect rect, int i6, int i7) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        if (this.f5776t == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f13110b;
            WeakHashMap weakHashMap = V.f1964a;
            iG2 = AbstractC1397f0.g(i7, iHeight, recyclerView.getMinimumHeight());
            iG = AbstractC1397f0.g(i6, (this.f5777u * this.f5772p) + iF, this.f13110b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f13110b;
            WeakHashMap weakHashMap2 = V.f1964a;
            iG = AbstractC1397f0.g(i6, iWidth, recyclerView2.getMinimumWidth());
            iG2 = AbstractC1397f0.g(i7, (this.f5777u * this.f5772p) + iD, this.f13110b.getMinimumHeight());
        }
        this.f13110b.setMeasuredDimension(iG, iG2);
    }

    @Override // v0.AbstractC1397f0
    public final g0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new z0((ViewGroup.MarginLayoutParams) layoutParams) : new z0(layoutParams);
    }

    @Override // v0.AbstractC1397f0
    public final void y0(RecyclerView recyclerView, int i6) {
        C1383L c1383l = new C1383L(recyclerView.getContext());
        c1383l.f13040a = i6;
        z0(c1383l);
    }
}
