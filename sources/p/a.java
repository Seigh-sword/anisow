package P;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Interpolator a(float f6, float f7) {
        return new PathInterpolator(f6, f7);
    }

    public static Interpolator b(float f6, float f7, float f8, float f9) {
        return new PathInterpolator(f6, f7, f8, f9);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
