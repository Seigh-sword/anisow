package androidx.core.widget;

import N.C0097i;
import N.C0104o;
import N.I;
import N.InterfaceC0106q;
import N.V;
import N.r;
import S0.f;
import T.e;
import T.h;
import T.i;
import T.j;
import T.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import d2.AbstractC0651b;
import i.C0803c;
import i.C0808h;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0106q {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final float f5327b0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h f5328c0 = new h();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int[] f5329d0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final EdgeEffect f5330A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final EdgeEffect f5331B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f5332C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5333D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5334E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f5335F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5336G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public VelocityTracker f5337H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5338I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5339J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f5340K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f5341L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f5342M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f5343N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int[] f5344O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int[] f5345P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5346Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f5347R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public k f5348S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final r f5349T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final C0104o f5350U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f5351V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public j f5352W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C0097i f5353a0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f5354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f5356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final OverScroller f5357z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.xo.anilab.R.attr.nestedScrollViewStyle);
        this.f5356y = new Rect();
        this.f5333D = true;
        this.f5334E = false;
        this.f5335F = null;
        this.f5336G = false;
        this.f5339J = true;
        this.f5343N = -1;
        this.f5344O = new int[2];
        this.f5345P = new int[2];
        this.f5353a0 = new C0097i(getContext(), new f(11, this));
        int i6 = Build.VERSION.SDK_INT;
        this.f5330A = i6 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f5331B = i6 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f5354w = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5357z = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5340K = viewConfiguration.getScaledTouchSlop();
        this.f5341L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5342M = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5329d0, com.xo.anilab.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f5349T = new r();
        this.f5350U = new C0104o(this);
        setNestedScrollingEnabled(true);
        V.l(this, f5328c0);
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, view2);
    }

    @Override // N.InterfaceC0105p
    public final void a(View view, View view2, int i6, int i7) {
        r rVar = this.f5349T;
        if (i7 == 1) {
            rVar.f2043b = i6;
        } else {
            rVar.f2042a = i6;
        }
        v(2, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // N.InterfaceC0105p
    public final void b(View view, int i6) {
        r rVar = this.f5349T;
        if (i6 == 1) {
            rVar.f2043b = 0;
        } else {
            rVar.f2042a = 0;
        }
        x(i6);
    }

    @Override // N.InterfaceC0105p
    public final void c(View view, int i6, int i7, int[] iArr, int i8) {
        this.f5350U.c(i6, i7, iArr, null, i8);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // N.InterfaceC0106q
    public final void d(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        n(i9, i10, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return this.f5350U.a(f6, f7, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f5350U.b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.f5350U.c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f5350U.e(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f5330A;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f5331B;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // N.InterfaceC0105p
    public final void e(View view, int i6, int i7, int i8, int i9, int i10) {
        n(i9, i10, null);
    }

    @Override // N.InterfaceC0105p
    public final boolean f(View view, View view2, int i6, int i7) {
        return (i6 & 2) != 0;
    }

    public final boolean g(int i6) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i6);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i6 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i6 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i6 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f5356y;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i6);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f5349T;
        return rVar.f2043b | rVar.f2042a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f5351V == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f5351V = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5351V;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i7 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i6 - verticalFadingEdgeLength : i6;
        int i8 = rect.bottom;
        if (i8 > i7 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i7, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        }
        if (rect.top >= scrollY || i8 >= i7) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i7 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f5350U.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f5356y.setEmpty();
        int i6 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode == 122) {
                                        q(33);
                                        return false;
                                    }
                                    if (keyCode != 123) {
                                        return false;
                                    }
                                }
                            }
                        } else if (keyEvent.isShiftPressed()) {
                            i6 = 33;
                        }
                        q(i6);
                        return false;
                    }
                    if (!keyEvent.isAltPressed()) {
                        return g(130);
                    }
                    return k(130);
                }
                if (!keyEvent.isAltPressed()) {
                    return g(33);
                }
                return k(33);
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5350U.f2029d;
    }

    public final void j(int i6) {
        if (getChildCount() > 0) {
            this.f5357z.fling(getScrollX(), getScrollY(), 0, i6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            v(2, 1);
            this.f5347R = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i6) {
        int childCount;
        boolean z5 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f5356y;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i6, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i6, int i7) {
        Rect rect = this.f5356y;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i6 >= getScrollY() && rect.top - i6 <= getScrollY() + i7;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i6, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i6, int i7, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i6);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5350U.d(scrollY2, i6 - scrollY2, i7, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5343N) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f5332C = (int) motionEvent.getY(i6);
            this.f5343N = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.f5337H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5334E = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r28) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int measuredHeight;
        super.onLayout(z5, i6, i7, i8, i9);
        int i10 = 0;
        this.f5333D = false;
        View view = this.f5335F;
        if (view != null && l(view, this)) {
            View view2 = this.f5335F;
            Rect rect = this.f5356y;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f5335F = null;
        if (!this.f5334E) {
            if (this.f5348S != null) {
                scrollTo(getScrollX(), this.f5348S.f3368w);
                this.f5348S = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i10 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5334E = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f5338I && View.MeasureSpec.getMode(i7) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        j((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return this.f5350U.b(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        this.f5350U.c(i6, i7, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        n(i9, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        a(view, view2, i6, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i6, int i7, boolean z5, boolean z6) {
        super.scrollTo(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (i6 == 2) {
            i6 = 130;
        } else if (i6 == 1) {
            i6 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i6) : focusFinder.findNextFocusFromRect(this, rect, i6);
        if (viewFindNextFocus == null || (true ^ m(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f5348S = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3368w = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
        j jVar = this.f5352W;
        if (jVar != null) {
            C0803c c0803c = (C0803c) jVar;
            C0808h.a(this, (View) c0803c.f9277x, (View) c0803c.f9278y);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i9)) {
            return;
        }
        Rect rect = this.f5356y;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f5339J) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return f(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i6;
        if (this.f5337H == null) {
            this.f5337H = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5346Q = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f5346Q);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f5331B;
            EdgeEffect edgeEffect2 = this.f5330A;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5337H;
                velocityTracker.computeCurrentVelocity(1000, this.f5342M);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5343N);
                if (Math.abs(yVelocity) >= this.f5341L) {
                    if (AbstractC0651b.o(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i6 = -yVelocity;
                            j(i6);
                        }
                    } else if (AbstractC0651b.o(edgeEffect) != 0.0f) {
                        i6 = -yVelocity;
                        if (t(edgeEffect, i6)) {
                            edgeEffect.onAbsorb(i6);
                        } else {
                            j(i6);
                        }
                    } else {
                        int i7 = -yVelocity;
                        float f7 = i7;
                        if (!this.f5350U.b(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            j(i7);
                        }
                    }
                } else if (this.f5357z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f5343N = -1;
                this.f5336G = false;
                VelocityTracker velocityTracker2 = this.f5337H;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f5337H = null;
                }
                x(0);
                this.f5330A.onRelease();
                this.f5331B.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5343N);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5343N + " in onTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(iFindPointerIndex);
                    int i8 = this.f5332C - y5;
                    float x5 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i8 / getHeight();
                    if (AbstractC0651b.o(edgeEffect2) != 0.0f) {
                        float f8 = -AbstractC0651b.x(edgeEffect2, -height, x5);
                        if (AbstractC0651b.o(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f6 = f8;
                    } else if (AbstractC0651b.o(edgeEffect) != 0.0f) {
                        float fX = AbstractC0651b.x(edgeEffect, height, 1.0f - x5);
                        if (AbstractC0651b.o(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f6 = fX;
                    }
                    int iRound = Math.round(f6 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i9 = i8 - iRound;
                    if (!this.f5336G && Math.abs(i9) > this.f5340K) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f5336G = true;
                        int i10 = this.f5340K;
                        i9 = i9 > 0 ? i9 - i10 : i9 + i10;
                    }
                    if (this.f5336G) {
                        int iS = s(i9, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f5332C = y5 - iS;
                        this.f5346Q += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5336G && getChildCount() > 0 && this.f5357z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f5343N = -1;
                this.f5336G = false;
                VelocityTracker velocityTracker3 = this.f5337H;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5337H = null;
                }
                x(0);
                this.f5330A.onRelease();
                this.f5331B.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5332C = (int) motionEvent.getY(actionIndex);
                this.f5343N = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f5332C = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5343N));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f5336G && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5357z.isFinished()) {
                this.f5357z.abortAnimation();
                x(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f5332C = y6;
            this.f5343N = pointerId;
            v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f5337H;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i6, int i7, int i8, int i9) {
        boolean z5;
        boolean z6;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i10 = i8 + i6;
        if (i7 <= 0 && i7 >= 0) {
            z5 = false;
        } else {
            i7 = 0;
            z5 = true;
        }
        if (i10 > i9) {
            z6 = true;
        } else if (i10 < 0) {
            i9 = 0;
            z6 = true;
        } else {
            i9 = i10;
            z6 = false;
        }
        if (z6 && !this.f5350U.g(1)) {
            this.f5357z.springBack(i7, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i9);
        return z5 || z6;
    }

    public final void q(int i6) {
        int i7 = 0;
        boolean z5 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f5356y;
        if (z5) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    i7 = paddingBottom - height;
                    rect.top = i7;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = i7;
            }
        }
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        r(i6, i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.s(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f5333D) {
            this.f5335F = view2;
        } else {
            Rect rect = this.f5356y;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z6 = iH != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, iH);
            } else {
                u(0, iH, false);
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f5337H) != null) {
            velocityTracker.recycle();
            this.f5337H = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5333D = true;
        super.requestLayout();
    }

    public final int s(int i6, int i7, int i8, boolean z5) {
        int i9;
        int i10;
        VelocityTracker velocityTracker;
        if (i8 == 1) {
            v(2, i8);
        }
        boolean zC = this.f5350U.c(0, i6, this.f5345P, this.f5344O, i8);
        int[] iArr = this.f5345P;
        int[] iArr2 = this.f5344O;
        if (zC) {
            i9 = i6 - iArr[1];
            i10 = iArr2[1];
        } else {
            i9 = i6;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z5;
        boolean z7 = p(i9, 0, scrollY, scrollRange) && !this.f5350U.g(i8);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f5350U.e(0, scrollY2, 0, i9 - scrollY2, this.f5344O, i8, iArr);
        int i11 = i10 + iArr2[1];
        int i12 = i9 - iArr[1];
        int i13 = scrollY + i12;
        EdgeEffect edgeEffect = this.f5331B;
        EdgeEffect edgeEffect2 = this.f5330A;
        if (i13 < 0) {
            if (z6) {
                AbstractC0651b.x(edgeEffect2, (-i12) / getHeight(), i7 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i13 > scrollRange && z6) {
            AbstractC0651b.x(edgeEffect, i12 / getHeight(), 1.0f - (i7 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z7 && i8 == 0 && (velocityTracker = this.f5337H) != null) {
            velocityTracker.clear();
        }
        if (i8 == 1) {
            x(i8);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i11;
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i7) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i6 < 0) {
                i6 = 0;
            } else if (width + i6 > width2) {
                i6 = width2 - width;
            }
            if (height >= height2 || i7 < 0) {
                i7 = 0;
            } else if (height + i7 > height2) {
                i7 = height2 - height;
            }
            if (i6 == getScrollX() && i7 == getScrollY()) {
                return;
            }
            super.scrollTo(i6, i7);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f5338I) {
            this.f5338I = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        C0104o c0104o = this.f5350U;
        if (c0104o.f2029d) {
            WeakHashMap weakHashMap = V.f1964a;
            I.z(c0104o.f2028c);
        }
        c0104o.f2029d = z5;
    }

    public void setOnScrollChangeListener(j jVar) {
        this.f5352W = jVar;
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f5339J = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return this.f5350U.h(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        x(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i6) {
        if (i6 > 0) {
            return true;
        }
        float fO = AbstractC0651b.o(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i6) * 0.35f;
        float f6 = this.f5354w * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d6 = f5327b0;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * dLog) * ((double) f6))) < fO;
    }

    public final void u(int i6, int i7, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5355x > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f5357z.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i7 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z5) {
                v(2, 1);
            } else {
                x(1);
            }
            this.f5347R = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f5357z.isFinished()) {
                this.f5357z.abortAnimation();
                x(1);
            }
            scrollBy(i6, i7);
        }
        this.f5355x = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void v(int i6, int i7) {
        this.f5350U.h(2, i7);
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f5330A;
        if (AbstractC0651b.o(edgeEffect) != 0.0f) {
            AbstractC0651b.x(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f5331B;
        if (AbstractC0651b.o(edgeEffect2) == 0.0f) {
            return z5;
        }
        AbstractC0651b.x(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void x(int i6) {
        this.f5350U.i(i6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
