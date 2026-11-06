package T;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3349i;

    public final float a(long j6) {
        if (j6 < this.f3345e) {
            return 0.0f;
        }
        long j7 = this.f3347g;
        if (j7 < 0 || j6 < j7) {
            return g.b((j6 - r0) / this.f3341a, 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f3348h;
        return (g.b((j6 - j7) / this.f3349i, 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
