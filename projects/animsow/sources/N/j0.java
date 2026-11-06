package N;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.C0396c2;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.j f2011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0 f2012b;

    public j0(View view, y2.j jVar) {
        C0 c0B;
        this.f2011a = jVar;
        WeakHashMap weakHashMap = V.f1964a;
        C0 c0A = J.a(view);
        if (c0A != null) {
            int i6 = Build.VERSION.SDK_INT;
            c0B = (i6 >= 30 ? new s0(c0A) : i6 >= 29 ? new r0(c0A) : new q0(c0A)).b();
        } else {
            c0B = null;
        }
        this.f2012b = c0B;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        A0 a02;
        if (!view.isLaidOut()) {
            this.f2012b = C0.g(view, windowInsets);
            return k0.i(view, windowInsets);
        }
        C0 c0G = C0.g(view, windowInsets);
        if (this.f2012b == null) {
            WeakHashMap weakHashMap = V.f1964a;
            this.f2012b = J.a(view);
        }
        if (this.f2012b == null) {
            this.f2012b = c0G;
            return k0.i(view, windowInsets);
        }
        y2.j jVarJ = k0.j(view);
        if (jVarJ != null && Objects.equals(jVarJ.f13815a, windowInsets)) {
            return k0.i(view, windowInsets);
        }
        C0 c02 = this.f2012b;
        int i6 = 1;
        int i7 = 0;
        while (true) {
            a02 = c0G.f1943a;
            if (i6 > 256) {
                break;
            }
            if (!a02.f(i6).equals(c02.f1943a.f(i6))) {
                i7 |= i6;
            }
            i6 <<= 1;
        }
        if (i7 == 0) {
            return k0.i(view, windowInsets);
        }
        C0 c03 = this.f2012b;
        o0 o0Var = new o0(i7, (i7 & 8) != 0 ? a02.f(8).f644d > c03.f1943a.f(8).f644d ? k0.f2014e : k0.f2015f : k0.f2016g, 160L);
        o0Var.f2031a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o0Var.f2031a.a());
        G.c cVarF = a02.f(i7);
        G.c cVarF2 = c03.f1943a.f(i7);
        int iMin = Math.min(cVarF.f641a, cVarF2.f641a);
        int i8 = cVarF.f642b;
        int i9 = cVarF2.f642b;
        int iMin2 = Math.min(i8, i9);
        int i10 = cVarF.f643c;
        int i11 = cVarF2.f643c;
        int iMin3 = Math.min(i10, i11);
        int i12 = cVarF.f644d;
        int i13 = i7;
        int i14 = cVarF2.f644d;
        C0396c2 c0396c2 = new C0396c2(G.c.b(iMin, iMin2, iMin3, Math.min(i12, i14)), 7, G.c.b(Math.max(cVarF.f641a, cVarF2.f641a), Math.max(i8, i9), Math.max(i10, i11), Math.max(i12, i14)));
        k0.f(view, windowInsets, false);
        duration.addUpdateListener(new C0096h0(o0Var, c0G, c03, i13, view));
        duration.addListener(new C0088d0(this, o0Var, view, 1));
        ViewTreeObserverOnPreDrawListenerC0110v.a(view, new RunnableC0098i0(this, view, o0Var, c0396c2, duration, 0));
        this.f2012b = c0G;
        return k0.i(view, windowInsets);
    }
}
