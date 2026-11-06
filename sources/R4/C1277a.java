package r4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import j1.i;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import m1.InterfaceC1006d;
import s1.AbstractC1296e;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: r4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1277a extends AbstractC1296e {
    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update("jp.wasabeef.glide.transformations.BlurTransformation.122".getBytes(i.f9435a));
    }

    @Override // s1.AbstractC1296e
    public final Bitmap c(Context context, InterfaceC1006d interfaceC1006d, Bitmap bitmap) throws Throwable {
        int i6;
        int i7 = 2;
        Bitmap bitmapA = interfaceC1006d.a(bitmap.getWidth() / 2, bitmap.getHeight() / 2, Bitmap.Config.ARGB_8888);
        bitmapA.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(bitmapA);
        float f6 = 1.0f / 2;
        canvas.scale(f6, f6);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            AbstractC1305a.g(context, bitmapA);
            return bitmapA;
        } catch (RSRuntimeException unused) {
            int width = bitmapA.getWidth();
            int height = bitmapA.getHeight();
            int i8 = width * height;
            int[] iArr = new int[i8];
            bitmapA.getPixels(iArr, 0, width, 0, 0, width, height);
            int i9 = width - 1;
            int i10 = height - 1;
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            int[] iArr4 = new int[i8];
            int[] iArr5 = new int[Math.max(width, height)];
            int[] iArr6 = new int[2304];
            int i11 = 0;
            for (int i12 = 0; i12 < 2304; i12++) {
                iArr6[i12] = i12 / 9;
            }
            int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 3);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < height) {
                int i16 = i11;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                int i22 = i21;
                int i23 = i22;
                int i24 = -2;
                int i25 = i23;
                while (i24 <= i7) {
                    int i26 = iArr[Math.min(i9, Math.max(i24, i11)) + i14];
                    int[] iArr8 = iArr7[i24 + 2];
                    iArr8[i11] = (i26 & 16711680) >> 16;
                    iArr8[1] = (i26 & 65280) >> 8;
                    iArr8[2] = i26 & 255;
                    int iAbs = 3 - Math.abs(i24);
                    int i27 = iArr8[i11];
                    i25 = (i27 * iAbs) + i25;
                    int i28 = iArr8[1];
                    i16 = (i28 * iAbs) + i16;
                    int i29 = iArr8[2];
                    i17 = (iAbs * i29) + i17;
                    if (i24 > 0) {
                        i21 += i27;
                        i22 += i28;
                        i23 += i29;
                    } else {
                        i18 += i27;
                        i19 += i28;
                        i20 += i29;
                    }
                    i24++;
                    i7 = 2;
                }
                int i30 = i11;
                int i31 = 2;
                while (i30 < width) {
                    iArr2[i14] = iArr6[i25];
                    iArr3[i14] = iArr6[i16];
                    iArr4[i14] = iArr6[i17];
                    int i32 = i25 - i18;
                    int i33 = i16 - i19;
                    int i34 = i17 - i20;
                    int[] iArr9 = iArr7[(i31 + 3) % 5];
                    int i35 = i18 - iArr9[i11];
                    int i36 = i19 - iArr9[1];
                    int i37 = i20 - iArr9[2];
                    if (i13 == 0) {
                        iArr5[i30] = Math.min(i30 + 3, i9);
                    }
                    int i38 = iArr[i15 + iArr5[i30]];
                    int i39 = (i38 & 16711680) >> 16;
                    iArr9[0] = i39;
                    int i40 = (i38 & 65280) >> 8;
                    iArr9[1] = i40;
                    int i41 = i38 & 255;
                    iArr9[2] = i41;
                    int i42 = i21 + i39;
                    int i43 = i22 + i40;
                    int i44 = i23 + i41;
                    i25 = i32 + i42;
                    i16 = i33 + i43;
                    i17 = i34 + i44;
                    i31 = (i31 + 1) % 5;
                    int[] iArr10 = iArr7[i31 % 5];
                    int i45 = iArr10[0];
                    i18 = i35 + i45;
                    int i46 = iArr10[1];
                    i19 = i36 + i46;
                    int i47 = iArr10[2];
                    i20 = i37 + i47;
                    i21 = i42 - i45;
                    i22 = i43 - i46;
                    i23 = i44 - i47;
                    i14++;
                    i30++;
                    i11 = 0;
                }
                i15 += width;
                i13++;
                i7 = 2;
                i11 = 0;
            }
            int i48 = 0;
            while (i48 < width) {
                Bitmap bitmap2 = bitmapA;
                int i49 = (-2) * width;
                int[] iArr11 = iArr5;
                int[] iArr12 = iArr6;
                int i50 = -2;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                for (int i60 = 2; i50 <= i60; i60 = 2) {
                    int iMax = Math.max(0, i49) + i48;
                    int[] iArr13 = iArr7[i50 + 2];
                    iArr13[0] = iArr2[iMax];
                    iArr13[1] = iArr3[iMax];
                    iArr13[2] = iArr4[iMax];
                    int iAbs2 = 3 - Math.abs(i50);
                    i51 = (iArr2[iMax] * iAbs2) + i51;
                    i52 = (iArr3[iMax] * iAbs2) + i52;
                    i53 = (iArr4[iMax] * iAbs2) + i53;
                    if (i50 > 0) {
                        i57 += iArr13[0];
                        i58 += iArr13[1];
                        i59 += iArr13[2];
                    } else {
                        i54 += iArr13[0];
                        i55 += iArr13[1];
                        i56 += iArr13[2];
                    }
                    if (i50 < i10) {
                        i49 += width;
                    }
                    i50++;
                }
                int i61 = i48;
                int i62 = 2;
                int i63 = 0;
                while (i63 < height) {
                    iArr[i61] = (iArr[i61] & (-16777216)) | (iArr12[i51] << 16) | (iArr12[i52] << 8) | iArr12[i53];
                    int i64 = i51 - i54;
                    int i65 = i52 - i55;
                    int i66 = i53 - i56;
                    int[] iArr14 = iArr7[(i62 + 3) % 5];
                    int i67 = i54 - iArr14[0];
                    int i68 = i55 - iArr14[1];
                    int i69 = i56 - iArr14[2];
                    if (i48 == 0) {
                        i6 = height;
                        iArr11[i63] = Math.min(i63 + 3, i10) * width;
                    } else {
                        i6 = height;
                    }
                    int i70 = iArr11[i63] + i48;
                    int i71 = iArr2[i70];
                    iArr14[0] = i71;
                    int i72 = iArr3[i70];
                    iArr14[1] = i72;
                    int i73 = iArr4[i70];
                    iArr14[2] = i73;
                    int i74 = i57 + i71;
                    int i75 = i58 + i72;
                    int i76 = i59 + i73;
                    i51 = i64 + i74;
                    i52 = i65 + i75;
                    i53 = i66 + i76;
                    i62 = (i62 + 1) % 5;
                    int[] iArr15 = iArr7[i62];
                    int i77 = iArr15[0];
                    i54 = i67 + i77;
                    int i78 = iArr15[1];
                    i55 = i68 + i78;
                    int i79 = iArr15[2];
                    i56 = i69 + i79;
                    i57 = i74 - i77;
                    i58 = i75 - i78;
                    i59 = i76 - i79;
                    i61 += width;
                    i63++;
                    height = i6;
                }
                i48++;
                height = height;
                bitmapA = bitmap2;
                iArr5 = iArr11;
                iArr6 = iArr12;
            }
            Bitmap bitmap3 = bitmapA;
            bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmap3;
        }
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1277a)) {
            return false;
        }
        ((C1277a) obj).getClass();
        return true;
    }

    @Override // j1.i
    public final int hashCode() {
        return 737515630;
    }

    public final String toString() {
        return "BlurTransformation(radius=2, sampling=2)";
    }
}
