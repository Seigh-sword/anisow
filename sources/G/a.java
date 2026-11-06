package G;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f639a = new ThreadLocal();

    public static int a(double d6, double d7, double d8) {
        double d9 = (((-0.4986d) * d8) + (((-1.5372d) * d7) + (3.2406d * d6))) / 100.0d;
        double d10 = ((0.0415d * d8) + ((1.8758d * d7) + ((-0.9689d) * d6))) / 100.0d;
        double d11 = ((1.057d * d8) + (((-0.204d) * d7) + (0.0557d * d6))) / 100.0d;
        double dPow = d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d;
        double dPow2 = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double dPow3 = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i6, int i7) {
        int iAlpha = Color.alpha(i7);
        int iAlpha2 = Color.alpha(i6);
        int i8 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i8, c(Color.red(i6), iAlpha2, Color.red(i7), iAlpha, i8), c(Color.green(i6), iAlpha2, Color.green(i7), iAlpha, i8), c(Color.blue(i6), iAlpha2, Color.blue(i7), iAlpha, i8));
    }

    public static int c(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((255 - i7) * (i8 * i9)) + ((i6 * 255) * i7)) / (i10 * 255);
    }

    public static int d(int i6, int i7) {
        if (i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i6 & 16777215) | (i7 << 24);
    }
}
