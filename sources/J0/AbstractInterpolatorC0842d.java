package j0;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: j0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC0842d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9421b;

    public AbstractInterpolatorC0842d(float[] fArr) {
        this.f9420a = fArr;
        this.f9421b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9420a;
        int iMin = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f7 = this.f9421b;
        float f8 = (f6 - (iMin * f7)) / f7;
        float f9 = fArr[iMin];
        return ((fArr[iMin + 1] - f9) * f8) + f9;
    }
}
