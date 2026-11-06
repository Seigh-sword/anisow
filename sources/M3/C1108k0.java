package m3;

/* JADX INFO: renamed from: m3.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1108k0 extends M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11564d;

    public C1108k0(int i6, String str, String str2, boolean z5) {
        this.f11561a = i6;
        this.f11562b = str;
        this.f11563c = str2;
        this.f11564d = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (this.f11561a == ((C1108k0) m02).f11561a) {
            C1108k0 c1108k0 = (C1108k0) m02;
            if (this.f11562b.equals(c1108k0.f11562b) && this.f11563c.equals(c1108k0.f11563c) && this.f11564d == c1108k0.f11564d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f11561a ^ 1000003) * 1000003) ^ this.f11562b.hashCode()) * 1000003) ^ this.f11563c.hashCode()) * 1000003) ^ (this.f11564d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f11561a + ", version=" + this.f11562b + ", buildVersion=" + this.f11563c + ", jailbroken=" + this.f11564d + "}";
    }
}
