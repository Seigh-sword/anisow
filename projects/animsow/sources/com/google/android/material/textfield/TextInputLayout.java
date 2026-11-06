package com.google.android.material.textfield;

import E.f;
import F0.A;
import F0.C0021h;
import H2.b;
import N.C0095h;
import N.L;
import N.V;
import P2.c;
import P2.e;
import P2.g;
import P2.i;
import P2.j;
import S2.l;
import S2.m;
import S2.p;
import S2.q;
import S2.t;
import S2.v;
import S2.w;
import S2.x;
import S2.y;
import S2.z;
import U2.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import d.RunnableC0632m;
import d2.AbstractC0651b;
import f2.h;
import i.C0803c;
import j.RunnableC0835a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.AbstractC0983r0;
import m.C0964h0;
import m.C0998z;
import m.R0;
import m2.C0;
import p1.C1243i;
import r2.AbstractC1274a;
import s2.AbstractC1301a;
import y2.C1499a;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final int[][] f7301Y0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f7302A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final LinkedHashSet f7303A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f7304B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ColorDrawable f7305B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f7306C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f7307C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f7308D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public Drawable f7309D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f7310E;
    public ColorStateList E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final q f7311F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ColorStateList f7312F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7313G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f7314G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f7315H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f7316H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7317I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f7318I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public y f7319J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public ColorStateList f7320J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0964h0 f7321K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f7322K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f7323L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f7324L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f7325M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f7326M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public CharSequence f7327N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f7328N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f7329O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f7330O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0964h0 f7331P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f7332P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f7333Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f7334Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f7335R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final b f7336R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0021h f7337S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f7338S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0021h f7339T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f7340T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f7341U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public ValueAnimator f7342U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ColorStateList f7343V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f7344V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ColorStateList f7345W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f7346W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f7347X0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ColorStateList f7348a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7349b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f7350c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f7351d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public g f7352e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public g f7353f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public StateListDrawable f7354g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f7355h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public g f7356i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public g f7357j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public j f7358k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f7359l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int f7360m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f7361n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f7362o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f7363p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f7364q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f7365r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f7366s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f7367t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Rect f7368u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Rect f7369v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f7370w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final RectF f7371w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f7372x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Typeface f7373x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f7374y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorDrawable f7375y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EditText f7376z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f7377z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        int colorForState;
        super(a.a(context, attributeSet, com.xo.anilab.R.attr.textInputStyle, com.xo.anilab.R.style.Widget_Design_TextInputLayout), attributeSet, com.xo.anilab.R.attr.textInputStyle);
        this.f7304B = -1;
        this.f7306C = -1;
        this.f7308D = -1;
        this.f7310E = -1;
        this.f7311F = new q(this);
        this.f7319J = new C0095h(18);
        this.f7368u0 = new Rect();
        this.f7369v0 = new Rect();
        this.f7371w0 = new RectF();
        this.f7303A0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f7336R0 = bVar;
        this.f7347X0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f7370w = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1301a.f12617a;
        bVar.f986Q = linearInterpolator;
        bVar.h(false);
        bVar.f985P = linearInterpolator;
        bVar.h(false);
        if (bVar.f1008g != 8388659) {
            bVar.f1008g = 8388659;
            bVar.h(false);
        }
        C0803c c0803cF = H2.m.f(context2, attributeSet, AbstractC1274a.f12445I, com.xo.anilab.R.attr.textInputStyle, com.xo.anilab.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        v vVar = new v(this, c0803cF);
        this.f7372x = vVar;
        this.f7349b0 = c0803cF.r(48, true);
        setHint(c0803cF.E(4));
        this.f7340T0 = c0803cF.r(47, true);
        this.f7338S0 = c0803cF.r(42, true);
        if (c0803cF.G(6)) {
            setMinEms(c0803cF.z(6, -1));
        } else if (c0803cF.G(3)) {
            setMinWidth(c0803cF.u(3, -1));
        }
        if (c0803cF.G(5)) {
            setMaxEms(c0803cF.z(5, -1));
        } else if (c0803cF.G(2)) {
            setMaxWidth(c0803cF.u(2, -1));
        }
        this.f7358k0 = j.b(context2, attributeSet, com.xo.anilab.R.attr.textInputStyle, com.xo.anilab.R.style.Widget_Design_TextInputLayout).a();
        this.f7360m0 = context2.getResources().getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f7362o0 = c0803cF.t(9, 0);
        this.f7364q0 = c0803cF.u(16, context2.getResources().getDimensionPixelSize(com.xo.anilab.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f7365r0 = c0803cF.u(17, context2.getResources().getDimensionPixelSize(com.xo.anilab.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f7363p0 = this.f7364q0;
        float dimension = ((TypedArray) c0803cF.f9278y).getDimension(13, -1.0f);
        float dimension2 = ((TypedArray) c0803cF.f9278y).getDimension(12, -1.0f);
        float dimension3 = ((TypedArray) c0803cF.f9278y).getDimension(10, -1.0f);
        float dimension4 = ((TypedArray) c0803cF.f9278y).getDimension(11, -1.0f);
        G1.m mVarE = this.f7358k0.e();
        if (dimension >= 0.0f) {
            mVarE.f812e = new P2.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            mVarE.f813f = new P2.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            mVarE.f814g = new P2.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            mVarE.f815h = new P2.a(dimension4);
        }
        this.f7358k0 = mVarE.a();
        ColorStateList colorStateListP = h.p(context2, c0803cF, 7);
        if (colorStateListP != null) {
            int defaultColor = colorStateListP.getDefaultColor();
            this.f7322K0 = defaultColor;
            this.f7367t0 = defaultColor;
            if (colorStateListP.isStateful()) {
                this.f7324L0 = colorStateListP.getColorForState(new int[]{-16842910}, -1);
                this.f7326M0 = colorStateListP.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListP.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f7326M0 = this.f7322K0;
                ColorStateList colorStateListB = f.b(context2, com.xo.anilab.R.color.mtrl_filled_background_color);
                this.f7324L0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.f7328N0 = colorForState;
        } else {
            this.f7367t0 = 0;
            this.f7322K0 = 0;
            this.f7324L0 = 0;
            this.f7326M0 = 0;
            this.f7328N0 = 0;
        }
        if (c0803cF.G(1)) {
            ColorStateList colorStateListS = c0803cF.s(1);
            this.f7312F0 = colorStateListS;
            this.E0 = colorStateListS;
        }
        ColorStateList colorStateListP2 = h.p(context2, c0803cF, 14);
        this.f7318I0 = ((TypedArray) c0803cF.f9278y).getColor(14, 0);
        Object obj = f.f379a;
        this.f7314G0 = E.b.a(context2, com.xo.anilab.R.color.mtrl_textinput_default_box_stroke_color);
        this.f7330O0 = E.b.a(context2, com.xo.anilab.R.color.mtrl_textinput_disabled_color);
        this.f7316H0 = E.b.a(context2, com.xo.anilab.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListP2 != null) {
            setBoxStrokeColorStateList(colorStateListP2);
        }
        if (c0803cF.G(15)) {
            setBoxStrokeErrorColor(h.p(context2, c0803cF, 15));
        }
        if (c0803cF.B(49, -1) != -1) {
            setHintTextAppearance(c0803cF.B(49, 0));
        }
        this.f7345W = c0803cF.s(24);
        this.f7348a0 = c0803cF.s(25);
        int iB = c0803cF.B(40, 0);
        CharSequence charSequenceE = c0803cF.E(35);
        int iZ = c0803cF.z(34, 1);
        boolean zR = c0803cF.r(36, false);
        int iB2 = c0803cF.B(45, 0);
        boolean zR2 = c0803cF.r(44, false);
        CharSequence charSequenceE2 = c0803cF.E(43);
        int iB3 = c0803cF.B(57, 0);
        CharSequence charSequenceE3 = c0803cF.E(56);
        boolean zR3 = c0803cF.r(18, false);
        setCounterMaxLength(c0803cF.z(19, -1));
        this.f7325M = c0803cF.B(22, 0);
        this.f7323L = c0803cF.B(20, 0);
        setBoxBackgroundMode(c0803cF.z(8, 0));
        setErrorContentDescription(charSequenceE);
        setErrorAccessibilityLiveRegion(iZ);
        setCounterOverflowTextAppearance(this.f7323L);
        setHelperTextTextAppearance(iB2);
        setErrorTextAppearance(iB);
        setCounterTextAppearance(this.f7325M);
        setPlaceholderText(charSequenceE3);
        setPlaceholderTextAppearance(iB3);
        if (c0803cF.G(41)) {
            setErrorTextColor(c0803cF.s(41));
        }
        if (c0803cF.G(46)) {
            setHelperTextColor(c0803cF.s(46));
        }
        if (c0803cF.G(50)) {
            setHintTextColor(c0803cF.s(50));
        }
        if (c0803cF.G(23)) {
            setCounterTextColor(c0803cF.s(23));
        }
        if (c0803cF.G(21)) {
            setCounterOverflowTextColor(c0803cF.s(21));
        }
        if (c0803cF.G(58)) {
            setPlaceholderTextColor(c0803cF.s(58));
        }
        m mVar = new m(this, c0803cF);
        this.f7374y = mVar;
        boolean zR4 = c0803cF.r(0, true);
        c0803cF.M();
        setImportantForAccessibility(2);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && i6 >= 26) {
            L.m(this, 1);
        }
        frameLayout.addView(vVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(zR4);
        setHelperTextEnabled(zR2);
        setErrorEnabled(zR);
        setCounterEnabled(zR3);
        setHelperText(charSequenceE2);
    }

    private Drawable getEditTextBoxBackground() {
        int iA;
        EditText editText = this.f7376z;
        if (!(editText instanceof AutoCompleteTextView) || C0.k(editText)) {
            return this.f7352e0;
        }
        int iF = C0.f(this.f7376z, com.xo.anilab.R.attr.colorControlHighlight);
        int i6 = this.f7361n0;
        int[][] iArr = f7301Y0;
        if (i6 != 2) {
            if (i6 != 1) {
                return null;
            }
            g gVar = this.f7352e0;
            int i7 = this.f7367t0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{C0.l(0.1f, iF, i7), i7}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f7352e0;
        TypedValue typedValueQ = C0.q(com.xo.anilab.R.attr.colorSurface, context, "TextInputLayout");
        int i8 = typedValueQ.resourceId;
        if (i8 != 0) {
            Object obj = f.f379a;
            iA = E.b.a(context, i8);
        } else {
            iA = typedValueQ.data;
        }
        g gVar3 = new g(gVar2.f2457w.f2417a);
        int iL = C0.l(0.1f, iF, iA);
        gVar3.n(new ColorStateList(iArr, new int[]{iL, 0}));
        gVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iL, iA});
        g gVar4 = new g(gVar2.f2457w.f2417a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f7354g0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f7354g0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f7354g0.addState(new int[0], f(false));
        }
        return this.f7354g0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f7353f0 == null) {
            this.f7353f0 = f(true);
        }
        return this.f7353f0;
    }

    public static void k(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z5);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f7376z != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f7376z = editText;
        int i6 = this.f7304B;
        if (i6 != -1) {
            setMinEms(i6);
        } else {
            setMinWidth(this.f7308D);
        }
        int i7 = this.f7306C;
        if (i7 != -1) {
            setMaxEms(i7);
        } else {
            setMaxWidth(this.f7310E);
        }
        this.f7355h0 = false;
        i();
        setTextInputAccessibilityDelegate(new x(this));
        Typeface typeface = this.f7376z.getTypeface();
        b bVar = this.f7336R0;
        bVar.m(typeface);
        float textSize = this.f7376z.getTextSize();
        if (bVar.f1009h != textSize) {
            bVar.f1009h = textSize;
            bVar.h(false);
        }
        int i8 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f7376z.getLetterSpacing();
        if (bVar.f992W != letterSpacing) {
            bVar.f992W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f7376z.getGravity();
        int i9 = (gravity & (-113)) | 48;
        if (bVar.f1008g != i9) {
            bVar.f1008g = i9;
            bVar.h(false);
        }
        if (bVar.f1006f != gravity) {
            bVar.f1006f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = V.f1964a;
        this.f7332P0 = editText.getMinimumHeight();
        this.f7376z.addTextChangedListener(new w(this, editText));
        if (this.E0 == null) {
            this.E0 = this.f7376z.getHintTextColors();
        }
        if (this.f7349b0) {
            if (TextUtils.isEmpty(this.f7350c0)) {
                CharSequence hint = this.f7376z.getHint();
                this.f7302A = hint;
                setHint(hint);
                this.f7376z.setHint((CharSequence) null);
            }
            this.f7351d0 = true;
        }
        if (i8 >= 29) {
            p();
        }
        if (this.f7321K != null) {
            n(this.f7376z.getText());
        }
        r();
        this.f7311F.b();
        this.f7372x.bringToFront();
        m mVar = this.f7374y;
        mVar.bringToFront();
        Iterator it = this.f7303A0.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(this);
        }
        mVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f7350c0)) {
            return;
        }
        this.f7350c0 = charSequence;
        b bVar = this.f7336R0;
        if (charSequence == null || !TextUtils.equals(bVar.f970A, charSequence)) {
            bVar.f970A = charSequence;
            bVar.f971B = null;
            Bitmap bitmap = bVar.f974E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f974E = null;
            }
            bVar.h(false);
        }
        if (this.f7334Q0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.f7329O == z5) {
            return;
        }
        if (z5) {
            C0964h0 c0964h0 = this.f7331P;
            if (c0964h0 != null) {
                this.f7370w.addView(c0964h0);
                this.f7331P.setVisibility(0);
            }
        } else {
            C0964h0 c0964h02 = this.f7331P;
            if (c0964h02 != null) {
                c0964h02.setVisibility(8);
            }
            this.f7331P = null;
        }
        this.f7329O = z5;
    }

    public final void a(float f6) {
        int i6 = 1;
        b bVar = this.f7336R0;
        if (bVar.f998b == f6) {
            return;
        }
        if (this.f7342U0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7342U0 = valueAnimator;
            valueAnimator.setInterpolator(Y2.b.A(getContext(), com.xo.anilab.R.attr.motionEasingEmphasizedInterpolator, AbstractC1301a.f12618b));
            this.f7342U0.setDuration(Y2.b.z(getContext(), com.xo.anilab.R.attr.motionDurationMedium4, 167));
            this.f7342U0.addUpdateListener(new C1499a(i6, this));
        }
        this.f7342U0.setFloatValues(bVar.f998b, f6);
        this.f7342U0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i6, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f7370w;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i6;
        int i7;
        g gVar = this.f7352e0;
        if (gVar == null) {
            return;
        }
        j jVar = gVar.f2457w.f2417a;
        j jVar2 = this.f7358k0;
        if (jVar != jVar2) {
            gVar.setShapeAppearanceModel(jVar2);
        }
        if (this.f7361n0 == 2 && (i6 = this.f7363p0) > -1 && (i7 = this.f7366s0) != 0) {
            g gVar2 = this.f7352e0;
            gVar2.f2457w.f2427k = i6;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i7);
            P2.f fVar = gVar2.f2457w;
            if (fVar.f2420d != colorStateListValueOf) {
                fVar.f2420d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iB = this.f7367t0;
        if (this.f7361n0 == 1) {
            iB = G.a.b(this.f7367t0, C0.e(getContext(), com.xo.anilab.R.attr.colorSurface, 0));
        }
        this.f7367t0 = iB;
        this.f7352e0.n(ColorStateList.valueOf(iB));
        g gVar3 = this.f7356i0;
        if (gVar3 != null && this.f7357j0 != null) {
            if (this.f7363p0 > -1 && this.f7366s0 != 0) {
                gVar3.n(ColorStateList.valueOf(this.f7376z.isFocused() ? this.f7314G0 : this.f7366s0));
                this.f7357j0.n(ColorStateList.valueOf(this.f7366s0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.f7349b0) {
            return 0;
        }
        int i6 = this.f7361n0;
        b bVar = this.f7336R0;
        if (i6 == 0) {
            fD = bVar.d();
        } else {
            if (i6 != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final C0021h d() {
        C0021h c0021h = new C0021h();
        c0021h.f528a0 = 3;
        c0021h.f593y = Y2.b.z(getContext(), com.xo.anilab.R.attr.motionDurationShort2, 87);
        c0021h.f594z = Y2.b.A(getContext(), com.xo.anilab.R.attr.motionEasingLinearInterpolator, AbstractC1301a.f12617a);
        return c0021h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i6) {
        EditText editText = this.f7376z;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.f7302A != null) {
            boolean z5 = this.f7351d0;
            this.f7351d0 = false;
            CharSequence hint = editText.getHint();
            this.f7376z.setHint(this.f7302A);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.f7376z.setHint(hint);
                this.f7351d0 = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        FrameLayout frameLayout = this.f7370w;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i7 = 0; i7 < frameLayout.getChildCount(); i7++) {
            View childAt = frameLayout.getChildAt(i7);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i7);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i6);
            if (childAt == this.f7376z) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f7346W0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f7346W0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i6;
        super.draw(canvas);
        boolean z5 = this.f7349b0;
        b bVar = this.f7336R0;
        if (z5) {
            bVar.getClass();
            int iSave = canvas.save();
            if (bVar.f971B != null) {
                RectF rectF = bVar.f1004e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f983N;
                    textPaint.setTextSize(bVar.f976G);
                    float f6 = bVar.f1017p;
                    float f7 = bVar.f1018q;
                    float f8 = bVar.f975F;
                    if (f8 != 1.0f) {
                        canvas.scale(f8, f8, f6, f7);
                    }
                    if (bVar.f1003d0 <= 1 || bVar.f972C) {
                        canvas.translate(f6, f7);
                        bVar.f994Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f1017p - bVar.f994Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f7);
                        float f9 = alpha;
                        textPaint.setAlpha((int) (bVar.f999b0 * f9));
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            textPaint.setShadowLayer(bVar.f977H, bVar.f978I, bVar.f979J, C0.a(bVar.f980K, textPaint.getAlpha()));
                        }
                        bVar.f994Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f997a0 * f9));
                        if (i7 >= 31) {
                            textPaint.setShadowLayer(bVar.f977H, bVar.f978I, bVar.f979J, C0.a(bVar.f980K, textPaint.getAlpha()));
                        }
                        int lineBaseline = bVar.f994Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f1001c0;
                        float f10 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f10, textPaint);
                        if (i7 >= 31) {
                            textPaint.setShadowLayer(bVar.f977H, bVar.f978I, bVar.f979J, bVar.f980K);
                        }
                        String strTrim = bVar.f1001c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i6 = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i6 = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f994Y.getLineEnd(i6), str.length()), 0.0f, f10, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f7357j0 == null || (gVar = this.f7356i0) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f7376z.isFocused()) {
            Rect bounds = this.f7357j0.getBounds();
            Rect bounds2 = this.f7356i0.getBounds();
            float f11 = bVar.f998b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC1301a.c(f11, iCenterX, bounds2.left);
            bounds.right = AbstractC1301a.c(f11, iCenterX, bounds2.right);
            this.f7357j0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f7344V0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f7344V0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            H2.b r3 = r4.f7336R0
            if (r3 == 0) goto L2f
            r3.f981L = r1
            android.content.res.ColorStateList r1 = r3.f1012k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1011j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f7376z
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = N.V.f1964a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f7344V0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f7349b0 && !TextUtils.isEmpty(this.f7350c0) && (this.f7352e0 instanceof S2.h);
    }

    public final g f(boolean z5) {
        int iA;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_shape_corner_size_small_component);
        float f6 = z5 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f7376z;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.xo.anilab.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e();
        e eVar2 = new e();
        e eVar3 = new e();
        e eVar4 = new e();
        P2.a aVar = new P2.a(f6);
        P2.a aVar2 = new P2.a(f6);
        P2.a aVar3 = new P2.a(dimensionPixelOffset);
        P2.a aVar4 = new P2.a(dimensionPixelOffset);
        j jVar = new j();
        jVar.f2462a = iVar;
        jVar.f2463b = iVar2;
        jVar.f2464c = iVar3;
        jVar.f2465d = iVar4;
        jVar.f2466e = aVar;
        jVar.f2467f = aVar2;
        jVar.f2468g = aVar4;
        jVar.f2469h = aVar3;
        jVar.f2470i = eVar;
        jVar.f2471j = eVar2;
        jVar.f2472k = eVar3;
        jVar.f2473l = eVar4;
        EditText editText2 = this.f7376z;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof t ? ((t) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f2438S;
            TypedValue typedValueQ = C0.q(com.xo.anilab.R.attr.colorSurface, context, g.class.getSimpleName());
            int i6 = typedValueQ.resourceId;
            if (i6 != 0) {
                Object obj = f.f379a;
                iA = E.b.a(context, i6);
            } else {
                iA = typedValueQ.data;
            }
            dropDownBackgroundTintList = ColorStateList.valueOf(iA);
        }
        g gVar = new g();
        gVar.k(context);
        gVar.n(dropDownBackgroundTintList);
        gVar.m(popupElevation);
        gVar.setShapeAppearanceModel(jVar);
        P2.f fVar = gVar.f2457w;
        if (fVar.f2424h == null) {
            fVar.f2424h = new Rect();
        }
        gVar.f2457w.f2424h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i6, boolean z5) {
        return ((z5 || getPrefixText() == null) ? (!z5 || getSuffixText() == null) ? this.f7376z.getCompoundPaddingLeft() : this.f7374y.c() : this.f7372x.a()) + i6;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f7376z;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i6 = this.f7361n0;
        if (i6 == 1 || i6 == 2) {
            return this.f7352e0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f7367t0;
    }

    public int getBoxBackgroundMode() {
        return this.f7361n0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f7362o0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zW = h.w(this);
        return (zW ? this.f7358k0.f2469h : this.f7358k0.f2468g).a(this.f7371w0);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zW = h.w(this);
        return (zW ? this.f7358k0.f2468g : this.f7358k0.f2469h).a(this.f7371w0);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zW = h.w(this);
        return (zW ? this.f7358k0.f2466e : this.f7358k0.f2467f).a(this.f7371w0);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zW = h.w(this);
        return (zW ? this.f7358k0.f2467f : this.f7358k0.f2466e).a(this.f7371w0);
    }

    public int getBoxStrokeColor() {
        return this.f7318I0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f7320J0;
    }

    public int getBoxStrokeWidth() {
        return this.f7364q0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f7365r0;
    }

    public int getCounterMaxLength() {
        return this.f7315H;
    }

    public CharSequence getCounterOverflowDescription() {
        C0964h0 c0964h0;
        if (this.f7313G && this.f7317I && (c0964h0 = this.f7321K) != null) {
            return c0964h0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f7343V;
    }

    public ColorStateList getCounterTextColor() {
        return this.f7341U;
    }

    public ColorStateList getCursorColor() {
        return this.f7345W;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f7348a0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.E0;
    }

    public EditText getEditText() {
        return this.f7376z;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f7374y.f3149C.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f7374y.f3149C.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f7374y.f3155I;
    }

    public int getEndIconMode() {
        return this.f7374y.f3151E;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f7374y.f3156J;
    }

    public CheckableImageButton getEndIconView() {
        return this.f7374y.f3149C;
    }

    public CharSequence getError() {
        q qVar = this.f7311F;
        if (qVar.f3197q) {
            return qVar.f3196p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f7311F.f3200t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f7311F.f3199s;
    }

    public int getErrorCurrentTextColors() {
        C0964h0 c0964h0 = this.f7311F.f3198r;
        if (c0964h0 != null) {
            return c0964h0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f7374y.f3167y.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f7311F;
        if (qVar.f3204x) {
            return qVar.f3203w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0964h0 c0964h0 = this.f7311F.f3205y;
        if (c0964h0 != null) {
            return c0964h0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f7349b0) {
            return this.f7350c0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f7336R0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f7336R0;
        return bVar.e(bVar.f1012k);
    }

    public ColorStateList getHintTextColor() {
        return this.f7312F0;
    }

    public y getLengthCounter() {
        return this.f7319J;
    }

    public int getMaxEms() {
        return this.f7306C;
    }

    public int getMaxWidth() {
        return this.f7310E;
    }

    public int getMinEms() {
        return this.f7304B;
    }

    public int getMinWidth() {
        return this.f7308D;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f7374y.f3149C.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f7374y.f3149C.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f7329O) {
            return this.f7327N;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f7335R;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f7333Q;
    }

    public CharSequence getPrefixText() {
        return this.f7372x.f3230y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f7372x.f3229x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f7372x.f3229x;
    }

    public j getShapeAppearanceModel() {
        return this.f7358k0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7372x.f3231z.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f7372x.f3231z.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f7372x.f3224C;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f7372x.f3225D;
    }

    public CharSequence getSuffixText() {
        return this.f7374y.f3158L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f7374y.f3159M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f7374y.f3159M;
    }

    public Typeface getTypeface() {
        return this.f7373x0;
    }

    public final int h(int i6, boolean z5) {
        return i6 - ((z5 || getSuffixText() == null) ? (!z5 || getPrefixText() == null) ? this.f7376z.getCompoundPaddingRight() : this.f7372x.a() : this.f7374y.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i6) {
        try {
            textView.setTextAppearance(i6);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.xo.anilab.R.style.TextAppearance_AppCompat_Caption);
        Context context = getContext();
        Object obj = f.f379a;
        textView.setTextColor(E.b.a(context, com.xo.anilab.R.color.design_error));
    }

    public final boolean m() {
        q qVar = this.f7311F;
        return (qVar.f3195o != 1 || qVar.f3198r == null || TextUtils.isEmpty(qVar.f3196p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0095h) this.f7319J).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z5 = this.f7317I;
        int i6 = this.f7315H;
        String string = null;
        if (i6 == -1) {
            this.f7321K.setText(String.valueOf(length));
            this.f7321K.setContentDescription(null);
            this.f7317I = false;
        } else {
            this.f7317I = length > i6;
            Context context = getContext();
            this.f7321K.setContentDescription(context.getString(this.f7317I ? com.xo.anilab.R.string.character_counter_overflowed_content_description : com.xo.anilab.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f7315H)));
            if (z5 != this.f7317I) {
                o();
            }
            String str = L.b.f1656d;
            L.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? L.b.f1659g : L.b.f1658f;
            C0964h0 c0964h0 = this.f7321K;
            String string2 = getContext().getString(com.xo.anilab.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f7315H));
            if (string2 == null) {
                bVar.getClass();
            } else {
                string = bVar.c(string2, bVar.f1662c).toString();
            }
            c0964h0.setText(string);
        }
        if (this.f7376z == null || z5 == this.f7317I) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0964h0 c0964h0 = this.f7321K;
        if (c0964h0 != null) {
            l(c0964h0, this.f7317I ? this.f7323L : this.f7325M);
            if (!this.f7317I && (colorStateList2 = this.f7341U) != null) {
                this.f7321K.setTextColor(colorStateList2);
            }
            if (!this.f7317I || (colorStateList = this.f7343V) == null) {
                return;
            }
            this.f7321K.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7336R0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        m mVar = this.f7374y;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z5 = false;
        this.f7347X0 = false;
        if (this.f7376z != null && this.f7376z.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f7372x.getMeasuredHeight()))) {
            this.f7376z.setMinimumHeight(iMax);
            z5 = true;
        }
        boolean zQ = q();
        if (z5 || zQ) {
            this.f7376z.post(new RunnableC0632m(18, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        EditText editText;
        super.onMeasure(i6, i7);
        boolean z5 = this.f7347X0;
        m mVar = this.f7374y;
        if (!z5) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f7347X0 = true;
        }
        if (this.f7331P != null && (editText = this.f7376z) != null) {
            this.f7331P.setGravity(editText.getGravity());
            this.f7331P.setPadding(this.f7376z.getCompoundPaddingLeft(), this.f7376z.getCompoundPaddingTop(), this.f7376z.getCompoundPaddingRight(), this.f7376z.getCompoundPaddingBottom());
        }
        mVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.f3569w);
        setError(zVar.f3236y);
        if (zVar.f3237z) {
            post(new RunnableC0835a(22, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z5 = i6 == 1;
        if (z5 != this.f7359l0) {
            c cVar = this.f7358k0.f2466e;
            RectF rectF = this.f7371w0;
            float fA = cVar.a(rectF);
            float fA2 = this.f7358k0.f2467f.a(rectF);
            float fA3 = this.f7358k0.f2469h.a(rectF);
            float fA4 = this.f7358k0.f2468g.a(rectF);
            j jVar = this.f7358k0;
            d dVar = jVar.f2462a;
            d dVar2 = jVar.f2463b;
            d dVar3 = jVar.f2465d;
            d dVar4 = jVar.f2464c;
            G1.m mVar = new G1.m(1);
            mVar.f808a = dVar2;
            G1.m.b(dVar2);
            mVar.f809b = dVar;
            G1.m.b(dVar);
            mVar.f811d = dVar4;
            G1.m.b(dVar4);
            mVar.f810c = dVar3;
            G1.m.b(dVar3);
            mVar.f812e = new P2.a(fA2);
            mVar.f813f = new P2.a(fA);
            mVar.f815h = new P2.a(fA4);
            mVar.f814g = new P2.a(fA3);
            j jVarA = mVar.a();
            this.f7359l0 = z5;
            setShapeAppearanceModel(jVarA);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        if (m()) {
            zVar.f3236y = getError();
        }
        m mVar = this.f7374y;
        zVar.f3237z = mVar.f3151E != 0 && mVar.f3149C.f7257z;
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f7345W
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903289(0x7f0300f9, float:1.7413392E38)
            android.util.TypedValue r1 = m2.C0.o(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = E.f.b(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f7376z
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = N.x0.c(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f7376z
            android.graphics.drawable.Drawable r1 = N.x0.c(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L49
            m.h0 r2 = r4.f7321K
            if (r2 == 0) goto L4e
            boolean r2 = r4.f7317I
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f7348a0
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            H.a.h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        C0964h0 c0964h0;
        Class<C0998z> cls;
        PorterDuffColorFilter porterDuffColorFilterG;
        EditText editText = this.f7376z;
        if (editText == null || this.f7361n0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0983r0.f10372a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C0998z.f10427b;
            cls = C0998z.class;
            synchronized (cls) {
                porterDuffColorFilterG = R0.g(errorCurrentTextColors, mode);
            }
        } else {
            if (!this.f7317I || (c0964h0 = this.f7321K) == null) {
                drawableMutate.clearColorFilter();
                this.f7376z.refreshDrawableState();
                return;
            }
            int currentTextColor = c0964h0.getCurrentTextColor();
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode4 = C0998z.f10427b;
            cls = C0998z.class;
            synchronized (cls) {
                porterDuffColorFilterG = R0.g(currentTextColor, mode3);
            }
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public final void s() {
        EditText editText = this.f7376z;
        if (editText == null || this.f7352e0 == null) {
            return;
        }
        if ((this.f7355h0 || editText.getBackground() == null) && this.f7361n0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f7376z;
            WeakHashMap weakHashMap = V.f1964a;
            editText2.setBackground(editTextBoxBackground);
            this.f7355h0 = true;
        }
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.f7367t0 != i6) {
            this.f7367t0 = i6;
            this.f7322K0 = i6;
            this.f7326M0 = i6;
            this.f7328N0 = i6;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        Context context = getContext();
        Object obj = f.f379a;
        setBoxBackgroundColor(E.b.a(context, i6));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f7322K0 = defaultColor;
        this.f7367t0 = defaultColor;
        this.f7324L0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7326M0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f7328N0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 == this.f7361n0) {
            return;
        }
        this.f7361n0 = i6;
        if (this.f7376z != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.f7362o0 = i6;
    }

    public void setBoxCornerFamily(int i6) {
        G1.m mVarE = this.f7358k0.e();
        c cVar = this.f7358k0.f2466e;
        d dVarJ = Y2.b.j(i6);
        mVarE.f808a = dVarJ;
        G1.m.b(dVarJ);
        mVarE.f812e = cVar;
        c cVar2 = this.f7358k0.f2467f;
        d dVarJ2 = Y2.b.j(i6);
        mVarE.f809b = dVarJ2;
        G1.m.b(dVarJ2);
        mVarE.f813f = cVar2;
        c cVar3 = this.f7358k0.f2469h;
        d dVarJ3 = Y2.b.j(i6);
        mVarE.f811d = dVarJ3;
        G1.m.b(dVarJ3);
        mVarE.f815h = cVar3;
        c cVar4 = this.f7358k0.f2468g;
        d dVarJ4 = Y2.b.j(i6);
        mVarE.f810c = dVarJ4;
        G1.m.b(dVarJ4);
        mVarE.f814g = cVar4;
        this.f7358k0 = mVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.f7318I0 != i6) {
            this.f7318I0 = i6;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f7318I0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            x();
        } else {
            this.f7314G0 = colorStateList.getDefaultColor();
            this.f7330O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f7316H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f7318I0 = defaultColor;
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f7320J0 != colorStateList) {
            this.f7320J0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.f7364q0 = i6;
        x();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.f7365r0 = i6;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.f7313G != z5) {
            q qVar = this.f7311F;
            if (z5) {
                C0964h0 c0964h0 = new C0964h0(getContext(), null);
                this.f7321K = c0964h0;
                c0964h0.setId(com.xo.anilab.R.id.textinput_counter);
                Typeface typeface = this.f7373x0;
                if (typeface != null) {
                    this.f7321K.setTypeface(typeface);
                }
                this.f7321K.setMaxLines(1);
                qVar.a(this.f7321K, 2);
                ((ViewGroup.MarginLayoutParams) this.f7321K.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f7321K != null) {
                    EditText editText = this.f7376z;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.f7321K, 2);
                this.f7321K = null;
            }
            this.f7313G = z5;
        }
    }

    public void setCounterMaxLength(int i6) {
        if (this.f7315H != i6) {
            if (i6 <= 0) {
                i6 = -1;
            }
            this.f7315H = i6;
            if (!this.f7313G || this.f7321K == null) {
                return;
            }
            EditText editText = this.f7376z;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.f7323L != i6) {
            this.f7323L = i6;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f7343V != colorStateList) {
            this.f7343V = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.f7325M != i6) {
            this.f7325M = i6;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f7341U != colorStateList) {
            this.f7341U = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f7345W != colorStateList) {
            this.f7345W = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f7348a0 != colorStateList) {
            this.f7348a0 = colorStateList;
            if (m() || (this.f7321K != null && this.f7317I)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.E0 = colorStateList;
        this.f7312F0 = colorStateList;
        if (this.f7376z != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        k(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.f7374y.f3149C.setActivated(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.f7374y.f3149C.setCheckable(z5);
    }

    public void setEndIconContentDescription(int i6) {
        m mVar = this.f7374y;
        CharSequence text = i6 != 0 ? mVar.getResources().getText(i6) : null;
        CheckableImageButton checkableImageButton = mVar.f3149C;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i6) {
        m mVar = this.f7374y;
        Drawable drawableP = i6 != 0 ? AbstractC0651b.p(mVar.getContext(), i6) : null;
        CheckableImageButton checkableImageButton = mVar.f3149C;
        checkableImageButton.setImageDrawable(drawableP);
        if (drawableP != null) {
            ColorStateList colorStateList = mVar.f3153G;
            PorterDuff.Mode mode = mVar.f3154H;
            TextInputLayout textInputLayout = mVar.f3165w;
            h.a(textInputLayout, checkableImageButton, colorStateList, mode);
            h.D(textInputLayout, checkableImageButton, mVar.f3153G);
        }
    }

    public void setEndIconMinSize(int i6) {
        m mVar = this.f7374y;
        if (i6 < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i6 != mVar.f3155I) {
            mVar.f3155I = i6;
            CheckableImageButton checkableImageButton = mVar.f3149C;
            checkableImageButton.setMinimumWidth(i6);
            checkableImageButton.setMinimumHeight(i6);
            CheckableImageButton checkableImageButton2 = mVar.f3167y;
            checkableImageButton2.setMinimumWidth(i6);
            checkableImageButton2.setMinimumHeight(i6);
        }
    }

    public void setEndIconMode(int i6) {
        this.f7374y.g(i6);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f7374y;
        View.OnLongClickListener onLongClickListener = mVar.f3157K;
        CheckableImageButton checkableImageButton = mVar.f3149C;
        checkableImageButton.setOnClickListener(onClickListener);
        h.F(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f7374y;
        mVar.f3157K = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f3149C;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        h.F(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f7374y;
        mVar.f3156J = scaleType;
        mVar.f3149C.setScaleType(scaleType);
        mVar.f3167y.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f7374y;
        if (mVar.f3153G != colorStateList) {
            mVar.f3153G = colorStateList;
            h.a(mVar.f3165w, mVar.f3149C, colorStateList, mVar.f3154H);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f7374y;
        if (mVar.f3154H != mode) {
            mVar.f3154H = mode;
            h.a(mVar.f3165w, mVar.f3149C, mVar.f3153G, mode);
        }
    }

    public void setEndIconVisible(boolean z5) {
        this.f7374y.h(z5);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.f7311F;
        if (!qVar.f3197q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f3196p = charSequence;
        qVar.f3198r.setText(charSequence);
        int i6 = qVar.f3194n;
        if (i6 != 1) {
            qVar.f3195o = 1;
        }
        qVar.i(i6, qVar.f3195o, qVar.h(qVar.f3198r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        q qVar = this.f7311F;
        qVar.f3200t = i6;
        C0964h0 c0964h0 = qVar.f3198r;
        if (c0964h0 != null) {
            WeakHashMap weakHashMap = V.f1964a;
            c0964h0.setAccessibilityLiveRegion(i6);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f7311F;
        qVar.f3199s = charSequence;
        C0964h0 c0964h0 = qVar.f3198r;
        if (c0964h0 != null) {
            c0964h0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z5) {
        q qVar = this.f7311F;
        if (qVar.f3197q == z5) {
            return;
        }
        qVar.c();
        TextInputLayout textInputLayout = qVar.f3188h;
        if (z5) {
            C0964h0 c0964h0 = new C0964h0(qVar.f3187g, null);
            qVar.f3198r = c0964h0;
            c0964h0.setId(com.xo.anilab.R.id.textinput_error);
            qVar.f3198r.setTextAlignment(5);
            Typeface typeface = qVar.f3180B;
            if (typeface != null) {
                qVar.f3198r.setTypeface(typeface);
            }
            int i6 = qVar.f3201u;
            qVar.f3201u = i6;
            C0964h0 c0964h02 = qVar.f3198r;
            if (c0964h02 != null) {
                textInputLayout.l(c0964h02, i6);
            }
            ColorStateList colorStateList = qVar.f3202v;
            qVar.f3202v = colorStateList;
            C0964h0 c0964h03 = qVar.f3198r;
            if (c0964h03 != null && colorStateList != null) {
                c0964h03.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f3199s;
            qVar.f3199s = charSequence;
            C0964h0 c0964h04 = qVar.f3198r;
            if (c0964h04 != null) {
                c0964h04.setContentDescription(charSequence);
            }
            int i7 = qVar.f3200t;
            qVar.f3200t = i7;
            C0964h0 c0964h05 = qVar.f3198r;
            if (c0964h05 != null) {
                WeakHashMap weakHashMap = V.f1964a;
                c0964h05.setAccessibilityLiveRegion(i7);
            }
            qVar.f3198r.setVisibility(4);
            qVar.a(qVar.f3198r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f3198r, 0);
            qVar.f3198r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        qVar.f3197q = z5;
    }

    public void setErrorIconDrawable(int i6) {
        m mVar = this.f7374y;
        mVar.i(i6 != 0 ? AbstractC0651b.p(mVar.getContext(), i6) : null);
        h.D(mVar.f3165w, mVar.f3167y, mVar.f3168z);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f7374y;
        CheckableImageButton checkableImageButton = mVar.f3167y;
        View.OnLongClickListener onLongClickListener = mVar.f3148B;
        checkableImageButton.setOnClickListener(onClickListener);
        h.F(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f7374y;
        mVar.f3148B = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f3167y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        h.F(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f7374y;
        if (mVar.f3168z != colorStateList) {
            mVar.f3168z = colorStateList;
            h.a(mVar.f3165w, mVar.f3167y, colorStateList, mVar.f3147A);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f7374y;
        if (mVar.f3147A != mode) {
            mVar.f3147A = mode;
            h.a(mVar.f3165w, mVar.f3167y, mVar.f3168z, mode);
        }
    }

    public void setErrorTextAppearance(int i6) {
        q qVar = this.f7311F;
        qVar.f3201u = i6;
        C0964h0 c0964h0 = qVar.f3198r;
        if (c0964h0 != null) {
            qVar.f3188h.l(c0964h0, i6);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f7311F;
        qVar.f3202v = colorStateList;
        C0964h0 c0964h0 = qVar.f3198r;
        if (c0964h0 == null || colorStateList == null) {
            return;
        }
        c0964h0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.f7338S0 != z5) {
            this.f7338S0 = z5;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f7311F;
        if (zIsEmpty) {
            if (qVar.f3204x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f3204x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f3203w = charSequence;
        qVar.f3205y.setText(charSequence);
        int i6 = qVar.f3194n;
        if (i6 != 2) {
            qVar.f3195o = 2;
        }
        qVar.i(i6, qVar.f3195o, qVar.h(qVar.f3205y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f7311F;
        qVar.f3179A = colorStateList;
        C0964h0 c0964h0 = qVar.f3205y;
        if (c0964h0 == null || colorStateList == null) {
            return;
        }
        c0964h0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z5) {
        q qVar = this.f7311F;
        if (qVar.f3204x == z5) {
            return;
        }
        qVar.c();
        if (z5) {
            C0964h0 c0964h0 = new C0964h0(qVar.f3187g, null);
            qVar.f3205y = c0964h0;
            c0964h0.setId(com.xo.anilab.R.id.textinput_helper_text);
            qVar.f3205y.setTextAlignment(5);
            Typeface typeface = qVar.f3180B;
            if (typeface != null) {
                qVar.f3205y.setTypeface(typeface);
            }
            qVar.f3205y.setVisibility(4);
            qVar.f3205y.setAccessibilityLiveRegion(1);
            int i6 = qVar.f3206z;
            qVar.f3206z = i6;
            C0964h0 c0964h02 = qVar.f3205y;
            if (c0964h02 != null) {
                c0964h02.setTextAppearance(i6);
            }
            ColorStateList colorStateList = qVar.f3179A;
            qVar.f3179A = colorStateList;
            C0964h0 c0964h03 = qVar.f3205y;
            if (c0964h03 != null && colorStateList != null) {
                c0964h03.setTextColor(colorStateList);
            }
            qVar.a(qVar.f3205y, 1);
            qVar.f3205y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i7 = qVar.f3194n;
            if (i7 == 2) {
                qVar.f3195o = 0;
            }
            qVar.i(i7, qVar.f3195o, qVar.h(qVar.f3205y, ""));
            qVar.g(qVar.f3205y, 1);
            qVar.f3205y = null;
            TextInputLayout textInputLayout = qVar.f3188h;
            textInputLayout.r();
            textInputLayout.x();
        }
        qVar.f3204x = z5;
    }

    public void setHelperTextTextAppearance(int i6) {
        q qVar = this.f7311F;
        qVar.f3206z = i6;
        C0964h0 c0964h0 = qVar.f3205y;
        if (c0964h0 != null) {
            c0964h0.setTextAppearance(i6);
        }
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.f7340T0 = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.f7349b0) {
            this.f7349b0 = z5;
            if (z5) {
                CharSequence hint = this.f7376z.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f7350c0)) {
                        setHint(hint);
                    }
                    this.f7376z.setHint((CharSequence) null);
                }
                this.f7351d0 = true;
            } else {
                this.f7351d0 = false;
                if (!TextUtils.isEmpty(this.f7350c0) && TextUtils.isEmpty(this.f7376z.getHint())) {
                    this.f7376z.setHint(this.f7350c0);
                }
                setHintInternal(null);
            }
            if (this.f7376z != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i6) {
        b bVar = this.f7336R0;
        View view = bVar.f996a;
        M2.d dVar = new M2.d(view.getContext(), i6);
        ColorStateList colorStateList = dVar.f1826j;
        if (colorStateList != null) {
            bVar.f1012k = colorStateList;
        }
        float f6 = dVar.f1827k;
        if (f6 != 0.0f) {
            bVar.f1010i = f6;
        }
        ColorStateList colorStateList2 = dVar.f1817a;
        if (colorStateList2 != null) {
            bVar.f990U = colorStateList2;
        }
        bVar.f988S = dVar.f1821e;
        bVar.f989T = dVar.f1822f;
        bVar.f987R = dVar.f1823g;
        bVar.f991V = dVar.f1825i;
        M2.a aVar = bVar.f1026y;
        if (aVar != null) {
            aVar.f1810z = true;
        }
        C1243i c1243i = new C1243i(15, bVar);
        dVar.a();
        bVar.f1026y = new M2.a(c1243i, dVar.f1830n);
        dVar.c(view.getContext(), bVar.f1026y);
        bVar.h(false);
        this.f7312F0 = bVar.f1012k;
        if (this.f7376z != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7312F0 != colorStateList) {
            if (this.E0 == null) {
                b bVar = this.f7336R0;
                if (bVar.f1012k != colorStateList) {
                    bVar.f1012k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f7312F0 = colorStateList;
            if (this.f7376z != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(y yVar) {
        this.f7319J = yVar;
    }

    public void setMaxEms(int i6) {
        this.f7306C = i6;
        EditText editText = this.f7376z;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxEms(i6);
    }

    public void setMaxWidth(int i6) {
        this.f7310E = i6;
        EditText editText = this.f7376z;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxWidth(i6);
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.f7304B = i6;
        EditText editText = this.f7376z;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinEms(i6);
    }

    public void setMinWidth(int i6) {
        this.f7308D = i6;
        EditText editText = this.f7376z;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinWidth(i6);
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        m mVar = this.f7374y;
        mVar.f3149C.setContentDescription(i6 != 0 ? mVar.getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        m mVar = this.f7374y;
        mVar.f3149C.setImageDrawable(i6 != 0 ? AbstractC0651b.p(mVar.getContext(), i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        m mVar = this.f7374y;
        if (z5 && mVar.f3151E != 1) {
            mVar.g(1);
        } else if (z5) {
            mVar.getClass();
        } else {
            mVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f7374y;
        mVar.f3153G = colorStateList;
        h.a(mVar.f3165w, mVar.f3149C, colorStateList, mVar.f3154H);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f7374y;
        mVar.f3154H = mode;
        h.a(mVar.f3165w, mVar.f3149C, mVar.f3153G, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f7331P == null) {
            C0964h0 c0964h0 = new C0964h0(getContext(), null);
            this.f7331P = c0964h0;
            c0964h0.setId(com.xo.anilab.R.id.textinput_placeholder);
            this.f7331P.setImportantForAccessibility(2);
            C0021h c0021hD = d();
            this.f7337S = c0021hD;
            c0021hD.f592x = 67L;
            this.f7339T = d();
            setPlaceholderTextAppearance(this.f7335R);
            setPlaceholderTextColor(this.f7333Q);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f7329O) {
                setPlaceholderTextEnabled(true);
            }
            this.f7327N = charSequence;
        }
        EditText editText = this.f7376z;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.f7335R = i6;
        C0964h0 c0964h0 = this.f7331P;
        if (c0964h0 != null) {
            c0964h0.setTextAppearance(i6);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f7333Q != colorStateList) {
            this.f7333Q = colorStateList;
            C0964h0 c0964h0 = this.f7331P;
            if (c0964h0 == null || colorStateList == null) {
                return;
            }
            c0964h0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f7372x;
        vVar.getClass();
        vVar.f3230y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f3229x.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i6) {
        this.f7372x.f3229x.setTextAppearance(i6);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f7372x.f3229x.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.f7352e0;
        if (gVar == null || gVar.f2457w.f2417a == jVar) {
            return;
        }
        this.f7358k0 = jVar;
        b();
    }

    public void setStartIconCheckable(boolean z5) {
        this.f7372x.f3231z.setCheckable(z5);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? AbstractC0651b.p(getContext(), i6) : null);
    }

    public void setStartIconMinSize(int i6) {
        v vVar = this.f7372x;
        if (i6 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i6 != vVar.f3224C) {
            vVar.f3224C = i6;
            CheckableImageButton checkableImageButton = vVar.f3231z;
            checkableImageButton.setMinimumWidth(i6);
            checkableImageButton.setMinimumHeight(i6);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f7372x;
        View.OnLongClickListener onLongClickListener = vVar.f3226E;
        CheckableImageButton checkableImageButton = vVar.f3231z;
        checkableImageButton.setOnClickListener(onClickListener);
        h.F(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f7372x;
        vVar.f3226E = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f3231z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        h.F(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f7372x;
        vVar.f3225D = scaleType;
        vVar.f3231z.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f7372x;
        if (vVar.f3222A != colorStateList) {
            vVar.f3222A = colorStateList;
            h.a(vVar.f3228w, vVar.f3231z, colorStateList, vVar.f3223B);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f7372x;
        if (vVar.f3223B != mode) {
            vVar.f3223B = mode;
            h.a(vVar.f3228w, vVar.f3231z, vVar.f3222A, mode);
        }
    }

    public void setStartIconVisible(boolean z5) {
        this.f7372x.c(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f7374y;
        mVar.getClass();
        mVar.f3158L = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.f3159M.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(int i6) {
        this.f7374y.f3159M.setTextAppearance(i6);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f7374y.f3159M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(x xVar) {
        EditText editText = this.f7376z;
        if (editText != null) {
            V.l(editText, xVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7373x0) {
            this.f7373x0 = typeface;
            this.f7336R0.m(typeface);
            q qVar = this.f7311F;
            if (typeface != qVar.f3180B) {
                qVar.f3180B = typeface;
                C0964h0 c0964h0 = qVar.f3198r;
                if (c0964h0 != null) {
                    c0964h0.setTypeface(typeface);
                }
                C0964h0 c0964h02 = qVar.f3205y;
                if (c0964h02 != null) {
                    c0964h02.setTypeface(typeface);
                }
            }
            C0964h0 c0964h03 = this.f7321K;
            if (c0964h03 != null) {
                c0964h03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f7361n0 != 1) {
            FrameLayout frameLayout = this.f7370w;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z5, boolean z6) {
        ColorStateList colorStateList;
        C0964h0 c0964h0;
        ColorStateList textColors;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f7376z;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f7376z;
        boolean z8 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.E0;
        b bVar = this.f7336R0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (zIsEnabled) {
            if (m()) {
                C0964h0 c0964h02 = this.f7311F.f3198r;
                textColors = c0964h02 != null ? c0964h02.getTextColors() : null;
            } else if (this.f7317I && (c0964h0 = this.f7321K) != null) {
                textColors = c0964h0.getTextColors();
            } else if (z8 && (colorStateList = this.f7312F0) != null && bVar.f1012k != colorStateList) {
                bVar.f1012k = colorStateList;
                bVar.h(false);
            }
            bVar.i(textColors);
        } else {
            ColorStateList colorStateList3 = this.E0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f7330O0) : this.f7330O0));
        }
        m mVar = this.f7374y;
        v vVar = this.f7372x;
        if (z7 || !this.f7338S0 || (isEnabled() && z8)) {
            if (z6 || this.f7334Q0) {
                ValueAnimator valueAnimator = this.f7342U0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f7342U0.cancel();
                }
                if (z5 && this.f7340T0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f7334Q0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f7376z;
                v(editText3 != null ? editText3.getText() : null);
                vVar.f3227F = false;
                vVar.e();
                mVar.f3160N = false;
                mVar.n();
                return;
            }
            return;
        }
        if (z6 || !this.f7334Q0) {
            ValueAnimator valueAnimator2 = this.f7342U0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f7342U0.cancel();
            }
            if (z5 && this.f7340T0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && (!((S2.h) this.f7352e0).f3128T.f3126v.isEmpty()) && e()) {
                ((S2.h) this.f7352e0).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f7334Q0 = true;
            C0964h0 c0964h03 = this.f7331P;
            if (c0964h03 != null && this.f7329O) {
                c0964h03.setText((CharSequence) null);
                A.a(this.f7370w, this.f7339T);
                this.f7331P.setVisibility(4);
            }
            vVar.f3227F = true;
            vVar.e();
            mVar.f3160N = true;
            mVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0095h) this.f7319J).getClass();
        FrameLayout frameLayout = this.f7370w;
        if ((editable != null && editable.length() != 0) || this.f7334Q0) {
            C0964h0 c0964h0 = this.f7331P;
            if (c0964h0 == null || !this.f7329O) {
                return;
            }
            c0964h0.setText((CharSequence) null);
            A.a(frameLayout, this.f7339T);
            this.f7331P.setVisibility(4);
            return;
        }
        if (this.f7331P == null || !this.f7329O || TextUtils.isEmpty(this.f7327N)) {
            return;
        }
        this.f7331P.setText(this.f7327N);
        A.a(frameLayout, this.f7337S);
        this.f7331P.setVisibility(0);
        this.f7331P.bringToFront();
        announceForAccessibility(this.f7327N);
    }

    public final void w(boolean z5, boolean z6) {
        int defaultColor = this.f7320J0.getDefaultColor();
        int colorForState = this.f7320J0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f7320J0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.f7366s0 = colorForState2;
        } else if (z6) {
            this.f7366s0 = colorForState;
        } else {
            this.f7366s0 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public void setHint(CharSequence charSequence) {
        if (this.f7349b0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f7372x.f3231z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7372x.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7374y.f3149C.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7374y.f3149C.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f7374y.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f7374y.f3149C;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f7374y;
        CheckableImageButton checkableImageButton = mVar.f3149C;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = mVar.f3153G;
            PorterDuff.Mode mode = mVar.f3154H;
            TextInputLayout textInputLayout = mVar.f3165w;
            h.a(textInputLayout, checkableImageButton, colorStateList, mode);
            h.D(textInputLayout, checkableImageButton, mVar.f3153G);
        }
    }
}
