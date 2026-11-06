package m3;

import d.AbstractC0628i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K extends O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f11360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f11362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N0 f11363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M0 f11364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0 f11365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f11366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11367l;

    public K(String str, String str2, String str3, long j6, Long l5, boolean z5, w0 w0Var, N0 n02, M0 m02, x0 x0Var, List list, int i6) {
        this.f11356a = str;
        this.f11357b = str2;
        this.f11358c = str3;
        this.f11359d = j6;
        this.f11360e = l5;
        this.f11361f = z5;
        this.f11362g = w0Var;
        this.f11363h = n02;
        this.f11364i = m02;
        this.f11365j = x0Var;
        this.f11366k = list;
        this.f11367l = i6;
    }

    @Override // m3.O0
    public final J a() {
        J j6 = new J();
        j6.f11343a = this.f11356a;
        j6.f11344b = this.f11357b;
        j6.f11345c = this.f11358c;
        j6.f11346d = this.f11359d;
        j6.f11347e = this.f11360e;
        j6.f11348f = this.f11361f;
        j6.f11349g = this.f11362g;
        j6.f11350h = this.f11363h;
        j6.f11351i = this.f11364i;
        j6.f11352j = this.f11365j;
        j6.f11353k = this.f11366k;
        j6.f11354l = this.f11367l;
        j6.f11355m = (byte) 7;
        return j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        if (this.f11356a.equals(((K) o02).f11356a)) {
            K k5 = (K) o02;
            if (this.f11357b.equals(k5.f11357b)) {
                String str = k5.f11358c;
                String str2 = this.f11358c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f11359d == k5.f11359d) {
                        Long l5 = k5.f11360e;
                        Long l6 = this.f11360e;
                        if (l6 != null ? l6.equals(l5) : l5 == null) {
                            if (this.f11361f == k5.f11361f && this.f11362g.equals(k5.f11362g)) {
                                N0 n02 = k5.f11363h;
                                N0 n03 = this.f11363h;
                                if (n03 != null ? n03.equals(n02) : n02 == null) {
                                    M0 m02 = k5.f11364i;
                                    M0 m03 = this.f11364i;
                                    if (m03 != null ? m03.equals(m02) : m02 == null) {
                                        x0 x0Var = k5.f11365j;
                                        x0 x0Var2 = this.f11365j;
                                        if (x0Var2 != null ? x0Var2.equals(x0Var) : x0Var == null) {
                                            List list = k5.f11366k;
                                            List list2 = this.f11366k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f11367l == k5.f11367l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11356a.hashCode() ^ 1000003) * 1000003) ^ this.f11357b.hashCode()) * 1000003;
        String str = this.f11358c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j6 = this.f11359d;
        int i6 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        Long l5 = this.f11360e;
        int iHashCode3 = (((((i6 ^ (l5 == null ? 0 : l5.hashCode())) * 1000003) ^ (this.f11361f ? 1231 : 1237)) * 1000003) ^ this.f11362g.hashCode()) * 1000003;
        N0 n02 = this.f11363h;
        int iHashCode4 = (iHashCode3 ^ (n02 == null ? 0 : n02.hashCode())) * 1000003;
        M0 m02 = this.f11364i;
        int iHashCode5 = (iHashCode4 ^ (m02 == null ? 0 : m02.hashCode())) * 1000003;
        x0 x0Var = this.f11365j;
        int iHashCode6 = (iHashCode5 ^ (x0Var == null ? 0 : x0Var.hashCode())) * 1000003;
        List list = this.f11366k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f11367l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f11356a);
        sb.append(", identifier=");
        sb.append(this.f11357b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f11358c);
        sb.append(", startedAt=");
        sb.append(this.f11359d);
        sb.append(", endedAt=");
        sb.append(this.f11360e);
        sb.append(", crashed=");
        sb.append(this.f11361f);
        sb.append(", app=");
        sb.append(this.f11362g);
        sb.append(", user=");
        sb.append(this.f11363h);
        sb.append(", os=");
        sb.append(this.f11364i);
        sb.append(", device=");
        sb.append(this.f11365j);
        sb.append(", events=");
        sb.append(this.f11366k);
        sb.append(", generatorType=");
        return AbstractC0628i.l(sb, this.f11367l, "}");
    }
}
