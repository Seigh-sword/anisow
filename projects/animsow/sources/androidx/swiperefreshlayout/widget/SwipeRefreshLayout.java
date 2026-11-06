package androidx.swiperefreshlayout.widget;

import D0.a;
import D0.d;
import D0.e;
import D0.f;
import D0.g;
import D0.h;
import D0.i;
import D0.j;
import E.b;
import N.C0104o;
import N.I;
import N.V;
import N.r;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f5787h0 = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f5788A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f5789B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final r f5790C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0104o f5791D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f5792E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int[] f5793F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5794G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f5795H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f5796I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f5797J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f5798K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f5799L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5800M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final DecelerateInterpolator f5801N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final a f5802O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f5803P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5804Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f5805R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f5806S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f5807T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final e f5808U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public g f5809V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public g f5810W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public h f5811a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h f5812b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f5813c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f5814d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f5815e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final g f5816f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final g f5817g0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f5818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f5819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5820y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f5821z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5820y = false;
        this.f5788A = -1.0f;
        this.f5792E = new int[2];
        this.f5793F = new int[2];
        this.f5800M = -1;
        this.f5803P = -1;
        this.f5815e0 = new f(this, 0);
        this.f5816f0 = new g(this, 2);
        this.f5817g0 = new g(this, 3);
        this.f5821z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5795H = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f5801N = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5814d0 = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f6 = aVar.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = V.f1964a;
        I.s(aVar, f6 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        aVar.setBackground(shapeDrawable);
        this.f5802O = aVar;
        e eVar = new e(getContext());
        this.f5808U = eVar;
        eVar.c(1);
        this.f5802O.setImageDrawable(this.f5808U);
        this.f5802O.setVisibility(8);
        addView(this.f5802O);
        setChildrenDrawingOrderEnabled(true);
        int i6 = (int) (displayMetrics.density * 64.0f);
        this.f5806S = i6;
        this.f5788A = i6;
        this.f5790C = new r();
        this.f5791D = new C0104o(this);
        setNestedScrollingEnabled(true);
        int i7 = -this.f5814d0;
        this.f5796I = i7;
        this.f5805R = i7;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5787h0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i6) {
        this.f5802O.getBackground().setAlpha(i6);
        this.f5808U.setAlpha(i6);
    }

    public final boolean a() {
        View view = this.f5818w;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f5818w == null) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (!childAt.equals(this.f5802O)) {
                    this.f5818w = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f6) {
        int i6 = 1;
        if (f6 > this.f5788A) {
            g(true, true);
            return;
        }
        this.f5820y = false;
        e eVar = this.f5808U;
        d dVar = eVar.f278w;
        dVar.f256e = 0.0f;
        dVar.f257f = 0.0f;
        eVar.invalidateSelf();
        f fVar = new f(this, i6);
        this.f5804Q = this.f5796I;
        g gVar = this.f5817g0;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.f5801N);
        a aVar = this.f5802O;
        aVar.f246w = fVar;
        aVar.clearAnimation();
        this.f5802O.startAnimation(gVar);
        e eVar2 = this.f5808U;
        d dVar2 = eVar2.f278w;
        if (dVar2.f265n) {
            dVar2.f265n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void d(float f6) {
        h hVar;
        h hVar2;
        e eVar = this.f5808U;
        d dVar = eVar.f278w;
        if (!dVar.f265n) {
            dVar.f265n = true;
        }
        eVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f6 / this.f5788A));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f6) - this.f5788A;
        int i6 = this.f5807T;
        if (i6 <= 0) {
            i6 = this.f5806S;
        }
        float f7 = i6;
        double dMax = Math.max(0.0f, Math.min(fAbs, f7 * 2.0f) / f7) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i7 = this.f5805R + ((int) ((f7 * fMin) + (f7 * fPow * 2.0f)));
        if (this.f5802O.getVisibility() != 0) {
            this.f5802O.setVisibility(0);
        }
        this.f5802O.setScaleX(1.0f);
        this.f5802O.setScaleY(1.0f);
        if (f6 < this.f5788A) {
            if (this.f5808U.f278w.f271t > 76 && ((hVar2 = this.f5811a0) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f5808U.f278w.f271t, 76);
                hVar3.setDuration(300L);
                a aVar = this.f5802O;
                aVar.f246w = null;
                aVar.clearAnimation();
                this.f5802O.startAnimation(hVar3);
                this.f5811a0 = hVar3;
            }
        } else if (this.f5808U.f278w.f271t < 255 && ((hVar = this.f5812b0) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f5808U.f278w.f271t, 255);
            hVar4.setDuration(300L);
            a aVar2 = this.f5802O;
            aVar2.f246w = null;
            aVar2.clearAnimation();
            this.f5802O.startAnimation(hVar4);
            this.f5812b0 = hVar4;
        }
        e eVar2 = this.f5808U;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        d dVar2 = eVar2.f278w;
        dVar2.f256e = 0.0f;
        dVar2.f257f = fMin2;
        eVar2.invalidateSelf();
        e eVar3 = this.f5808U;
        float fMin3 = Math.min(1.0f, fMax);
        d dVar3 = eVar3.f278w;
        if (fMin3 != dVar3.f267p) {
            dVar3.f267p = fMin3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f5808U;
        eVar4.f278w.f258g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i7 - this.f5796I);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return this.f5791D.a(f6, f7, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f5791D.b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.f5791D.c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f5791D.e(i6, i7, i8, i9, iArr, 0, null);
    }

    public final void e(float f6) {
        setTargetOffsetTopAndBottom((this.f5804Q + ((int) ((this.f5805R - r0) * f6))) - this.f5802O.getTop());
    }

    public final void f() {
        this.f5802O.clearAnimation();
        this.f5808U.stop();
        this.f5802O.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f5805R - this.f5796I);
        this.f5796I = this.f5802O.getTop();
    }

    public final void g(boolean z5, boolean z6) {
        if (this.f5820y != z5) {
            this.f5813c0 = z6;
            b();
            this.f5820y = z5;
            f fVar = this.f5815e0;
            if (!z5) {
                g gVar = new g(this, 1);
                this.f5810W = gVar;
                gVar.setDuration(150L);
                a aVar = this.f5802O;
                aVar.f246w = fVar;
                aVar.clearAnimation();
                this.f5802O.startAnimation(this.f5810W);
                return;
            }
            this.f5804Q = this.f5796I;
            g gVar2 = this.f5816f0;
            gVar2.reset();
            gVar2.setDuration(200L);
            gVar2.setInterpolator(this.f5801N);
            if (fVar != null) {
                this.f5802O.f246w = fVar;
            }
            this.f5802O.clearAnimation();
            this.f5802O.startAnimation(gVar2);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        int i8 = this.f5803P;
        return i8 < 0 ? i7 : i7 == i6 + (-1) ? i8 : i7 >= i8 ? i7 + 1 : i7;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f5790C;
        return rVar.f2043b | rVar.f2042a;
    }

    public int getProgressCircleDiameter() {
        return this.f5814d0;
    }

    public int getProgressViewEndOffset() {
        return this.f5806S;
    }

    public int getProgressViewStartOffset() {
        return this.f5805R;
    }

    public final void h(float f6) {
        float f7 = this.f5798K;
        float f8 = f6 - f7;
        int i6 = this.f5821z;
        if (f8 <= i6 || this.f5799L) {
            return;
        }
        this.f5797J = f7 + i6;
        this.f5799L = true;
        this.f5808U.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f5791D.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5791D.f2029d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.a()
            if (r1 != 0) goto L88
            boolean r1 = r5.f5820y
            if (r1 != 0) goto L88
            boolean r1 = r5.f5794G
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.f5800M
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.f5800M = r6
            goto L85
        L44:
            int r0 = r5.f5800M
            if (r0 != r3) goto L50
            java.lang.String r6 = "SwipeRefreshLayout"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r6, r0)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            return r2
        L57:
            float r6 = r6.getY(r0)
            r5.h(r6)
            goto L85
        L5f:
            r5.f5799L = r2
            r5.f5800M = r3
            goto L85
        L64:
            D0.a r0 = r5.f5802O
            int r0 = r0.getTop()
            int r1 = r5.f5805R
            int r1 = r1 - r0
            r5.setTargetOffsetTopAndBottom(r1)
            int r0 = r6.getPointerId(r2)
            r5.f5800M = r0
            r5.f5799L = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            return r2
        L7f:
            float r6 = r6.getY(r0)
            r5.f5798K = r6
        L85:
            boolean r6 = r5.f5799L
            return r6
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f5818w == null) {
            b();
        }
        View view = this.f5818w;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f5802O.getMeasuredWidth();
        int measuredHeight2 = this.f5802O.getMeasuredHeight();
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        int i12 = this.f5796I;
        this.f5802O.layout(i10 - i11, i12, i10 + i11, measuredHeight2 + i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f5818w == null) {
            b();
        }
        View view = this.f5818w;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f5802O.measure(View.MeasureSpec.makeMeasureSpec(this.f5814d0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5814d0, 1073741824));
        this.f5803P = -1;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == this.f5802O) {
                this.f5803P = i8;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        return this.f5791D.a(f6, f7, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return this.f5791D.b(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        if (i7 > 0) {
            float f6 = this.f5789B;
            if (f6 > 0.0f) {
                float f7 = i7;
                if (f7 > f6) {
                    iArr[1] = i7 - ((int) f6);
                    this.f5789B = 0.0f;
                } else {
                    this.f5789B = f6 - f7;
                    iArr[1] = i7;
                }
                d(this.f5789B);
            }
        }
        int i8 = i6 - iArr[0];
        int i9 = i7 - iArr[1];
        int[] iArr2 = this.f5792E;
        if (dispatchNestedPreScroll(i8, i9, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        dispatchNestedScroll(i6, i7, i8, i9, this.f5793F);
        if (i9 + this.f5793F[1] >= 0 || a()) {
            return;
        }
        float fAbs = this.f5789B + Math.abs(r11);
        this.f5789B = fAbs;
        d(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        this.f5790C.f2042a = i6;
        startNestedScroll(i6 & 2);
        this.f5789B = 0.0f;
        this.f5794G = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return (!isEnabled() || this.f5820y || (i6 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f5790C.f2042a = 0;
        this.f5794G = false;
        float f6 = this.f5789B;
        if (f6 > 0.0f) {
            c(f6);
            this.f5789B = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f5820y || this.f5794G) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5800M = motionEvent.getPointerId(0);
            this.f5799L = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5800M);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f5799L) {
                    float y5 = (motionEvent.getY(iFindPointerIndex) - this.f5797J) * 0.5f;
                    this.f5799L = false;
                    c(y5);
                }
                this.f5800M = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f5800M);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y6 = motionEvent.getY(iFindPointerIndex2);
                h(y6);
                if (this.f5799L) {
                    float f6 = (y6 - this.f5797J) * 0.5f;
                    if (f6 <= 0.0f) {
                        return false;
                    }
                    d(f6);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f5800M = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f5800M) {
                        this.f5800M = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        View view = this.f5818w;
        if (view != null) {
            WeakHashMap weakHashMap = V.f1964a;
            if (!I.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    public void setAnimationProgress(float f6) {
        this.f5802O.setScaleX(f6);
        this.f5802O.setScaleY(f6);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        e eVar = this.f5808U;
        d dVar = eVar.f278w;
        dVar.f260i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            Object obj = E.f.f379a;
            iArr2[i6] = b.a(context, i7);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i6) {
        this.f5788A = i6;
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (z5) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        C0104o c0104o = this.f5791D;
        if (c0104o.f2029d) {
            WeakHashMap weakHashMap = V.f1964a;
            I.z(c0104o.f2028c);
        }
        c0104o.f2029d = z5;
    }

    public void setOnRefreshListener(j jVar) {
        this.f5819x = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i6) {
        setProgressBackgroundColorSchemeResource(i6);
    }

    public void setProgressBackgroundColorSchemeColor(int i6) {
        this.f5802O.setBackgroundColor(i6);
    }

    public void setProgressBackgroundColorSchemeResource(int i6) {
        Context context = getContext();
        Object obj = E.f.f379a;
        setProgressBackgroundColorSchemeColor(b.a(context, i6));
    }

    public void setRefreshing(boolean z5) {
        if (!z5 || this.f5820y == z5) {
            g(z5, false);
            return;
        }
        this.f5820y = z5;
        setTargetOffsetTopAndBottom((this.f5806S + this.f5805R) - this.f5796I);
        this.f5813c0 = false;
        f fVar = this.f5815e0;
        this.f5802O.setVisibility(0);
        this.f5808U.setAlpha(255);
        g gVar = new g(this, 0);
        this.f5809V = gVar;
        gVar.setDuration(this.f5795H);
        if (fVar != null) {
            this.f5802O.f246w = fVar;
        }
        this.f5802O.clearAnimation();
        this.f5802O.startAnimation(this.f5809V);
    }

    public void setSize(int i6) {
        if (i6 == 0 || i6 == 1) {
            this.f5814d0 = (int) (getResources().getDisplayMetrics().density * (i6 == 0 ? 56.0f : 40.0f));
            this.f5802O.setImageDrawable(null);
            this.f5808U.c(i6);
            this.f5802O.setImageDrawable(this.f5808U);
        }
    }

    public void setSlingshotDistance(int i6) {
        this.f5807T = i6;
    }

    public void setTargetOffsetTopAndBottom(int i6) {
        this.f5802O.bringToFront();
        a aVar = this.f5802O;
        WeakHashMap weakHashMap = V.f1964a;
        aVar.offsetTopAndBottom(i6);
        this.f5796I = this.f5802O.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return this.f5791D.h(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f5791D.i(0);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
