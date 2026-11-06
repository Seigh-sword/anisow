package G;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f647b;

    public f(char c6, float[] fArr) {
        this.f646a = c6;
        this.f647b = fArr;
    }

    public static void a(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z5, boolean z6) {
        double d6;
        double d7;
        double radians = Math.toRadians(f12);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d8 = f6;
        double d9 = f7;
        double d10 = (d9 * dSin) + (d8 * dCos);
        double d11 = d8;
        double d12 = f10;
        double d13 = d10 / d12;
        double d14 = f11;
        double d15 = ((d9 * dCos) + (((double) (-f6)) * dSin)) / d14;
        double d16 = d9;
        double d17 = f9;
        double d18 = ((d17 * dSin) + (((double) f8) * dCos)) / d12;
        double d19 = ((d17 * dCos) + (((double) (-f8)) * dSin)) / d14;
        double d20 = d13 - d18;
        double d21 = d15 - d19;
        double d22 = (d13 + d18) / 2.0d;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float fSqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f6, f7, f8, f9, f10 * fSqrt, f11 * fSqrt, f12, z5, z6);
            return;
        }
        double dSqrt = Math.sqrt(d25);
        double d26 = d20 * dSqrt;
        double d27 = dSqrt * d21;
        if (z5 == z6) {
            d6 = d22 - d27;
            d7 = d23 + d26;
        } else {
            d6 = d22 + d27;
            d7 = d23 - d26;
        }
        double dAtan2 = Math.atan2(d15 - d7, d13 - d6);
        double dAtan22 = Math.atan2(d19 - d7, d18 - d6) - dAtan2;
        if (z6 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d28 = d6 * d12;
        double d29 = d7 * d14;
        double d30 = (d28 * dCos) - (d29 * dSin);
        double d31 = (d29 * dCos) + (d28 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d32 = -d12;
        double d33 = d32 * dCos2;
        double d34 = d14 * dSin2;
        double d35 = (d33 * dSin3) - (d34 * dCos3);
        double d36 = d32 * dSin2;
        double d37 = d14 * dCos2;
        double d38 = (dCos3 * d37) + (dSin3 * d36);
        double d39 = d37;
        double d40 = dAtan22 / ((double) iCeil);
        int i6 = 0;
        while (i6 < iCeil) {
            double d41 = dAtan2 + d40;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            double d42 = d40;
            double d43 = (((d12 * dCos2) * dCos4) + d30) - (d34 * dSin4);
            double d44 = d39;
            double d45 = d30;
            double d46 = (d44 * dSin4) + (d12 * dSin2 * dCos4) + d31;
            double d47 = (d33 * dSin4) - (d34 * dCos4);
            double d48 = (dCos4 * d44) + (dSin4 * d36);
            double d49 = d41 - dAtan2;
            double dTan = Math.tan(d49 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * dSqrt2) + d11), (float) ((d38 * dSqrt2) + d16), (float) (d43 - (dSqrt2 * d47)), (float) (d46 - (dSqrt2 * d48)), (float) d43, (float) d46);
            i6++;
            dAtan2 = d41;
            d36 = d36;
            dCos2 = dCos2;
            iCeil = iCeil;
            d38 = d48;
            d12 = d12;
            d35 = d47;
            d11 = d43;
            d16 = d46;
            d30 = d45;
            d40 = d42;
            d39 = d44;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i6;
        int i7;
        char c6;
        int i8;
        int i9;
        f fVar;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        f[] fVarArr2 = fVarArr;
        int i10 = 6;
        float[] fArr = new float[6];
        int length = fVarArr2.length;
        int i11 = 0;
        char c7 = 'm';
        while (i11 < length) {
            f fVar2 = fVarArr2[i11];
            char c8 = fVar2.f646a;
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            float f23 = fArr[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i6 = 7;
                    break;
                case 'C':
                case 'c':
                    i6 = i10;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i6 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i6 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                default:
                    i6 = 2;
                    break;
            }
            float f24 = f22;
            float f25 = f23;
            float f26 = f18;
            float f27 = f19;
            int i12 = 0;
            while (true) {
                float[] fArr2 = fVar2.f647b;
                if (i12 < fArr2.length) {
                    if (c8 != 'A') {
                        if (c8 != 'C') {
                            if (c8 == 'H') {
                                i7 = i12;
                                c6 = c8;
                                i8 = i11;
                                i9 = length;
                                fVar = fVar2;
                                path.lineTo(fArr2[i7], f27);
                                f26 = fArr2[i7];
                            } else if (c8 == 'Q') {
                                i7 = i12;
                                c6 = c8;
                                i8 = i11;
                                i9 = length;
                                fVar = fVar2;
                                float f28 = fArr2[i7];
                                int i13 = i7 + 1;
                                float f29 = fArr2[i13];
                                int i14 = i7 + 2;
                                int i15 = i7 + 3;
                                path.quadTo(f28, f29, fArr2[i14], fArr2[i15]);
                                f6 = fArr2[i7];
                                f7 = fArr2[i13];
                                f26 = fArr2[i14];
                                f27 = fArr2[i15];
                            } else if (c8 == 'V') {
                                i7 = i12;
                                c6 = c8;
                                i8 = i11;
                                i9 = length;
                                fVar = fVar2;
                                path.lineTo(f26, fArr2[i7]);
                                f27 = fArr2[i7];
                            } else if (c8 != 'a') {
                                if (c8 != 'c') {
                                    if (c8 != 'h') {
                                        if (c8 == 'q') {
                                            i7 = i12;
                                            float f30 = f27;
                                            float f31 = f26;
                                            int i16 = i7 + 1;
                                            int i17 = i7 + 2;
                                            int i18 = i7 + 3;
                                            path.rQuadTo(fArr2[i7], fArr2[i16], fArr2[i17], fArr2[i18]);
                                            float f32 = f31 + fArr2[i7];
                                            float f33 = fArr2[i16] + f30;
                                            float f34 = f31 + fArr2[i17];
                                            f27 = f30 + fArr2[i18];
                                            f21 = f33;
                                            f20 = f32;
                                            c6 = c8;
                                            i8 = i11;
                                            i9 = length;
                                            f26 = f34;
                                        } else if (c8 == 'v') {
                                            i7 = i12;
                                            path.rLineTo(0.0f, fArr2[i7]);
                                            f27 += fArr2[i7];
                                        } else if (c8 == 'L') {
                                            i7 = i12;
                                            int i19 = i7 + 1;
                                            path.lineTo(fArr2[i7], fArr2[i19]);
                                            f26 = fArr2[i7];
                                            f27 = fArr2[i19];
                                        } else if (c8 == 'M') {
                                            i7 = i12;
                                            f26 = fArr2[i7];
                                            f27 = fArr2[i7 + 1];
                                            if (i7 > 0) {
                                                path.lineTo(f26, f27);
                                            } else {
                                                path.moveTo(f26, f27);
                                                f25 = f27;
                                                f24 = f26;
                                            }
                                        } else if (c8 == 'S') {
                                            i7 = i12;
                                            float f35 = f27;
                                            float f36 = f26;
                                            if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                f12 = (f35 * 2.0f) - f21;
                                                f13 = (f36 * 2.0f) - f20;
                                            } else {
                                                f13 = f36;
                                                f12 = f35;
                                            }
                                            int i20 = i7 + 1;
                                            int i21 = i7 + 2;
                                            int i22 = i7 + 3;
                                            path.cubicTo(f13, f12, fArr2[i7], fArr2[i20], fArr2[i21], fArr2[i22]);
                                            float f37 = fArr2[i7];
                                            float f38 = fArr2[i20];
                                            f26 = fArr2[i21];
                                            f27 = fArr2[i22];
                                            f21 = f38;
                                            f20 = f37;
                                        } else if (c8 == 'T') {
                                            i7 = i12;
                                            float f39 = f27;
                                            float f40 = f26;
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f8 = (f40 * 2.0f) - f20;
                                                f9 = (f39 * 2.0f) - f21;
                                            } else {
                                                f8 = f40;
                                                f9 = f39;
                                            }
                                            int i23 = i7 + 1;
                                            path.quadTo(f8, f9, fArr2[i7], fArr2[i23]);
                                            f10 = fArr2[i7];
                                            f11 = fArr2[i23];
                                        } else if (c8 == 'l') {
                                            i7 = i12;
                                            int i24 = i7 + 1;
                                            path.rLineTo(fArr2[i7], fArr2[i24]);
                                            f26 += fArr2[i7];
                                            f27 += fArr2[i24];
                                        } else if (c8 == 'm') {
                                            i7 = i12;
                                            float f41 = fArr2[i7];
                                            f26 += f41;
                                            float f42 = fArr2[i7 + 1];
                                            f27 += f42;
                                            if (i7 > 0) {
                                                path.rLineTo(f41, f42);
                                            } else {
                                                path.rMoveTo(f41, f42);
                                                f25 = f27;
                                                f24 = f26;
                                            }
                                        } else if (c8 == 's') {
                                            if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                float f43 = f26 - f20;
                                                f14 = f27 - f21;
                                                f15 = f43;
                                            } else {
                                                f14 = 0.0f;
                                                f15 = 0.0f;
                                            }
                                            int i25 = i12 + 1;
                                            int i26 = i12 + 2;
                                            int i27 = i12 + 3;
                                            i7 = i12;
                                            float f44 = f27;
                                            float f45 = f26;
                                            path.rCubicTo(f15, f14, fArr2[i12], fArr2[i25], fArr2[i26], fArr2[i27]);
                                            f8 = f45 + fArr2[i7];
                                            f9 = f44 + fArr2[i25];
                                            f10 = f45 + fArr2[i26];
                                            f11 = fArr2[i27] + f44;
                                        } else if (c8 != 't') {
                                            i7 = i12;
                                        } else {
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f16 = f26 - f20;
                                                f17 = f27 - f21;
                                            } else {
                                                f17 = 0.0f;
                                                f16 = 0.0f;
                                            }
                                            int i28 = i12 + 1;
                                            path.rQuadTo(f16, f17, fArr2[i12], fArr2[i28]);
                                            float f46 = f16 + f26;
                                            float f47 = f17 + f27;
                                            f26 += fArr2[i12];
                                            f27 += fArr2[i28];
                                            f21 = f47;
                                            i7 = i12;
                                            c6 = c8;
                                            i8 = i11;
                                            i9 = length;
                                            f20 = f46;
                                        }
                                        fVar = fVar2;
                                    } else {
                                        i7 = i12;
                                        path.rLineTo(fArr2[i7], 0.0f);
                                        f26 += fArr2[i7];
                                    }
                                    c6 = c8;
                                    i8 = i11;
                                    i9 = length;
                                    fVar = fVar2;
                                } else {
                                    i7 = i12;
                                    float f48 = f27;
                                    float f49 = f26;
                                    int i29 = i7 + 2;
                                    int i30 = i7 + 3;
                                    int i31 = i7 + 4;
                                    int i32 = i7 + 5;
                                    path.rCubicTo(fArr2[i7], fArr2[i7 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                    f8 = f49 + fArr2[i29];
                                    f9 = f48 + fArr2[i30];
                                    f10 = f49 + fArr2[i31];
                                    f11 = fArr2[i32] + f48;
                                }
                                f21 = f9;
                                f20 = f8;
                                c6 = c8;
                                i8 = i11;
                                i9 = length;
                                f26 = f10;
                                f27 = f11;
                                fVar = fVar2;
                            } else {
                                i7 = i12;
                                float f50 = f27;
                                float f51 = f26;
                                int i33 = i7 + 5;
                                int i34 = i7 + 6;
                                c6 = c8;
                                i9 = length;
                                fVar = fVar2;
                                i8 = i11;
                                a(path, f51, f50, fArr2[i33] + f51, fArr2[i34] + f50, fArr2[i7], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                                f26 = f51 + fArr2[i33];
                                f27 = f50 + fArr2[i34];
                            }
                            i12 = i7 + i6;
                            fVar2 = fVar;
                            length = i9;
                            c7 = c6;
                            c8 = c7;
                            i11 = i8;
                        } else {
                            i7 = i12;
                            c6 = c8;
                            i8 = i11;
                            i9 = length;
                            fVar = fVar2;
                            int i35 = i7 + 2;
                            int i36 = i7 + 3;
                            int i37 = i7 + 4;
                            int i38 = i7 + 5;
                            path.cubicTo(fArr2[i7], fArr2[i7 + 1], fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                            f26 = fArr2[i37];
                            f27 = fArr2[i38];
                            f6 = fArr2[i35];
                            f7 = fArr2[i36];
                        }
                        f20 = f6;
                        f21 = f7;
                        i12 = i7 + i6;
                        fVar2 = fVar;
                        length = i9;
                        c7 = c6;
                        c8 = c7;
                        i11 = i8;
                    } else {
                        i7 = i12;
                        c6 = c8;
                        i8 = i11;
                        i9 = length;
                        fVar = fVar2;
                        int i39 = i7 + 5;
                        int i40 = i7 + 6;
                        a(path, f26, f27, fArr2[i39], fArr2[i40], fArr2[i7], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f26 = fArr2[i39];
                        f27 = fArr2[i40];
                    }
                    f21 = f27;
                    f20 = f26;
                    i12 = i7 + i6;
                    fVar2 = fVar;
                    length = i9;
                    c7 = c6;
                    c8 = c7;
                    i11 = i8;
                }
            }
            fArr[0] = f26;
            fArr[1] = f27;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f24;
            fArr[5] = f25;
            c7 = fVar2.f646a;
            i11++;
            fVarArr2 = fVarArr;
            length = length;
            i10 = 6;
        }
    }

    public f(f fVar) {
        this.f646a = fVar.f646a;
        float[] fArr = fVar.f647b;
        this.f647b = com.bumptech.glide.d.h(fArr, fArr.length);
    }
}
