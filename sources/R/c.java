package r;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f12418a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f6, float f7, boolean z5) {
        if (!z5) {
            return f6;
        }
        return (float) (((1.0d - f12418a) * ((double) f7)) + ((double) f6));
    }

    public static float b(float f6, float f7, boolean z5) {
        float f8 = f6 * 1.5f;
        if (!z5) {
            return f8;
        }
        return (float) (((1.0d - f12418a) * ((double) f7)) + ((double) f8));
    }
}
