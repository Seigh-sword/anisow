package R2;

import N.G;
import N.I;
import N.V;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.xo.anilab.R;
import j0.C0840b;
import java.util.WeakHashMap;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends FrameLayout {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final h f2953H = new h();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f2954A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f2955B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f2956C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f2957D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f2958E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Rect f2959F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f2960G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f2961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final P2.j f2962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f2964z;

    public i(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(U2.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1274a.f12442F);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = V.f1964a;
            I.s(this, dimensionPixelSize);
        }
        this.f2963y = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f2962x = P2.j.b(context2, attributeSet, 0, 0).a();
        }
        this.f2964z = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(f2.h.o(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(f2.h.B(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2954A = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f2955B = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2956C = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f2953H);
        setFocusable(true);
        if (getBackground() == null) {
            int iL = C0.l(getBackgroundOverlayColorAlpha(), C0.f(this, R.attr.colorSurface), C0.f(this, R.attr.colorOnSurface));
            P2.j jVar = this.f2962x;
            if (jVar != null) {
                C0840b c0840b = j.f2965u;
                P2.g gVar = new P2.g(jVar);
                gVar.n(ColorStateList.valueOf(iL));
                drawable = gVar;
            } else {
                Resources resources = getResources();
                C0840b c0840b2 = j.f2965u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iL);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f2957D;
            if (colorStateList != null) {
                H.a.h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = V.f1964a;
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(j jVar) {
        this.f2961w = jVar;
    }

    public float getActionTextColorAlpha() {
        return this.f2954A;
    }

    public int getAnimationMode() {
        return this.f2963y;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2964z;
    }

    public int getMaxInlineActionWidth() {
        return this.f2956C;
    }

    public int getMaxWidth() {
        return this.f2955B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j jVar = this.f2961w;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = jVar.f2979i.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    jVar.f2986p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    jVar.e();
                }
            } else {
                jVar.getClass();
            }
        }
        WeakHashMap weakHashMap = V.f1964a;
        G.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i6;
        boolean z5;
        m mVar;
        super.onDetachedFromWindow();
        j jVar = this.f2961w;
        if (jVar != null) {
            n nVarB = n.b();
            g gVar = jVar.f2990t;
            synchronized (nVarB.f2997a) {
                i6 = 1;
                z5 = nVarB.c(gVar) || !((mVar = nVarB.f3000d) == null || gVar == null || mVar.f2993a.get() != gVar);
            }
            if (z5) {
                j.f2968x.post(new f(jVar, i6));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        j jVar = this.f2961w;
        if (jVar == null || !jVar.f2988r) {
            return;
        }
        jVar.d();
        jVar.f2988r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int i8 = this.f2955B;
        if (i8 <= 0 || getMeasuredWidth() <= i8) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), i7);
    }

    public void setAnimationMode(int i6) {
        this.f2963y = i6;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2957D != null) {
            drawable = drawable.mutate();
            H.a.h(drawable, this.f2957D);
            H.a.i(drawable, this.f2958E);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2957D = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            H.a.h(drawableMutate, colorStateList);
            H.a.i(drawableMutate, this.f2958E);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2958E = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            H.a.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f2960G || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f2959F = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        j jVar = this.f2961w;
        if (jVar != null) {
            C0840b c0840b = j.f2965u;
            jVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2953H);
        super.setOnClickListener(onClickListener);
    }
}
