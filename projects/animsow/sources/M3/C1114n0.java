package m3;

import a3.C0261b;

/* JADX INFO: renamed from: m3.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1114n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0261b f11591f;

    public C1114n0(String str, String str2, String str3, String str4, int i6, C0261b c0261b) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f11586a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f11587b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f11588c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f11589d = str4;
        this.f11590e = i6;
        if (c0261b == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f11591f = c0261b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1114n0)) {
            return false;
        }
        C1114n0 c1114n0 = (C1114n0) obj;
        return this.f11586a.equals(c1114n0.f11586a) && this.f11587b.equals(c1114n0.f11587b) && this.f11588c.equals(c1114n0.f11588c) && this.f11589d.equals(c1114n0.f11589d) && this.f11590e == c1114n0.f11590e && this.f11591f.equals(c1114n0.f11591f);
    }

    public final int hashCode() {
        return ((((((((((this.f11586a.hashCode() ^ 1000003) * 1000003) ^ this.f11587b.hashCode()) * 1000003) ^ this.f11588c.hashCode()) * 1000003) ^ this.f11589d.hashCode()) * 1000003) ^ this.f11590e) * 1000003) ^ this.f11591f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f11586a + ", versionCode=" + this.f11587b + ", versionName=" + this.f11588c + ", installUuid=" + this.f11589d + ", deliveryMechanism=" + this.f11590e + ", developmentPlatformProvider=" + this.f11591f + "}";
    }
}
