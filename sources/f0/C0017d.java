package F0;

import android.view.ViewGroup;

/* JADX INFO: renamed from: F0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017d extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f510a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f511b;

    public C0017d(ViewGroup viewGroup) {
        this.f511b = viewGroup;
    }

    @Override // F0.x, F0.u
    public final void a(w wVar) {
        if (!this.f510a) {
            com.bumptech.glide.c.P(this.f511b, false);
        }
        wVar.F(this);
    }

    @Override // F0.x, F0.u
    public final void b(w wVar) {
        com.bumptech.glide.c.P(this.f511b, false);
        this.f510a = true;
    }

    @Override // F0.x, F0.u
    public final void c() {
        com.bumptech.glide.c.P(this.f511b, false);
    }

    @Override // F0.x, F0.u
    public final void e() {
        com.bumptech.glide.c.P(this.f511b, true);
    }
}
