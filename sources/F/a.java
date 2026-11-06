package F;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f426f;

    public a(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f421a = f6;
        this.f422b = f7;
        this.f423c = f8;
        this.f424d = f9;
        this.f425e = f10;
        this.f426f = f11;
    }

    public static a a(int i6) {
        r rVar = r.f461k;
        float fB = b.b(Color.red(i6));
        float fB2 = b.b(Color.green(i6));
        float fB3 = b.b(Color.blue(i6));
        float[][] fArr = b.f430d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f8 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = b.f427a;
        float[] fArr6 = fArr5[0];
        float f9 = (fArr6[2] * f8) + (fArr6[1] * f7) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f10 = (fArr7[2] * f8) + (fArr7[1] * f7) + (fArr7[0] * f6);
        float[] fArr8 = fArr5[2];
        float f11 = (f8 * fArr8[2]) + (f7 * fArr8[1]) + (f6 * fArr8[0]);
        float[] fArr9 = rVar.f468g;
        float f12 = fArr9[0] * f9;
        float f13 = fArr9[1] * f10;
        float f14 = fArr9[2] * f11;
        float fAbs = Math.abs(f12);
        float f15 = rVar.f469h;
        float fPow = (float) Math.pow(((double) (fAbs * f15)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f13) * f15)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f14) * f15)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d6 = fSignum3;
        float f16 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d6)) / 11.0f;
        float f17 = ((float) (((double) (fSignum + fSignum2)) - (d6 * 2.0d))) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float f23 = f20 * rVar.f463b;
        float f24 = rVar.f462a;
        float f25 = rVar.f465d;
        float fPow4 = ((float) Math.pow(f23 / f24, rVar.f471j * f25)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f26 = f24 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.f467f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f21) < 20.14d ? 360.0f + f21 : f21)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.f466e) * rVar.f464c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f27 = rVar.f470i * fPow5;
        Math.sqrt((r3 * f25) / f26);
        float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f27 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new a(f21, fPow5, fPow4, f28, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static a b(float f6, float f7, float f8) {
        r rVar = r.f461k;
        float f9 = rVar.f465d;
        Math.sqrt(((double) f6) / 100.0d);
        float f10 = rVar.f462a + 4.0f;
        float f11 = rVar.f470i * f7;
        Math.sqrt(((f7 / ((float) Math.sqrt(r1))) * rVar.f465d) / f10);
        float f12 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float fLog = ((float) Math.log((((double) f11) * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f7, f6, f12, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(F.r r17) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.a.c(F.r):int");
    }
}
