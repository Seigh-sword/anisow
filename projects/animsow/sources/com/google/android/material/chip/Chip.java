package com.google.android.material.chip;

import D2.b;
import D2.d;
import D2.e;
import D2.f;
import H.g;
import H.h;
import N.V;
import N2.a;
import P2.j;
import P2.u;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import d2.AbstractC0651b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C0990v;
import s2.C1302b;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0990v implements e, u, Checkable {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Rect f7146S = new Rect();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int[] f7147T = {R.attr.state_selected};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f7148U = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public f f7149A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InsetDrawable f7150B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RippleDrawable f7151C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View.OnClickListener f7152D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7153E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7154F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7155G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f7156H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7157I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f7158J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f7159K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f7160L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CharSequence f7161M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final d f7162N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f7163O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Rect f7164P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RectF f7165Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final b f7166R;

    /* JADX WARN: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f7165Q;
        rectF.setEmpty();
        if (c() && this.f7152D != null) {
            f fVar = this.f7149A;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.Y()) {
                float f6 = fVar.f356z0 + fVar.f355y0 + fVar.f341k0 + fVar.f354x0 + fVar.f353w0;
                if (H.b.a(fVar) == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f6;
                } else {
                    float f8 = bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f6;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i6 = (int) closeIconTouchBounds.left;
        int i7 = (int) closeIconTouchBounds.top;
        int i8 = (int) closeIconTouchBounds.right;
        int i9 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f7164P;
        rect.set(i6, i7, i8, i9);
        return rect;
    }

    private M2.d getTextAppearance() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f303G0.f1054g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.f7156H != z5) {
            this.f7156H = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.f7155G != z5) {
            this.f7155G = z5;
            refreshDrawableState();
        }
    }

    public final void b(int i6) {
        this.f7160L = i6;
        if (!this.f7158J) {
            InsetDrawable insetDrawable = this.f7150B;
            if (insetDrawable == null) {
                int[] iArr = a.f2112a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f7150B = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = a.f2112a;
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i6 - ((int) this.f7149A.f320V));
        int iMax2 = Math.max(0, i6 - this.f7149A.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f7150B;
            if (insetDrawable2 == null) {
                int[] iArr3 = a.f2112a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f7150B = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = a.f2112a;
                    f();
                    return;
                }
                return;
            }
        }
        int i7 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i8 = iMax > 0 ? iMax / 2 : 0;
        if (this.f7150B != null) {
            Rect rect = new Rect();
            this.f7150B.getPadding(rect);
            if (rect.top == i8 && rect.bottom == i8 && rect.left == i7 && rect.right == i7) {
                int[] iArr5 = a.f2112a;
                f();
                return;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        this.f7150B = new InsetDrawable((Drawable) this.f7149A, i7, i8, i7, i8);
        int[] iArr6 = a.f2112a;
        f();
    }

    public final boolean c() {
        f fVar = this.f7149A;
        if (fVar != null) {
            Object obj = fVar.f338h0;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof g) {
                ((h) ((g) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        f fVar = this.f7149A;
        return fVar != null && fVar.f343m0;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i6;
        if (!this.f7163O) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f7162N;
        AccessibilityManager accessibilityManager = dVar.f3647h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x5 = motionEvent.getX();
                float y5 = motionEvent.getY();
                Chip chip = dVar.f295q;
                int i7 = (chip.c() && chip.getCloseIconTouchBounds().contains(x5, y5)) ? 1 : 0;
                int i8 = dVar.f3652m;
                if (i8 != i7) {
                    dVar.f3652m = i7;
                    dVar.q(i7, 128);
                    dVar.q(i8, 256);
                }
                if (i7 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i6 = dVar.f3652m) != Integer.MIN_VALUE) {
                if (i6 == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f3652m = Integer.MIN_VALUE;
                dVar.q(Integer.MIN_VALUE, 128);
                dVar.q(i6, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f7163O
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            D2.d r0 = r9.f7162N
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto La4
            int r1 = r10.getKeyCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 61
            r5 = 0
            if (r1 == r4) goto L87
            r4 = 0
            r6 = 66
            if (r1 == r6) goto L56
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L56;
                default: goto L28;
            }
        L28:
            goto La4
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto La4
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r6 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r6 = 17
            goto L44
        L42:
            r6 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L4a:
            if (r4 >= r1) goto L9d
            boolean r8 = r0.m(r6, r5)
            if (r8 == 0) goto L9d
            int r4 = r4 + 1
            r7 = r2
            goto L4a
        L56:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto La4
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto La4
            int r1 = r0.f3651l
            if (r1 == r3) goto L9f
            com.google.android.material.chip.Chip r5 = r0.f295q
            if (r1 != 0) goto L6f
            boolean r1 = r5.performClick()
            goto L9f
        L6f:
            if (r1 != r2) goto L9f
            r5.playSoundEffect(r4)
            android.view.View$OnClickListener r1 = r5.f7152D
            if (r1 == 0) goto L7c
            r1.onClick(r5)
            r4 = r2
        L7c:
            boolean r1 = r5.f7163O
            if (r1 == 0) goto L85
            D2.d r1 = r5.f7162N
            r1.q(r2, r2)
        L85:
            r1 = r4
            goto L9f
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r7 = r0.m(r1, r5)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto La4
            boolean r7 = r0.m(r2, r5)
        L9d:
            if (r7 == 0) goto La4
        L9f:
            int r0 = r0.f3651l
            if (r0 == r3) goto La4
            return r2
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // m.C0990v, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f7149A;
        if (fVar == null || !f.z(fVar.f338h0)) {
            return;
        }
        f fVar2 = this.f7149A;
        ?? IsEnabled = isEnabled();
        int i6 = IsEnabled;
        if (this.f7157I) {
            i6 = IsEnabled + 1;
        }
        int i7 = i6;
        if (this.f7156H) {
            i7 = i6 + 1;
        }
        int i8 = i7;
        if (this.f7155G) {
            i8 = i7 + 1;
        }
        int i9 = i8;
        if (isChecked()) {
            i9 = i8 + 1;
        }
        int[] iArr = new int[i9];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f7157I) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f7156H) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f7155G) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        if (Arrays.equals(fVar2.f319U0, iArr)) {
            return;
        }
        fVar2.f319U0 = iArr;
        if (fVar2.Y() && fVar2.B(fVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final void e() {
        boolean z5;
        f fVar;
        if (!c() || (fVar = this.f7149A) == null || !fVar.f337g0 || this.f7152D == null) {
            V.l(this, null);
            z5 = false;
        } else {
            V.l(this, this.f7162N);
            z5 = true;
        }
        this.f7163O = z5;
    }

    public final void f() {
        this.f7151C = new RippleDrawable(a.b(this.f7149A.f328Z), getBackgroundDrawable(), null);
        f fVar = this.f7149A;
        if (fVar.f321V0) {
            fVar.f321V0 = false;
            fVar.f323W0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f7151C;
        WeakHashMap weakHashMap = V.f1964a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f7149A) == null) {
            return;
        }
        int iW = (int) (fVar.w() + fVar.f356z0 + fVar.f353w0);
        f fVar2 = this.f7149A;
        int iV = (int) (fVar2.v() + fVar2.f349s0 + fVar2.f352v0);
        if (this.f7150B != null) {
            Rect rect = new Rect();
            this.f7150B.getPadding(rect);
            iV += rect.left;
            iW += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = V.f1964a;
        setPaddingRelative(iV, paddingTop, iW, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f7161M)) {
            return this.f7161M;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f7150B;
        return insetDrawable == null ? this.f7149A : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f345o0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f346p0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f318U;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return Math.max(0.0f, fVar.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7149A;
    }

    public float getChipEndPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f356z0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f7149A;
        if (fVar == null || (drawable = fVar.f333c0) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        ((h) ((g) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f335e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f334d0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f320V;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f349s0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f324X;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f326Y;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f7149A;
        if (fVar == null || (drawable = fVar.f338h0) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        ((h) ((g) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f342l0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f355y0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f341k0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f354x0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f340j0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f327Y0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f7163O) {
            d dVar = this.f7162N;
            if (dVar.f3651l == 1 || dVar.f3650k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1302b getHideMotionSpec() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f348r0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f351u0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f350t0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f328Z;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f7149A.f2457w.f2417a;
    }

    public C1302b getShowMotionSpec() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f347q0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f353w0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f7149A;
        if (fVar != null) {
            return fVar.f352v0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f7149A;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        M2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f7166R);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y2.b.B(this, this.f7149A);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7147T);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7148U);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i6, Rect rect) {
        super.onFocusChanged(z5, i6, rect);
        if (this.f7163O) {
            d dVar = this.f7162N;
            int i7 = dVar.f3651l;
            if (i7 != Integer.MIN_VALUE) {
                dVar.j(i7);
            }
            if (z5) {
                dVar.m(i6, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i6);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.f7159K != i6) {
            this.f7159K = i6;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L51
        L21:
            boolean r0 = r5.f7155G
            if (r0 == 0) goto L51
            if (r1 != 0) goto L57
            r5.setCloseIconPressed(r2)
            goto L57
        L2b:
            boolean r0 = r5.f7155G
            if (r0 == 0) goto L44
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f7152D
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f7163O
            if (r0 == 0) goto L42
            D2.d r0 = r5.f7162N
            r0.q(r3, r3)
        L42:
            r0 = r3
            goto L45
        L44:
            r0 = r2
        L45:
            r5.setCloseIconPressed(r2)
            if (r0 != 0) goto L57
            goto L51
        L4b:
            if (r1 == 0) goto L51
            r5.setCloseIconPressed(r3)
            goto L57
        L51:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L58
        L57:
            r2 = r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f7161M = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7151C) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.C0990v, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7151C) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.C0990v, android.view.View
    public void setBackgroundResource(int i6) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.C(z5);
        }
    }

    public void setCheckableResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.C(fVar.f298A0.getResources().getBoolean(i6));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        f fVar = this.f7149A;
        if (fVar == null) {
            this.f7154F = z5;
        } else if (fVar.f343m0) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.D(AbstractC0651b.p(fVar.f298A0, i6));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.E(E.f.b(fVar.f298A0, i6));
        }
    }

    public void setCheckedIconVisible(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.F(fVar.f298A0.getResources().getBoolean(i6));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f318U == colorStateList) {
            return;
        }
        fVar.f318U = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i6) {
        ColorStateList colorStateListB;
        f fVar = this.f7149A;
        if (fVar == null || fVar.f318U == (colorStateListB = E.f.b(fVar.f298A0, i6))) {
            return;
        }
        fVar.f318U = colorStateListB;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.G(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.G(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f7149A;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f325X0 = new WeakReference(null);
            }
            this.f7149A = fVar;
            fVar.f329Z0 = false;
            fVar.f325X0 = new WeakReference(this);
            b(this.f7160L);
        }
    }

    public void setChipEndPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f356z0 == f6) {
            return;
        }
        fVar.f356z0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipEndPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            float dimension = fVar.f298A0.getResources().getDimension(i6);
            if (fVar.f356z0 != dimension) {
                fVar.f356z0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.H(AbstractC0651b.p(fVar.f298A0, i6));
        }
    }

    public void setChipIconSize(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.I(f6);
        }
    }

    public void setChipIconSizeResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.I(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.J(E.f.b(fVar.f298A0, i6));
        }
    }

    public void setChipIconVisible(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.K(fVar.f298A0.getResources().getBoolean(i6));
        }
    }

    public void setChipMinHeight(float f6) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f320V == f6) {
            return;
        }
        fVar.f320V = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipMinHeightResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            float dimension = fVar.f298A0.getResources().getDimension(i6);
            if (fVar.f320V != dimension) {
                fVar.f320V = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f349s0 == f6) {
            return;
        }
        fVar.f349s0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipStartPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            float dimension = fVar.f298A0.getResources().getDimension(i6);
            if (fVar.f349s0 != dimension) {
                fVar.f349s0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.L(E.f.b(fVar.f298A0, i6));
        }
    }

    public void setChipStrokeWidth(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.M(f6);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.M(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.N(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f342l0 == charSequence) {
            return;
        }
        String str = L.b.f1656d;
        L.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? L.b.f1659g : L.b.f1658f;
        fVar.f342l0 = bVar.c(charSequence, bVar.f1662c);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.O(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.O(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.N(AbstractC0651b.p(fVar.f298A0, i6));
        }
        e();
    }

    public void setCloseIconSize(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.P(f6);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.P(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.Q(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.Q(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.R(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.R(E.f.b(fVar.f298A0, i6));
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    @Override // m.C0990v, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.C0990v, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.m(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f7149A == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f327Y0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.f7158J = z5;
        b(this.f7160L);
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i6);
        }
    }

    public void setHideMotionSpec(C1302b c1302b) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f348r0 = c1302b;
        }
    }

    public void setHideMotionSpecResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f348r0 = C1302b.a(fVar.f298A0, i6);
        }
    }

    public void setIconEndPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.T(f6);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.T(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    public void setIconStartPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.U(f6);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.U(fVar.f298A0.getResources().getDimension(i6));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.f7149A == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f331a1 = i6;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i6);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7153E = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7152D = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.V(colorStateList);
        }
        if (this.f7149A.f321V0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.V(E.f.b(fVar.f298A0, i6));
            if (this.f7149A.f321V0) {
                return;
            }
            f();
        }
    }

    @Override // P2.u
    public void setShapeAppearanceModel(j jVar) {
        this.f7149A.setShapeAppearanceModel(jVar);
    }

    public void setShowMotionSpec(C1302b c1302b) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f347q0 = c1302b;
        }
    }

    public void setShowMotionSpecResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f347q0 = C1302b.a(fVar.f298A0, i6);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f7149A;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f329Z0 ? null : charSequence, bufferType);
        f fVar2 = this.f7149A;
        if (fVar2 == null || TextUtils.equals(fVar2.f330a0, charSequence)) {
            return;
        }
        fVar2.f330a0 = charSequence;
        fVar2.f303G0.f1052e = true;
        fVar2.invalidateSelf();
        fVar2.A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        f fVar = this.f7149A;
        if (fVar != null) {
            Context context = fVar.f298A0;
            fVar.f303G0.b(new M2.d(context, i6), context);
        }
        h();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f353w0 == f6) {
            return;
        }
        fVar.f353w0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextEndPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            float dimension = fVar.f298A0.getResources().getDimension(i6);
            if (fVar.f353w0 != dimension) {
                fVar.f353w0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        super.setTextSize(i6, f6);
        f fVar = this.f7149A;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics());
            H2.j jVar = fVar.f303G0;
            M2.d dVar = jVar.f1054g;
            if (dVar != null) {
                dVar.f1827k = fApplyDimension;
                jVar.f1048a.setTextSize(fApplyDimension);
                fVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f6) {
        f fVar = this.f7149A;
        if (fVar == null || fVar.f352v0 == f6) {
            return;
        }
        fVar.f352v0 = f6;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextStartPaddingResource(int i6) {
        f fVar = this.f7149A;
        if (fVar != null) {
            float dimension = fVar.f298A0.getResources().getDimension(i6);
            if (fVar.f352v0 != dimension) {
                fVar.f352v0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z5) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.S(z5);
        }
        e();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCheckedIconVisible(boolean z5) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.F(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.K(z5);
        }
    }

    public void setTextAppearance(M2.d dVar) {
        f fVar = this.f7149A;
        if (fVar != null) {
            fVar.f303G0.b(dVar, fVar.f298A0);
        }
        h();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        f fVar = this.f7149A;
        if (fVar != null) {
            Context context2 = fVar.f298A0;
            fVar.f303G0.b(new M2.d(context2, i6), context2);
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(H2.e eVar) {
    }
}
