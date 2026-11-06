package androidx.appcompat.widget;

import L3.c;
import N.A0;
import N.C0;
import N.G;
import N.I;
import N.InterfaceC0105p;
import N.InterfaceC0106q;
import N.V;
import N.r;
import N.t0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.xo.anilab.R;
import d2.AbstractC0651b;
import i.U;
import i.v;
import java.util.WeakHashMap;
import k.l;
import l.o;
import m.C0955d;
import m.C0961g;
import m.C0963h;
import m.C0977o;
import m.InterfaceC0959f;
import m.InterfaceC0980p0;
import m.InterfaceC0982q0;
import m.RunnableC0957e;
import m.d1;
import m.i1;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0980p0, InterfaceC0105p, InterfaceC0106q {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int[] f5158b0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final C0 f5159c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Rect f5160d0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC0982q0 f5161A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f5162B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5163C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5164D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5165E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5166F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f5167G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f5168H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Rect f5169I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f5170J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f5171K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f5172L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0 f5173M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0 f5174N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0 f5175O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0 f5176P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public InterfaceC0959f f5177Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public OverScroller f5178R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ViewPropertyAnimator f5179S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final C0955d f5180T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final RunnableC0957e f5181U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final RunnableC0957e f5182V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final r f5183W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C0963h f5184a0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5186x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ContentFrameLayout f5187y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ActionBarContainer f5188z;

    static {
        c cVar = new c(11, 0);
        ((t0) cVar.f1734x).g(G.c.b(0, 1, 0, 1));
        f5159c0 = ((t0) cVar.f1734x).b();
        f5160d0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5186x = 0;
        this.f5169I = new Rect();
        this.f5170J = new Rect();
        this.f5171K = new Rect();
        this.f5172L = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0 c02 = C0.f1942b;
        this.f5173M = c02;
        this.f5174N = c02;
        this.f5175O = c02;
        this.f5176P = c02;
        this.f5180T = new C0955d(0, this);
        this.f5181U = new RunnableC0957e(this, 0);
        this.f5182V = new RunnableC0957e(this, 1);
        i(context);
        this.f5183W = new r();
        C0963h c0963h = new C0963h(context);
        c0963h.setWillNotDraw(true);
        this.f5184a0 = c0963h;
        addView(c0963h);
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z5) {
        boolean z6;
        C0961g c0961g = (C0961g) frameLayout.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) c0961g).leftMargin;
        int i7 = rect.left;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0961g).leftMargin = i7;
            z6 = true;
        } else {
            z6 = false;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c0961g).topMargin;
        int i9 = rect.top;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c0961g).topMargin = i9;
            z6 = true;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) c0961g).rightMargin;
        int i11 = rect.right;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c0961g).rightMargin = i11;
            z6 = true;
        }
        if (z5) {
            int i12 = ((ViewGroup.MarginLayoutParams) c0961g).bottomMargin;
            int i13 = rect.bottom;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) c0961g).bottomMargin = i13;
                return true;
            }
        }
        return z6;
    }

    @Override // N.InterfaceC0105p
    public final void a(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // N.InterfaceC0105p
    public final void b(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // N.InterfaceC0105p
    public final void c(View view, int i6, int i7, int[] iArr, int i8) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0961g;
    }

    @Override // N.InterfaceC0106q
    public final void d(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        e(view, i6, i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f5162B != null) {
            if (this.f5188z.getVisibility() == 0) {
                translationY = (int) (this.f5188z.getTranslationY() + this.f5188z.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f5162B.setBounds(0, translationY, getWidth(), this.f5162B.getIntrinsicHeight() + translationY);
            this.f5162B.draw(canvas);
        }
    }

    @Override // N.InterfaceC0105p
    public final void e(View view, int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i6, i7, i8, i9);
        }
    }

    @Override // N.InterfaceC0105p
    public final boolean f(View view, View view2, int i6, int i7) {
        return i7 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0961g(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0961g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f5188z;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f5183W;
        return rVar.f2043b | rVar.f2042a;
    }

    public CharSequence getTitle() {
        k();
        return ((i1) this.f5161A).f10283a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f5181U);
        removeCallbacks(this.f5182V);
        ViewPropertyAnimator viewPropertyAnimator = this.f5179S;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f5158b0);
        this.f5185w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f5162B = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f5178R = new OverScroller(context);
    }

    public final void j(int i6) {
        k();
        if (i6 == 2) {
            ((i1) this.f5161A).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i6 == 5) {
            ((i1) this.f5161A).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i6 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0982q0 wrapper;
        if (this.f5187y == null) {
            this.f5187y = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f5188z = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0982q0) {
                wrapper = (InterfaceC0982q0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f5161A = wrapper;
        }
    }

    public final void l(o oVar, v vVar) {
        k();
        i1 i1Var = (i1) this.f5161A;
        C0977o c0977o = i1Var.f10295m;
        Toolbar toolbar = i1Var.f10283a;
        if (c0977o == null) {
            C0977o c0977o2 = new C0977o(toolbar.getContext());
            i1Var.f10295m = c0977o2;
            c0977o2.f10342E = R.id.action_menu_presenter;
        }
        C0977o c0977o3 = i1Var.f10295m;
        c0977o3.f10338A = vVar;
        if (oVar == null && toolbar.f5257w == null) {
            return;
        }
        toolbar.f();
        o oVar2 = toolbar.f5257w.f5189L;
        if (oVar2 == oVar) {
            return;
        }
        if (oVar2 != null) {
            oVar2.r(toolbar.f5250j0);
            oVar2.r(toolbar.f5251k0);
        }
        if (toolbar.f5251k0 == null) {
            toolbar.f5251k0 = new d1(toolbar);
        }
        c0977o3.f10351N = true;
        if (oVar != null) {
            oVar.b(c0977o3, toolbar.f5223F);
            oVar.b(toolbar.f5251k0, toolbar.f5223F);
        } else {
            c0977o3.b(toolbar.f5223F, null);
            toolbar.f5251k0.b(toolbar.f5223F, null);
            c0977o3.n(true);
            toolbar.f5251k0.n(true);
        }
        toolbar.f5257w.setPopupTheme(toolbar.f5224G);
        toolbar.f5257w.setPresenter(c0977o3);
        toolbar.f5250j0 = c0977o3;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        C0 c0G = C0.g(this, windowInsets);
        boolean zG = g(this.f5188z, new Rect(c0G.b(), c0G.d(), c0G.c(), c0G.a()), false);
        WeakHashMap weakHashMap = V.f1964a;
        Rect rect = this.f5169I;
        I.b(this, c0G, rect);
        int i6 = rect.left;
        int i7 = rect.top;
        int i8 = rect.right;
        int i9 = rect.bottom;
        A0 a02 = c0G.f1943a;
        C0 c0L = a02.l(i6, i7, i8, i9);
        this.f5173M = c0L;
        if (!this.f5174N.equals(c0L)) {
            this.f5174N = this.f5173M;
            zG = true;
        }
        Rect rect2 = this.f5170J;
        if (rect2.equals(rect)) {
            if (zG) {
            }
            return a02.a().f1943a.c().f1943a.b().f();
        }
        rect2.set(rect);
        requestLayout();
        return a02.a().f1943a.c().f1943a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = V.f1964a;
        G.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0961g c0961g = (C0961g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) c0961g).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) c0961g).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (!this.f5165E || !z5) {
            return false;
        }
        this.f5178R.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f5178R.getFinalY() > this.f5188z.getHeight()) {
            h();
            this.f5182V.run();
        } else {
            h();
            this.f5181U.run();
        }
        this.f5166F = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        int i10 = this.f5167G + i7;
        this.f5167G = i10;
        setActionBarHideOffset(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        U u5;
        l lVar;
        this.f5183W.f2042a = i6;
        this.f5167G = getActionBarHideOffset();
        h();
        InterfaceC0959f interfaceC0959f = this.f5177Q;
        if (interfaceC0959f == null || (lVar = (u5 = (U) interfaceC0959f).f9253F) == null) {
            return;
        }
        lVar.a();
        u5.f9253F = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) == 0 || this.f5188z.getVisibility() != 0) {
            return false;
        }
        return this.f5165E;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f5165E || this.f5166F) {
            return;
        }
        if (this.f5167G <= this.f5188z.getHeight()) {
            h();
            postDelayed(this.f5181U, 600L);
        } else {
            h();
            postDelayed(this.f5182V, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i6) {
        super.onWindowSystemUiVisibilityChanged(i6);
        k();
        int i7 = this.f5168H ^ i6;
        this.f5168H = i6;
        boolean z5 = (i6 & 4) == 0;
        boolean z6 = (i6 & 256) != 0;
        InterfaceC0959f interfaceC0959f = this.f5177Q;
        if (interfaceC0959f != null) {
            ((U) interfaceC0959f).f9249B = !z6;
            if (z5 || !z6) {
                U u5 = (U) interfaceC0959f;
                if (u5.f9250C) {
                    u5.f9250C = false;
                    u5.G(true);
                }
            } else {
                U u6 = (U) interfaceC0959f;
                if (!u6.f9250C) {
                    u6.f9250C = true;
                    u6.G(true);
                }
            }
        }
        if ((i7 & 256) == 0 || this.f5177Q == null) {
            return;
        }
        WeakHashMap weakHashMap = V.f1964a;
        G.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f5186x = i6;
        InterfaceC0959f interfaceC0959f = this.f5177Q;
        if (interfaceC0959f != null) {
            ((U) interfaceC0959f).f9248A = i6;
        }
    }

    public void setActionBarHideOffset(int i6) {
        h();
        this.f5188z.setTranslationY(-Math.max(0, Math.min(i6, this.f5188z.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0959f interfaceC0959f) {
        this.f5177Q = interfaceC0959f;
        if (getWindowToken() != null) {
            ((U) this.f5177Q).f9248A = this.f5186x;
            int i6 = this.f5168H;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                WeakHashMap weakHashMap = V.f1964a;
                G.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f5164D = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f5165E) {
            this.f5165E = z5;
            if (z5) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i6) {
        k();
        i1 i1Var = (i1) this.f5161A;
        i1Var.f10286d = i6 != 0 ? AbstractC0651b.p(i1Var.f10283a.getContext(), i6) : null;
        i1Var.c();
    }

    public void setLogo(int i6) {
        k();
        i1 i1Var = (i1) this.f5161A;
        i1Var.f10287e = i6 != 0 ? AbstractC0651b.p(i1Var.f10283a.getContext(), i6) : null;
        i1Var.c();
    }

    public void setOverlayMode(boolean z5) {
        this.f5163C = z5;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i6) {
    }

    @Override // m.InterfaceC0980p0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((i1) this.f5161A).f10293k = callback;
    }

    @Override // m.InterfaceC0980p0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        i1 i1Var = (i1) this.f5161A;
        if (i1Var.f10289g) {
            return;
        }
        i1Var.f10290h = charSequence;
        if ((i1Var.f10284b & 8) != 0) {
            Toolbar toolbar = i1Var.f10283a;
            toolbar.setTitle(charSequence);
            if (i1Var.f10289g) {
                V.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0961g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        i1 i1Var = (i1) this.f5161A;
        i1Var.f10286d = drawable;
        i1Var.c();
    }
}
