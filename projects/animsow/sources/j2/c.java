package J2;

import M4.B;
import N.AbstractC0111w;
import N.K;
import N.V;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;
import l.InterfaceC0902B;
import l.q;
import m2.C1017B;
import s2.AbstractC1301a;
import u2.C1368a;
import w2.ViewOnLayoutChangeListenerC1476a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout implements InterfaceC0902B {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f1249f0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final C1017B f1250g0 = new C1017B();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final b f1251h0 = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1252A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f1253B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f1254C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1255D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f1256E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1257F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f1258G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final FrameLayout f1259H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final View f1260I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ImageView f1261J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ViewGroup f1262K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TextView f1263L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final TextView f1264M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f1265N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f1266O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public q f1267P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f1268Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Drawable f1269R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Drawable f1270S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ValueAnimator f1271T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C1017B f1272U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f1273V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f1274W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1275a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1276b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1277c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1278d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C1368a f1279e0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f1281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f1282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1283z;

    public c(Context context) {
        super(context);
        this.f1280w = false;
        this.f1265N = -1;
        this.f1266O = 0;
        this.f1272U = f1250g0;
        this.f1273V = 0.0f;
        this.f1274W = false;
        this.f1275a0 = 0;
        this.f1276b0 = 0;
        this.f1277c0 = false;
        this.f1278d0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f1259H = (FrameLayout) findViewById(com.xo.anilab.R.id.navigation_bar_item_icon_container);
        this.f1260I = findViewById(com.xo.anilab.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.xo.anilab.R.id.navigation_bar_item_icon_view);
        this.f1261J = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.xo.anilab.R.id.navigation_bar_item_labels_group);
        this.f1262K = viewGroup;
        TextView textView = (TextView) findViewById(com.xo.anilab.R.id.navigation_bar_item_small_label_view);
        this.f1263L = textView;
        TextView textView2 = (TextView) findViewById(com.xo.anilab.R.id.navigation_bar_item_large_label_view);
        this.f1264M = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f1283z = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f1252A = viewGroup.getPaddingBottom();
        this.f1253B = getResources().getDimensionPixelSize(com.xo.anilab.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = V.f1964a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1476a(1, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = r2.AbstractC1274a.f12443G
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.c.f(android.widget.TextView, int):void");
    }

    public static void g(float f6, float f7, int i6, TextView textView) {
        textView.setScaleX(f6);
        textView.setScaleY(f7);
        textView.setVisibility(i6);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f1259H;
        return frameLayout != null ? frameLayout : this.f1261J;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i6 = 0;
        for (int i7 = 0; i7 < iIndexOfChild; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof c) && childAt.getVisibility() == 0) {
                i6++;
            }
        }
        return i6;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C1368a c1368a = this.f1279e0;
        int minimumWidth = c1368a == null ? 0 : c1368a.getMinimumWidth() - this.f1279e0.f12866A.f12910b.f12897S.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f1261J.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i6, int i7) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i6;
        layoutParams.bottomMargin = i6;
        layoutParams.gravity = i7;
        view.setLayoutParams(layoutParams);
    }

    public static void k(ViewGroup viewGroup, int i6) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i6);
    }

    public final void a(float f6, float f7) {
        this.f1254C = f6 - f7;
        this.f1255D = (f7 * 1.0f) / f6;
        this.f1256E = (f6 * 1.0f) / f7;
    }

    @Override // l.InterfaceC0902B
    public final void b(q qVar) {
        this.f1267P = qVar;
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setIcon(qVar.getIcon());
        setTitle(qVar.f9788e);
        setId(qVar.f9784a);
        if (!TextUtils.isEmpty(qVar.f9800q)) {
            setContentDescription(qVar.f9800q);
        }
        B.q(this, !TextUtils.isEmpty(qVar.f9801r) ? qVar.f9801r : qVar.f9788e);
        setVisibility(qVar.isVisible() ? 0 : 8);
        this.f1280w = true;
    }

    public final void c() {
        q qVar = this.f1267P;
        if (qVar != null) {
            setChecked(qVar.isChecked());
        }
    }

    public final void d() {
        Drawable rippleDrawable = this.f1282y;
        ColorStateList colorStateList = this.f1281x;
        FrameLayout frameLayout = this.f1259H;
        RippleDrawable rippleDrawable2 = null;
        boolean z5 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f1274W && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(N2.a.b(this.f1281x), null, activeIndicatorDrawable);
                z5 = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList2 = this.f1281x;
                int[] iArr = N2.a.f2115d;
                int iA = N2.a.a(colorStateList2, N2.a.f2114c);
                int[] iArr2 = N2.a.f2113b;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, N2.a.a(colorStateList2, iArr2), N2.a.a(colorStateList2, N2.a.f2112a)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = V.f1964a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f1259H;
        if (frameLayout != null && this.f1274W) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f6, float f7) {
        View view = this.f1260I;
        if (view != null) {
            C1017B c1017b = this.f1272U;
            c1017b.getClass();
            view.setScaleX(AbstractC1301a.a(0.4f, 1.0f, f6));
            view.setScaleY(c1017b.i(f6, f7));
            view.setAlpha(AbstractC1301a.b(0.0f, 1.0f, f7 == 0.0f ? 0.8f : 0.0f, f7 == 0.0f ? 1.0f : 0.2f, f6));
        }
        this.f1273V = f6;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f1260I;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C1368a getBadge() {
        return this.f1279e0;
    }

    public int getItemBackgroundResId() {
        return com.xo.anilab.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // l.InterfaceC0902B
    public q getItemData() {
        return this.f1267P;
    }

    public int getItemDefaultMarginResId() {
        return com.xo.anilab.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f1265N;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f1262K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f1253B : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f1262K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(ImageView imageView) {
        if (this.f1279e0 != null) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C1368a c1368a = this.f1279e0;
                if (c1368a != null) {
                    if (c1368a.c() != null) {
                        c1368a.c().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c1368a);
                    }
                }
            }
            this.f1279e0 = null;
        }
    }

    public final void j(int i6) {
        View view = this.f1260I;
        if (view == null || i6 <= 0) {
            return;
        }
        int iMin = Math.min(this.f1275a0, i6 - (this.f1278d0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f1277c0 && this.f1257F == 2) ? iMin : this.f1276b0;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        q qVar = this.f1267P;
        if (qVar != null && qVar.isCheckable() && this.f1267P.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1249f0);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.c.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        post(new Q0.e(i6, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f1260I;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z5) {
        this.f1274W = z5;
        d();
        View view = this.f1260I;
        if (view != null) {
            view.setVisibility(z5 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i6) {
        this.f1276b0 = i6;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i6) {
        if (this.f1253B != i6) {
            this.f1253B = i6;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i6) {
        this.f1278d0 = i6;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z5) {
        this.f1277c0 = z5;
    }

    public void setActiveIndicatorWidth(int i6) {
        this.f1275a0 = i6;
        j(getWidth());
    }

    public void setBadge(C1368a c1368a) {
        C1368a c1368a2 = this.f1279e0;
        if (c1368a2 == c1368a) {
            return;
        }
        boolean z5 = c1368a2 != null;
        ImageView imageView = this.f1261J;
        if (z5 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            i(imageView);
        }
        this.f1279e0 = c1368a;
        if (imageView == null || c1368a == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C1368a c1368a3 = this.f1279e0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c1368a3.setBounds(rect);
        c1368a3.h(imageView, null);
        if (c1368a3.c() != null) {
            c1368a3.c().setForeground(c1368a3);
        } else {
            imageView.getOverlay().add(c1368a3);
        }
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6 A[PHI: r0 r4
      0x00f6: PHI (r0v5 android.view.View) = (r0v3 android.view.View), (r0v11 android.view.View) binds: [B:37:0x0119, B:30:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r4v3 int) = (r4v1 int), (r4v9 int) binds: [B:37:0x0119, B:30:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102 A[PHI: r0 r4
      0x0102: PHI (r0v4 android.view.View) = (r0v3 android.view.View), (r0v11 android.view.View) binds: [B:37:0x0119, B:30:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r4v2 int) = (r4v1 int), (r4v9 int) binds: [B:37:0x0119, B:30:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.c.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        this.f1263L.setEnabled(z5);
        this.f1264M.setEnabled(z5);
        this.f1261J.setEnabled(z5);
        if (z5) {
            K.d(this, AbstractC0111w.b(getContext(), 1002));
        } else {
            WeakHashMap weakHashMap = V.f1964a;
            K.d(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f1269R) {
            return;
        }
        this.f1269R = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f1270S = drawable;
            ColorStateList colorStateList = this.f1268Q;
            if (colorStateList != null) {
                H.a.h(drawable, colorStateList);
            }
        }
        this.f1261J.setImageDrawable(drawable);
    }

    public void setIconSize(int i6) {
        ImageView imageView = this.f1261J;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i6;
        layoutParams.height = i6;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f1268Q = colorStateList;
        if (this.f1267P == null || (drawable = this.f1270S) == null) {
            return;
        }
        H.a.h(drawable, colorStateList);
        this.f1270S.invalidateSelf();
    }

    public void setItemBackground(int i6) {
        Drawable drawableB;
        if (i6 == 0) {
            drawableB = null;
        } else {
            Context context = getContext();
            Object obj = E.f.f379a;
            drawableB = E.a.b(context, i6);
        }
        setItemBackground(drawableB);
    }

    public void setItemPaddingBottom(int i6) {
        if (this.f1252A != i6) {
            this.f1252A = i6;
            c();
        }
    }

    public void setItemPaddingTop(int i6) {
        if (this.f1283z != i6) {
            this.f1283z = i6;
            c();
        }
    }

    public void setItemPosition(int i6) {
        this.f1265N = i6;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1281x = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i6) {
        if (this.f1257F != i6) {
            this.f1257F = i6;
            this.f1272U = (this.f1277c0 && i6 == 2) ? f1251h0 : f1250g0;
            j(getWidth());
            c();
        }
    }

    public void setShifting(boolean z5) {
        if (this.f1258G != z5) {
            this.f1258G = z5;
            c();
        }
    }

    public void setTextAppearanceActive(int i6) {
        this.f1266O = i6;
        TextView textView = this.f1264M;
        f(textView, i6);
        a(this.f1263L.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z5) {
        setTextAppearanceActive(this.f1266O);
        TextView textView = this.f1264M;
        textView.setTypeface(textView.getTypeface(), z5 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i6) {
        TextView textView = this.f1263L;
        f(textView, i6);
        a(textView.getTextSize(), this.f1264M.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1263L.setTextColor(colorStateList);
            this.f1264M.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f1263L.setText(charSequence);
        this.f1264M.setText(charSequence);
        q qVar = this.f1267P;
        if (qVar == null || TextUtils.isEmpty(qVar.f9800q)) {
            setContentDescription(charSequence);
        }
        q qVar2 = this.f1267P;
        if (qVar2 != null && !TextUtils.isEmpty(qVar2.f9801r)) {
            charSequence = this.f1267P.f9801r;
        }
        B.q(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f1282y = drawable;
        d();
    }
}
