package N;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f2024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2025d;

    public n0(int i6, Interpolator interpolator, long j6) {
        this.f2022a = i6;
        this.f2024c = interpolator;
        this.f2025d = j6;
    }

    public long a() {
        return this.f2025d;
    }

    public float b() {
        Interpolator interpolator = this.f2024c;
        return interpolator != null ? interpolator.getInterpolation(this.f2023b) : this.f2023b;
    }

    public int c() {
        return this.f2022a;
    }

    public void d(float f6) {
        this.f2023b = f6;
    }
}
