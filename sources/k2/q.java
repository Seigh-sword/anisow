package K2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1612k;

    @Override // K2.e
    public final void a() {
        int i6 = this.f1557g;
        if (i6 < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
        if (this.f1612k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f1609h == 0) {
            if (this.f1552b > 0 && i6 == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f1553c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
