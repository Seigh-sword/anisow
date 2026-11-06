package N;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends w0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public G.c f2064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public G.c f2065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public G.c f2066p;

    public y0(C0 c02, WindowInsets windowInsets) {
        super(c02, windowInsets);
        this.f2064n = null;
        this.f2065o = null;
        this.f2066p = null;
    }

    @Override // N.A0
    public G.c g() {
        if (this.f2065o == null) {
            this.f2065o = G.c.c(this.f2052c.getMandatorySystemGestureInsets());
        }
        return this.f2065o;
    }

    @Override // N.A0
    public G.c i() {
        if (this.f2064n == null) {
            this.f2064n = G.c.c(this.f2052c.getSystemGestureInsets());
        }
        return this.f2064n;
    }

    @Override // N.A0
    public G.c k() {
        if (this.f2066p == null) {
            this.f2066p = G.c.c(this.f2052c.getTappableElementInsets());
        }
        return this.f2066p;
    }

    @Override // N.u0, N.A0
    public C0 l(int i6, int i7, int i8, int i9) {
        return C0.g(null, this.f2052c.inset(i6, i7, i8, i9));
    }

    @Override // N.v0, N.A0
    public void q(G.c cVar) {
    }
}
