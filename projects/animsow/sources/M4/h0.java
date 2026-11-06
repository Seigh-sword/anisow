package M4;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends f0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k0 f1891A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final i0 f1892B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0067l f1893C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f1894D;

    public h0(k0 k0Var, i0 i0Var, C0067l c0067l, Object obj) {
        this.f1891A = k0Var;
        this.f1892B = i0Var;
        this.f1893C = c0067l;
        this.f1894D = obj;
    }

    @Override // M4.Y
    public final void d(Throwable th) {
        k0 k0Var = this.f1891A;
        k0Var.getClass();
        C0067l c0067lV = k0.V(this.f1893C);
        i0 i0Var = this.f1892B;
        Object obj = this.f1894D;
        if (c0067lV != null) {
            while (S3.a.z(c0067lV.f1907A, false, new h0(k0Var, i0Var, c0067lV, obj), 1) == o0.f1909w) {
                c0067lV = k0.V(c0067lV);
                if (c0067lV == null) {
                }
            }
            return;
        }
        k0Var.v(k0Var.E(i0Var, obj));
    }
}
