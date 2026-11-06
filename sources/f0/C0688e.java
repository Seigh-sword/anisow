package f0;

/* JADX INFO: renamed from: f0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8340b;

    public C0688e(long j6, long j7) {
        if (j7 == 0) {
            this.f8339a = 0L;
            this.f8340b = 1L;
        } else {
            this.f8339a = j6;
            this.f8340b = j7;
        }
    }

    public final String toString() {
        return this.f8339a + "/" + this.f8340b;
    }
}
