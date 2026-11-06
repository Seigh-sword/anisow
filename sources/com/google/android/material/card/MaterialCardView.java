package com.google.android.material.card;

import A2.d;
import H2.m;
import P2.f;
import P2.g;
import P2.j;
import P2.u;
import U2.a;
import Y2.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import d2.AbstractC0651b;
import f2.h;
import m2.C0;
import r.C1267a;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends C1267a implements Checkable, u {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f7136H = {R.attr.state_checkable};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f7137I = {R.attr.state_checked};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f7138J = {com.xo.anilab.R.attr.state_dragged};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final d f7139D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f7140E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7141F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7142G;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.xo.anilab.R.attr.materialCardViewStyle, com.xo.anilab.R.style.Widget_MaterialComponents_CardView), attributeSet, com.xo.anilab.R.attr.materialCardViewStyle);
        this.f7141F = false;
        this.f7142G = false;
        this.f7140E = true;
        TypedArray typedArrayE = m.e(getContext(), attributeSet, AbstractC1274a.f12465s, com.xo.anilab.R.attr.materialCardViewStyle, com.xo.anilab.R.style.Widget_MaterialComponents_CardView, new int[0]);
        d dVar = new d(this, attributeSet);
        this.f7139D = dVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g gVar = dVar.f13c;
        gVar.n(cardBackgroundColor);
        dVar.f12b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        dVar.l();
        MaterialCardView materialCardView = dVar.f11a;
        ColorStateList colorStateListO = h.o(materialCardView.getContext(), typedArrayE, 11);
        dVar.f24n = colorStateListO;
        if (colorStateListO == null) {
            dVar.f24n = ColorStateList.valueOf(-1);
        }
        dVar.f18h = typedArrayE.getDimensionPixelSize(12, 0);
        boolean z5 = typedArrayE.getBoolean(0, false);
        dVar.f29s = z5;
        materialCardView.setLongClickable(z5);
        dVar.f22l = h.o(materialCardView.getContext(), typedArrayE, 6);
        dVar.g(h.s(materialCardView.getContext(), typedArrayE, 2));
        dVar.f16f = typedArrayE.getDimensionPixelSize(5, 0);
        dVar.f15e = typedArrayE.getDimensionPixelSize(4, 0);
        dVar.f17g = typedArrayE.getInteger(3, 8388661);
        ColorStateList colorStateListO2 = h.o(materialCardView.getContext(), typedArrayE, 7);
        dVar.f21k = colorStateListO2;
        if (colorStateListO2 == null) {
            dVar.f21k = ColorStateList.valueOf(C0.f(materialCardView, com.xo.anilab.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListO3 = h.o(materialCardView.getContext(), typedArrayE, 1);
        g gVar2 = dVar.f14d;
        gVar2.n(colorStateListO3 == null ? ColorStateList.valueOf(0) : colorStateListO3);
        int[] iArr = N2.a.f2112a;
        RippleDrawable rippleDrawable = dVar.f25o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(dVar.f21k);
        }
        gVar.m(materialCardView.getCardElevation());
        float f6 = dVar.f18h;
        ColorStateList colorStateList = dVar.f24n;
        gVar2.f2457w.f2427k = f6;
        gVar2.invalidateSelf();
        f fVar = gVar2.f2457w;
        if (fVar.f2420d != colorStateList) {
            fVar.f2420d = colorStateList;
            gVar2.onStateChange(gVar2.getState());
        }
        materialCardView.setBackgroundInternal(dVar.d(gVar));
        Drawable drawableC = dVar.j() ? dVar.c() : gVar2;
        dVar.f19i = drawableC;
        materialCardView.setForeground(dVar.d(drawableC));
        typedArrayE.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f7139D.f13c.getBounds());
        return rectF;
    }

    public final void b() {
        d dVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (dVar = this.f7139D).f25o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i6 = bounds.bottom;
        dVar.f25o.setBounds(bounds.left, bounds.top, bounds.right, i6 - 1);
        dVar.f25o.setBounds(bounds.left, bounds.top, bounds.right, i6);
    }

    @Override // r.C1267a
    public ColorStateList getCardBackgroundColor() {
        return this.f7139D.f13c.f2457w.f2419c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f7139D.f14d.f2457w.f2419c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f7139D.f20j;
    }

    public int getCheckedIconGravity() {
        return this.f7139D.f17g;
    }

    public int getCheckedIconMargin() {
        return this.f7139D.f15e;
    }

    public int getCheckedIconSize() {
        return this.f7139D.f16f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f7139D.f22l;
    }

    @Override // r.C1267a
    public int getContentPaddingBottom() {
        return this.f7139D.f12b.bottom;
    }

    @Override // r.C1267a
    public int getContentPaddingLeft() {
        return this.f7139D.f12b.left;
    }

    @Override // r.C1267a
    public int getContentPaddingRight() {
        return this.f7139D.f12b.right;
    }

    @Override // r.C1267a
    public int getContentPaddingTop() {
        return this.f7139D.f12b.top;
    }

    public float getProgress() {
        return this.f7139D.f13c.f2457w.f2426j;
    }

    @Override // r.C1267a
    public float getRadius() {
        return this.f7139D.f13c.i();
    }

    public ColorStateList getRippleColor() {
        return this.f7139D.f21k;
    }

    public j getShapeAppearanceModel() {
        return this.f7139D.f23m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f7139D.f24n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f7139D.f24n;
    }

    public int getStrokeWidth() {
        return this.f7139D.f18h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7141F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.f7139D;
        dVar.k();
        b.B(this, dVar.f13c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 3);
        d dVar = this.f7139D;
        if (dVar != null && dVar.f29s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7136H);
        }
        if (this.f7141F) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7137I);
        }
        if (this.f7142G) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7138J);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f7141F);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        d dVar = this.f7139D;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f29s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f7141F);
    }

    @Override // r.C1267a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        this.f7139D.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f7140E) {
            d dVar = this.f7139D;
            if (!dVar.f28r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                dVar.f28r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // r.C1267a
    public void setCardBackgroundColor(int i6) {
        this.f7139D.f13c.n(ColorStateList.valueOf(i6));
    }

    @Override // r.C1267a
    public void setCardElevation(float f6) {
        super.setCardElevation(f6);
        d dVar = this.f7139D;
        dVar.f13c.m(dVar.f11a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f7139D.f14d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.n(colorStateList);
    }

    public void setCheckable(boolean z5) {
        this.f7139D.f29s = z5;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (this.f7141F != z5) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f7139D.g(drawable);
    }

    public void setCheckedIconGravity(int i6) {
        d dVar = this.f7139D;
        if (dVar.f17g != i6) {
            dVar.f17g = i6;
            MaterialCardView materialCardView = dVar.f11a;
            dVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i6) {
        this.f7139D.f15e = i6;
    }

    public void setCheckedIconMarginResource(int i6) {
        if (i6 != -1) {
            this.f7139D.f15e = getResources().getDimensionPixelSize(i6);
        }
    }

    public void setCheckedIconResource(int i6) {
        this.f7139D.g(AbstractC0651b.p(getContext(), i6));
    }

    public void setCheckedIconSize(int i6) {
        this.f7139D.f16f = i6;
    }

    public void setCheckedIconSizeResource(int i6) {
        if (i6 != 0) {
            this.f7139D.f16f = getResources().getDimensionPixelSize(i6);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f7139D;
        dVar.f22l = colorStateList;
        Drawable drawable = dVar.f20j;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z5) {
        super.setClickable(z5);
        d dVar = this.f7139D;
        if (dVar != null) {
            dVar.k();
        }
    }

    public void setDragged(boolean z5) {
        if (this.f7142G != z5) {
            this.f7142G = z5;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // r.C1267a
    public void setMaxCardElevation(float f6) {
        super.setMaxCardElevation(f6);
        this.f7139D.m();
    }

    @Override // r.C1267a
    public void setPreventCornerOverlap(boolean z5) {
        super.setPreventCornerOverlap(z5);
        d dVar = this.f7139D;
        dVar.m();
        dVar.l();
    }

    public void setProgress(float f6) {
        d dVar = this.f7139D;
        dVar.f13c.o(f6);
        g gVar = dVar.f14d;
        if (gVar != null) {
            gVar.o(f6);
        }
        g gVar2 = dVar.f27q;
        if (gVar2 != null) {
            gVar2.o(f6);
        }
    }

    @Override // r.C1267a
    public void setRadius(float f6) {
        super.setRadius(f6);
        d dVar = this.f7139D;
        G1.m mVarE = dVar.f23m.e();
        mVarE.f812e = new P2.a(f6);
        mVarE.f813f = new P2.a(f6);
        mVarE.f814g = new P2.a(f6);
        mVarE.f815h = new P2.a(f6);
        dVar.h(mVarE.a());
        dVar.f19i.invalidateSelf();
        if (dVar.i() || (dVar.f11a.getPreventCornerOverlap() && !dVar.f13c.l())) {
            dVar.l();
        }
        if (dVar.i()) {
            dVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f7139D;
        dVar.f21k = colorStateList;
        int[] iArr = N2.a.f2112a;
        RippleDrawable rippleDrawable = dVar.f25o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i6) {
        ColorStateList colorStateListB = E.f.b(getContext(), i6);
        d dVar = this.f7139D;
        dVar.f21k = colorStateListB;
        int[] iArr = N2.a.f2112a;
        RippleDrawable rippleDrawable = dVar.f25o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListB);
        }
    }

    @Override // P2.u
    public void setShapeAppearanceModel(j jVar) {
        setClipToOutline(jVar.d(getBoundsAsRectF()));
        this.f7139D.h(jVar);
    }

    public void setStrokeColor(int i6) {
        setStrokeColor(ColorStateList.valueOf(i6));
    }

    public void setStrokeWidth(int i6) {
        d dVar = this.f7139D;
        if (i6 != dVar.f18h) {
            dVar.f18h = i6;
            g gVar = dVar.f14d;
            ColorStateList colorStateList = dVar.f24n;
            gVar.f2457w.f2427k = i6;
            gVar.invalidateSelf();
            f fVar = gVar.f2457w;
            if (fVar.f2420d != colorStateList) {
                fVar.f2420d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // r.C1267a
    public void setUseCompatPadding(boolean z5) {
        super.setUseCompatPadding(z5);
        d dVar = this.f7139D;
        dVar.m();
        dVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d dVar = this.f7139D;
        if (dVar != null && dVar.f29s && isEnabled()) {
            this.f7141F = !this.f7141F;
            refreshDrawableState();
            b();
            dVar.f(this.f7141F, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f7139D;
        if (dVar.f24n != colorStateList) {
            dVar.f24n = colorStateList;
            g gVar = dVar.f14d;
            gVar.f2457w.f2427k = dVar.f18h;
            gVar.invalidateSelf();
            f fVar = gVar.f2457w;
            if (fVar.f2420d != colorStateList) {
                fVar.f2420d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // r.C1267a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f7139D.f13c.n(colorStateList);
    }

    public void setOnCheckedChangeListener(A2.a aVar) {
    }
}
