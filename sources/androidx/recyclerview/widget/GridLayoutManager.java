package androidx.recyclerview.widget;

import N.V;
import O.i;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.datastore.preferences.protobuf.C0289n;
import d.AbstractC0628i;
import java.util.WeakHashMap;
import m.Z0;
import v0.AbstractC1397f0;
import v0.C1377F;
import v0.C1379H;
import v0.C1381J;
import v0.g0;
import v0.m0;
import v0.r0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5663E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f5664F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int[] f5665G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View[] f5666H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseIntArray f5667I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseIntArray f5668J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Z0 f5669K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f5670L;

    public GridLayoutManager(int i6) {
        super(1);
        this.f5663E = false;
        this.f5664F = -1;
        this.f5667I = new SparseIntArray();
        this.f5668J = new SparseIntArray();
        this.f5669K = new Z0();
        this.f5670L = new Rect();
        m1(i6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final boolean A0() {
        return this.f5685z == null && !this.f5663E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(r0 r0Var, C1381J c1381j, C0289n c0289n) {
        int i6;
        int i7 = this.f5664F;
        for (int i8 = 0; i8 < this.f5664F && (i6 = c1381j.f13028d) >= 0 && i6 < r0Var.b() && i7 > 0; i8++) {
            c0289n.a(c1381j.f13028d, Math.max(0, c1381j.f13031g));
            this.f5669K.getClass();
            i7--;
            c1381j.f13028d += c1381j.f13029e;
        }
    }

    @Override // v0.AbstractC1397f0
    public final int J(m0 m0Var, r0 r0Var) {
        if (this.f5675p == 0) {
            return this.f5664F;
        }
        if (r0Var.b() < 1) {
            return 0;
        }
        return i1(r0Var.b() - 1, m0Var, r0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(m0 m0Var, r0 r0Var, boolean z5, boolean z6) {
        int i6;
        int iV;
        int iV2 = v();
        int i7 = 1;
        if (z6) {
            iV = v() - 1;
            i6 = -1;
            i7 = -1;
        } else {
            i6 = iV2;
            iV = 0;
        }
        int iB = r0Var.b();
        H0();
        int iF = this.f5677r.f();
        int iE = this.f5677r.e();
        View view = null;
        View view2 = null;
        while (iV != i6) {
            View viewU = u(iV);
            int iH = AbstractC1397f0.H(viewU);
            if (iH >= 0 && iH < iB && j1(iH, m0Var, r0Var) == 0) {
                if (((g0) viewU.getLayoutParams()).f13125a.j()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f5677r.d(viewU) < iE && this.f5677r.b(viewU) >= iF) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i7;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (r13 == (r2 > r15)) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r23, int r24, v0.m0 r25, v0.r0 r26) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, v0.m0, v0.r0):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(v0.m0 r19, v0.r0 r20, v0.C1381J r21, v0.C1380I r22) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U0(v0.m0, v0.r0, v0.J, v0.I):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(m0 m0Var, r0 r0Var, C1379H c1379h, int i6) {
        n1();
        if (r0Var.b() > 0 && !r0Var.f13220g) {
            boolean z5 = i6 == 1;
            int iJ1 = j1(c1379h.f13017b, m0Var, r0Var);
            if (z5) {
                while (iJ1 > 0) {
                    int i7 = c1379h.f13017b;
                    if (i7 <= 0) {
                        break;
                    }
                    int i8 = i7 - 1;
                    c1379h.f13017b = i8;
                    iJ1 = j1(i8, m0Var, r0Var);
                }
            } else {
                int iB = r0Var.b() - 1;
                int i9 = c1379h.f13017b;
                while (i9 < iB) {
                    int i10 = i9 + 1;
                    int iJ12 = j1(i10, m0Var, r0Var);
                    if (iJ12 <= iJ1) {
                        break;
                    }
                    i9 = i10;
                    iJ1 = iJ12;
                }
                c1379h.f13017b = i9;
            }
        }
        g1();
    }

    @Override // v0.AbstractC1397f0
    public final void W(m0 m0Var, r0 r0Var, View view, i iVar) {
        int i6;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1377F)) {
            V(view, iVar);
            return;
        }
        C1377F c1377f = (C1377F) layoutParams;
        int iI1 = i1(c1377f.f13125a.c(), m0Var, r0Var);
        int i10 = this.f5675p;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        if (i10 == 0) {
            i9 = c1377f.f13001e;
            i8 = c1377f.f13002f;
            z5 = false;
            i7 = 1;
            z6 = false;
            i6 = iI1;
        } else {
            i6 = c1377f.f13001e;
            i7 = c1377f.f13002f;
            z5 = false;
            i8 = 1;
            z6 = false;
            i9 = iI1;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, i8, i6, i7, z5, z6));
    }

    @Override // v0.AbstractC1397f0
    public final void X(int i6, int i7) {
        Z0 z02 = this.f5669K;
        z02.g();
        ((SparseIntArray) z02.f10238d).clear();
    }

    @Override // v0.AbstractC1397f0
    public final void Y() {
        Z0 z02 = this.f5669K;
        z02.g();
        ((SparseIntArray) z02.f10238d).clear();
    }

    @Override // v0.AbstractC1397f0
    public final void Z(int i6, int i7) {
        Z0 z02 = this.f5669K;
        z02.g();
        ((SparseIntArray) z02.f10238d).clear();
    }

    @Override // v0.AbstractC1397f0
    public final void a0(int i6, int i7) {
        Z0 z02 = this.f5669K;
        z02.g();
        ((SparseIntArray) z02.f10238d).clear();
    }

    @Override // v0.AbstractC1397f0
    public final void b0(int i6, int i7) {
        Z0 z02 = this.f5669K;
        z02.g();
        ((SparseIntArray) z02.f10238d).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.b1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final void c0(m0 m0Var, r0 r0Var) {
        boolean z5 = r0Var.f13220g;
        SparseIntArray sparseIntArray = this.f5668J;
        SparseIntArray sparseIntArray2 = this.f5667I;
        if (z5) {
            int iV = v();
            for (int i6 = 0; i6 < iV; i6++) {
                C1377F c1377f = (C1377F) u(i6).getLayoutParams();
                int iC = c1377f.f13125a.c();
                sparseIntArray2.put(iC, c1377f.f13002f);
                sparseIntArray.put(iC, c1377f.f13001e);
            }
        }
        super.c0(m0Var, r0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final void d0(r0 r0Var) {
        super.d0(r0Var);
        this.f5663E = false;
    }

    @Override // v0.AbstractC1397f0
    public final boolean f(g0 g0Var) {
        return g0Var instanceof C1377F;
    }

    public final void f1(int i6) {
        int i7;
        int[] iArr = this.f5665G;
        int i8 = this.f5664F;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i8 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i6 / i8;
        int i11 = i6 % i8;
        int i12 = 0;
        for (int i13 = 1; i13 <= i8; i13++) {
            i9 += i11;
            if (i9 <= 0 || i8 - i9 >= i11) {
                i7 = i10;
            } else {
                i7 = i10 + 1;
                i9 -= i8;
            }
            i12 += i7;
            iArr[i13] = i12;
        }
        this.f5665G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.f5666H;
        if (viewArr == null || viewArr.length != this.f5664F) {
            this.f5666H = new View[this.f5664F];
        }
    }

    public final int h1(int i6, int i7) {
        if (this.f5675p != 1 || !T0()) {
            int[] iArr = this.f5665G;
            return iArr[i7 + i6] - iArr[i6];
        }
        int[] iArr2 = this.f5665G;
        int i8 = this.f5664F;
        return iArr2[i8 - i6] - iArr2[(i8 - i6) - i7];
    }

    public final int i1(int i6, m0 m0Var, r0 r0Var) {
        boolean z5 = r0Var.f13220g;
        Z0 z02 = this.f5669K;
        if (!z5) {
            return z02.d(i6, this.f5664F);
        }
        int iB = m0Var.b(i6);
        if (iB != -1) {
            return z02.d(iB, this.f5664F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
        return 0;
    }

    public final int j1(int i6, m0 m0Var, r0 r0Var) {
        boolean z5 = r0Var.f13220g;
        Z0 z02 = this.f5669K;
        if (!z5) {
            return z02.e(i6, this.f5664F);
        }
        int i7 = this.f5668J.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        int iB = m0Var.b(i6);
        if (iB != -1) {
            return z02.e(iB, this.f5664F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final int k(r0 r0Var) {
        return E0(r0Var);
    }

    public final int k1(int i6, m0 m0Var, r0 r0Var) {
        boolean z5 = r0Var.f13220g;
        Z0 z02 = this.f5669K;
        if (!z5) {
            z02.getClass();
            return 1;
        }
        int i7 = this.f5667I.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        if (m0Var.b(i6) != -1) {
            z02.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final int l(r0 r0Var) {
        return F0(r0Var);
    }

    public final void l1(View view, int i6, boolean z5) {
        int iW;
        int iW2;
        C1377F c1377f = (C1377F) view.getLayoutParams();
        Rect rect = c1377f.f13126b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1377f).topMargin + ((ViewGroup.MarginLayoutParams) c1377f).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1377f).leftMargin + ((ViewGroup.MarginLayoutParams) c1377f).rightMargin;
        int iH1 = h1(c1377f.f13001e, c1377f.f13002f);
        if (this.f5675p == 1) {
            iW2 = AbstractC1397f0.w(false, iH1, i6, i8, ((ViewGroup.MarginLayoutParams) c1377f).width);
            iW = AbstractC1397f0.w(true, this.f5677r.g(), this.f13121m, i7, ((ViewGroup.MarginLayoutParams) c1377f).height);
        } else {
            int iW3 = AbstractC1397f0.w(false, iH1, i6, i7, ((ViewGroup.MarginLayoutParams) c1377f).height);
            int iW4 = AbstractC1397f0.w(true, this.f5677r.g(), this.f13120l, i8, ((ViewGroup.MarginLayoutParams) c1377f).width);
            iW = iW3;
            iW2 = iW4;
        }
        g0 g0Var = (g0) view.getLayoutParams();
        if (z5 ? x0(view, iW2, iW, g0Var) : v0(view, iW2, iW, g0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void m1(int i6) {
        if (i6 == this.f5664F) {
            return;
        }
        this.f5663E = true;
        if (i6 < 1) {
            throw new IllegalArgumentException(AbstractC0628i.f("Span count should be at least 1. Provided ", i6));
        }
        this.f5664F = i6;
        this.f5669K.g();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final int n(r0 r0Var) {
        return E0(r0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final int n0(int i6, m0 m0Var, r0 r0Var) {
        n1();
        g1();
        return super.n0(i6, m0Var, r0Var);
    }

    public final void n1() {
        int iD;
        int iG;
        if (this.f5675p == 1) {
            iD = this.f13122n - F();
            iG = E();
        } else {
            iD = this.f13123o - D();
            iG = G();
        }
        f1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final int o(r0 r0Var) {
        return F0(r0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final int p0(int i6, m0 m0Var, r0 r0Var) {
        n1();
        g1();
        return super.p0(i6, m0Var, r0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final g0 r() {
        return this.f5675p == 0 ? new C1377F(-2, -1) : new C1377F(-1, -2);
    }

    @Override // v0.AbstractC1397f0
    public final g0 s(Context context, AttributeSet attributeSet) {
        C1377F c1377f = new C1377F(context, attributeSet);
        c1377f.f13001e = -1;
        c1377f.f13002f = 0;
        return c1377f;
    }

    @Override // v0.AbstractC1397f0
    public final void s0(Rect rect, int i6, int i7) {
        int iG;
        int iG2;
        if (this.f5665G == null) {
            super.s0(rect, i6, i7);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f5675p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f13110b;
            WeakHashMap weakHashMap = V.f1964a;
            iG2 = AbstractC1397f0.g(i7, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f5665G;
            iG = AbstractC1397f0.g(i6, iArr[iArr.length - 1] + iF, this.f13110b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f13110b;
            WeakHashMap weakHashMap2 = V.f1964a;
            iG = AbstractC1397f0.g(i6, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f5665G;
            iG2 = AbstractC1397f0.g(i7, iArr2[iArr2.length - 1] + iD, this.f13110b.getMinimumHeight());
        }
        this.f13110b.setMeasuredDimension(iG, iG2);
    }

    @Override // v0.AbstractC1397f0
    public final g0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1377F c1377f = new C1377F((ViewGroup.MarginLayoutParams) layoutParams);
            c1377f.f13001e = -1;
            c1377f.f13002f = 0;
            return c1377f;
        }
        C1377F c1377f2 = new C1377F(layoutParams);
        c1377f2.f13001e = -1;
        c1377f2.f13002f = 0;
        return c1377f2;
    }

    @Override // v0.AbstractC1397f0
    public final int x(m0 m0Var, r0 r0Var) {
        if (this.f5675p == 1) {
            return this.f5664F;
        }
        if (r0Var.b() < 1) {
            return 0;
        }
        return i1(r0Var.b() - 1, m0Var, r0Var) + 1;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f5663E = false;
        this.f5664F = -1;
        this.f5667I = new SparseIntArray();
        this.f5668J = new SparseIntArray();
        this.f5669K = new Z0();
        this.f5670L = new Rect();
        m1(AbstractC1397f0.I(context, attributeSet, i6, i7).f13100b);
    }
}
