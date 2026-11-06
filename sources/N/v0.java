package N;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends u0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public G.c f2060m;

    public v0(C0 c02, WindowInsets windowInsets) {
        super(c02, windowInsets);
        this.f2060m = null;
    }

    @Override // N.A0
    public C0 b() {
        return C0.g(null, this.f2052c.consumeStableInsets());
    }

    @Override // N.A0
    public C0 c() {
        return C0.g(null, this.f2052c.consumeSystemWindowInsets());
    }

    @Override // N.A0
    public final G.c h() {
        if (this.f2060m == null) {
            WindowInsets windowInsets = this.f2052c;
            this.f2060m = G.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2060m;
    }

    @Override // N.A0
    public boolean m() {
        return this.f2052c.isConsumed();
    }

    @Override // N.A0
    public void q(G.c cVar) {
        this.f2060m = cVar;
    }
}
