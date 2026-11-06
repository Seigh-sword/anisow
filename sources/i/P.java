package i;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static P f9233d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9236c;

    public P(int i6, long j6, long j7) {
        this.f9234a = j6;
        this.f9235b = j7;
        this.f9236c = i6;
    }

    public final void a(double d6, double d7, long j6) {
        double d8 = (0.01720197f * ((j6 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d8) * 0.03341960161924362d) + d8 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d8) * 0.0053d) + ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d7) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d9 = 0.01745329238474369d * d6;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d9))) / (Math.cos(dAsin) * Math.cos(d9));
        if (dSin3 >= 1.0d) {
            this.f9236c = 1;
        } else {
            if (dSin3 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
                this.f9234a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
                this.f9235b = jRound;
                if (jRound >= j6 || this.f9234a <= j6) {
                    this.f9236c = 1;
                    return;
                } else {
                    this.f9236c = 0;
                    return;
                }
            }
            this.f9236c = 0;
        }
        this.f9234a = -1L;
        this.f9235b = -1L;
    }
}
