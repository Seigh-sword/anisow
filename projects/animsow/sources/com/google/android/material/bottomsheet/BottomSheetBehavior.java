package com.google.android.material.bottomsheet;

import B.b;
import I2.h;
import N.C0081a;
import N.C0083b;
import N.I;
import N.V;
import P2.g;
import P2.j;
import V.e;
import W1.C0217k;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.d;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.C0621b;
import j0.C0840b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m.C0955d;
import r2.AbstractC1274a;
import s2.AbstractC1301a;
import y2.AbstractC1501c;
import y2.C1499a;
import y2.C1500b;
import y2.C1502d;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b implements I2.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0217k f7052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ValueAnimator f7053B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f7054C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f7055D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f7056E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float f7057F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f7058G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final float f7059H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7060I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f7061J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f7062K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f7063L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public e f7064M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f7065N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f7066O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f7067P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final float f7068Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f7069R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f7070S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f7071T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public WeakReference f7072U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public WeakReference f7073V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final ArrayList f7074W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public VelocityTracker f7075X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public h f7076Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f7077Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7078a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f7079a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7080b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7081b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7082c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public HashMap f7083c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7084d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f7085d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7086e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final C1500b f7087e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f7091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f7092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f7103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f7106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f7107y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7108z;

    public BottomSheetBehavior() {
        this.f7078a = 0;
        this.f7080b = true;
        this.f7093k = -1;
        this.f7094l = -1;
        this.f7052A = new C0217k(this, 0);
        this.f7057F = 0.5f;
        this.f7059H = -1.0f;
        this.f7062K = true;
        this.f7063L = 4;
        this.f7068Q = 0.1f;
        this.f7074W = new ArrayList();
        this.f7079a0 = -1;
        this.f7085d0 = new SparseIntArray();
        this.f7087e0 = new C1500b(this);
    }

    public static BottomSheetBehavior A(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof B.e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = ((B.e) layoutParams).f37a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i6, int i7, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i7, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
        }
        if (size != 0) {
            i8 = Math.min(size, i8);
        }
        return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = V.f1964a;
        if (I.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View viewZ = z(viewGroup.getChildAt(i6));
                if (viewZ != null) {
                    return viewZ;
                }
            }
        }
        return null;
    }

    public final int C() {
        if (this.f7080b) {
            return this.f7055D;
        }
        return Math.max(this.f7054C, this.f7100r ? 0 : this.f7105w);
    }

    public final int D(int i6) {
        if (i6 == 3) {
            return C();
        }
        if (i6 == 4) {
            return this.f7058G;
        }
        if (i6 == 5) {
            return this.f7071T;
        }
        if (i6 == 6) {
            return this.f7056E;
        }
        throw new IllegalArgumentException(AbstractC0628i.f("Invalid state to get top offset: ", i6));
    }

    public final boolean E() {
        WeakReference weakReference = this.f7072U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f7072U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void F(boolean z5) {
        if (this.f7060I != z5) {
            this.f7060I = z5;
            if (!z5 && this.f7063L == 5) {
                H(4);
            }
            L();
        }
    }

    public final void G(int i6) {
        if (i6 == -1) {
            if (this.f7088f) {
                return;
            } else {
                this.f7088f = true;
            }
        } else {
            if (!this.f7088f && this.f7086e == i6) {
                return;
            }
            this.f7088f = false;
            this.f7086e = Math.max(0, i6);
        }
        O();
    }

    public final void H(int i6) {
        if (i6 == 1 || i6 == 2) {
            throw new IllegalArgumentException(AbstractC0628i.m(new StringBuilder("STATE_"), i6 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f7060I && i6 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i6);
            return;
        }
        int i7 = (i6 == 6 && this.f7080b && D(i6) <= this.f7055D) ? 3 : i6;
        WeakReference weakReference = this.f7072U;
        if (weakReference == null || weakReference.get() == null) {
            I(i6);
            return;
        }
        View view = (View) this.f7072U.get();
        d dVar = new d(this, view, i7, 7);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = V.f1964a;
            if (view.isAttachedToWindow()) {
                view.post(dVar);
                return;
            }
        }
        dVar.run();
    }

    public final void I(int i6) {
        View view;
        if (this.f7063L == i6) {
            return;
        }
        this.f7063L = i6;
        if (i6 != 4 && i6 != 3 && i6 != 6) {
            boolean z5 = this.f7060I;
        }
        WeakReference weakReference = this.f7072U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i7 = 0;
        if (i6 == 3) {
            N(true);
        } else if (i6 == 6 || i6 == 5 || i6 == 4) {
            N(false);
        }
        M(i6, true);
        while (true) {
            ArrayList arrayList = this.f7074W;
            if (i7 >= arrayList.size()) {
                L();
                return;
            } else {
                ((AbstractC1501c) arrayList.get(i7)).c(view, i6);
                i7++;
            }
        }
    }

    public final boolean J(View view, float f6) {
        if (this.f7061J) {
            return true;
        }
        if (view.getTop() < this.f7058G) {
            return false;
        }
        return Math.abs(((f6 * this.f7068Q) + ((float) view.getTop())) - ((float) this.f7058G)) / ((float) x()) > 0.5f;
    }

    public final void K(View view, int i6, boolean z5) {
        int iD = D(i6);
        e eVar = this.f7064M;
        if (eVar == null || (!z5 ? eVar.q(view, view.getLeft(), iD) : eVar.o(view.getLeft(), iD))) {
            I(i6);
            return;
        }
        I(2);
        M(i6, true);
        this.f7052A.a(i6);
    }

    public final void L() {
        View view;
        O.d dVar;
        T1.j jVar;
        int iA;
        WeakReference weakReference = this.f7072U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        V.i(view, 524288);
        V.g(view, 0);
        V.i(view, 262144);
        V.g(view, 0);
        V.i(view, 1048576);
        V.g(view, 0);
        SparseIntArray sparseIntArray = this.f7085d0;
        int i6 = sparseIntArray.get(0, -1);
        if (i6 != -1) {
            V.i(view, i6);
            V.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f7080b && this.f7063L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            T1.j jVar2 = new T1.j(i, this);
            ArrayList arrayListE = V.e(view);
            int i7 = 0;
            while (true) {
                if (i7 >= arrayListE.size()) {
                    int i8 = -1;
                    for (int i9 = 0; i9 < 32 && i8 == -1; i9++) {
                        int i10 = V.f1967d[i9];
                        boolean z5 = true;
                        for (int i11 = 0; i11 < arrayListE.size(); i11++) {
                            z5 &= ((O.d) arrayListE.get(i11)).a() != i10;
                        }
                        if (z5) {
                            i8 = i10;
                        }
                    }
                    iA = i8;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((O.d) arrayListE.get(i7)).f2297a).getLabel())) {
                        iA = ((O.d) arrayListE.get(i7)).a();
                        break;
                    }
                    i7++;
                }
            }
            if (iA != -1) {
                O.d dVar2 = new O.d(null, iA, string, jVar2, null);
                View.AccessibilityDelegate accessibilityDelegateC = V.c(view);
                C0083b c0083b = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof C0081a ? ((C0081a) accessibilityDelegateC).f1971a : new C0083b(accessibilityDelegateC);
                if (c0083b == null) {
                    c0083b = new C0083b();
                }
                V.l(view, c0083b);
                V.i(view, dVar2.a());
                V.e(view).add(dVar2);
                V.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f7060I) {
            int i12 = 5;
            if (this.f7063L != 5) {
                V.j(view, O.d.f2294j, new T1.j(i12, this));
            }
        }
        int i13 = this.f7063L;
        int i14 = 4;
        int i15 = 3;
        if (i13 == 3) {
            i = this.f7080b ? 4 : 6;
            dVar = O.d.f2293i;
            jVar = new T1.j(i, this);
        } else if (i13 == 4) {
            i = this.f7080b ? 3 : 6;
            dVar = O.d.f2292h;
            jVar = new T1.j(i, this);
        } else {
            if (i13 != 6) {
                return;
            }
            V.j(view, O.d.f2293i, new T1.j(i14, this));
            dVar = O.d.f2292h;
            jVar = new T1.j(i15, this);
        }
        V.j(view, dVar, jVar);
    }

    public final void M(int i6, boolean z5) {
        g gVar = this.f7091i;
        ValueAnimator valueAnimator = this.f7053B;
        if (i6 == 2) {
            return;
        }
        boolean z6 = this.f7063L == 3 && (this.f7106x || E());
        if (this.f7108z == z6 || gVar == null) {
            return;
        }
        this.f7108z = z6;
        if (!z5 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            gVar.o(this.f7108z ? w() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(gVar.f2457w.f2426j, z6 ? w() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void N(boolean z5) {
        WeakReference weakReference = this.f7072U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.f7083c0 != null) {
                    return;
                } else {
                    this.f7083c0 = new HashMap(childCount);
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if (childAt != this.f7072U.get() && z5) {
                    this.f7083c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z5) {
                return;
            }
            this.f7083c0 = null;
        }
    }

    public final void O() {
        View view;
        if (this.f7072U != null) {
            v();
            if (this.f7063L != 4 || (view = (View) this.f7072U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // I2.b
    public final void a(C0621b c0621b) {
        h hVar = this.f7076Y;
        if (hVar == null) {
            return;
        }
        if (hVar.f1142f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0621b c0621b2 = hVar.f1142f;
        hVar.f1142f = c0621b;
        if (c0621b2 == null) {
            return;
        }
        hVar.b(c0621b.f8093c);
    }

    @Override // I2.b
    public final void b(C0621b c0621b) {
        h hVar = this.f7076Y;
        if (hVar == null) {
            return;
        }
        hVar.f1142f = c0621b;
    }

    @Override // I2.b
    public final void c() {
        h hVar = this.f7076Y;
        if (hVar == null) {
            return;
        }
        C0621b c0621b = hVar.f1142f;
        hVar.f1142f = null;
        if (c0621b == null || Build.VERSION.SDK_INT < 34) {
            H(this.f7060I ? 5 : 4);
            return;
        }
        boolean z5 = this.f7060I;
        int i6 = hVar.f1140d;
        int i7 = hVar.f1139c;
        float f6 = c0621b.f8093c;
        if (!z5) {
            AnimatorSet animatorSetA = hVar.a();
            animatorSetA.setDuration(AbstractC1301a.c(f6, i7, i6));
            animatorSetA.start();
            H(4);
            return;
        }
        C0955d c0955d = new C0955d(5, this);
        View view = hVar.f1138b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new C0840b());
        objectAnimatorOfFloat.setDuration(AbstractC1301a.c(f6, i7, i6));
        objectAnimatorOfFloat.addListener(new C0955d(7, hVar));
        objectAnimatorOfFloat.addListener(c0955d);
        objectAnimatorOfFloat.start();
    }

    @Override // I2.b
    public final void d() {
        h hVar = this.f7076Y;
        if (hVar == null) {
            return;
        }
        if (hVar.f1142f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0621b c0621b = hVar.f1142f;
        hVar.f1142f = null;
        if (c0621b == null) {
            return;
        }
        AnimatorSet animatorSetA = hVar.a();
        animatorSetA.setDuration(hVar.f1141e);
        animatorSetA.start();
    }

    @Override // B.b
    public final void g(B.e eVar) {
        this.f7072U = null;
        this.f7064M = null;
        this.f7076Y = null;
    }

    @Override // B.b
    public final void i() {
        this.f7072U = null;
        this.f7064M = null;
        this.f7076Y = null;
    }

    @Override // B.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i6;
        e eVar;
        if (!view.isShown() || !this.f7062K) {
            this.f7065N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7077Z = -1;
            this.f7079a0 = -1;
            VelocityTracker velocityTracker = this.f7075X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7075X = null;
            }
        }
        if (this.f7075X == null) {
            this.f7075X = VelocityTracker.obtain();
        }
        this.f7075X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            this.f7079a0 = (int) motionEvent.getY();
            if (this.f7063L != 2) {
                WeakReference weakReference = this.f7073V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x5, this.f7079a0)) {
                    this.f7077Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f7081b0 = true;
                }
            }
            this.f7065N = this.f7077Z == -1 && !coordinatorLayout.o(view, x5, this.f7079a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7081b0 = false;
            this.f7077Z = -1;
            if (this.f7065N) {
                this.f7065N = false;
                return false;
            }
        }
        if (!this.f7065N && (eVar = this.f7064M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f7073V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f7065N || this.f7063L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f7064M == null || (i6 = this.f7079a0) == -1 || Math.abs(((float) i6) - motionEvent.getY()) <= ((float) this.f7064M.f3660b)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[PHI: r6 r8
      0x00f9: PHI (r6v24 int) = (r6v23 int), (r6v25 int) binds: [B:63:0x0103, B:58:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r8v17 int) = (r8v15 int), (r8v2 int) binds: [B:63:0x0103, B:58:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168 A[LOOP:0: B:85:0x0160->B:87:0x0168, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174 A[SYNTHETIC] */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // B.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, this.f7093k, marginLayoutParams.width), B(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f7094l, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final boolean m(View view) {
        WeakReference weakReference = this.f7073V;
        return (weakReference == null || view != weakReference.get() || this.f7063L == 3) ? false : true;
    }

    @Override // B.b
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        if (i8 == 1) {
            return;
        }
        WeakReference weakReference = this.f7073V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i11 = top - i7;
        if (i7 > 0) {
            if (i11 < C()) {
                int iC = top - C();
                iArr[1] = iC;
                int i12 = -iC;
                WeakHashMap weakHashMap = V.f1964a;
                view.offsetTopAndBottom(i12);
                i10 = 3;
                I(i10);
            } else {
                if (!this.f7062K) {
                    return;
                }
                iArr[1] = i7;
                i9 = -i7;
                WeakHashMap weakHashMap2 = V.f1964a;
                view.offsetTopAndBottom(i9);
                I(1);
            }
        } else if (i7 < 0 && !view2.canScrollVertically(-1)) {
            int i13 = this.f7058G;
            if (i11 > i13 && !this.f7060I) {
                int i14 = top - i13;
                iArr[1] = i14;
                int i15 = -i14;
                WeakHashMap weakHashMap3 = V.f1964a;
                view.offsetTopAndBottom(i15);
                i10 = 4;
                I(i10);
            } else {
                if (!this.f7062K) {
                    return;
                }
                iArr[1] = i7;
                i9 = -i7;
                WeakHashMap weakHashMap4 = V.f1964a;
                view.offsetTopAndBottom(i9);
                I(1);
            }
        }
        y(view.getTop());
        this.f7066O = i7;
        this.f7067P = true;
    }

    @Override // B.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
    }

    @Override // B.b
    public final void q(View view, Parcelable parcelable) {
        C1502d c1502d = (C1502d) parcelable;
        int i6 = this.f7078a;
        if (i6 != 0) {
            if (i6 == -1 || (i6 & 1) == 1) {
                this.f7086e = c1502d.f13794z;
            }
            if (i6 == -1 || (i6 & 2) == 2) {
                this.f7080b = c1502d.f13790A;
            }
            if (i6 == -1 || (i6 & 4) == 4) {
                this.f7060I = c1502d.f13791B;
            }
            if (i6 == -1 || (i6 & 8) == 8) {
                this.f7061J = c1502d.f13792C;
            }
        }
        int i7 = c1502d.f13793y;
        if (i7 == 1 || i7 == 2) {
            this.f7063L = 4;
        } else {
            this.f7063L = i7;
        }
    }

    @Override // B.b
    public final Parcelable r(View view) {
        return new C1502d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // B.b
    public final boolean s(View view, int i6, int i7) {
        this.f7066O = 0;
        this.f7067P = false;
        return (i6 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.C()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.I(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f7073V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f7067P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f7066O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f7080b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f7056E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f7060I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f7075X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f7082c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f7075X
            int r0 = r3.f7077Z
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.J(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f7066O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f7080b
            if (r2 == 0) goto L74
            int r6 = r3.f7055D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f7058G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f7056E
            if (r5 >= r2) goto L83
            int r0 = r3.f7058G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f7058G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f7080b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f7056E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f7058G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.K(r4, r1, r5)
            r3.f7067P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t(android.view.View, android.view.View, int):void");
    }

    @Override // B.b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.f7063L;
        if (i6 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f7064M;
        if (eVar != null && (this.f7062K || i6 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f7077Z = -1;
            this.f7079a0 = -1;
            VelocityTracker velocityTracker = this.f7075X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7075X = null;
            }
        }
        if (this.f7075X == null) {
            this.f7075X = VelocityTracker.obtain();
        }
        this.f7075X.addMovement(motionEvent);
        if (this.f7064M != null && ((this.f7062K || this.f7063L == 1) && actionMasked == 2 && !this.f7065N)) {
            float fAbs = Math.abs(this.f7079a0 - motionEvent.getY());
            e eVar2 = this.f7064M;
            if (fAbs > eVar2.f3660b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f7065N;
    }

    public final void v() {
        int iX = x();
        if (this.f7080b) {
            this.f7058G = Math.max(this.f7071T - iX, this.f7055D);
        } else {
            this.f7058G = this.f7071T - iX;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float w() {
        /*
            r5 = this;
            P2.g r0 = r5.f7091i
            r1 = 0
            if (r0 == 0) goto L6f
            java.lang.ref.WeakReference r0 = r5.f7072U
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L6f
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L6f
            java.lang.ref.WeakReference r0 = r5.f7072U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.E()
            if (r2 == 0) goto L6f
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L6f
            P2.g r2 = r5.f7091i
            float r2 = r2.i()
            android.view.RoundedCorner r3 = M0.a.i(r0)
            if (r3 == 0) goto L44
            int r3 = M0.a.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            P2.g r2 = r5.f7091i
            P2.f r4 = r2.f2457w
            P2.j r4 = r4.f2417a
            P2.c r4 = r4.f2467f
            android.graphics.RectF r2 = r2.h()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = M0.a.p(r0)
            if (r0 == 0) goto L6a
            int r0 = M0.a.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6a
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6a
            float r1 = r0 / r2
        L6a:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w():float");
    }

    public final int x() {
        int i6;
        return this.f7088f ? Math.min(Math.max(this.f7089g, this.f7071T - ((this.f7070S * 9) / 16)), this.f7069R) + this.f7104v : (this.f7096n || this.f7097o || (i6 = this.f7095m) <= 0) ? this.f7086e + this.f7104v : Math.max(this.f7086e, i6 + this.f7090h);
    }

    public final void y(int i6) {
        View view = (View) this.f7072U.get();
        if (view != null) {
            ArrayList arrayList = this.f7074W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i7 = this.f7058G;
            if (i6 <= i7 && i7 != C()) {
                C();
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((AbstractC1501c) arrayList.get(i8)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        int i6;
        this.f7078a = 0;
        this.f7080b = true;
        this.f7093k = -1;
        this.f7094l = -1;
        this.f7052A = new C0217k(this, 0);
        this.f7057F = 0.5f;
        this.f7059H = -1.0f;
        this.f7062K = true;
        this.f7063L = 4;
        this.f7068Q = 0.1f;
        this.f7074W = new ArrayList();
        this.f7079a0 = -1;
        this.f7085d0 = new SparseIntArray();
        this.f7087e0 = new C1500b(this);
        this.f7090h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12450d);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f7092j = f2.h.o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f7107y = j.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        j jVar = this.f7107y;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f7091i = gVar;
            gVar.k(context);
            ColorStateList colorStateList = this.f7092j;
            if (colorStateList != null) {
                this.f7091i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f7091i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.f7053B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f7053B.addUpdateListener(new C1499a(0, this));
        this.f7059H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f7093k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f7094l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i6 = typedValuePeekValue.data) != -1) {
            G(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            G(i6);
        }
        F(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f7096n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f7080b != z5) {
            this.f7080b = z5;
            if (this.f7072U != null) {
                v();
            }
            I((this.f7080b && this.f7063L == 6) ? 3 : this.f7063L);
            M(this.f7063L, true);
            L();
        }
        this.f7061J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f7062K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f7078a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f6 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f6 > 0.0f && f6 < 1.0f) {
            this.f7057F = f6;
            if (this.f7072U != null) {
                this.f7056E = (int) ((1.0f - f6) * this.f7071T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
                dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                dimensionPixelOffset = typedValuePeekValue2.data;
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f7054C = dimensionPixelOffset;
            M(this.f7063L, true);
            this.f7084d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f7097o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f7098p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f7099q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f7100r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f7101s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f7102t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f7103u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f7106x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f7082c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
