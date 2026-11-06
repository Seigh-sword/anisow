package androidx.recyclerview.widget;

import J.l;
import N.C0104o;
import N.I;
import N.L;
import V.d;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.C0289n;
import h5.C0786m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.L0;
import s.C1283e;
import u.h;
import u0.AbstractC1356a;
import v0.AbstractC1391c0;
import v0.AbstractC1393d0;
import v0.AbstractC1397f0;
import v0.C1374C;
import v0.C1383L;
import v0.C1386a;
import v0.C1387a0;
import v0.C1388b;
import v0.C1389b0;
import v0.C1401j;
import v0.C1402k;
import v0.F0;
import v0.RunnableC1376E;
import v0.U;
import v0.V;
import v0.W;
import v0.Z;
import v0.g0;
import v0.h0;
import v0.i0;
import v0.j0;
import v0.k0;
import v0.l0;
import v0.m0;
import v0.n0;
import v0.o0;
import v0.r;
import v0.r0;
import v0.s0;
import v0.t0;
import v0.u0;
import v0.w0;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final int[] f5686U0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final Class[] f5687V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final d f5688W0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1402k f5689A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C0289n f5690A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0786m f5691B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final r0 f5692B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5693C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public j0 f5694C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final U f5695D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList f5696D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f5697E;
    public boolean E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f5698F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f5699F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RectF f5700G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final V f5701G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public W f5702H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f5703H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC1397f0 f5704I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public w0 f5705I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList f5706J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int[] f5707J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ArrayList f5708K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C0104o f5709K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f5710L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final int[] f5711L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i0 f5712M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final int[] f5713M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f5714N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final int[] f5715N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f5716O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final ArrayList f5717O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f5718P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final U f5719P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5720Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f5721Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f5722R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f5723R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f5724S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f5725S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f5726T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final V f5727T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f5728U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f5729V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final AccessibilityManager f5730W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f5731a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f5732b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f5733c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f5734d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C1387a0 f5735e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EdgeEffect f5736f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public EdgeEffect f5737g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public EdgeEffect f5738h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public EdgeEffect f5739i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public AbstractC1391c0 f5740j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f5741k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f5742l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public VelocityTracker f5743m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f5744n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f5745o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f5746p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f5747q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f5748r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public h0 f5749s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f5750t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f5751u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final float f5752v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L0 f5753w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final float f5754w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m0 f5755x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f5756x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o0 f5757y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t0 f5758y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1388b f5759z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public RunnableC1376E f5760z0;

    static {
        Class cls = Integer.TYPE;
        f5687V0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5688W0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.xo.anilab.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i6));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static u0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((g0) view.getLayoutParams()).f13125a;
    }

    private C0104o getScrollingChildHelper() {
        if (this.f5709K0 == null) {
            this.f5709K0 = new C0104o(this);
        }
        return this.f5709K0;
    }

    public static void j(u0 u0Var) {
        WeakReference weakReference = u0Var.f13249b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == u0Var.f13248a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                u0Var.f13249b = null;
                return;
            }
        }
    }

    public final View A(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z5;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f5710L;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            i0 i0Var = (i0) arrayList.get(i6);
            C1374C c1374c = (C1374C) i0Var;
            int i7 = c1374c.f12974v;
            if (i7 == 1) {
                boolean zD = c1374c.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = c1374c.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        c1374c.f12975w = 1;
                        c1374c.f12968p = (int) motionEvent.getX();
                    } else if (zD) {
                        c1374c.f12975w = 2;
                        c1374c.f12965m = (int) motionEvent.getY();
                    }
                    c1374c.f(2);
                }
            } else {
                z5 = i7 == 2;
            }
            if (z5 && action != 3) {
                this.f5712M = i0Var;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int iE = this.f5689A.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < iE; i8++) {
            u0 u0VarI = I(this.f5689A.d(i8));
            if (!u0VarI.q()) {
                int iC = u0VarI.c();
                if (iC < i6) {
                    i6 = iC;
                }
                if (iC > i7) {
                    i7 = iC;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    public final u0 E(int i6) {
        u0 u0Var = null;
        if (this.f5731a0) {
            return null;
        }
        int iH = this.f5689A.h();
        for (int i7 = 0; i7 < iH; i7++) {
            u0 u0VarI = I(this.f5689A.g(i7));
            if (u0VarI != null && !u0VarI.j() && F(u0VarI) == i6) {
                if (!this.f5689A.k(u0VarI.f13248a)) {
                    return u0VarI;
                }
                u0Var = u0VarI;
            }
        }
        return u0Var;
    }

    public final int F(u0 u0Var) {
        if (u0Var.e(524) || !u0Var.g()) {
            return -1;
        }
        C1388b c1388b = this.f5759z;
        int i6 = u0Var.f13250c;
        ArrayList arrayList = c1388b.f13079b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1386a c1386a = (C1386a) arrayList.get(i7);
            int i8 = c1386a.f13074a;
            if (i8 != 1) {
                if (i8 == 2) {
                    int i9 = c1386a.f13075b;
                    if (i9 <= i6) {
                        int i10 = c1386a.f13077d;
                        if (i9 + i10 > i6) {
                            return -1;
                        }
                        i6 -= i10;
                    } else {
                        continue;
                    }
                } else if (i8 == 8) {
                    int i11 = c1386a.f13075b;
                    if (i11 == i6) {
                        i6 = c1386a.f13077d;
                    } else {
                        if (i11 < i6) {
                            i6--;
                        }
                        if (c1386a.f13077d <= i6) {
                            i6++;
                        }
                    }
                }
            } else if (c1386a.f13075b <= i6) {
                i6 += c1386a.f13077d;
            }
        }
        return i6;
    }

    public final long G(u0 u0Var) {
        return this.f5702H.f13072b ? u0Var.f13252e : u0Var.f13250c;
    }

    public final u0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        g0 g0Var = (g0) view.getLayoutParams();
        boolean z5 = g0Var.f13127c;
        Rect rect = g0Var.f13126b;
        if (!z5) {
            return rect;
        }
        if (this.f5692B0.f13220g && (g0Var.f13125a.m() || g0Var.f13125a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f5708K;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Rect rect2 = this.f5697E;
            rect2.set(0, 0, 0, 0);
            ((AbstractC1393d0) arrayList.get(i6)).getClass();
            ((g0) view.getLayoutParams()).f13125a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        g0Var.f13127c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f5718P || this.f5731a0 || this.f5759z.g();
    }

    public final boolean L() {
        return this.f5733c0 > 0;
    }

    public final void M(int i6) {
        if (this.f5704I == null) {
            return;
        }
        setScrollState(2);
        this.f5704I.o0(i6);
        awakenScrollBars();
    }

    public final void N() {
        int iH = this.f5689A.h();
        for (int i6 = 0; i6 < iH; i6++) {
            ((g0) this.f5689A.g(i6).getLayoutParams()).f13127c = true;
        }
        ArrayList arrayList = this.f5755x.f13165c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            g0 g0Var = (g0) ((u0) arrayList.get(i7)).f13248a.getLayoutParams();
            if (g0Var != null) {
                g0Var.f13127c = true;
            }
        }
    }

    public final void O(int i6, int i7, boolean z5) {
        int i8 = i6 + i7;
        int iH = this.f5689A.h();
        for (int i9 = 0; i9 < iH; i9++) {
            u0 u0VarI = I(this.f5689A.g(i9));
            if (u0VarI != null && !u0VarI.q()) {
                int i10 = u0VarI.f13250c;
                r0 r0Var = this.f5692B0;
                if (i10 >= i8) {
                    u0VarI.n(-i7, z5);
                    r0Var.f13219f = true;
                } else if (i10 >= i6) {
                    u0VarI.b(8);
                    u0VarI.n(-i7, z5);
                    u0VarI.f13250c = i6 - 1;
                    r0Var.f13219f = true;
                }
            }
        }
        m0 m0Var = this.f5755x;
        ArrayList arrayList = m0Var.f13165c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u0 u0Var = (u0) arrayList.get(size);
            if (u0Var != null) {
                int i11 = u0Var.f13250c;
                if (i11 >= i8) {
                    u0Var.n(-i7, z5);
                } else if (i11 >= i6) {
                    u0Var.b(8);
                    m0Var.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f5733c0++;
    }

    public final void Q(boolean z5) {
        int i6;
        AccessibilityManager accessibilityManager;
        int i7 = this.f5733c0 - 1;
        this.f5733c0 = i7;
        if (i7 < 1) {
            this.f5733c0 = 0;
            if (z5) {
                int i8 = this.f5728U;
                this.f5728U = 0;
                if (i8 != 0 && (accessibilityManager = this.f5730W) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i8);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f5717O0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    u0 u0Var = (u0) arrayList.get(size);
                    if (u0Var.f13248a.getParent() == this && !u0Var.q() && (i6 = u0Var.f13264q) != -1) {
                        WeakHashMap weakHashMap = N.V.f1964a;
                        u0Var.f13248a.setImportantForAccessibility(i6);
                        u0Var.f13264q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5742l0) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f5742l0 = motionEvent.getPointerId(i6);
            int x5 = (int) (motionEvent.getX(i6) + 0.5f);
            this.f5746p0 = x5;
            this.f5744n0 = x5;
            int y5 = (int) (motionEvent.getY(i6) + 0.5f);
            this.f5747q0 = y5;
            this.f5745o0 = y5;
        }
    }

    public final void S() {
        if (this.f5703H0 || !this.f5714N) {
            return;
        }
        WeakHashMap weakHashMap = N.V.f1964a;
        postOnAnimation(this.f5719P0);
        this.f5703H0 = true;
    }

    public final void T() {
        boolean z5;
        boolean z6 = false;
        if (this.f5731a0) {
            C1388b c1388b = this.f5759z;
            c1388b.l(c1388b.f13079b);
            c1388b.l(c1388b.f13080c);
            c1388b.f13083f = 0;
            if (this.f5732b0) {
                this.f5704I.Y();
            }
        }
        if (this.f5740j0 == null || !this.f5704I.A0()) {
            this.f5759z.c();
        } else {
            this.f5759z.j();
        }
        boolean z7 = this.E0 || this.f5699F0;
        boolean z8 = this.f5718P && this.f5740j0 != null && ((z5 = this.f5731a0) || z7 || this.f5704I.f13114f) && (!z5 || this.f5702H.f13072b);
        r0 r0Var = this.f5692B0;
        r0Var.f13223j = z8;
        if (z8 && z7 && !this.f5731a0 && this.f5740j0 != null && this.f5704I.A0()) {
            z6 = true;
        }
        r0Var.f13224k = z6;
    }

    public final void U(boolean z5) {
        this.f5732b0 = z5 | this.f5732b0;
        this.f5731a0 = true;
        int iH = this.f5689A.h();
        for (int i6 = 0; i6 < iH; i6++) {
            u0 u0VarI = I(this.f5689A.g(i6));
            if (u0VarI != null && !u0VarI.q()) {
                u0VarI.b(6);
            }
        }
        N();
        m0 m0Var = this.f5755x;
        ArrayList arrayList = m0Var.f13165c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            u0 u0Var = (u0) arrayList.get(i7);
            if (u0Var != null) {
                u0Var.b(6);
                u0Var.a(null);
            }
        }
        W w5 = m0Var.f13170h.f5702H;
        if (w5 == null || !w5.f13072b) {
            m0Var.d();
        }
    }

    public final void V(u0 u0Var, C1389b0 c1389b0) {
        u0Var.f13257j &= -8193;
        boolean z5 = this.f5692B0.f13221h;
        C0786m c0786m = this.f5691B;
        if (z5 && u0Var.m() && !u0Var.j() && !u0Var.q()) {
            ((C1283e) c0786m.f9113c).i(G(u0Var), u0Var);
        }
        c0786m.e(u0Var, c1389b0);
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5697E;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g0) {
            g0 g0Var = (g0) layoutParams;
            if (!g0Var.f13127c) {
                int i6 = rect.left;
                Rect rect2 = g0Var.f13126b;
                rect.left = i6 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f5704I.l0(this, view, this.f5697E, !this.f5718P, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f5743m0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        f0(0);
        EdgeEffect edgeEffect = this.f5736f0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f5736f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5737g0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f5737g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5738h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f5738h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5739i0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f5739i0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = N.V.f1964a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int i6, int i7, int[] iArr) {
        u0 u0Var;
        d0();
        P();
        int i8 = l.f1168a;
        Trace.beginSection("RV Scroll");
        r0 r0Var = this.f5692B0;
        z(r0Var);
        m0 m0Var = this.f5755x;
        int iN0 = i6 != 0 ? this.f5704I.n0(i6, m0Var, r0Var) : 0;
        int iP0 = i7 != 0 ? this.f5704I.p0(i7, m0Var, r0Var) : 0;
        Trace.endSection();
        int iE = this.f5689A.e();
        for (int i9 = 0; i9 < iE; i9++) {
            View viewD = this.f5689A.d(i9);
            u0 u0VarH = H(viewD);
            if (u0VarH != null && (u0Var = u0VarH.f13256i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = u0Var.f13248a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        e0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    public final void a0(int i6) {
        C1383L c1383l;
        if (this.f5724S) {
            return;
        }
        setScrollState(0);
        t0 t0Var = this.f5758y0;
        t0Var.f13235C.removeCallbacks(t0Var);
        t0Var.f13238y.abortAnimation();
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && (c1383l = abstractC1397f0.f13113e) != null) {
            c1383l.i();
        }
        AbstractC1397f0 abstractC1397f02 = this.f5704I;
        if (abstractC1397f02 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1397f02.o0(i6);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i6, int i7) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null) {
            abstractC1397f0.getClass();
        }
        super.addFocusables(arrayList, i6, i7);
    }

    public final void b0(int i6, int i7, boolean z5) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5724S) {
            return;
        }
        if (!abstractC1397f0.d()) {
            i6 = 0;
        }
        if (!this.f5704I.e()) {
            i7 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            return;
        }
        if (z5) {
            int i8 = i6 != 0 ? 1 : 0;
            if (i7 != 0) {
                i8 |= 2;
            }
            getScrollingChildHelper().h(i8, 1);
        }
        this.f5758y0.b(i6, i7, Integer.MIN_VALUE, null);
    }

    public final void c0(int i6) {
        if (this.f5724S) {
            return;
        }
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1397f0.y0(this, i6);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g0) && this.f5704I.f((g0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && abstractC1397f0.d()) {
            return this.f5704I.j(this.f5692B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && abstractC1397f0.d()) {
            return this.f5704I.k(this.f5692B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && abstractC1397f0.d()) {
            return this.f5704I.l(this.f5692B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && abstractC1397f0.e()) {
            return this.f5704I.m(this.f5692B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && abstractC1397f0.e()) {
            return this.f5704I.n(this.f5692B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && abstractC1397f0.e()) {
            return this.f5704I.o(this.f5692B0);
        }
        return 0;
    }

    public final void d0() {
        int i6 = this.f5720Q + 1;
        this.f5720Q = i6;
        if (i6 != 1 || this.f5724S) {
            return;
        }
        this.f5722R = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return getScrollingChildHelper().a(f6, f7, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().e(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z5;
        float paddingRight;
        float paddingBottom;
        super.draw(canvas);
        ArrayList arrayList = this.f5708K;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC1393d0) arrayList.get(i6)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f5736f0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f5693C ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.f5736f0;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f5737g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f5693C) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5737g0;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f5738h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5693C ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5738h0;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f5739i0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5693C) {
                paddingRight = getPaddingRight() + (-getWidth());
                paddingBottom = getPaddingBottom() + (-getHeight());
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f5739i0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(iSave4);
        }
        if ((z5 || this.f5740j0 == null || arrayList.size() <= 0 || !this.f5740j0.f()) && !z5) {
            return;
        }
        WeakHashMap weakHashMap = N.V.f1964a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void e0(boolean z5) {
        if (this.f5720Q < 1) {
            this.f5720Q = 1;
        }
        if (!z5 && !this.f5724S) {
            this.f5722R = false;
        }
        if (this.f5720Q == 1) {
            if (z5 && this.f5722R && !this.f5724S && this.f5704I != null && this.f5702H != null) {
                o();
            }
            if (!this.f5724S) {
                this.f5722R = false;
            }
        }
        this.f5720Q--;
    }

    public final void f(u0 u0Var) {
        View view = u0Var.f13248a;
        boolean z5 = view.getParent() == this;
        this.f5755x.j(H(view));
        if (u0Var.l()) {
            this.f5689A.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z5) {
            this.f5689A.a(view, -1, true);
            return;
        }
        C1402k c1402k = this.f5689A;
        int iIndexOfChild = ((V) c1402k.f13146b).f13070a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C1401j) c1402k.f13147c).i(iIndexOfChild);
            c1402k.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(int i6) {
        getScrollingChildHelper().i(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(AbstractC1393d0 abstractC1393d0) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null) {
            abstractC1397f0.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5708K;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1393d0);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null) {
            return abstractC1397f0.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null) {
            return abstractC1397f0.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public W getAdapter() {
        return this.f5702H;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 == null) {
            return super.getBaseline();
        }
        abstractC1397f0.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        return super.getChildDrawingOrder(i6, i7);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5693C;
    }

    public w0 getCompatAccessibilityDelegate() {
        return this.f5705I0;
    }

    public C1387a0 getEdgeEffectFactory() {
        return this.f5735e0;
    }

    public AbstractC1391c0 getItemAnimator() {
        return this.f5740j0;
    }

    public int getItemDecorationCount() {
        return this.f5708K.size();
    }

    public AbstractC1397f0 getLayoutManager() {
        return this.f5704I;
    }

    public int getMaxFlingVelocity() {
        return this.f5751u0;
    }

    public int getMinFlingVelocity() {
        return this.f5750t0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public h0 getOnFlingListener() {
        return this.f5749s0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5756x0;
    }

    public l0 getRecycledViewPool() {
        return this.f5755x.c();
    }

    public int getScrollState() {
        return this.f5741k0;
    }

    public final void h(j0 j0Var) {
        if (this.f5696D0 == null) {
            this.f5696D0 = new ArrayList();
        }
        this.f5696D0.add(j0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f5734d0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f5714N;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5724S;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2029d;
    }

    public final void k() {
        int iH = this.f5689A.h();
        for (int i6 = 0; i6 < iH; i6++) {
            u0 u0VarI = I(this.f5689A.g(i6));
            if (!u0VarI.q()) {
                u0VarI.f13251d = -1;
                u0VarI.f13254g = -1;
            }
        }
        m0 m0Var = this.f5755x;
        ArrayList arrayList = m0Var.f13165c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            u0 u0Var = (u0) arrayList.get(i7);
            u0Var.f13251d = -1;
            u0Var.f13254g = -1;
        }
        ArrayList arrayList2 = m0Var.f13163a;
        int size2 = arrayList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            u0 u0Var2 = (u0) arrayList2.get(i8);
            u0Var2.f13251d = -1;
            u0Var2.f13254g = -1;
        }
        ArrayList arrayList3 = m0Var.f13164b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                u0 u0Var3 = (u0) m0Var.f13164b.get(i9);
                u0Var3.f13251d = -1;
                u0Var3.f13254g = -1;
            }
        }
    }

    public final void l(int i6, int i7) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5736f0;
        if (edgeEffect == null || edgeEffect.isFinished() || i6 <= 0) {
            zIsFinished = false;
        } else {
            this.f5736f0.onRelease();
            zIsFinished = this.f5736f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5738h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.f5738h0.onRelease();
            zIsFinished |= this.f5738h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5737g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i7 > 0) {
            this.f5737g0.onRelease();
            zIsFinished |= this.f5737g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5739i0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i7 < 0) {
            this.f5739i0.onRelease();
            zIsFinished |= this.f5739i0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = N.V.f1964a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f5718P || this.f5731a0) {
            int i6 = l.f1168a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (this.f5759z.g()) {
            C1388b c1388b = this.f5759z;
            int i7 = c1388b.f13083f;
            if ((i7 & 4) != 0 && (i7 & 11) == 0) {
                int i8 = l.f1168a;
                Trace.beginSection("RV PartialInvalidate");
                d0();
                P();
                this.f5759z.j();
                if (!this.f5722R) {
                    int iE = this.f5689A.e();
                    int i9 = 0;
                    while (true) {
                        if (i9 < iE) {
                            u0 u0VarI = I(this.f5689A.d(i9));
                            if (u0VarI != null && !u0VarI.q() && u0VarI.m()) {
                                o();
                                break;
                            }
                            i9++;
                        } else {
                            this.f5759z.b();
                            break;
                        }
                    }
                }
                e0(true);
                Q(true);
            } else {
                if (!c1388b.g()) {
                    return;
                }
                int i10 = l.f1168a;
                Trace.beginSection("RV FullInvalidate");
                o();
            }
            Trace.endSection();
        }
    }

    public final void n(int i6, int i7) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = N.V.f1964a;
        setMeasuredDimension(AbstractC1397f0.g(i6, paddingRight, getMinimumWidth()), AbstractC1397f0.g(i7, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [v0.u0] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f5733c0 = r0
            r1 = 1
            r5.f5714N = r1
            boolean r2 = r5.f5718P
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f5718P = r2
            v0.f0 r2 = r5.f5704I
            if (r2 == 0) goto L21
            r2.f13115g = r1
            r2.R(r5)
        L21:
            r5.f5703H0 = r0
            java.lang.ThreadLocal r0 = v0.RunnableC1376E.f12995A
            java.lang.Object r1 = r0.get()
            v0.E r1 = (v0.RunnableC1376E) r1
            r5.f5760z0 = r1
            if (r1 != 0) goto L6b
            v0.E r1 = new v0.E
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12997w = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f13000z = r2
            r5.f5760z0 = r1
            java.util.WeakHashMap r1 = N.V.f1964a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            v0.E r2 = r5.f5760z0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f12999y = r3
            r0.set(r2)
        L6b:
            v0.E r0 = r5.f5760z0
            java.util.ArrayList r0 = r0.f12997w
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1383L c1383l;
        super.onDetachedFromWindow();
        AbstractC1391c0 abstractC1391c0 = this.f5740j0;
        if (abstractC1391c0 != null) {
            abstractC1391c0.e();
        }
        setScrollState(0);
        t0 t0Var = this.f5758y0;
        t0Var.f13235C.removeCallbacks(t0Var);
        t0Var.f13238y.abortAnimation();
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null && (c1383l = abstractC1397f0.f13113e) != null) {
            c1383l.i();
        }
        this.f5714N = false;
        AbstractC1397f0 abstractC1397f02 = this.f5704I;
        if (abstractC1397f02 != null) {
            abstractC1397f02.f13115g = false;
            abstractC1397f02.S(this);
        }
        this.f5717O0.clear();
        removeCallbacks(this.f5719P0);
        this.f5691B.getClass();
        while (F0.f13003d.h() != null) {
        }
        RunnableC1376E runnableC1376E = this.f5760z0;
        if (runnableC1376E != null) {
            runnableC1376E.f12997w.remove(this);
            this.f5760z0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5708K;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC1393d0) arrayList.get(i6)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (this.f5724S) {
            return false;
        }
        this.f5712M = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 == null) {
            return false;
        }
        boolean zD = abstractC1397f0.d();
        boolean zE = this.f5704I.e();
        if (this.f5743m0 == null) {
            this.f5743m0 = VelocityTracker.obtain();
        }
        this.f5743m0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5726T) {
                this.f5726T = false;
            }
            this.f5742l0 = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.f5746p0 = x5;
            this.f5744n0 = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.f5747q0 = y5;
            this.f5745o0 = y5;
            if (this.f5741k0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f0(1);
            }
            int[] iArr = this.f5713M0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i6 = zD;
            if (zE) {
                i6 = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i6, 0);
        } else if (actionMasked == 1) {
            this.f5743m0.clear();
            f0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f5742l0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5742l0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x6 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f5741k0 != 1) {
                int i7 = x6 - this.f5744n0;
                int i8 = y6 - this.f5745o0;
                if (!zD || Math.abs(i7) <= this.f5748r0) {
                    z5 = false;
                } else {
                    this.f5746p0 = x6;
                    z5 = true;
                }
                if (zE && Math.abs(i8) > this.f5748r0) {
                    this.f5747q0 = y6;
                } else if (z5) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f5742l0 = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5746p0 = x7;
            this.f5744n0 = x7;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5747q0 = y7;
            this.f5745o0 = y7;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f5741k0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int i10 = l.f1168a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f5718P = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 == null) {
            n(i6, i7);
            return;
        }
        boolean zL = abstractC1397f0.L();
        boolean z5 = false;
        r0 r0Var = this.f5692B0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f5704I.f13110b.n(i6, i7);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.f5721Q0 = z5;
            if (z5 || this.f5702H == null) {
                return;
            }
            if (r0Var.f13217d == 1) {
                p();
            }
            this.f5704I.r0(i6, i7);
            r0Var.f13222i = true;
            q();
            this.f5704I.t0(i6, i7);
            if (this.f5704I.w0()) {
                this.f5704I.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                r0Var.f13222i = true;
                q();
                this.f5704I.t0(i6, i7);
            }
            this.f5723R0 = getMeasuredWidth();
            this.f5725S0 = getMeasuredHeight();
            return;
        }
        if (this.f5716O) {
            this.f5704I.f13110b.n(i6, i7);
            return;
        }
        if (this.f5729V) {
            d0();
            P();
            T();
            Q(true);
            if (r0Var.f13224k) {
                r0Var.f13220g = true;
            } else {
                this.f5759z.c();
                r0Var.f13220g = false;
            }
            this.f5729V = false;
            e0(false);
        } else if (r0Var.f13224k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        W w5 = this.f5702H;
        if (w5 != null) {
            r0Var.f13218e = w5.a();
        } else {
            r0Var.f13218e = 0;
        }
        d0();
        this.f5704I.f13110b.n(i6, i7);
        e0(false);
        r0Var.f13220g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0 o0Var = (o0) parcelable;
        this.f5757y = o0Var;
        super.onRestoreInstanceState(o0Var.f3569w);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o0 o0Var = new o0(super.onSaveInstanceState());
        o0 o0Var2 = this.f5757y;
        if (o0Var2 != null) {
            o0Var.f13182y = o0Var2.f13182y;
        } else {
            AbstractC1397f0 abstractC1397f0 = this.f5704I;
            o0Var.f13182y = abstractC1397f0 != null ? abstractC1397f0.f0() : null;
        }
        return o0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i6 == i8 && i7 == i9) {
            return;
        }
        this.f5739i0 = null;
        this.f5737g0 = null;
        this.f5738h0 = null;
        this.f5736f0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9 A[PHI: r0
      0x00e9: PHI (r0v58 int) = (r0v45 int), (r0v62 int) binds: [B:44:0x00d4, B:49:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        d0();
        P();
        r0 r0Var = this.f5692B0;
        r0Var.a(6);
        this.f5759z.c();
        r0Var.f13218e = this.f5702H.a();
        r0Var.f13216c = 0;
        if (this.f5757y != null) {
            W w5 = this.f5702H;
            int iB = h.b(w5.f13073c);
            if (iB == 1 ? w5.a() > 0 : iB != 2) {
                Parcelable parcelable = this.f5757y.f13182y;
                if (parcelable != null) {
                    this.f5704I.e0(parcelable);
                }
                this.f5757y = null;
            }
        }
        r0Var.f13220g = false;
        this.f5704I.c0(this.f5755x, r0Var);
        r0Var.f13219f = false;
        r0Var.f13223j = r0Var.f13223j && this.f5740j0 != null;
        r0Var.f13217d = 4;
        Q(true);
        e0(false);
    }

    public final boolean r(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z5) {
        u0 u0VarI = I(view);
        if (u0VarI != null) {
            if (u0VarI.l()) {
                u0VarI.f13257j &= -257;
            } else if (!u0VarI.q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + u0VarI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C1383L c1383l = this.f5704I.f13113e;
        if ((c1383l == null || !c1383l.f13044e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.f5704I.l0(this, view, rect, z5, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        ArrayList arrayList = this.f5710L;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((i0) arrayList.get(i6)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5720Q != 0 || this.f5724S) {
            this.f5722R = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().e(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i6, int i7) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5724S) {
            return;
        }
        boolean zD = abstractC1397f0.d();
        boolean zE = this.f5704I.e();
        if (zD || zE) {
            if (!zD) {
                i6 = 0;
            }
            if (!zE) {
                i7 = 0;
            }
            Y(i6, i7, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i7) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f5728U |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(w0 w0Var) {
        this.f5705I0 = w0Var;
        N.V.l(this, w0Var);
    }

    public void setAdapter(W w5) {
        setLayoutFrozen(false);
        W w6 = this.f5702H;
        L0 l02 = this.f5753w;
        if (w6 != null) {
            w6.f13071a.unregisterObserver(l02);
            this.f5702H.getClass();
        }
        AbstractC1391c0 abstractC1391c0 = this.f5740j0;
        if (abstractC1391c0 != null) {
            abstractC1391c0.e();
        }
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        m0 m0Var = this.f5755x;
        if (abstractC1397f0 != null) {
            abstractC1397f0.h0(m0Var);
            this.f5704I.i0(m0Var);
        }
        m0Var.f13163a.clear();
        m0Var.d();
        C1388b c1388b = this.f5759z;
        c1388b.l(c1388b.f13079b);
        c1388b.l(c1388b.f13080c);
        c1388b.f13083f = 0;
        W w7 = this.f5702H;
        this.f5702H = w5;
        if (w5 != null) {
            w5.f13071a.registerObserver(l02);
        }
        AbstractC1397f0 abstractC1397f02 = this.f5704I;
        if (abstractC1397f02 != null) {
            abstractC1397f02.Q();
        }
        W w8 = this.f5702H;
        m0Var.f13163a.clear();
        m0Var.d();
        l0 l0VarC = m0Var.c();
        if (w7 != null) {
            l0VarC.f13157b--;
        }
        if (l0VarC.f13157b == 0) {
            int i6 = 0;
            while (true) {
                SparseArray sparseArray = l0VarC.f13156a;
                if (i6 >= sparseArray.size()) {
                    break;
                }
                ((k0) sparseArray.valueAt(i6)).f13149a.clear();
                i6++;
            }
        }
        if (w8 != null) {
            l0VarC.f13157b++;
        }
        this.f5692B0.f13219f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(Z z5) {
        if (z5 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.f5693C) {
            this.f5739i0 = null;
            this.f5737g0 = null;
            this.f5738h0 = null;
            this.f5736f0 = null;
        }
        this.f5693C = z5;
        super.setClipToPadding(z5);
        if (this.f5718P) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1387a0 c1387a0) {
        c1387a0.getClass();
        this.f5735e0 = c1387a0;
        this.f5739i0 = null;
        this.f5737g0 = null;
        this.f5738h0 = null;
        this.f5736f0 = null;
    }

    public void setHasFixedSize(boolean z5) {
        this.f5716O = z5;
    }

    public void setItemAnimator(AbstractC1391c0 abstractC1391c0) {
        AbstractC1391c0 abstractC1391c02 = this.f5740j0;
        if (abstractC1391c02 != null) {
            abstractC1391c02.e();
            this.f5740j0.f13089a = null;
        }
        this.f5740j0 = abstractC1391c0;
        if (abstractC1391c0 != null) {
            abstractC1391c0.f13089a = this.f5701G0;
        }
    }

    public void setItemViewCacheSize(int i6) {
        m0 m0Var = this.f5755x;
        m0Var.f13167e = i6;
        m0Var.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(AbstractC1397f0 abstractC1397f0) {
        V v5;
        C1383L c1383l;
        if (abstractC1397f0 == this.f5704I) {
            return;
        }
        setScrollState(0);
        t0 t0Var = this.f5758y0;
        t0Var.f13235C.removeCallbacks(t0Var);
        t0Var.f13238y.abortAnimation();
        AbstractC1397f0 abstractC1397f02 = this.f5704I;
        if (abstractC1397f02 != null && (c1383l = abstractC1397f02.f13113e) != null) {
            c1383l.i();
        }
        AbstractC1397f0 abstractC1397f03 = this.f5704I;
        m0 m0Var = this.f5755x;
        if (abstractC1397f03 != null) {
            AbstractC1391c0 abstractC1391c0 = this.f5740j0;
            if (abstractC1391c0 != null) {
                abstractC1391c0.e();
            }
            this.f5704I.h0(m0Var);
            this.f5704I.i0(m0Var);
            m0Var.f13163a.clear();
            m0Var.d();
            if (this.f5714N) {
                AbstractC1397f0 abstractC1397f04 = this.f5704I;
                abstractC1397f04.f13115g = false;
                abstractC1397f04.S(this);
            }
            this.f5704I.u0(null);
            this.f5704I = null;
        } else {
            m0Var.f13163a.clear();
            m0Var.d();
        }
        C1402k c1402k = this.f5689A;
        ((C1401j) c1402k.f13147c).h();
        List list = (List) c1402k.f13148d;
        int size = list.size() - 1;
        while (true) {
            v5 = (V) c1402k.f13146b;
            if (size < 0) {
                break;
            }
            View view = (View) list.get(size);
            v5.getClass();
            u0 u0VarI = I(view);
            if (u0VarI != null) {
                int i6 = u0VarI.f13263p;
                RecyclerView recyclerView = v5.f13070a;
                if (recyclerView.L()) {
                    u0VarI.f13264q = i6;
                    recyclerView.f5717O0.add(u0VarI);
                } else {
                    WeakHashMap weakHashMap = N.V.f1964a;
                    u0VarI.f13248a.setImportantForAccessibility(i6);
                }
                u0VarI.f13263p = 0;
            }
            list.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = v5.f13070a;
        int childCount = recyclerView2.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView2.getChildAt(i7);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f5704I = abstractC1397f0;
        if (abstractC1397f0 != null) {
            if (abstractC1397f0.f13110b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC1397f0 + " is already attached to a RecyclerView:" + abstractC1397f0.f13110b.y());
            }
            abstractC1397f0.u0(this);
            if (this.f5714N) {
                AbstractC1397f0 abstractC1397f05 = this.f5704I;
                abstractC1397f05.f13115g = true;
                abstractC1397f05.R(this);
            }
        }
        m0Var.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        C0104o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2029d) {
            WeakHashMap weakHashMap = N.V.f1964a;
            I.z(scrollingChildHelper.f2028c);
        }
        scrollingChildHelper.f2029d = z5;
    }

    public void setOnFlingListener(h0 h0Var) {
        this.f5749s0 = h0Var;
    }

    @Deprecated
    public void setOnScrollListener(j0 j0Var) {
        this.f5694C0 = j0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.f5756x0 = z5;
    }

    public void setRecycledViewPool(l0 l0Var) {
        m0 m0Var = this.f5755x;
        if (m0Var.f13169g != null) {
            r1.f13157b--;
        }
        m0Var.f13169g = l0Var;
        if (l0Var == null || m0Var.f13170h.getAdapter() == null) {
            return;
        }
        m0Var.f13169g.f13157b++;
    }

    public void setScrollState(int i6) {
        C1383L c1383l;
        if (i6 == this.f5741k0) {
            return;
        }
        this.f5741k0 = i6;
        if (i6 != 2) {
            t0 t0Var = this.f5758y0;
            t0Var.f13235C.removeCallbacks(t0Var);
            t0Var.f13238y.abortAnimation();
            AbstractC1397f0 abstractC1397f0 = this.f5704I;
            if (abstractC1397f0 != null && (c1383l = abstractC1397f0.f13113e) != null) {
                c1383l.i();
            }
        }
        AbstractC1397f0 abstractC1397f02 = this.f5704I;
        if (abstractC1397f02 != null) {
            abstractC1397f02.g0(i6);
        }
        j0 j0Var = this.f5694C0;
        if (j0Var != null) {
            j0Var.a(this, i6);
        }
        ArrayList arrayList = this.f5696D0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j0) this.f5696D0.get(size)).a(this, i6);
            }
        }
    }

    public void setScrollingTouchSlop(int i6) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i6 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f5748r0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(s0 s0Var) {
        this.f5755x.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().h(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        C1383L c1383l;
        if (z5 != this.f5724S) {
            i("Do not suppressLayout in layout or scroll");
            if (!z5) {
                this.f5724S = false;
                if (this.f5722R && this.f5704I != null && this.f5702H != null) {
                    requestLayout();
                }
                this.f5722R = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5724S = true;
            this.f5726T = true;
            setScrollState(0);
            t0 t0Var = this.f5758y0;
            t0Var.f13235C.removeCallbacks(t0Var);
            t0Var.f13238y.abortAnimation();
            AbstractC1397f0 abstractC1397f0 = this.f5704I;
            if (abstractC1397f0 == null || (c1383l = abstractC1397f0.f13113e) == null) {
                return;
            }
            c1383l.i();
        }
    }

    public final void t(int i6, int i7) {
        this.f5734d0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i7);
        j0 j0Var = this.f5694C0;
        if (j0Var != null) {
            j0Var.b(this, i6, i7);
        }
        ArrayList arrayList = this.f5696D0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j0) this.f5696D0.get(size)).b(this, i6, i7);
            }
        }
        this.f5734d0--;
    }

    public final void u() {
        int measuredWidth;
        int measuredHeight;
        if (this.f5739i0 != null) {
            return;
        }
        this.f5735e0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5739i0 = edgeEffect;
        if (this.f5693C) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void v() {
        int measuredHeight;
        int measuredWidth;
        if (this.f5736f0 != null) {
            return;
        }
        this.f5735e0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5736f0 = edgeEffect;
        if (this.f5693C) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void w() {
        int measuredHeight;
        int measuredWidth;
        if (this.f5738h0 != null) {
            return;
        }
        this.f5735e0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5738h0 = edgeEffect;
        if (this.f5693C) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void x() {
        int measuredWidth;
        int measuredHeight;
        if (this.f5737g0 != null) {
            return;
        }
        this.f5735e0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5737g0 = edgeEffect;
        if (this.f5693C) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f5702H + ", layout:" + this.f5704I + ", context:" + getContext();
    }

    public final void z(r0 r0Var) {
        if (getScrollState() != 2) {
            r0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f5758y0.f13238y;
        overScroller.getFinalX();
        overScroller.getCurrX();
        r0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i6) {
        float fA;
        int i7;
        char c6;
        Object[] objArr;
        Constructor constructor;
        Object[] objArr2;
        super(context, attributeSet, i6);
        this.f5753w = new L0(1, this);
        this.f5755x = new m0(this);
        this.f5691B = new C0786m(0);
        this.f5695D = new U(this, 0);
        this.f5697E = new Rect();
        this.f5698F = new Rect();
        this.f5700G = new RectF();
        this.f5706J = new ArrayList();
        this.f5708K = new ArrayList();
        this.f5710L = new ArrayList();
        this.f5720Q = 0;
        this.f5731a0 = false;
        this.f5732b0 = false;
        this.f5733c0 = 0;
        this.f5734d0 = 0;
        this.f5735e0 = new C1387a0();
        r rVar = new r();
        rVar.f13089a = null;
        rVar.f13090b = new ArrayList();
        rVar.f13091c = 120L;
        rVar.f13092d = 120L;
        rVar.f13093e = 250L;
        rVar.f13094f = 250L;
        rVar.f13202g = true;
        rVar.f13203h = new ArrayList();
        rVar.f13204i = new ArrayList();
        rVar.f13205j = new ArrayList();
        rVar.f13206k = new ArrayList();
        rVar.f13207l = new ArrayList();
        rVar.f13208m = new ArrayList();
        rVar.f13209n = new ArrayList();
        rVar.f13210o = new ArrayList();
        rVar.f13211p = new ArrayList();
        rVar.f13212q = new ArrayList();
        rVar.f13213r = new ArrayList();
        this.f5740j0 = rVar;
        this.f5741k0 = 0;
        this.f5742l0 = -1;
        this.f5752v0 = Float.MIN_VALUE;
        this.f5754w0 = Float.MIN_VALUE;
        this.f5756x0 = true;
        this.f5758y0 = new t0(this);
        this.f5690A0 = new C0289n();
        r0 r0Var = new r0();
        r0Var.f13214a = -1;
        r0Var.f13215b = 0;
        r0Var.f13216c = 0;
        r0Var.f13217d = 1;
        r0Var.f13218e = 0;
        r0Var.f13219f = false;
        r0Var.f13220g = false;
        r0Var.f13221h = false;
        r0Var.f13222i = false;
        r0Var.f13223j = false;
        r0Var.f13224k = false;
        this.f5692B0 = r0Var;
        this.E0 = false;
        this.f5699F0 = false;
        V v5 = new V(this);
        this.f5701G0 = v5;
        this.f5703H0 = false;
        this.f5707J0 = new int[2];
        this.f5711L0 = new int[2];
        this.f5713M0 = new int[2];
        this.f5715N0 = new int[2];
        this.f5717O0 = new ArrayList();
        this.f5719P0 = new U(this, 1);
        this.f5723R0 = 0;
        this.f5725S0 = 0;
        this.f5727T0 = new V(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5748r0 = viewConfiguration.getScaledTouchSlop();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            Method method = N.Z.f1970a;
            fA = N.W.a(viewConfiguration);
        } else {
            fA = N.Z.a(viewConfiguration, context);
        }
        this.f5752v0 = fA;
        this.f5754w0 = i8 >= 26 ? N.W.b(viewConfiguration) : N.Z.a(viewConfiguration, context);
        this.f5750t0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5751u0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5740j0.f13089a = v5;
        this.f5759z = new C1388b(new V(this));
        this.f5689A = new C1402k(new V(this));
        WeakHashMap weakHashMap = N.V.f1964a;
        if ((i8 < 26 || L.c(this) == 0) && i8 >= 26) {
            L.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5730W = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new w0(this));
        int[] iArr = AbstractC1356a.f12813a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        N.V.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i6);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5693C = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            i7 = 4;
            c6 = 2;
            objArr = null;
            new C1374C(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.xo.anilab.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.xo.anilab.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.xo.anilab.R.dimen.fastscroll_margin));
        } else {
            i7 = 4;
            c6 = 2;
            objArr = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1397f0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f5687V0);
                        objArr2 = new Object[i7];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c6] = Integer.valueOf(i6);
                        objArr2[3] = 0;
                    } catch (NoSuchMethodException e6) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr2 = objArr;
                        } catch (NoSuchMethodException e7) {
                            e7.initCause(e6);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e7);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1397f0) constructor.newInstance(objArr2));
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e8);
                } catch (ClassNotFoundException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e9);
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e10);
                } catch (InstantiationException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e11);
                } catch (InvocationTargetException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e12);
                }
            }
        }
        int[] iArr2 = f5686U0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i6, 0);
        N.V.k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i6);
        boolean z5 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1397f0 abstractC1397f0 = this.f5704I;
        if (abstractC1397f0 != null) {
            return abstractC1397f0.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Deprecated
    public void setRecyclerListener(n0 n0Var) {
    }
}
