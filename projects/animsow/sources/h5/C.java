package h5;

/* JADX INFO: loaded from: classes.dex */
public final class C extends V4.J {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V4.t f8989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f8990y;

    public C(V4.t tVar, long j6) {
        this.f8989x = tVar;
        this.f8990y = j6;
    }

    @Override // V4.J
    public final long b() {
        return this.f8990y;
    }

    @Override // V4.J
    public final V4.t c() {
        return this.f8989x;
    }

    @Override // V4.J
    public final f5.i g() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
