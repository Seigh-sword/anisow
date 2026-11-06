package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import i.C0803c;
import java.util.List;
import java.util.WeakHashMap;
import r2.AbstractC1274a;

/* JADX INFO: renamed from: m.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10384g;

    public C0986t(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i6, P2.j jVar, Rect rect) {
        this.f10378a = 2;
        AbstractC0651b.e(rect.left);
        AbstractC0651b.e(rect.top);
        AbstractC0651b.e(rect.right);
        AbstractC0651b.e(rect.bottom);
        this.f10380c = rect;
        this.f10381d = colorStateList2;
        this.f10382e = colorStateList;
        this.f10383f = colorStateList3;
        this.f10379b = i6;
        this.f10384g = jVar;
    }

    public static C0986t b(Context context, int i6) {
        AbstractC0651b.d("Cannot create a CalendarItemStyle with a styleResId of 0", i6 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, AbstractC1274a.f12464r);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListO = f2.h.o(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListO2 = f2.h.o(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListO3 = f2.h.o(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        P2.j jVarA = P2.j.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new P2.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0986t(colorStateListO, colorStateListO2, colorStateListO3, dimensionPixelSize, jVarA, rect);
    }

    public final void a() {
        View view = (View) this.f10380c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((Z0) this.f10382e) != null) {
                if (((Z0) this.f10384g) == null) {
                    this.f10384g = new Z0();
                }
                Z0 z02 = (Z0) this.f10384g;
                z02.f10237c = null;
                z02.f10236b = false;
                z02.f10238d = null;
                z02.f10235a = false;
                WeakHashMap weakHashMap = N.V.f1964a;
                ColorStateList colorStateListG = N.I.g(view);
                if (colorStateListG != null) {
                    z02.f10236b = true;
                    z02.f10237c = colorStateListG;
                }
                PorterDuff.Mode modeH = N.I.h(view);
                if (modeH != null) {
                    z02.f10235a = true;
                    z02.f10238d = modeH;
                }
                if (z02.f10236b || z02.f10235a) {
                    C0998z.d(background, z02, view.getDrawableState());
                    return;
                }
            }
            Z0 z03 = (Z0) this.f10383f;
            if (z03 != null) {
                C0998z.d(background, z03, view.getDrawableState());
                return;
            }
            Z0 z04 = (Z0) this.f10382e;
            if (z04 != null) {
                C0998z.d(background, z04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f10383f;
        if (((Z0) obj) != null) {
            return (ColorStateList) ((Z0) obj).f10237c;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f10383f;
        if (((Z0) obj) != null) {
            return (PorterDuff.Mode) ((Z0) obj).f10238d;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i6) {
        ColorStateList colorStateListH;
        Object obj = this.f10380c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = AbstractC0732a.f8587y;
        C0803c c0803cJ = C0803c.J(context, attributeSet, iArr, i6, 0);
        N.V.k(view, view.getContext(), iArr, attributeSet, (TypedArray) c0803cJ.f9278y, i6);
        try {
            if (c0803cJ.G(0)) {
                this.f10379b = c0803cJ.B(0, -1);
                C0998z c0998z = (C0998z) this.f10381d;
                Context context2 = ((View) obj).getContext();
                int i7 = this.f10379b;
                synchronized (c0998z) {
                    colorStateListH = c0998z.f10429a.h(context2, i7);
                }
                if (colorStateListH != null) {
                    h(colorStateListH);
                }
            }
            if (c0803cJ.G(1)) {
                N.I.q((View) obj, c0803cJ.s(1));
            }
            if (c0803cJ.G(2)) {
                N.I.r((View) obj, AbstractC0983r0.b(c0803cJ.z(2, -1), null));
            }
            c0803cJ.M();
        } catch (Throwable th) {
            c0803cJ.M();
            throw th;
        }
    }

    public final void f() {
        this.f10379b = -1;
        h(null);
        a();
    }

    public final void g(int i6) {
        ColorStateList colorStateListH;
        this.f10379b = i6;
        C0998z c0998z = (C0998z) this.f10381d;
        if (c0998z != null) {
            Context context = ((View) this.f10380c).getContext();
            synchronized (c0998z) {
                colorStateListH = c0998z.f10429a.h(context, i6);
            }
        } else {
            colorStateListH = null;
        }
        h(colorStateListH);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((Z0) this.f10382e) == null) {
                this.f10382e = new Z0();
            }
            Object obj = this.f10382e;
            ((Z0) obj).f10237c = colorStateList;
            ((Z0) obj).f10236b = true;
        } else {
            this.f10382e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((Z0) this.f10383f) == null) {
            this.f10383f = new Z0();
        }
        Z0 z02 = (Z0) this.f10383f;
        z02.f10237c = colorStateList;
        z02.f10236b = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((Z0) this.f10383f) == null) {
            this.f10383f = new Z0();
        }
        Z0 z02 = (Z0) this.f10383f;
        z02.f10238d = mode;
        z02.f10235a = true;
        a();
    }

    public final String toString() {
        switch (this.f10378a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f10380c) + ", mProviderPackage: " + ((String) this.f10381d) + ", mQuery: " + ((String) this.f10382e) + ", mCertificates:");
                for (int i6 = 0; i6 < ((List) this.f10383f).size(); i6++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f10383f).get(i6);
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i7), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f10379b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0986t(View view) {
        this.f10378a = 0;
        this.f10379b = -1;
        this.f10380c = view;
        this.f10381d = C0998z.a();
    }

    public C0986t(String str, String str2, String str3, List list) {
        this.f10378a = 1;
        str.getClass();
        this.f10380c = str;
        str2.getClass();
        this.f10381d = str2;
        this.f10382e = str3;
        list.getClass();
        this.f10383f = list;
        this.f10379b = 0;
        this.f10384g = str + "-" + str2 + "-" + str3;
    }
}
