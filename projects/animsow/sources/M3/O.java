package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class O extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11392i;

    public O(int i6, String str, int i7, long j6, long j7, boolean z5, int i8, String str2, String str3) {
        this.f11384a = i6;
        this.f11385b = str;
        this.f11386c = i7;
        this.f11387d = j6;
        this.f11388e = j7;
        this.f11389f = z5;
        this.f11390g = i8;
        this.f11391h = str2;
        this.f11392i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f11384a == ((O) x0Var).f11384a) {
            O o3 = (O) x0Var;
            if (this.f11385b.equals(o3.f11385b) && this.f11386c == o3.f11386c && this.f11387d == o3.f11387d && this.f11388e == o3.f11388e && this.f11389f == o3.f11389f && this.f11390g == o3.f11390g && this.f11391h.equals(o3.f11391h) && this.f11392i.equals(o3.f11392i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11384a ^ 1000003) * 1000003) ^ this.f11385b.hashCode()) * 1000003) ^ this.f11386c) * 1000003;
        long j6 = this.f11387d;
        int i6 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f11388e;
        return ((((((((i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ (this.f11389f ? 1231 : 1237)) * 1000003) ^ this.f11390g) * 1000003) ^ this.f11391h.hashCode()) * 1000003) ^ this.f11392i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f11384a);
        sb.append(", model=");
        sb.append(this.f11385b);
        sb.append(", cores=");
        sb.append(this.f11386c);
        sb.append(", ram=");
        sb.append(this.f11387d);
        sb.append(", diskSpace=");
        sb.append(this.f11388e);
        sb.append(", simulator=");
        sb.append(this.f11389f);
        sb.append(", state=");
        sb.append(this.f11390g);
        sb.append(", manufacturer=");
        sb.append(this.f11391h);
        sb.append(", modelClass=");
        return AbstractC0628i.m(sb, this.f11392i, "}");
    }
}
