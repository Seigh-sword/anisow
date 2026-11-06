package m3;

/* JADX INFO: loaded from: classes.dex */
public final class C extends P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final O0 f11312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u0 f11313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f11314m;

    public C(String str, String str2, int i6, String str3, String str4, String str5, String str6, String str7, String str8, O0 o02, u0 u0Var, r0 r0Var) {
        this.f11303b = str;
        this.f11304c = str2;
        this.f11305d = i6;
        this.f11306e = str3;
        this.f11307f = str4;
        this.f11308g = str5;
        this.f11309h = str6;
        this.f11310i = str7;
        this.f11311j = str8;
        this.f11312k = o02;
        this.f11313l = u0Var;
        this.f11314m = r0Var;
    }

    @Override // m3.P0
    public final B a() {
        B b6 = new B();
        b6.f11290a = this.f11303b;
        b6.f11291b = this.f11304c;
        b6.f11292c = this.f11305d;
        b6.f11293d = this.f11306e;
        b6.f11294e = this.f11307f;
        b6.f11295f = this.f11308g;
        b6.f11296g = this.f11309h;
        b6.f11297h = this.f11310i;
        b6.f11298i = this.f11311j;
        b6.f11299j = this.f11312k;
        b6.f11300k = this.f11313l;
        b6.f11301l = this.f11314m;
        b6.f11302m = (byte) 1;
        return b6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        if (this.f11303b.equals(((C) p02).f11303b)) {
            C c6 = (C) p02;
            if (this.f11304c.equals(c6.f11304c) && this.f11305d == c6.f11305d && this.f11306e.equals(c6.f11306e)) {
                String str = c6.f11307f;
                String str2 = this.f11307f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c6.f11308g;
                    String str4 = this.f11308g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c6.f11309h;
                        String str6 = this.f11309h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f11310i.equals(c6.f11310i) && this.f11311j.equals(c6.f11311j)) {
                                O0 o02 = c6.f11312k;
                                O0 o03 = this.f11312k;
                                if (o03 != null ? o03.equals(o02) : o02 == null) {
                                    u0 u0Var = c6.f11313l;
                                    u0 u0Var2 = this.f11313l;
                                    if (u0Var2 != null ? u0Var2.equals(u0Var) : u0Var == null) {
                                        r0 r0Var = c6.f11314m;
                                        r0 r0Var2 = this.f11314m;
                                        if (r0Var2 == null) {
                                            if (r0Var == null) {
                                                return true;
                                            }
                                        } else if (r0Var2.equals(r0Var)) {
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
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f11303b.hashCode() ^ 1000003) * 1000003) ^ this.f11304c.hashCode()) * 1000003) ^ this.f11305d) * 1000003) ^ this.f11306e.hashCode()) * 1000003;
        String str = this.f11307f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f11308g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11309h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f11310i.hashCode()) * 1000003) ^ this.f11311j.hashCode()) * 1000003;
        O0 o02 = this.f11312k;
        int iHashCode5 = (iHashCode4 ^ (o02 == null ? 0 : o02.hashCode())) * 1000003;
        u0 u0Var = this.f11313l;
        int iHashCode6 = (iHashCode5 ^ (u0Var == null ? 0 : u0Var.hashCode())) * 1000003;
        r0 r0Var = this.f11314m;
        return iHashCode6 ^ (r0Var != null ? r0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f11303b + ", gmpAppId=" + this.f11304c + ", platform=" + this.f11305d + ", installationUuid=" + this.f11306e + ", firebaseInstallationId=" + this.f11307f + ", firebaseAuthenticationToken=" + this.f11308g + ", appQualitySessionId=" + this.f11309h + ", buildVersion=" + this.f11310i + ", displayVersion=" + this.f11311j + ", session=" + this.f11312k + ", ndkPayload=" + this.f11313l + ", appExitInfo=" + this.f11314m + "}";
    }
}
