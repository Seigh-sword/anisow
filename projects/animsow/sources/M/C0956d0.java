package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import i.C0803c;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: m.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0956d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z0 f10251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z0 f10252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z0 f10253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z0 f10254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z0 f10255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Z0 f10256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z0 f10257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0974m0 f10258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10259j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10260k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f10261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10262m;

    public C0956d0(TextView textView) {
        this.f10250a = textView;
        this.f10258i = new C0974m0(textView);
    }

    public static Z0 c(Context context, C0998z c0998z, int i6) {
        ColorStateList colorStateListH;
        synchronized (c0998z) {
            colorStateListH = c0998z.f10429a.h(context, i6);
        }
        if (colorStateListH == null) {
            return null;
        }
        Z0 z02 = new Z0();
        z02.f10236b = true;
        z02.f10237c = colorStateListH;
        return z02;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i6;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i7 >= 30) {
            S.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i7 >= 30) {
            S.b.a(editorInfo, text);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 : i8;
        if (i8 <= i9) {
            i8 = i9;
        }
        int length = text.length();
        if (i10 < 0 || i8 > length || (i6 = editorInfo.inputType & 4095) == 129 || i6 == 225 || i6 == 18) {
            S.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            S.c.a(editorInfo, text, i10, i8);
            return;
        }
        int i11 = i8 - i10;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int iMin = Math.min(text.length() - i8, i13 - Math.min(i10, (int) (((double) i13) * 0.8d)));
        int iMin2 = Math.min(i10, i13 - iMin);
        int i14 = i10 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i14))) {
            i14++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i8 + iMin) - 1))) {
            iMin--;
        }
        int i15 = iMin2 + i12;
        S.c.a(editorInfo, i12 != i11 ? TextUtils.concat(text.subSequence(i14, i14 + iMin2), text.subSequence(i8, iMin + i8)) : text.subSequence(i14, i15 + iMin + i14), iMin2, i15);
    }

    public final void a(Drawable drawable, Z0 z02) {
        if (drawable == null || z02 == null) {
            return;
        }
        C0998z.d(drawable, z02, this.f10250a.getDrawableState());
    }

    public final void b() {
        Z0 z02 = this.f10251b;
        TextView textView = this.f10250a;
        if (z02 != null || this.f10252c != null || this.f10253d != null || this.f10254e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f10251b);
            a(compoundDrawables[1], this.f10252c);
            a(compoundDrawables[2], this.f10253d);
            a(compoundDrawables[3], this.f10254e);
        }
        if (this.f10255f == null && this.f10256g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f10255f);
        a(compoundDrawablesRelative[2], this.f10256g);
    }

    public final ColorStateList d() {
        Z0 z02 = this.f10257h;
        if (z02 != null) {
            return (ColorStateList) z02.f10237c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        Z0 z02 = this.f10257h;
        if (z02 != null) {
            return (PorterDuff.Mode) z02.f10238d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i6) {
        boolean zR;
        boolean z5;
        String strC;
        String strC2;
        char c6;
        int i7;
        int i8;
        int i9;
        float fU;
        int i10;
        int resourceId;
        int i11;
        TextView textView = this.f10250a;
        Context context = textView.getContext();
        C0998z c0998zA = C0998z.a();
        int[] iArr = AbstractC0732a.f8570h;
        C0803c c0803cJ = C0803c.J(context, attributeSet, iArr, i6, 0);
        N.V.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0803cJ.f9278y, i6);
        int iB = c0803cJ.B(0, -1);
        if (c0803cJ.G(3)) {
            this.f10251b = c(context, c0998zA, c0803cJ.B(3, 0));
        }
        if (c0803cJ.G(1)) {
            this.f10252c = c(context, c0998zA, c0803cJ.B(1, 0));
        }
        if (c0803cJ.G(4)) {
            this.f10253d = c(context, c0998zA, c0803cJ.B(4, 0));
        }
        int i12 = 2;
        if (c0803cJ.G(2)) {
            this.f10254e = c(context, c0998zA, c0803cJ.B(2, 0));
        }
        if (c0803cJ.G(5)) {
            this.f10255f = c(context, c0998zA, c0803cJ.B(5, 0));
        }
        if (c0803cJ.G(6)) {
            this.f10256g = c(context, c0998zA, c0803cJ.B(6, 0));
        }
        c0803cJ.M();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0732a.f8584v;
        if (iB != -1) {
            C0803c c0803c = new C0803c(context, i12, context.obtainStyledAttributes(iB, iArr2));
            if (z6 || !c0803c.G(14)) {
                zR = false;
                z5 = false;
            } else {
                zR = c0803c.r(14, false);
                z5 = true;
            }
            n(context, c0803c);
            int i13 = Build.VERSION.SDK_INT;
            if (c0803c.G(15)) {
                strC2 = c0803c.C(15);
                i11 = 26;
            } else {
                i11 = 26;
                strC2 = null;
            }
            strC = (i13 < i11 || !c0803c.G(13)) ? null : c0803c.C(13);
            c0803c.M();
        } else {
            zR = false;
            z5 = false;
            strC = null;
            strC2 = null;
        }
        C0803c c0803c2 = new C0803c(context, i12, context.obtainStyledAttributes(attributeSet, iArr2, i6, 0));
        if (!z6 && c0803c2.G(14)) {
            zR = c0803c2.r(14, false);
            z5 = true;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (c0803c2.G(15)) {
            strC2 = c0803c2.C(15);
        }
        if (i14 >= 26) {
            c6 = '\r';
            if (c0803c2.G(13)) {
                strC = c0803c2.C(13);
            }
        } else {
            c6 = '\r';
        }
        if (i14 >= 28 && c0803c2.G(0) && c0803c2.u(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c0803c2);
        c0803c2.M();
        if (!z6 && z5) {
            textView.setAllCaps(zR);
        }
        Typeface typeface = this.f10261l;
        if (typeface != null) {
            if (this.f10260k == -1) {
                textView.setTypeface(typeface, this.f10259j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strC != null) {
            AbstractC0952b0.d(textView, strC);
        }
        if (strC2 != null) {
            AbstractC0950a0.b(textView, AbstractC0950a0.a(strC2));
        }
        int[] iArr3 = AbstractC0732a.f8571i;
        C0974m0 c0974m0 = this.f10258i;
        Context context2 = c0974m0.f10331j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i6, 0);
        TextView textView2 = c0974m0.f10330i;
        N.V.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i6);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c0974m0.f10322a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = typedArrayObtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                c0974m0.f10327f = C0974m0.b(iArr4);
                c0974m0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!c0974m0.j()) {
            c0974m0.f10322a = 0;
        } else if (c0974m0.f10322a == 1) {
            if (!c0974m0.f10328g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0974m0.k(dimension2, dimension3, dimension);
            }
            c0974m0.h();
        }
        if (p1.f10365c && c0974m0.f10322a != 0) {
            int[] iArr5 = c0974m0.f10327f;
            if (iArr5.length > 0) {
                if (AbstractC0952b0.a(textView) != -1.0f) {
                    AbstractC0952b0.b(textView, Math.round(c0974m0.f10325d), Math.round(c0974m0.f10326e), Math.round(c0974m0.f10324c), 0);
                } else {
                    AbstractC0952b0.c(textView, iArr5, 0);
                }
            }
        }
        C0803c c0803c3 = new C0803c(context, 2, context.obtainStyledAttributes(attributeSet, iArr3));
        int iB2 = c0803c3.B(8, -1);
        Drawable drawableB = iB2 != -1 ? c0998zA.b(context, iB2) : null;
        int iB3 = c0803c3.B(13, -1);
        Drawable drawableB2 = iB3 != -1 ? c0998zA.b(context, iB3) : null;
        int iB4 = c0803c3.B(9, -1);
        Drawable drawableB3 = iB4 != -1 ? c0998zA.b(context, iB4) : null;
        int iB5 = c0803c3.B(6, -1);
        Drawable drawableB4 = iB5 != -1 ? c0998zA.b(context, iB5) : null;
        int iB6 = c0803c3.B(10, -1);
        Drawable drawableB5 = iB6 != -1 ? c0998zA.b(context, iB6) : null;
        int iB7 = c0803c3.B(7, -1);
        Drawable drawableB6 = iB7 != -1 ? c0998zA.b(context, iB7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (c0803c3.G(11)) {
            T.m.f(textView, c0803c3.s(11));
        }
        if (c0803c3.G(12)) {
            i7 = -1;
            T.m.g(textView, AbstractC0983r0.b(c0803c3.z(12, -1), null));
        } else {
            i7 = -1;
        }
        int iU = c0803c3.u(15, i7);
        int iU2 = c0803c3.u(18, i7);
        if (c0803c3.G(19)) {
            TypedValue typedValuePeekValue = ((TypedArray) c0803c3.f9278y).peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i8 = -1;
                fU = c0803c3.u(19, -1);
                i9 = -1;
            } else {
                int i16 = typedValuePeekValue.data;
                int i17 = i16 & 15;
                fU = TypedValue.complexToFloat(i16);
                i9 = i17;
                i8 = -1;
            }
        } else {
            i8 = -1;
            i9 = -1;
            fU = -1.0f;
        }
        c0803c3.M();
        if (iU != i8) {
            AbstractC0651b.z(textView, iU);
        }
        if (iU2 != i8) {
            AbstractC0651b.A(textView, iU2);
        }
        if (fU != -1.0f) {
            if (i9 == i8) {
                AbstractC0651b.B(textView, (int) fU);
            } else if (Build.VERSION.SDK_INT >= 34) {
                T.p.a(textView, i9, fU);
            } else {
                AbstractC0651b.B(textView, Math.round(TypedValue.applyDimension(i9, fU, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i6) {
        String strC;
        C0803c c0803c = new C0803c(context, 2, context.obtainStyledAttributes(i6, AbstractC0732a.f8584v));
        boolean zG = c0803c.G(14);
        TextView textView = this.f10250a;
        if (zG) {
            textView.setAllCaps(c0803c.r(14, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (c0803c.G(0) && c0803c.u(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c0803c);
        if (i7 >= 26 && c0803c.G(13) && (strC = c0803c.C(13)) != null) {
            AbstractC0952b0.d(textView, strC);
        }
        c0803c.M();
        Typeface typeface = this.f10261l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f10259j);
        }
    }

    public final void i(int i6, int i7, int i8, int i9) {
        C0974m0 c0974m0 = this.f10258i;
        if (c0974m0.j()) {
            DisplayMetrics displayMetrics = c0974m0.f10331j.getResources().getDisplayMetrics();
            c0974m0.k(TypedValue.applyDimension(i9, i6, displayMetrics), TypedValue.applyDimension(i9, i7, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (c0974m0.h()) {
                c0974m0.a();
            }
        }
    }

    public final void j(int[] iArr, int i6) {
        C0974m0 c0974m0 = this.f10258i;
        if (c0974m0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i6 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0974m0.f10331j.getResources().getDisplayMetrics();
                    for (int i7 = 0; i7 < length; i7++) {
                        iArrCopyOf[i7] = Math.round(TypedValue.applyDimension(i6, iArr[i7], displayMetrics));
                    }
                }
                c0974m0.f10327f = C0974m0.b(iArrCopyOf);
                if (!c0974m0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0974m0.f10328g = false;
            }
            if (c0974m0.h()) {
                c0974m0.a();
            }
        }
    }

    public final void k(int i6) {
        C0974m0 c0974m0 = this.f10258i;
        if (c0974m0.j()) {
            if (i6 == 0) {
                c0974m0.f10322a = 0;
                c0974m0.f10325d = -1.0f;
                c0974m0.f10326e = -1.0f;
                c0974m0.f10324c = -1.0f;
                c0974m0.f10327f = new int[0];
                c0974m0.f10323b = false;
                return;
            }
            if (i6 != 1) {
                throw new IllegalArgumentException(AbstractC0628i.f("Unknown auto-size text type: ", i6));
            }
            DisplayMetrics displayMetrics = c0974m0.f10331j.getResources().getDisplayMetrics();
            c0974m0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0974m0.h()) {
                c0974m0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f10257h == null) {
            this.f10257h = new Z0();
        }
        Z0 z02 = this.f10257h;
        z02.f10237c = colorStateList;
        z02.f10236b = colorStateList != null;
        this.f10251b = z02;
        this.f10252c = z02;
        this.f10253d = z02;
        this.f10254e = z02;
        this.f10255f = z02;
        this.f10256g = z02;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f10257h == null) {
            this.f10257h = new Z0();
        }
        Z0 z02 = this.f10257h;
        z02.f10238d = mode;
        z02.f10235a = mode != null;
        this.f10251b = z02;
        this.f10252c = z02;
        this.f10253d = z02;
        this.f10254e = z02;
        this.f10255f = z02;
        this.f10256g = z02;
    }

    public final void n(Context context, C0803c c0803c) {
        String strC;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f10259j = c0803c.z(2, this.f10259j);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int iZ = c0803c.z(11, -1);
            this.f10260k = iZ;
            if (iZ != -1) {
                this.f10259j &= 2;
            }
        }
        if (!c0803c.G(10) && !c0803c.G(12)) {
            if (c0803c.G(1)) {
                this.f10262m = false;
                int iZ2 = c0803c.z(1, 1);
                if (iZ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iZ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iZ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f10261l = typeface;
                return;
            }
            return;
        }
        this.f10261l = null;
        int i7 = c0803c.G(12) ? 12 : 10;
        int i8 = this.f10260k;
        int i9 = this.f10259j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceX = c0803c.x(i7, this.f10259j, new Y(this, i8, i9, new WeakReference(this.f10250a)));
                if (typefaceX != null) {
                    if (i6 >= 28 && this.f10260k != -1) {
                        typefaceX = AbstractC0954c0.a(Typeface.create(typefaceX, 0), this.f10260k, (this.f10259j & 2) != 0);
                    }
                    this.f10261l = typefaceX;
                }
                this.f10262m = this.f10261l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f10261l != null || (strC = c0803c.C(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f10260k == -1) {
            typefaceCreate = Typeface.create(strC, this.f10259j);
        } else {
            typefaceCreate = AbstractC0954c0.a(Typeface.create(strC, 0), this.f10260k, (this.f10259j & 2) != 0);
        }
        this.f10261l = typefaceCreate;
    }
}
