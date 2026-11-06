package N;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import d2.AbstractC0651b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends A0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2047h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f2048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f2049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f2050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f2051l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f2052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G.c[] f2053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G.c f2054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0 f2055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public G.c f2056g;

    public u0(C0 c02, WindowInsets windowInsets) {
        super(c02);
        this.f2054e = null;
        this.f2052c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private G.c r(int i6, boolean z5) {
        G.c cVarA = G.c.f640e;
        for (int i7 = 1; i7 <= 256; i7 <<= 1) {
            if ((i6 & i7) != 0) {
                cVarA = G.c.a(cVarA, s(i7, z5));
            }
        }
        return cVarA;
    }

    private G.c t() {
        C0 c02 = this.f2055f;
        return c02 != null ? c02.f1943a.h() : G.c.f640e;
    }

    private G.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2047h) {
            v();
        }
        Method method = f2048i;
        if (method != null && f2049j != null && f2050k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2050k.get(f2051l.get(objInvoke));
                if (rect != null) {
                    return G.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f2048i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2049j = cls;
            f2050k = cls.getDeclaredField("mVisibleInsets");
            f2051l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2050k.setAccessible(true);
            f2051l.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f2047h = true;
    }

    @Override // N.A0
    public void d(View view) {
        G.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = G.c.f640e;
        }
        w(cVarU);
    }

    @Override // N.A0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2056g, ((u0) obj).f2056g);
        }
        return false;
    }

    @Override // N.A0
    public G.c f(int i6) {
        return r(i6, false);
    }

    @Override // N.A0
    public final G.c j() {
        if (this.f2054e == null) {
            WindowInsets windowInsets = this.f2052c;
            this.f2054e = G.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2054e;
    }

    @Override // N.A0
    public C0 l(int i6, int i7, int i8, int i9) {
        C0 c0G = C0.g(null, this.f2052c);
        int i10 = Build.VERSION.SDK_INT;
        t0 s0Var = i10 >= 30 ? new s0(c0G) : i10 >= 29 ? new r0(c0G) : new q0(c0G);
        s0Var.g(C0.e(j(), i6, i7, i8, i9));
        s0Var.e(C0.e(h(), i6, i7, i8, i9));
        return s0Var.b();
    }

    @Override // N.A0
    public boolean n() {
        return this.f2052c.isRound();
    }

    @Override // N.A0
    public void o(G.c[] cVarArr) {
        this.f2053d = cVarArr;
    }

    @Override // N.A0
    public void p(C0 c02) {
        this.f2055f = c02;
    }

    public G.c s(int i6, boolean z5) {
        G.c cVarH;
        int i7;
        if (i6 == 1) {
            return z5 ? G.c.b(0, Math.max(t().f642b, j().f642b), 0, 0) : G.c.b(0, j().f642b, 0, 0);
        }
        if (i6 == 2) {
            if (z5) {
                G.c cVarT = t();
                G.c cVarH2 = h();
                return G.c.b(Math.max(cVarT.f641a, cVarH2.f641a), 0, Math.max(cVarT.f643c, cVarH2.f643c), Math.max(cVarT.f644d, cVarH2.f644d));
            }
            G.c cVarJ = j();
            C0 c02 = this.f2055f;
            cVarH = c02 != null ? c02.f1943a.h() : null;
            int iMin = cVarJ.f644d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f644d);
            }
            return G.c.b(cVarJ.f641a, 0, cVarJ.f643c, iMin);
        }
        G.c cVar = G.c.f640e;
        if (i6 == 8) {
            G.c[] cVarArr = this.f2053d;
            cVarH = cVarArr != null ? cVarArr[AbstractC0651b.t(8)] : null;
            if (cVarH != null) {
                return cVarH;
            }
            G.c cVarJ2 = j();
            G.c cVarT2 = t();
            int i8 = cVarJ2.f644d;
            if (i8 > cVarT2.f644d) {
                return G.c.b(0, 0, 0, i8);
            }
            G.c cVar2 = this.f2056g;
            return (cVar2 == null || cVar2.equals(cVar) || (i7 = this.f2056g.f644d) <= cVarT2.f644d) ? cVar : G.c.b(0, 0, 0, i7);
        }
        if (i6 == 16) {
            return i();
        }
        if (i6 == 32) {
            return g();
        }
        if (i6 == 64) {
            return k();
        }
        if (i6 != 128) {
            return cVar;
        }
        C0 c03 = this.f2055f;
        C0100k c0100kE = c03 != null ? c03.f1943a.e() : e();
        if (c0100kE == null) {
            return cVar;
        }
        int i9 = Build.VERSION.SDK_INT;
        DisplayCutout displayCutout = c0100kE.f2013a;
        return G.c.b(i9 >= 28 ? AbstractC0099j.d(displayCutout) : 0, i9 >= 28 ? AbstractC0099j.f(displayCutout) : 0, i9 >= 28 ? AbstractC0099j.e(displayCutout) : 0, i9 >= 28 ? AbstractC0099j.c(displayCutout) : 0);
    }

    public void w(G.c cVar) {
        this.f2056g = cVar;
    }
}
