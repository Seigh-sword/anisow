package com.google.android.material.button;

import E.f;
import H2.m;
import N.V;
import P2.j;
import P2.u;
import U2.a;
import Y2.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import f2.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C0988u;
import p1.C1243i;
import r2.AbstractC1274a;
import z2.InterfaceC1530a;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0988u implements Checkable, u {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int[] f7109N = {R.attr.state_checkable};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f7110O = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinkedHashSet f7111A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC1530a f7112B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f7113C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f7114D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f7115E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f7116F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f7117G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f7118H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f7119I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f7120J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f7121K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f7122L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f7123M;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f7124z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.xo.anilab.R.attr.materialButtonStyle, com.xo.anilab.R.style.Widget_MaterialComponents_Button), attributeSet, com.xo.anilab.R.attr.materialButtonStyle);
        this.f7111A = new LinkedHashSet();
        this.f7121K = false;
        this.f7122L = false;
        Context context2 = getContext();
        TypedArray typedArrayE = m.e(context2, attributeSet, AbstractC1274a.f12461o, com.xo.anilab.R.attr.materialButtonStyle, com.xo.anilab.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f7120J = typedArrayE.getDimensionPixelSize(12, 0);
        int i6 = typedArrayE.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f7113C = h.B(i6, mode);
        this.f7114D = h.o(getContext(), typedArrayE, 14);
        this.f7115E = h.s(getContext(), typedArrayE, 10);
        this.f7123M = typedArrayE.getInteger(11, 1);
        this.f7117G = typedArrayE.getDimensionPixelSize(13, 0);
        c cVar = new c(this, j.b(context2, attributeSet, com.xo.anilab.R.attr.materialButtonStyle, com.xo.anilab.R.style.Widget_MaterialComponents_Button).a());
        this.f7124z = cVar;
        cVar.f14085c = typedArrayE.getDimensionPixelOffset(1, 0);
        cVar.f14086d = typedArrayE.getDimensionPixelOffset(2, 0);
        cVar.f14087e = typedArrayE.getDimensionPixelOffset(3, 0);
        cVar.f14088f = typedArrayE.getDimensionPixelOffset(4, 0);
        if (typedArrayE.hasValue(8)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(8, -1);
            cVar.f14089g = dimensionPixelSize;
            float f6 = dimensionPixelSize;
            G1.m mVarE = cVar.f14084b.e();
            mVarE.f812e = new P2.a(f6);
            mVarE.f813f = new P2.a(f6);
            mVarE.f814g = new P2.a(f6);
            mVarE.f815h = new P2.a(f6);
            cVar.c(mVarE.a());
            cVar.f14098p = true;
        }
        cVar.f14090h = typedArrayE.getDimensionPixelSize(20, 0);
        cVar.f14091i = h.B(typedArrayE.getInt(7, -1), mode);
        cVar.f14092j = h.o(getContext(), typedArrayE, 6);
        cVar.f14093k = h.o(getContext(), typedArrayE, 19);
        cVar.f14094l = h.o(getContext(), typedArrayE, 16);
        cVar.f14099q = typedArrayE.getBoolean(5, false);
        cVar.f14102t = typedArrayE.getDimensionPixelSize(9, 0);
        cVar.f14100r = typedArrayE.getBoolean(21, true);
        WeakHashMap weakHashMap = V.f1964a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            cVar.f14097o = true;
            setSupportBackgroundTintList(cVar.f14092j);
            setSupportBackgroundTintMode(cVar.f14091i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f14085c, paddingTop + cVar.f14087e, paddingEnd + cVar.f14086d, paddingBottom + cVar.f14088f);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.f7120J);
        d(this.f7115E != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f7124z;
        return cVar != null && cVar.f14099q;
    }

    public final boolean b() {
        c cVar = this.f7124z;
        return (cVar == null || cVar.f14097o) ? false : true;
    }

    public final void c() {
        int i6 = this.f7123M;
        boolean z5 = true;
        if (i6 != 1 && i6 != 2) {
            z5 = false;
        }
        if (z5) {
            setCompoundDrawablesRelative(this.f7115E, null, null, null);
            return;
        }
        if (i6 == 3 || i6 == 4) {
            setCompoundDrawablesRelative(null, null, this.f7115E, null);
        } else if (i6 == 16 || i6 == 32) {
            setCompoundDrawablesRelative(null, this.f7115E, null, null);
        }
    }

    public final void d(boolean z5) {
        Drawable drawable = this.f7115E;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f7115E = drawableMutate;
            H.a.h(drawableMutate, this.f7114D);
            PorterDuff.Mode mode = this.f7113C;
            if (mode != null) {
                H.a.i(this.f7115E, mode);
            }
            int intrinsicWidth = this.f7117G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f7115E.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f7117G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f7115E.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7115E;
            int i6 = this.f7118H;
            int i7 = this.f7119I;
            drawable2.setBounds(i6, i7, intrinsicWidth + i6, intrinsicHeight + i7);
            this.f7115E.setVisible(true, z5);
        }
        if (z5) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i8 = this.f7123M;
        if (((i8 == 1 || i8 == 2) && drawable3 != this.f7115E) || (((i8 == 3 || i8 == 4) && drawable5 != this.f7115E) || ((i8 == 16 || i8 == 32) && drawable4 != this.f7115E))) {
            c();
        }
    }

    public final void e(int i6, int i7) {
        if (this.f7115E == null || getLayout() == null) {
            return;
        }
        int i8 = this.f7123M;
        if (!(i8 == 1 || i8 == 2) && i8 != 3 && i8 != 4) {
            if (i8 == 16 || i8 == 32) {
                this.f7118H = 0;
                if (i8 == 16) {
                    this.f7119I = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.f7117G;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f7115E.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i7 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f7120J) - getPaddingBottom()) / 2);
                if (this.f7119I != iMax) {
                    this.f7119I = iMax;
                    d(false);
                }
                return;
            }
            return;
        }
        this.f7119I = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i9 = this.f7123M;
        if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f7118H = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.f7117G;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f7115E.getIntrinsicWidth();
        }
        int textLayoutWidth = i6 - getTextLayoutWidth();
        WeakHashMap weakHashMap = V.f1964a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f7120J) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f7123M == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f7118H != paddingEnd) {
            this.f7118H = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f7116F)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f7116F;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f7124z.f14089g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7115E;
    }

    public int getIconGravity() {
        return this.f7123M;
    }

    public int getIconPadding() {
        return this.f7120J;
    }

    public int getIconSize() {
        return this.f7117G;
    }

    public ColorStateList getIconTint() {
        return this.f7114D;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7113C;
    }

    public int getInsetBottom() {
        return this.f7124z.f14088f;
    }

    public int getInsetTop() {
        return this.f7124z.f14087e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f7124z.f14094l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (b()) {
            return this.f7124z.f14084b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f7124z.f14093k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f7124z.f14090h;
        }
        return 0;
    }

    @Override // m.C0988u
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f7124z.f14092j : super.getSupportBackgroundTintList();
    }

    @Override // m.C0988u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f7124z.f14091i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7121K;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            b.B(this, this.f7124z.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7109N);
        }
        if (this.f7121K) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7110O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // m.C0988u, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f7121K);
    }

    @Override // m.C0988u, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f7121K);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.C0988u, android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z2.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z2.b bVar = (z2.b) parcelable;
        super.onRestoreInstanceState(bVar.f3569w);
        setChecked(bVar.f14082y);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        z2.b bVar = new z2.b(super.onSaveInstanceState());
        bVar.f14082y = this.f7121K;
        return bVar;
    }

    @Override // m.C0988u, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f7124z.f14100r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7115E != null) {
            if (this.f7115E.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7116F = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (!b()) {
            super.setBackgroundColor(i6);
            return;
        }
        c cVar = this.f7124z;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i6);
        }
    }

    @Override // m.C0988u, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            c cVar = this.f7124z;
            cVar.f14097o = true;
            ColorStateList colorStateList = cVar.f14092j;
            MaterialButton materialButton = cVar.f14083a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(cVar.f14091i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.C0988u, android.view.View
    public void setBackgroundResource(int i6) {
        setBackgroundDrawable(i6 != 0 ? AbstractC0651b.p(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z5) {
        if (b()) {
            this.f7124z.f14099q = z5;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (a() && isEnabled() && this.f7121K != z5) {
            this.f7121K = z5;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z6 = this.f7121K;
                if (!materialButtonToggleGroup.f7127B) {
                    materialButtonToggleGroup.b(getId(), z6);
                }
            }
            if (this.f7122L) {
                return;
            }
            this.f7122L = true;
            Iterator it = this.f7111A.iterator();
            if (it.hasNext()) {
                AbstractC0628i.p(it.next());
                throw null;
            }
            this.f7122L = false;
        }
    }

    public void setCornerRadius(int i6) {
        if (b()) {
            c cVar = this.f7124z;
            if (cVar.f14098p && cVar.f14089g == i6) {
                return;
            }
            cVar.f14089g = i6;
            cVar.f14098p = true;
            float f6 = i6;
            G1.m mVarE = cVar.f14084b.e();
            mVarE.f812e = new P2.a(f6);
            mVarE.f813f = new P2.a(f6);
            mVarE.f814g = new P2.a(f6);
            mVarE.f815h = new P2.a(f6);
            cVar.c(mVarE.a());
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (b()) {
            this.f7124z.b(false).m(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7115E != drawable) {
            this.f7115E = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i6) {
        if (this.f7123M != i6) {
            this.f7123M = i6;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.f7120J != i6) {
            this.f7120J = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        setIcon(i6 != 0 ? AbstractC0651b.p(getContext(), i6) : null);
    }

    public void setIconSize(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f7117G != i6) {
            this.f7117G = i6;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7114D != colorStateList) {
            this.f7114D = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7113C != mode) {
            this.f7113C = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(f.b(getContext(), i6));
    }

    public void setInsetBottom(int i6) {
        c cVar = this.f7124z;
        cVar.d(cVar.f14087e, i6);
    }

    public void setInsetTop(int i6) {
        c cVar = this.f7124z;
        cVar.d(i6, cVar.f14088f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1530a interfaceC1530a) {
        this.f7112B = interfaceC1530a;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        InterfaceC1530a interfaceC1530a = this.f7112B;
        if (interfaceC1530a != null) {
            ((MaterialButtonToggleGroup) ((C1243i) interfaceC1530a).f12254x).invalidate();
        }
        super.setPressed(z5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f7124z;
            if (cVar.f14094l != colorStateList) {
                cVar.f14094l = colorStateList;
                MaterialButton materialButton = cVar.f14083a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(N2.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i6) {
        if (b()) {
            setRippleColor(f.b(getContext(), i6));
        }
    }

    @Override // P2.u
    public void setShapeAppearanceModel(j jVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7124z.c(jVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (b()) {
            c cVar = this.f7124z;
            cVar.f14096n = z5;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f7124z;
            if (cVar.f14093k != colorStateList) {
                cVar.f14093k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i6) {
        if (b()) {
            setStrokeColor(f.b(getContext(), i6));
        }
    }

    public void setStrokeWidth(int i6) {
        if (b()) {
            c cVar = this.f7124z;
            if (cVar.f14090h != i6) {
                cVar.f14090h = i6;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // m.C0988u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f7124z;
        if (cVar.f14092j != colorStateList) {
            cVar.f14092j = colorStateList;
            if (cVar.b(false) != null) {
                H.a.h(cVar.b(false), cVar.f14092j);
            }
        }
    }

    @Override // m.C0988u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f7124z;
        if (cVar.f14091i != mode) {
            cVar.f14091i = mode;
            if (cVar.b(false) == null || cVar.f14091i == null) {
                return;
            }
            H.a.i(cVar.b(false), cVar.f14091i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f7124z.f14100r = z5;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f7121K);
    }
}
