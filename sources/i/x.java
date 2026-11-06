package i;

import N.C0090e0;
import N.V;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import k.AbstractC0880c;
import k.InterfaceC0879b;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC0879b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0879b f9347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f9348b;

    public x(H h4, P0.h hVar) {
        this.f9348b = h4;
        this.f9347a = hVar;
    }

    @Override // k.InterfaceC0879b
    public final boolean a(AbstractC0880c abstractC0880c, l.o oVar) {
        return this.f9347a.a(abstractC0880c, oVar);
    }

    @Override // k.InterfaceC0879b
    public final boolean b(AbstractC0880c abstractC0880c, MenuItem menuItem) {
        return this.f9347a.b(abstractC0880c, menuItem);
    }

    @Override // k.InterfaceC0879b
    public final boolean c(AbstractC0880c abstractC0880c, l.o oVar) {
        ViewGroup viewGroup = this.f9348b.f9188X;
        WeakHashMap weakHashMap = V.f1964a;
        N.G.c(viewGroup);
        return this.f9347a.c(abstractC0880c, oVar);
    }

    @Override // k.InterfaceC0879b
    public final void d(AbstractC0880c abstractC0880c) {
        this.f9347a.d(abstractC0880c);
        H h4 = this.f9348b;
        if (h4.f9183S != null) {
            h4.f9172H.getDecorView().removeCallbacks(h4.f9184T);
        }
        if (h4.f9182R != null) {
            C0090e0 c0090e0 = h4.f9185U;
            if (c0090e0 != null) {
                c0090e0.b();
            }
            C0090e0 c0090e0A = V.a(h4.f9182R);
            c0090e0A.a(0.0f);
            h4.f9185U = c0090e0A;
            c0090e0A.d(new w(2, this));
        }
        h4.f9181Q = null;
        ViewGroup viewGroup = h4.f9188X;
        WeakHashMap weakHashMap = V.f1964a;
        N.G.c(viewGroup);
        h4.H();
    }
}
