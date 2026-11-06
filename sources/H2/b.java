package H2;

import N.V;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import j0.C0840b;
import java.util.WeakHashMap;
import m2.C0;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f970A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f971B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f972C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Bitmap f974E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f975F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f976G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f977H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f978I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f979J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f980K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f981L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f982M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final TextPaint f983N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextPaint f984O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TimeInterpolator f985P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public TimeInterpolator f986Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f987R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f988S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f989T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f990U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f991V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f992W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f993X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public StaticLayout f994Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f995Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f996a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f997a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f998b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f999b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f1000c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f1001c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f1004e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f1011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f1012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f1019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f1020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f1021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f1022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f1023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f1024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f1025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public M2.a f1026y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1006f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1008g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1009h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1010i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f1027z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f973D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f1003d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f1005e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f1007f0 = 1;

    public b(View view) {
        this.f996a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f983N = textPaint;
        this.f984O = new TextPaint(textPaint);
        this.f1002d = new Rect();
        this.f1000c = new Rect();
        this.f1004e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f6, int i6, int i7) {
        float f7 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i7) * f6) + (Color.alpha(i6) * f7)), Math.round((Color.red(i7) * f6) + (Color.red(i6) * f7)), Math.round((Color.green(i7) * f6) + (Color.green(i6) * f7)), Math.round((Color.blue(i7) * f6) + (Color.blue(i6) * f7)));
    }

    public static float f(float f6, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        return AbstractC1301a.a(f6, f7, f8);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = V.f1964a;
        boolean z5 = this.f996a.getLayoutDirection() == 1;
        if (this.f973D) {
            return (z5 ? L.k.f1673d : L.k.f1672c).j(charSequence, charSequence.length());
        }
        return z5;
    }

    public final void c(float f6, boolean z5) {
        float f7;
        float f8;
        Typeface typeface;
        boolean z6;
        Layout.Alignment alignment;
        if (this.f970A == null) {
            return;
        }
        float fWidth = this.f1002d.width();
        float fWidth2 = this.f1000c.width();
        if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
            f7 = this.f1010i;
            f8 = this.f991V;
            this.f975F = 1.0f;
            typeface = this.f1019r;
        } else {
            float f9 = this.f1009h;
            float f10 = this.f992W;
            Typeface typeface2 = this.f1022u;
            if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                this.f975F = 1.0f;
            } else {
                this.f975F = f(this.f1009h, this.f1010i, f6, this.f986Q) / this.f1009h;
            }
            float f11 = this.f1010i / this.f1009h;
            fWidth = (z5 || fWidth2 * f11 <= fWidth) ? fWidth2 : Math.min(fWidth / f11, fWidth2);
            f7 = f9;
            f8 = f10;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f983N;
        if (fWidth > 0.0f) {
            boolean z7 = this.f976G != f7;
            boolean z8 = this.f993X != f8;
            boolean z9 = this.f1025x != typeface;
            StaticLayout staticLayout = this.f994Y;
            boolean z10 = z7 || z8 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z9 || this.f982M;
            this.f976G = f7;
            this.f993X = f8;
            this.f1025x = typeface;
            this.f982M = false;
            textPaint.setLinearText(this.f975F != 1.0f);
            z6 = z10;
        } else {
            z6 = false;
        }
        if (this.f971B == null || z6) {
            textPaint.setTextSize(this.f976G);
            textPaint.setTypeface(this.f1025x);
            textPaint.setLetterSpacing(this.f993X);
            boolean zB = b(this.f970A);
            this.f972C = zB;
            int i6 = this.f1003d0;
            if (i6 <= 1 || zB) {
                i6 = 1;
            }
            if (i6 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f1006f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? (absoluteGravity == 5 ? !this.f972C : this.f972C) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            h hVar = new h(this.f970A, textPaint, (int) fWidth);
            hVar.f1047l = this.f1027z;
            hVar.f1046k = zB;
            hVar.f1040e = alignment;
            hVar.f1045j = false;
            hVar.f1041f = i6;
            float f12 = this.f1005e0;
            hVar.f1042g = 0.0f;
            hVar.f1043h = f12;
            hVar.f1044i = this.f1007f0;
            StaticLayout staticLayoutA = hVar.a();
            staticLayoutA.getClass();
            this.f994Y = staticLayoutA;
            this.f971B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f984O;
        textPaint.setTextSize(this.f1010i);
        textPaint.setTypeface(this.f1019r);
        textPaint.setLetterSpacing(this.f991V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f981L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f1021t;
            if (typeface != null) {
                this.f1020s = C0.n(configuration, typeface);
            }
            Typeface typeface2 = this.f1024w;
            if (typeface2 != null) {
                this.f1023v = C0.n(configuration, typeface2);
            }
            Typeface typeface3 = this.f1020s;
            if (typeface3 == null) {
                typeface3 = this.f1021t;
            }
            this.f1019r = typeface3;
            Typeface typeface4 = this.f1023v;
            if (typeface4 == null) {
                typeface4 = this.f1024w;
            }
            this.f1022u = typeface4;
            h(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r17) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.b.h(boolean):void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f1012k == colorStateList && this.f1011j == colorStateList) {
            return;
        }
        this.f1012k = colorStateList;
        this.f1011j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        M2.a aVar = this.f1026y;
        if (aVar != null) {
            aVar.f1810z = true;
        }
        if (this.f1021t == typeface) {
            return false;
        }
        this.f1021t = typeface;
        Typeface typefaceN = C0.n(this.f996a.getContext().getResources().getConfiguration(), typeface);
        this.f1020s = typefaceN;
        if (typefaceN == null) {
            typefaceN = this.f1021t;
        }
        this.f1019r = typefaceN;
        return true;
    }

    public final void k(float f6) {
        float fN = com.bumptech.glide.c.n(f6, 0.0f, 1.0f);
        if (fN != this.f998b) {
            this.f998b = fN;
            float f7 = this.f1000c.left;
            Rect rect = this.f1002d;
            float f8 = f(f7, rect.left, fN, this.f985P);
            RectF rectF = this.f1004e;
            rectF.left = f8;
            rectF.top = f(this.f1013l, this.f1014m, fN, this.f985P);
            rectF.right = f(r2.right, rect.right, fN, this.f985P);
            rectF.bottom = f(r2.bottom, rect.bottom, fN, this.f985P);
            this.f1017p = f(this.f1015n, this.f1016o, fN, this.f985P);
            this.f1018q = f(this.f1013l, this.f1014m, fN, this.f985P);
            l(fN);
            C0840b c0840b = AbstractC1301a.f12618b;
            this.f997a0 = 1.0f - f(0.0f, 1.0f, 1.0f - fN, c0840b);
            WeakHashMap weakHashMap = V.f1964a;
            View view = this.f996a;
            view.postInvalidateOnAnimation();
            this.f999b0 = f(1.0f, 0.0f, fN, c0840b);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f1012k;
            ColorStateList colorStateList2 = this.f1011j;
            TextPaint textPaint = this.f983N;
            textPaint.setColor(colorStateList != colorStateList2 ? a(fN, e(colorStateList2), e(this.f1012k)) : e(colorStateList));
            float f9 = this.f991V;
            float f10 = this.f992W;
            if (f9 != f10) {
                f9 = f(f10, f9, fN, c0840b);
            }
            textPaint.setLetterSpacing(f9);
            this.f977H = f(0.0f, this.f987R, fN, null);
            this.f978I = f(0.0f, this.f988S, fN, null);
            this.f979J = f(0.0f, this.f989T, fN, null);
            int iA = a(fN, e(null), e(this.f990U));
            this.f980K = iA;
            textPaint.setShadowLayer(this.f977H, this.f978I, this.f979J, iA);
            view.postInvalidateOnAnimation();
        }
    }

    public final void l(float f6) {
        c(f6, false);
        WeakHashMap weakHashMap = V.f1964a;
        this.f996a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z5;
        boolean zJ = j(typeface);
        if (this.f1024w != typeface) {
            this.f1024w = typeface;
            Typeface typefaceN = C0.n(this.f996a.getContext().getResources().getConfiguration(), typeface);
            this.f1023v = typefaceN;
            if (typefaceN == null) {
                typefaceN = this.f1024w;
            }
            this.f1022u = typefaceN;
            z5 = true;
        } else {
            z5 = false;
        }
        if (zJ || z5) {
            h(false);
        }
    }
}
