package F0;

/* JADX INFO: loaded from: classes.dex */
public final class B extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f476b;

    public B(C c6, int i6) {
        this.f475a = i6;
        if (i6 != 1) {
            this.f476b = c6;
        } else {
            this.f476b = c6;
        }
    }

    @Override // F0.x, F0.u
    public final void a(w wVar) {
        switch (this.f475a) {
            case 1:
                C c6 = this.f476b;
                int i6 = c6.f479c0 - 1;
                c6.f479c0 = i6;
                if (i6 == 0) {
                    c6.f480d0 = false;
                    c6.q();
                }
                wVar.F(this);
                break;
        }
    }

    @Override // F0.x, F0.u
    public final void b(w wVar) {
        switch (this.f475a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f476b.f477a0.remove(wVar);
                if (!this.f476b.w()) {
                    this.f476b.C(v.f562c);
                    C c6 = this.f476b;
                    c6.f582N = true;
                    c6.C(v.f561b);
                }
                break;
        }
    }

    @Override // F0.x, F0.u
    public final void d(w wVar) {
        switch (this.f475a) {
            case 1:
                C c6 = this.f476b;
                if (!c6.f480d0) {
                    c6.Q();
                    this.f476b.f480d0 = true;
                }
                break;
        }
    }
}
