package N;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2044c;

    public r0() {
        this.f2044c = B.a.f();
    }

    @Override // N.t0
    public C0 b() {
        a();
        C0 c0G = C0.g(null, this.f2044c.build());
        c0G.f1943a.o(this.f2046b);
        return c0G;
    }

    @Override // N.t0
    public void d(G.c cVar) {
        this.f2044c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // N.t0
    public void e(G.c cVar) {
        this.f2044c.setStableInsets(cVar.d());
    }

    @Override // N.t0
    public void f(G.c cVar) {
        this.f2044c.setSystemGestureInsets(cVar.d());
    }

    @Override // N.t0
    public void g(G.c cVar) {
        this.f2044c.setSystemWindowInsets(cVar.d());
    }

    @Override // N.t0
    public void h(G.c cVar) {
        this.f2044c.setTappableElementInsets(cVar.d());
    }

    public r0(C0 c02) {
        super(c02);
        WindowInsets windowInsetsF = c02.f();
        this.f2044c = windowInsetsF != null ? B.a.g(windowInsetsF) : B.a.f();
    }
}
