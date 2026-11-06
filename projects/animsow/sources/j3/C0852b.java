package j3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: j3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0852b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9458c;

    public C0852b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f9456a = str;
        this.f9457b = str2;
        this.f9458c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0852b)) {
            return false;
        }
        C0852b c0852b = (C0852b) obj;
        if (this.f9456a.equals(c0852b.f9456a)) {
            String str = c0852b.f9457b;
            String str2 = this.f9457b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = c0852b.f9458c;
                String str4 = this.f9458c;
                if (str4 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9456a.hashCode() ^ 1000003) * 1000003;
        String str = this.f9457b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9458c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f9456a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f9457b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC0628i.m(sb, this.f9458c, "}");
    }
}
