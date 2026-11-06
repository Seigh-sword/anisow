package N;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0 f2031a;

    public o0(int i6, Interpolator interpolator, long j6) {
        this.f2031a = Build.VERSION.SDK_INT >= 30 ? new m0(F2.b.j(i6, interpolator, j6)) : new k0(i6, interpolator, j6);
    }
}
