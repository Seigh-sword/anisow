package N;

import android.view.WindowInsetsAnimation;
import com.google.android.gms.internal.measurement.C0396c2;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2021e;

    public m0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2021e = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds e(C0396c2 c0396c2) {
        return new WindowInsetsAnimation.Bounds(((G.c) c0396c2.f6775x).d(), ((G.c) c0396c2.f6776y).d());
    }

    @Override // N.n0
    public final long a() {
        return this.f2021e.getDurationMillis();
    }

    @Override // N.n0
    public final float b() {
        return this.f2021e.getInterpolatedFraction();
    }

    @Override // N.n0
    public final int c() {
        return this.f2021e.getTypeMask();
    }

    @Override // N.n0
    public final void d(float f6) {
        this.f2021e.setFraction(f6);
    }
}
