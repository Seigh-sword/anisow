package V;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3657a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        switch (this.f3657a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                float f7 = f6 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
            default:
                float f8 = f6 - 1.0f;
                return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }
}
