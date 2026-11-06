package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1116o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11604i;

    public C1116o0(int i6, String str, int i7, long j6, long j7, boolean z5, int i8, String str2, String str3) {
        this.f11596a = i6;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f11597b = str;
        this.f11598c = i7;
        this.f11599d = j6;
        this.f11600e = j7;
        this.f11601f = z5;
        this.f11602g = i8;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f11603h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f11604i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1116o0)) {
            return false;
        }
        C1116o0 c1116o0 = (C1116o0) obj;
        return this.f11596a == c1116o0.f11596a && this.f11597b.equals(c1116o0.f11597b) && this.f11598c == c1116o0.f11598c && this.f11599d == c1116o0.f11599d && this.f11600e == c1116o0.f11600e && this.f11601f == c1116o0.f11601f && this.f11602g == c1116o0.f11602g && this.f11603h.equals(c1116o0.f11603h) && this.f11604i.equals(c1116o0.f11604i);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11596a ^ 1000003) * 1000003) ^ this.f11597b.hashCode()) * 1000003) ^ this.f11598c) * 1000003;
        long j6 = this.f11599d;
        int i6 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f11600e;
        return ((((((((i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ (this.f11601f ? 1231 : 1237)) * 1000003) ^ this.f11602g) * 1000003) ^ this.f11603h.hashCode()) * 1000003) ^ this.f11604i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f11596a);
        sb.append(", model=");
        sb.append(this.f11597b);
        sb.append(", availableProcessors=");
        sb.append(this.f11598c);
        sb.append(", totalRam=");
        sb.append(this.f11599d);
        sb.append(", diskSpace=");
        sb.append(this.f11600e);
        sb.append(", isEmulator=");
        sb.append(this.f11601f);
        sb.append(", state=");
        sb.append(this.f11602g);
        sb.append(", manufacturer=");
        sb.append(this.f11603h);
        sb.append(", modelClass=");
        return AbstractC0628i.m(sb, this.f11604i, "}");
    }
}
