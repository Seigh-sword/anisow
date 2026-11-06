package D2;

import G1.m;
import H.h;
import H2.i;
import H2.j;
import P2.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s2.C1302b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, i {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int[] f296c1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final ShapeDrawable f297d1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final Context f298A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final Paint f299B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final Paint.FontMetrics f300C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final RectF f301D0;
    public final PointF E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final Path f302F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final j f303G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f304H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f305I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f306J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f307K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f308L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f309M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f310N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f311O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f312P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ColorFilter f313Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public PorterDuffColorFilter f314R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ColorStateList f315S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ColorStateList f316T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public PorterDuff.Mode f317T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f318U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int[] f319U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f320V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f321V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f322W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public ColorStateList f323W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ColorStateList f324X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public WeakReference f325X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f326Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public TextUtils.TruncateAt f327Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ColorStateList f328Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f329Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f330a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f331a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f332b0;
    public boolean b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f333c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorStateList f334d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f335e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f336f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f337g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f338h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public RippleDrawable f339i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f340j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f341k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SpannableStringBuilder f342l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f343m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f344n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Drawable f345o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ColorStateList f346p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C1302b f347q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C1302b f348r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f349s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f350t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f351u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f352v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f353w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f354x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f355y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f356z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.xo.anilab.R.attr.chipStyle, com.xo.anilab.R.style.Widget_MaterialComponents_Chip_Action);
        this.f322W = -1.0f;
        this.f299B0 = new Paint(1);
        this.f300C0 = new Paint.FontMetrics();
        this.f301D0 = new RectF();
        this.E0 = new PointF();
        this.f302F0 = new Path();
        this.f312P0 = 255;
        this.f317T0 = PorterDuff.Mode.SRC_IN;
        this.f325X0 = new WeakReference(null);
        k(context);
        this.f298A0 = context;
        j jVar = new j(this);
        this.f303G0 = jVar;
        this.f330a0 = "";
        jVar.f1048a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f296c1;
        setState(iArr);
        if (!Arrays.equals(this.f319U0, iArr)) {
            this.f319U0 = iArr;
            if (Y()) {
                B(getState(), iArr);
            }
        }
        this.f329Z0 = true;
        int[] iArr2 = N2.a.f2112a;
        f297d1.setTint(-1);
    }

    public static void Z(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A() {
        e eVar = (e) this.f325X0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f7160L);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean B(int[] iArr, int[] iArr2) {
        boolean z5;
        boolean z6;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f316T;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f304H0) : 0);
        boolean state = true;
        if (this.f304H0 != iD) {
            this.f304H0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f318U;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f305I0) : 0);
        if (this.f305I0 != iD2) {
            this.f305I0 = iD2;
            zOnStateChange = true;
        }
        int iB = G.a.b(iD2, iD);
        if ((this.f306J0 != iB) | (this.f2457w.f2419c == null)) {
            this.f306J0 = iB;
            n(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f324X;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f307K0) : 0;
        if (this.f307K0 != colorForState) {
            this.f307K0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f323W0 == null || !N2.a.c(iArr)) ? 0 : this.f323W0.getColorForState(iArr, this.f308L0);
        if (this.f308L0 != colorForState2) {
            this.f308L0 = colorForState2;
            if (this.f321V0) {
                zOnStateChange = true;
            }
        }
        M2.d dVar = this.f303G0.f1054g;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f1826j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f309M0);
        if (this.f309M0 != colorForState3) {
            this.f309M0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z5 = false;
        } else {
            int length = state2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (state2[i6] != 16842912) {
                    i6++;
                } else if (this.f343m0) {
                    z5 = true;
                }
            }
            z5 = false;
        }
        if (this.f310N0 == z5 || this.f345o0 == null) {
            z6 = false;
        } else {
            float fV = v();
            this.f310N0 = z5;
            if (fV != v()) {
                zOnStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f315S0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f311O0) : 0;
        if (this.f311O0 != colorForState4) {
            this.f311O0 = colorForState4;
            ColorStateList colorStateList6 = this.f315S0;
            PorterDuff.Mode mode = this.f317T0;
            this.f314R0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (z(this.f333c0)) {
            state |= this.f333c0.setState(iArr);
        }
        if (z(this.f345o0)) {
            state |= this.f345o0.setState(iArr);
        }
        if (z(this.f338h0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f338h0.setState(iArr3);
        }
        int[] iArr4 = N2.a.f2112a;
        if (z(this.f339i0)) {
            state |= this.f339i0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z6) {
            A();
        }
        return state;
    }

    public final void C(boolean z5) {
        if (this.f343m0 != z5) {
            this.f343m0 = z5;
            float fV = v();
            if (!z5 && this.f310N0) {
                this.f310N0 = false;
            }
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.f345o0 != drawable) {
            float fV = v();
            this.f345o0 = drawable;
            float fV2 = v();
            Z(this.f345o0);
            t(this.f345o0);
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f346p0 != colorStateList) {
            this.f346p0 = colorStateList;
            if (this.f344n0 && (drawable = this.f345o0) != null && this.f343m0) {
                H.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z5) {
        if (this.f344n0 != z5) {
            boolean zW = W();
            this.f344n0 = z5;
            boolean zW2 = W();
            if (zW != zW2) {
                if (zW2) {
                    t(this.f345o0);
                } else {
                    Z(this.f345o0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f6) {
        if (this.f322W != f6) {
            this.f322W = f6;
            m mVarE = this.f2457w.f2417a.e();
            mVarE.f812e = new P2.a(f6);
            mVarE.f813f = new P2.a(f6);
            mVarE.f814g = new P2.a(f6);
            mVarE.f815h = new P2.a(f6);
            setShapeAppearanceModel(mVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void H(Drawable drawable) {
        ?? r02;
        Object obj = this.f333c0;
        if (obj != null) {
            boolean z5 = obj instanceof H.g;
            r02 = obj;
            if (z5) {
                ((h) ((H.g) obj)).getClass();
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fV = v();
            this.f333c0 = drawable != null ? drawable.mutate() : null;
            float fV2 = v();
            Z(r02);
            if (X()) {
                t(this.f333c0);
            }
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void I(float f6) {
        if (this.f335e0 != f6) {
            float fV = v();
            this.f335e0 = f6;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.f336f0 = true;
        if (this.f334d0 != colorStateList) {
            this.f334d0 = colorStateList;
            if (X()) {
                H.a.h(this.f333c0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z5) {
        if (this.f332b0 != z5) {
            boolean zX = X();
            this.f332b0 = z5;
            boolean zX2 = X();
            if (zX != zX2) {
                if (zX2) {
                    t(this.f333c0);
                } else {
                    Z(this.f333c0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f324X != colorStateList) {
            this.f324X = colorStateList;
            if (this.b1) {
                P2.f fVar = this.f2457w;
                if (fVar.f2420d != colorStateList) {
                    fVar.f2420d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f6) {
        if (this.f326Y != f6) {
            this.f326Y = f6;
            this.f299B0.setStrokeWidth(f6);
            if (this.b1) {
                this.f2457w.f2427k = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void N(Drawable drawable) {
        ?? r02;
        Object obj = this.f338h0;
        if (obj != null) {
            boolean z5 = obj instanceof H.g;
            r02 = obj;
            if (z5) {
                ((h) ((H.g) obj)).getClass();
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fW = w();
            this.f338h0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = N2.a.f2112a;
            this.f339i0 = new RippleDrawable(N2.a.b(this.f328Z), this.f338h0, f297d1);
            float fW2 = w();
            Z(r02);
            if (Y()) {
                t(this.f338h0);
            }
            invalidateSelf();
            if (fW != fW2) {
                A();
            }
        }
    }

    public final void O(float f6) {
        if (this.f355y0 != f6) {
            this.f355y0 = f6;
            invalidateSelf();
            if (Y()) {
                A();
            }
        }
    }

    public final void P(float f6) {
        if (this.f341k0 != f6) {
            this.f341k0 = f6;
            invalidateSelf();
            if (Y()) {
                A();
            }
        }
    }

    public final void Q(float f6) {
        if (this.f354x0 != f6) {
            this.f354x0 = f6;
            invalidateSelf();
            if (Y()) {
                A();
            }
        }
    }

    public final void R(ColorStateList colorStateList) {
        if (this.f340j0 != colorStateList) {
            this.f340j0 = colorStateList;
            if (Y()) {
                H.a.h(this.f338h0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void S(boolean z5) {
        if (this.f337g0 != z5) {
            boolean zY = Y();
            this.f337g0 = z5;
            boolean zY2 = Y();
            if (zY != zY2) {
                if (zY2) {
                    t(this.f338h0);
                } else {
                    Z(this.f338h0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void T(float f6) {
        if (this.f351u0 != f6) {
            float fV = v();
            this.f351u0 = f6;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void U(float f6) {
        if (this.f350t0 != f6) {
            float fV = v();
            this.f350t0 = f6;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.f328Z != colorStateList) {
            this.f328Z = colorStateList;
            this.f323W0 = this.f321V0 ? N2.a.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean W() {
        return this.f344n0 && this.f345o0 != null && this.f310N0;
    }

    public final boolean X() {
        return this.f332b0 && this.f333c0 != null;
    }

    public final boolean Y() {
        return this.f337g0 && this.f338h0 != null;
    }

    @Override // H2.i
    public final void a() {
        A();
        invalidateSelf();
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i6;
        RectF rectF;
        int i7;
        int i8;
        int i9;
        RectF rectF2;
        int iSave;
        float f6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i6 = this.f312P0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i6 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i6) : 0;
        boolean z5 = this.b1;
        Paint paint = this.f299B0;
        RectF rectF3 = this.f301D0;
        if (!z5) {
            paint.setColor(this.f304H0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, x(), x(), paint);
        }
        if (!this.b1) {
            paint.setColor(this.f305I0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f313Q0;
            if (colorFilter == null) {
                colorFilter = this.f314R0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, x(), x(), paint);
        }
        if (this.b1) {
            super.draw(canvas);
        }
        if (this.f326Y > 0.0f && !this.b1) {
            paint.setColor(this.f307K0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.b1) {
                ColorFilter colorFilter2 = this.f313Q0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f314R0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f7 = bounds.left;
            float f8 = this.f326Y / 2.0f;
            rectF3.set(f7 + f8, bounds.top + f8, bounds.right - f8, bounds.bottom - f8);
            float f9 = this.f322W - (this.f326Y / 2.0f);
            canvas.drawRoundRect(rectF3, f9, f9, paint);
        }
        paint.setColor(this.f308L0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.b1) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f302F0;
            P2.f fVar = this.f2457w;
            this.f2452N.a(fVar.f2417a, fVar.f2426j, rectF4, this.f2451M, path);
            f(canvas, paint, path, this.f2457w.f2417a, h());
        } else {
            canvas.drawRoundRect(rectF3, x(), x(), paint);
        }
        if (X()) {
            u(bounds, rectF3);
            float f10 = rectF3.left;
            float f11 = rectF3.top;
            canvas.translate(f10, f11);
            this.f333c0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f333c0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (W()) {
            u(bounds, rectF3);
            float f12 = rectF3.left;
            float f13 = rectF3.top;
            canvas.translate(f12, f13);
            this.f345o0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f345o0.draw(canvas);
            canvas.translate(-f12, -f13);
        }
        if (!this.f329Z0 || this.f330a0 == null) {
            rectF = rectF3;
            i7 = iSaveLayerAlpha;
            i8 = 0;
            i9 = 255;
        } else {
            PointF pointF = this.E0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f330a0;
            j jVar = this.f303G0;
            if (charSequence != null) {
                float fV = v() + this.f349s0 + this.f352v0;
                if (H.b.a(this) == 0) {
                    pointF.x = bounds.left + fV;
                } else {
                    pointF.x = bounds.right - fV;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = jVar.f1048a;
                Paint.FontMetrics fontMetrics = this.f300C0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f330a0 != null) {
                float fV2 = v() + this.f349s0 + this.f352v0;
                float fW = w() + this.f356z0 + this.f353w0;
                if (H.b.a(this) == 0) {
                    rectF3.left = bounds.left + fV2;
                    f6 = bounds.right - fW;
                } else {
                    rectF3.left = bounds.left + fW;
                    f6 = bounds.right - fV2;
                }
                rectF3.right = f6;
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            M2.d dVar = jVar.f1054g;
            TextPaint textPaint2 = jVar.f1048a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                jVar.f1054g.e(this.f298A0, textPaint2, jVar.f1049b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f330a0.toString();
            if (jVar.f1052e) {
                jVar.a(string);
            }
            boolean z6 = Math.round(jVar.f1050c) > Math.round(rectF3.width());
            if (z6) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f330a0;
            if (z6 && this.f327Y0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f327Y0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f14 = pointF.x;
            float f15 = pointF.y;
            rectF = rectF3;
            i7 = iSaveLayerAlpha;
            i8 = 0;
            i9 = 255;
            canvas.drawText(charSequence2, 0, length, f14, f15, textPaint2);
            if (z6) {
                canvas.restoreToCount(iSave);
            }
        }
        if (Y()) {
            rectF.setEmpty();
            if (Y()) {
                float f16 = this.f356z0 + this.f355y0;
                if (H.b.a(this) == 0) {
                    float f17 = bounds.right - f16;
                    rectF2 = rectF;
                    rectF2.right = f17;
                    rectF2.left = f17 - this.f341k0;
                } else {
                    rectF2 = rectF;
                    float f18 = bounds.left + f16;
                    rectF2.left = f18;
                    rectF2.right = f18 + this.f341k0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f19 = this.f341k0;
                float f20 = fExactCenterY - (f19 / 2.0f);
                rectF2.top = f20;
                rectF2.bottom = f20 + f19;
            } else {
                rectF2 = rectF;
            }
            float f21 = rectF2.left;
            float f22 = rectF2.top;
            canvas.translate(f21, f22);
            this.f338h0.setBounds(i8, i8, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = N2.a.f2112a;
            this.f339i0.setBounds(this.f338h0.getBounds());
            this.f339i0.jumpToCurrentState();
            this.f339i0.draw(canvas);
            canvas.translate(-f21, -f22);
        }
        if (this.f312P0 < i9) {
            canvas.restoreToCount(i7);
        }
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f312P0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f313Q0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f320V;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fV = v() + this.f349s0 + this.f352v0;
        String string = this.f330a0.toString();
        j jVar = this.f303G0;
        if (jVar.f1052e) {
            jVar.a(string);
        }
        return Math.min(Math.round(w() + jVar.f1050c + fV + this.f353w0 + this.f356z0), this.f331a1);
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f320V, this.f322W);
        } else {
            outline.setRoundRect(bounds, this.f322W);
        }
        outline.setAlpha(this.f312P0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        M2.d dVar;
        ColorStateList colorStateList;
        return y(this.f316T) || y(this.f318U) || y(this.f324X) || (this.f321V0 && y(this.f323W0)) || (!((dVar = this.f303G0.f1054g) == null || (colorStateList = dVar.f1826j) == null || !colorStateList.isStateful()) || ((this.f344n0 && this.f345o0 != null && this.f343m0) || z(this.f333c0) || z(this.f345o0) || y(this.f315S0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (X()) {
            zOnLayoutDirectionChanged |= H.b.b(this.f333c0, i6);
        }
        if (W()) {
            zOnLayoutDirectionChanged |= H.b.b(this.f345o0, i6);
        }
        if (Y()) {
            zOnLayoutDirectionChanged |= H.b.b(this.f338h0, i6);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean zOnLevelChange = super.onLevelChange(i6);
        if (X()) {
            zOnLevelChange |= this.f333c0.setLevel(i6);
        }
        if (W()) {
            zOnLevelChange |= this.f345o0.setLevel(i6);
        }
        if (Y()) {
            zOnLevelChange |= this.f338h0.setLevel(i6);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // P2.g, android.graphics.drawable.Drawable, H2.i
    public final boolean onStateChange(int[] iArr) {
        if (this.b1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.f319U0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.f312P0 != i6) {
            this.f312P0 = i6;
            invalidateSelf();
        }
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f313Q0 != colorFilter) {
            this.f313Q0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f315S0 != colorStateList) {
            this.f315S0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f317T0 != mode) {
            this.f317T0 = mode;
            ColorStateList colorStateList = this.f315S0;
            this.f314R0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (X()) {
            visible |= this.f333c0.setVisible(z5, z6);
        }
        if (W()) {
            visible |= this.f345o0.setVisible(z5, z6);
        }
        if (Y()) {
            visible |= this.f338h0.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        H.b.b(drawable, H.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f338h0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f319U0);
            }
            H.a.h(drawable, this.f340j0);
            return;
        }
        Drawable drawable2 = this.f333c0;
        if (drawable == drawable2 && this.f336f0) {
            H.a.h(drawable2, this.f334d0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (X() || W()) {
            float f6 = this.f349s0 + this.f350t0;
            Drawable drawable = this.f310N0 ? this.f345o0 : this.f333c0;
            float intrinsicWidth = this.f335e0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (H.b.a(this) == 0) {
                float f7 = rect.left + f6;
                rectF.left = f7;
                rectF.right = f7 + intrinsicWidth;
            } else {
                float f8 = rect.right - f6;
                rectF.right = f8;
                rectF.left = f8 - intrinsicWidth;
            }
            Drawable drawable2 = this.f310N0 ? this.f345o0 : this.f333c0;
            float fCeil = this.f335e0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f298A0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (!X() && !W()) {
            return 0.0f;
        }
        float f6 = this.f350t0;
        Drawable drawable = this.f310N0 ? this.f345o0 : this.f333c0;
        float intrinsicWidth = this.f335e0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f6 + this.f351u0;
    }

    public final float w() {
        if (Y()) {
            return this.f354x0 + this.f341k0 + this.f355y0;
        }
        return 0.0f;
    }

    public final float x() {
        return this.b1 ? i() : this.f322W;
    }
}
