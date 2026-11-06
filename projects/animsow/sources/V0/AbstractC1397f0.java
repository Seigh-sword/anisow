package v0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0289n;
import androidx.recyclerview.widget.RecyclerView;
import h5.C0786m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.AbstractC1356a;

/* JADX INFO: renamed from: v0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1397f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1402k f13109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f13110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0786m f13111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0786m f13112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1383L f13113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13123o;

    public AbstractC1397f0() {
        T1.j jVar = new T1.j(0, this);
        T1.j jVar2 = new T1.j(1, this);
        this.f13111c = new C0786m(jVar);
        this.f13112d = new C0786m(jVar2);
        this.f13114f = false;
        this.f13115g = false;
        this.f13116h = true;
        this.f13117i = true;
    }

    public static int A(View view) {
        Rect rect = ((g0) view.getLayoutParams()).f13126b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((g0) view.getLayoutParams()).f13125a.c();
    }

    public static C1395e0 I(Context context, AttributeSet attributeSet, int i6, int i7) {
        C1395e0 c1395e0 = new C1395e0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1356a.f12813a, i6, i7);
        c1395e0.f13099a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c1395e0.f13100b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c1395e0.f13101c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c1395e0.f13102d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c1395e0;
    }

    public static boolean M(int i6, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (i8 > 0 && i6 != i8) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i6;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i6;
        }
        return true;
    }

    public static void N(View view, int i6, int i7, int i8, int i9) {
        g0 g0Var = (g0) view.getLayoutParams();
        Rect rect = g0Var.f13126b;
        view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) g0Var).leftMargin, i7 + rect.top + ((ViewGroup.MarginLayoutParams) g0Var).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) g0Var).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin);
    }

    public static int g(int i6, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i7, i8) : size : Math.min(size, Math.max(i7, i8));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.AbstractC1397f0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((g0) view.getLayoutParams()).f13126b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.f13110b;
        W adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f13110b;
        WeakHashMap weakHashMap = N.V.f1964a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(m0 m0Var, r0 r0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((g0) view.getLayoutParams()).f13126b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f13110b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f13110b.f5700G;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i6) {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            int iE = recyclerView.f5689A.e();
            for (int i7 = 0; i7 < iE; i7++) {
                recyclerView.f5689A.d(i7).offsetLeftAndRight(i6);
            }
        }
    }

    public void P(int i6) {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            int iE = recyclerView.f5689A.e();
            for (int i7 = 0; i7 < iE; i7++) {
                recyclerView.f5689A.d(i7).offsetTopAndBottom(i6);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i6, m0 m0Var, r0 r0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f13110b;
        m0 m0Var = recyclerView.f5755x;
        r0 r0Var = recyclerView.f5692B0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z5 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f13110b.canScrollVertically(-1) && !this.f13110b.canScrollHorizontally(-1) && !this.f13110b.canScrollHorizontally(1)) {
            z5 = false;
        }
        accessibilityEvent.setScrollable(z5);
        W w5 = this.f13110b.f5702H;
        if (w5 != null) {
            accessibilityEvent.setItemCount(w5.a());
        }
    }

    public final void V(View view, O.i iVar) {
        u0 u0VarI = RecyclerView.I(view);
        if (u0VarI == null || u0VarI.j() || this.f13109a.k(u0VarI.f13248a)) {
            return;
        }
        RecyclerView recyclerView = this.f13110b;
        W(recyclerView.f5755x, recyclerView.f5692B0, view, iVar);
    }

    public final void b(View view, int i6, boolean z5) {
        u0 u0VarI = RecyclerView.I(view);
        if (z5 || u0VarI.j()) {
            this.f13110b.f5691B.c(u0VarI);
        } else {
            this.f13110b.f5691B.n(u0VarI);
        }
        g0 g0Var = (g0) view.getLayoutParams();
        if (u0VarI.r() || u0VarI.k()) {
            if (u0VarI.k()) {
                u0VarI.f13261n.j(u0VarI);
            } else {
                u0VarI.f13257j &= -33;
            }
            this.f13109a.b(view, i6, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f13110b) {
                int iJ = this.f13109a.j(view);
                if (i6 == -1) {
                    i6 = this.f13109a.e();
                }
                if (iJ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f13110b.indexOfChild(view) + this.f13110b.y());
                }
                if (iJ != i6) {
                    AbstractC1397f0 abstractC1397f0 = this.f13110b.f5704I;
                    View viewU = abstractC1397f0.u(iJ);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iJ + abstractC1397f0.f13110b.toString());
                    }
                    abstractC1397f0.u(iJ);
                    abstractC1397f0.f13109a.c(iJ);
                    g0 g0Var2 = (g0) viewU.getLayoutParams();
                    u0 u0VarI2 = RecyclerView.I(viewU);
                    if (u0VarI2.j()) {
                        abstractC1397f0.f13110b.f5691B.c(u0VarI2);
                    } else {
                        abstractC1397f0.f13110b.f5691B.n(u0VarI2);
                    }
                    abstractC1397f0.f13109a.b(viewU, i6, g0Var2, u0VarI2.j());
                }
            } else {
                this.f13109a.a(view, i6, false);
                g0Var.f13127c = true;
                C1383L c1383l = this.f13113e;
                if (c1383l != null && c1383l.f13044e) {
                    c1383l.f13041b.getClass();
                    u0 u0VarI3 = RecyclerView.I(view);
                    if ((u0VarI3 != null ? u0VarI3.c() : -1) == c1383l.f13040a) {
                        c1383l.f13045f = view;
                    }
                }
            }
        }
        if (g0Var.f13128d) {
            u0VarI.f13248a.invalidate();
            g0Var.f13128d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(m0 m0Var, r0 r0Var);

    public abstract boolean d();

    public abstract void d0(r0 r0Var);

    public abstract boolean e();

    public boolean f(g0 g0Var) {
        return g0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(m0 m0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).q()) {
                View viewU = u(iV);
                k0(iV);
                m0Var.f(viewU);
            }
        }
    }

    public final void i0(m0 m0Var) {
        ArrayList arrayList;
        int size = m0Var.f13163a.size();
        int i6 = size - 1;
        while (true) {
            arrayList = m0Var.f13163a;
            if (i6 < 0) {
                break;
            }
            View view = ((u0) arrayList.get(i6)).f13248a;
            u0 u0VarI = RecyclerView.I(view);
            if (!u0VarI.q()) {
                u0VarI.p(false);
                if (u0VarI.l()) {
                    this.f13110b.removeDetachedView(view, false);
                }
                AbstractC1391c0 abstractC1391c0 = this.f13110b.f5740j0;
                if (abstractC1391c0 != null) {
                    abstractC1391c0.d(u0VarI);
                }
                u0VarI.p(true);
                u0 u0VarI2 = RecyclerView.I(view);
                u0VarI2.f13261n = null;
                u0VarI2.f13262o = false;
                u0VarI2.f13257j &= -33;
                m0Var.g(u0VarI2);
            }
            i6--;
        }
        arrayList.clear();
        ArrayList arrayList2 = m0Var.f13164b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f13110b.invalidate();
        }
    }

    public abstract int j(r0 r0Var);

    public final void j0(View view, m0 m0Var) {
        C1402k c1402k = this.f13109a;
        V v5 = (V) c1402k.f13146b;
        int iIndexOfChild = v5.f13070a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C1401j) c1402k.f13147c).f(iIndexOfChild)) {
                c1402k.l(view);
            }
            v5.h(iIndexOfChild);
        }
        m0Var.f(view);
    }

    public abstract int k(r0 r0Var);

    public final void k0(int i6) {
        if (u(i6) != null) {
            C1402k c1402k = this.f13109a;
            int iF = c1402k.f(i6);
            V v5 = (V) c1402k.f13146b;
            View childAt = v5.f13070a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            if (((C1401j) c1402k.f13147c).f(iF)) {
                c1402k.l(childAt);
            }
            v5.h(iF);
        }
    }

    public abstract int l(r0 r0Var);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f13122n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f13123o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto La6
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto Lab
        L74:
            int r11 = r8.E()
            int r13 = r8.G()
            int r3 = r8.f13122n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f13123o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f13110b
            android.graphics.Rect r5 = r5.f5697E
            r8.y(r5, r10)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto Lab
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto Lab
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto Lab
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto Lab
        La6:
            if (r2 != 0) goto Lac
            if (r1 == 0) goto Lab
            goto Lac
        Lab:
            return r0
        Lac:
            if (r12 == 0) goto Lb2
            r9.scrollBy(r2, r1)
            goto Lb5
        Lb2:
            r9.b0(r2, r1, r0)
        Lb5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.AbstractC1397f0.l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int m(r0 r0Var);

    public final void m0() {
        RecyclerView recyclerView = this.f13110b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(r0 r0Var);

    public abstract int n0(int i6, m0 m0Var, r0 r0Var);

    public abstract int o(r0 r0Var);

    public abstract void o0(int i6);

    public final void p(m0 m0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            u0 u0VarI = RecyclerView.I(viewU);
            if (!u0VarI.q()) {
                if (!u0VarI.h() || u0VarI.j() || this.f13110b.f5702H.f13072b) {
                    u(iV);
                    this.f13109a.c(iV);
                    m0Var.h(viewU);
                    this.f13110b.f5691B.n(u0VarI);
                } else {
                    k0(iV);
                    m0Var.g(u0VarI);
                }
            }
        }
    }

    public abstract int p0(int i6, m0 m0Var, r0 r0Var);

    public View q(int i6) {
        int iV = v();
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            u0 u0VarI = RecyclerView.I(viewU);
            if (u0VarI != null && u0VarI.c() == i6 && !u0VarI.q() && (this.f13110b.f5692B0.f13220g || !u0VarI.j())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract g0 r();

    public final void r0(int i6, int i7) {
        this.f13122n = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        this.f13120l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f5686U0;
        }
        this.f13123o = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i7);
        this.f13121m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f5686U0;
        }
    }

    public g0 s(Context context, AttributeSet attributeSet) {
        return new g0(context, attributeSet);
    }

    public void s0(Rect rect, int i6, int i7) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.f13110b;
        WeakHashMap weakHashMap = N.V.f1964a;
        this.f13110b.setMeasuredDimension(g(i6, iF, recyclerView.getMinimumWidth()), g(i7, iD, this.f13110b.getMinimumHeight()));
    }

    public g0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g0 ? new g0((g0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g0((ViewGroup.MarginLayoutParams) layoutParams) : new g0(layoutParams);
    }

    public final void t0(int i6, int i7) {
        int iV = v();
        if (iV == 0) {
            this.f13110b.n(i6, i7);
            return;
        }
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < iV; i12++) {
            View viewU = u(i12);
            Rect rect = this.f13110b.f5697E;
            y(rect, viewU);
            int i13 = rect.left;
            if (i13 < i11) {
                i11 = i13;
            }
            int i14 = rect.right;
            if (i14 > i8) {
                i8 = i14;
            }
            int i15 = rect.top;
            if (i15 < i9) {
                i9 = i15;
            }
            int i16 = rect.bottom;
            if (i16 > i10) {
                i10 = i16;
            }
        }
        this.f13110b.f5697E.set(i11, i9, i8, i10);
        s0(this.f13110b.f5697E, i6, i7);
    }

    public final View u(int i6) {
        C1402k c1402k = this.f13109a;
        if (c1402k != null) {
            return c1402k.d(i6);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.f13110b = null;
            this.f13109a = null;
            height = 0;
            this.f13122n = 0;
        } else {
            this.f13110b = recyclerView;
            this.f13109a = recyclerView.f5689A;
            this.f13122n = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.f13123o = height;
        this.f13120l = 1073741824;
        this.f13121m = 1073741824;
    }

    public final int v() {
        C1402k c1402k = this.f13109a;
        if (c1402k != null) {
            return c1402k.e();
        }
        return 0;
    }

    public final boolean v0(View view, int i6, int i7, g0 g0Var) {
        return (!view.isLayoutRequested() && this.f13116h && M(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) g0Var).width) && M(view.getHeight(), i7, ((ViewGroup.MarginLayoutParams) g0Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(m0 m0Var, r0 r0Var) {
        return -1;
    }

    public final boolean x0(View view, int i6, int i7, g0 g0Var) {
        return (this.f13116h && M(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) g0Var).width) && M(view.getMeasuredHeight(), i7, ((ViewGroup.MarginLayoutParams) g0Var).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.f5686U0;
        g0 g0Var = (g0) view.getLayoutParams();
        Rect rect2 = g0Var.f13126b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) g0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) g0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i6);

    public final void z0(C1383L c1383l) {
        C1383L c1383l2 = this.f13113e;
        if (c1383l2 != null && c1383l != c1383l2 && c1383l2.f13044e) {
            c1383l2.i();
        }
        this.f13113e = c1383l;
        RecyclerView recyclerView = this.f13110b;
        t0 t0Var = recyclerView.f5758y0;
        t0Var.f13235C.removeCallbacks(t0Var);
        t0Var.f13238y.abortAnimation();
        if (c1383l.f13047h) {
            Log.w("RecyclerView", "An instance of " + c1383l.getClass().getSimpleName() + " was started more than once. Each instance of" + c1383l.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c1383l.f13041b = recyclerView;
        c1383l.f13042c = this;
        int i6 = c1383l.f13040a;
        if (i6 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f5692B0.f13214a = i6;
        c1383l.f13044e = true;
        c1383l.f13043d = true;
        c1383l.f13045f = recyclerView.f5704I.q(i6);
        c1383l.f13041b.f5758y0.a();
        c1383l.f13047h = true;
    }

    public void Q() {
    }

    public void Y() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i6) {
    }

    public void X(int i6, int i7) {
    }

    public void Z(int i6, int i7) {
    }

    public void a0(int i6, int i7) {
    }

    public void b0(int i6, int i7) {
    }

    public void i(int i6, C0289n c0289n) {
    }

    public void W(m0 m0Var, r0 r0Var, View view, O.i iVar) {
    }

    public void h(int i6, int i7, r0 r0Var, C0289n c0289n) {
    }
}
