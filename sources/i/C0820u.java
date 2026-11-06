package i;

import N.C0;
import N.InterfaceC0107s;
import N.V;
import N.q0;
import N.r0;
import N.s0;
import N.t0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import m.InterfaceC0978o0;

/* JADX INFO: renamed from: i.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0820u implements InterfaceC0107s, InterfaceC0978o0, l.z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H f9343w;

    public /* synthetic */ C0820u(H h4) {
        this.f9343w = h4;
    }

    @Override // l.z
    public final void c(l.o oVar, boolean z5) {
        G g4;
        l.o oVarK = oVar.k();
        int i6 = 0;
        boolean z6 = oVarK != oVar;
        if (z6) {
            oVar = oVarK;
        }
        H h4 = this.f9343w;
        G[] gArr = h4.f9199i0;
        int length = gArr != null ? gArr.length : 0;
        while (true) {
            if (i6 < length) {
                g4 = gArr[i6];
                if (g4 != null && g4.f9155h == oVar) {
                    break;
                } else {
                    i6++;
                }
            } else {
                g4 = null;
                break;
            }
        }
        if (g4 != null) {
            if (!z6) {
                h4.r(g4, z5);
            } else {
                h4.p(g4.f9148a, g4, oVarK);
                h4.r(g4, true);
            }
        }
    }

    @Override // l.z
    public final boolean f(l.o oVar) {
        Window.Callback callback;
        if (oVar != oVar.k()) {
            return true;
        }
        H h4 = this.f9343w;
        if (!h4.f9193c0 || (callback = h4.f9172H.getCallback()) == null || h4.f9204n0) {
            return true;
        }
        callback.onMenuOpened(108, oVar);
        return true;
    }

    @Override // N.InterfaceC0107s
    public final C0 p(View view, C0 c02) {
        int iD = c02.d();
        int I5 = this.f9343w.I(c02, null);
        if (iD != I5) {
            int iB = c02.b();
            int iC = c02.c();
            int iA = c02.a();
            int i6 = Build.VERSION.SDK_INT;
            t0 s0Var = i6 >= 30 ? new s0(c02) : i6 >= 29 ? new r0(c02) : new q0(c02);
            s0Var.g(G.c.b(iB, I5, iC, iA));
            c02 = s0Var.b();
        }
        WeakHashMap weakHashMap = V.f1964a;
        WindowInsets windowInsetsF = c02.f();
        if (windowInsetsF == null) {
            return c02;
        }
        WindowInsets windowInsetsB = N.G.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? C0.g(view, windowInsetsB) : c02;
    }
}
