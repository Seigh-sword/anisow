package M2;

import F.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import f2.h;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f1817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f1826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1829m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f1830n;

    public d(Context context, int i6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, AbstractC1274a.f12443G);
        this.f1827k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1826j = h.o(context, typedArrayObtainStyledAttributes, 3);
        h.o(context, typedArrayObtainStyledAttributes, 4);
        h.o(context, typedArrayObtainStyledAttributes, 5);
        this.f1819c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1820d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i7 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1828l = typedArrayObtainStyledAttributes.getResourceId(i7, 0);
        this.f1818b = typedArrayObtainStyledAttributes.getString(i7);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1817a = h.o(context, typedArrayObtainStyledAttributes, 6);
        this.f1821e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1822f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1823g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i6, AbstractC1274a.f12469w);
        this.f1824h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1825i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1830n;
        int i6 = this.f1819c;
        if (typeface == null && (str = this.f1818b) != null) {
            this.f1830n = Typeface.create(str, i6);
        }
        if (this.f1830n == null) {
            int i7 = this.f1820d;
            this.f1830n = i7 != 1 ? i7 != 2 ? i7 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f1830n = Typeface.create(this.f1830n, i6);
        }
    }

    public final Typeface b(Context context) {
        if (this.f1829m) {
            return this.f1830n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = q.a(context, this.f1828l);
                this.f1830n = typefaceA;
                if (typefaceA != null) {
                    this.f1830n = Typeface.create(typefaceA, this.f1819c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e6) {
                Log.d("TextAppearance", "Error loading font " + this.f1818b, e6);
            }
        }
        a();
        this.f1829m = true;
        return this.f1830n;
    }

    public final void c(Context context, com.bumptech.glide.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i6 = this.f1828l;
        if (i6 == 0) {
            this.f1829m = true;
        }
        if (this.f1829m) {
            cVar.C(this.f1830n, true);
            return;
        }
        try {
            b bVar = new b(this, cVar);
            ThreadLocal threadLocal = q.f458a;
            if (context.isRestricted()) {
                bVar.d(-4);
            } else {
                q.b(context, i6, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1829m = true;
            cVar.B(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f1818b, e6);
            this.f1829m = true;
            cVar.B(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceB = null;
        int i6 = this.f1828l;
        if (i6 != 0) {
            ThreadLocal threadLocal = q.f458a;
            if (!context.isRestricted()) {
                typefaceB = q.b(context, i6, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f1826j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1817a;
        textPaint.setShadowLayer(this.f1823g, this.f1821e, this.f1822f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f1830n);
        c(context, new c(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceN = C0.n(context.getResources().getConfiguration(), typeface);
        if (typefaceN != null) {
            typeface = typefaceN;
        }
        textPaint.setTypeface(typeface);
        int i6 = (~typeface.getStyle()) & this.f1819c;
        textPaint.setFakeBoldText((i6 & 1) != 0);
        textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1827k);
        if (this.f1824h) {
            textPaint.setLetterSpacing(this.f1825i);
        }
    }
}
