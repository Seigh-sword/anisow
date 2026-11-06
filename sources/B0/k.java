package b0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f5906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f5908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f5909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f5910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f5911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f5912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f5913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0335g f5914j;

    public k() {
        this.f5905a = Math.sqrt(1500.0d);
        this.f5906b = 0.5d;
        this.f5907c = false;
        this.f5913i = Double.MAX_VALUE;
        this.f5914j = new C0335g();
    }

    public final void a(float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f5905a = Math.sqrt(f6);
        this.f5907c = false;
    }

    public final C0335g b(double d6, double d7, long j6) {
        double dCos;
        double dPow;
        if (!this.f5907c) {
            if (this.f5913i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d8 = this.f5906b;
            if (d8 > 1.0d) {
                double d9 = this.f5905a;
                this.f5910f = (Math.sqrt((d8 * d8) - 1.0d) * d9) + ((-d8) * d9);
                double d10 = this.f5906b;
                double d11 = this.f5905a;
                this.f5911g = ((-d10) * d11) - (Math.sqrt((d10 * d10) - 1.0d) * d11);
            } else if (d8 >= 0.0d && d8 < 1.0d) {
                this.f5912h = Math.sqrt(1.0d - (d8 * d8)) * this.f5905a;
            }
            this.f5907c = true;
        }
        double d12 = j6 / 1000.0d;
        double d13 = d6 - this.f5913i;
        double d14 = this.f5906b;
        if (d14 > 1.0d) {
            double d15 = this.f5911g;
            double d16 = this.f5910f;
            double d17 = d13 - (((d15 * d13) - d7) / (d15 - d16));
            double d18 = ((d13 * d15) - d7) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, this.f5910f * d12) * d18) + (Math.pow(2.718281828459045d, d15 * d12) * d17);
            double d19 = this.f5911g;
            double dPow2 = Math.pow(2.718281828459045d, d19 * d12) * d17 * d19;
            double d20 = this.f5910f;
            dCos = (Math.pow(2.718281828459045d, d20 * d12) * d18 * d20) + dPow2;
        } else if (d14 == 1.0d) {
            double d21 = this.f5905a;
            double d22 = (d21 * d13) + d7;
            double d23 = (d22 * d12) + d13;
            double dPow3 = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f5905a) * d12) * d23;
            double d24 = this.f5905a;
            dCos = (Math.pow(2.718281828459045d, (-d24) * d12) * d22) + (dPow4 * (-d24));
            dPow = dPow3;
        } else {
            double d25 = 1.0d / this.f5912h;
            double d26 = this.f5905a;
            double d27 = ((d14 * d26 * d13) + d7) * d25;
            double dSin = ((Math.sin(this.f5912h * d12) * d27) + (Math.cos(this.f5912h * d12) * d13)) * Math.pow(2.718281828459045d, (-d14) * d26 * d12);
            double d28 = this.f5905a;
            double d29 = this.f5906b;
            double d30 = (-d28) * dSin * d29;
            double dPow5 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d31 = this.f5912h;
            double dSin2 = Math.sin(d31 * d12) * (-d31) * d13;
            double d32 = this.f5912h;
            dCos = (((Math.cos(d32 * d12) * d27 * d32) + dSin2) * dPow5) + d30;
            dPow = dSin;
        }
        float f6 = (float) (dPow + this.f5913i);
        C0335g c0335g = this.f5914j;
        c0335g.f5881a = f6;
        c0335g.f5882b = (float) dCos;
        return c0335g;
    }

    public k(float f6) {
        this.f5905a = Math.sqrt(1500.0d);
        this.f5906b = 0.5d;
        this.f5907c = false;
        this.f5914j = new C0335g();
        this.f5913i = f6;
    }
}
