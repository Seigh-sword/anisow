package com.google.android.material.sidesheet;

import B.b;
import F.n;
import I2.i;
import N.V;
import O.s;
import P2.g;
import P2.j;
import Q2.a;
import Q2.d;
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
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.C0621b;
import f2.h;
import j0.C0840b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C0955d;
import r2.AbstractC1274a;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b implements I2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f7271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f7272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f7273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f7274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217k f7275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f7279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f7281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f7286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f7287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f7289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public I2.j f7290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f7292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f7293w;

    public SideSheetBehavior() {
        this.f7275e = new C0217k(this);
        this.f7277g = true;
        this.f7278h = 5;
        this.f7281k = 0.1f;
        this.f7288r = -1;
        this.f7292v = new LinkedHashSet();
        this.f7293w = new d(this);
    }

    @Override // I2.b
    public final void a(C0621b c0621b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        I2.j jVar = this.f7290t;
        if (jVar == null) {
            return;
        }
        a aVar = this.f7271a;
        int i6 = 5;
        if (aVar != null) {
            switch (aVar.f2794a) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    i6 = 3;
                    break;
            }
        }
        if (jVar.f1142f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0621b c0621b2 = jVar.f1142f;
        jVar.f1142f = c0621b;
        if (c0621b2 != null) {
            jVar.a(c0621b.f8093c, i6, c0621b.f8094d == 0);
        }
        WeakReference weakReference = this.f7286p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f7286p.get();
        WeakReference weakReference2 = this.f7287q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        int scaleX = (int) ((view.getScaleX() * this.f7282l) + this.f7285o);
        switch (this.f7271a.f2794a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                marginLayoutParams.leftMargin = scaleX;
                break;
            default:
                marginLayoutParams.rightMargin = scaleX;
                break;
        }
        view2.requestLayout();
    }

    @Override // I2.b
    public final void b(C0621b c0621b) {
        I2.j jVar = this.f7290t;
        if (jVar == null) {
            return;
        }
        jVar.f1142f = c0621b;
    }

    @Override // I2.b
    public final void c() {
        int i6;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i7;
        I2.j jVar = this.f7290t;
        if (jVar == null) {
            return;
        }
        C0621b c0621b = jVar.f1142f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jVar.f1142f = null;
        int i8 = 5;
        if (c0621b == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        a aVar = this.f7271a;
        if (aVar != null) {
            switch (aVar.f2794a) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    i8 = 3;
                    break;
            }
        }
        C0955d c0955d = new C0955d(9, this);
        WeakReference weakReference = this.f7287q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.f7271a.f2794a) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    i7 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i7 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Q2.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a aVar2 = this.f2798a.f7271a;
                    int iC = AbstractC1301a.c(valueAnimator.getAnimatedFraction(), i7, 0);
                    int i9 = aVar2.f2794a;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    switch (i9) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            marginLayoutParams2.leftMargin = iC;
                            break;
                        default:
                            marginLayoutParams2.rightMargin = iC;
                            break;
                    }
                    view.requestLayout();
                }
            };
        }
        boolean z5 = c0621b.f8094d == 0;
        WeakHashMap weakHashMap = V.f1964a;
        View view2 = jVar.f1138b;
        boolean z6 = (Gravity.getAbsoluteGravity(i8, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i6 = z6 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i6 = 0;
        }
        float f6 = scaleX + i6;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (z6) {
            f6 = -f6;
        }
        fArr[0] = f6;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C0840b());
        objectAnimatorOfFloat.setDuration(AbstractC1301a.c(c0621b.f8093c, jVar.f1139c, jVar.f1140d));
        objectAnimatorOfFloat.addListener(new i(jVar, z5, i8));
        objectAnimatorOfFloat.addListener(c0955d);
        objectAnimatorOfFloat.start();
    }

    @Override // I2.b
    public final void d() {
        I2.j jVar = this.f7290t;
        if (jVar == null) {
            return;
        }
        if (jVar.f1142f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0621b c0621b = jVar.f1142f;
        jVar.f1142f = null;
        if (c0621b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = jVar.f1138b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i6), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(jVar.f1141e);
        animatorSet.start();
    }

    @Override // B.b
    public final void g(B.e eVar) {
        this.f7286p = null;
        this.f7279i = null;
        this.f7290t = null;
    }

    @Override // B.b
    public final void i() {
        this.f7286p = null;
        this.f7279i = null;
        this.f7290t = null;
    }

    @Override // B.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && V.d(view) == null) || !this.f7277g) {
            this.f7280j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f7289s) != null) {
            velocityTracker.recycle();
            this.f7289s = null;
        }
        if (this.f7289s == null) {
            this.f7289s = VelocityTracker.obtain();
        }
        this.f7289s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f7291u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f7280j) {
            this.f7280j = false;
            return false;
        }
        return (this.f7280j || (eVar = this.f7279i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[PHI: r0 r5
      0x00e1: PHI (r0v17 P2.j) = (r0v12 P2.j), (r0v21 P2.j) binds: [B:75:0x012a, B:58:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r5v5 P2.g) = (r5v4 P2.g), (r5v8 P2.g) binds: [B:75:0x012a, B:58:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // B.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final void q(View view, Parcelable parcelable) {
        int i6 = ((Q2.e) parcelable).f2803y;
        if (i6 == 1 || i6 == 2) {
            i6 = 5;
        }
        this.f7278h = i6;
    }

    @Override // B.b
    public final Parcelable r(View view) {
        return new Q2.e(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // B.b
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7278h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.f7279i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f7289s) != null) {
            velocityTracker.recycle();
            this.f7289s = null;
        }
        if (this.f7289s == null) {
            this.f7289s = VelocityTracker.obtain();
        }
        this.f7289s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.f7280j && x()) {
            float fAbs = Math.abs(this.f7291u - motionEvent.getX());
            e eVar = this.f7279i;
            if (fAbs > eVar.f3660b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f7280j;
    }

    public final void v(int i6) {
        if (i6 == 1 || i6 == 2) {
            throw new IllegalArgumentException(AbstractC0628i.m(new StringBuilder("STATE_"), i6 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f7286p;
        if (weakReference == null || weakReference.get() == null) {
            w(i6);
            return;
        }
        View view = (View) this.f7286p.get();
        n nVar = new n(i6, 1, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = V.f1964a;
            if (view.isAttachedToWindow()) {
                view.post(nVar);
                return;
            }
        }
        nVar.run();
    }

    public final void w(int i6) {
        View view;
        if (this.f7278h == i6) {
            return;
        }
        this.f7278h = i6;
        WeakReference weakReference = this.f7286p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i7 = this.f7278h == 5 ? 4 : 0;
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
        Iterator it = this.f7292v.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        z();
    }

    public final boolean x() {
        return this.f7279i != null && (this.f7277g || this.f7278h == 1);
    }

    public final void y(View view, int i6, boolean z5) {
        int i7;
        if (i6 == 3) {
            i7 = this.f7271a.i();
        } else {
            if (i6 != 5) {
                throw new IllegalArgumentException(AbstractC0628i.f("Invalid state to get outer edge offset: ", i6));
            }
            i7 = this.f7271a.j();
        }
        e eVar = this.f7279i;
        if (eVar == null || (!z5 ? eVar.q(view, i7, view.getTop()) : eVar.o(i7, view.getTop()))) {
            w(i6);
        } else {
            w(2);
            this.f7275e.a(i6);
        }
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.f7286p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        V.i(view, 262144);
        V.g(view, 0);
        V.i(view, 1048576);
        V.g(view, 0);
        final int i6 = 5;
        if (this.f7278h != 5) {
            V.j(view, O.d.f2294j, new s() { // from class: Q2.b
                @Override // O.s
                public final boolean a(View view2) {
                    this.f2796w.v(i6);
                    return true;
                }
            });
        }
        final int i7 = 3;
        if (this.f7278h != 3) {
            V.j(view, O.d.f2292h, new s() { // from class: Q2.b
                @Override // O.s
                public final boolean a(View view2) {
                    this.f2796w.v(i7);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f7275e = new C0217k(this);
        this.f7277g = true;
        this.f7278h = 5;
        this.f7281k = 0.1f;
        this.f7288r = -1;
        this.f7292v = new LinkedHashSet();
        this.f7293w = new d(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12441E);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f7273c = h.o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f7274d = j.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f7288r = resourceId;
            WeakReference weakReference = this.f7287q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f7287q = null;
            WeakReference weakReference2 = this.f7286p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = V.f1964a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        j jVar = this.f7274d;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f7272b = gVar;
            gVar.k(context);
            ColorStateList colorStateList = this.f7273c;
            if (colorStateList != null) {
                this.f7272b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f7272b.setTint(typedValue.data);
            }
        }
        this.f7276f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f7277g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
