package F;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f461k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f471j;

    static {
        float[] fArr = b.f429c;
        float fC = (float) ((((double) b.c()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f427a;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = (fArr3[1] * f8) + f7;
        float f10 = fArr[2];
        float f11 = (fArr3[2] * f10) + f9;
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[2] * f10) + (fArr4[1] * f8) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f13 = (f10 * fArr5[2]) + (f8 * fArr5[1]) + (f6 * fArr5[0]);
        float f14 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d6 = fExp;
        if (d6 > 1.0d) {
            fExp = 1.0f;
        } else if (d6 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp};
        float f15 = 1.0f / ((5.0f * fC) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float fCbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(((double) fC) * 5.0d))) + (f16 * fC);
        float fC2 = b.c() / fArr[1];
        double d7 = fC2;
        float fSqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f13)) / 100.0d, 0.42d)};
        float f18 = fArr7[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[2];
        float[] fArr8 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        f461k = new r(fC2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f14, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public r(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f467f = f6;
        this.f462a = f7;
        this.f463b = f8;
        this.f464c = f9;
        this.f465d = f10;
        this.f466e = f11;
        this.f468g = fArr;
        this.f469h = f12;
        this.f470i = f13;
        this.f471j = f14;
    }
}
