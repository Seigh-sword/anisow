package s2;

import android.animation.TimeInterpolator;
import d.AbstractC0628i;

/* JADX INFO: renamed from: s2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1303c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f12625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12627e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f12625c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1301a.f12618b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1303c)) {
            return false;
        }
        C1303c c1303c = (C1303c) obj;
        if (this.f12623a == c1303c.f12623a && this.f12624b == c1303c.f12624b && this.f12626d == c1303c.f12626d && this.f12627e == c1303c.f12627e) {
            return a().getClass().equals(c1303c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f12623a;
        long j7 = this.f12624b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.f12626d) * 31) + this.f12627e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C1303c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f12623a);
        sb.append(" duration: ");
        sb.append(this.f12624b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f12626d);
        sb.append(" repeatMode: ");
        return AbstractC0628i.l(sb, this.f12627e, "}\n");
    }
}
