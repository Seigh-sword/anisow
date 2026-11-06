package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0 f1942b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f1943a;

    static {
        f1942b = Build.VERSION.SDK_INT >= 30 ? z0.f2067q : A0.f1935b;
    }

    public C0() {
        this.f1943a = new A0(this);
    }

    public static G.c e(G.c cVar, int i6, int i7, int i8, int i9) {
        int iMax = Math.max(0, cVar.f641a - i6);
        int iMax2 = Math.max(0, cVar.f642b - i7);
        int iMax3 = Math.max(0, cVar.f643c - i8);
        int iMax4 = Math.max(0, cVar.f644d - i9);
        return (iMax == i6 && iMax2 == i7 && iMax3 == i8 && iMax4 == i9) ? cVar : G.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static C0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0 c02 = new C0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = V.f1964a;
            C0 c0A = J.a(view);
            A0 a02 = c02.f1943a;
            a02.p(c0A);
            a02.d(view.getRootView());
        }
        return c02;
    }

    public final int a() {
        return this.f1943a.j().f644d;
    }

    public final int b() {
        return this.f1943a.j().f641a;
    }

    public final int c() {
        return this.f1943a.j().f643c;
    }

    public final int d() {
        return this.f1943a.j().f642b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        return Objects.equals(this.f1943a, ((C0) obj).f1943a);
    }

    public final WindowInsets f() {
        A0 a02 = this.f1943a;
        if (a02 instanceof u0) {
            return ((u0) a02).f2052c;
        }
        return null;
    }

    public final int hashCode() {
        A0 a02 = this.f1943a;
        if (a02 == null) {
            return 0;
        }
        return a02.hashCode();
    }

    public C0(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        this.f1943a = i6 >= 30 ? new z0(this, windowInsets) : i6 >= 29 ? new y0(this, windowInsets) : i6 >= 28 ? new w0(this, windowInsets) : new v0(this, windowInsets);
    }
}
