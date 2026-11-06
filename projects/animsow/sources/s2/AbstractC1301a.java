package s2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import j0.C0839a;
import j0.C0840b;
import j0.C0841c;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1301a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f12617a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0840b f12618b = new C0840b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0839a f12619c = new C0839a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0841c f12620d = new C0841c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f6, float f7, float f8) {
        return ((f7 - f6) * f8) + f6;
    }

    public static float b(float f6, float f7, float f8, float f9, float f10) {
        return f10 <= f8 ? f6 : f10 >= f9 ? f7 : a(f6, f7, (f10 - f8) / (f9 - f8));
    }

    public static int c(float f6, int i6, int i7) {
        return Math.round(f6 * (i7 - i6)) + i6;
    }
}
