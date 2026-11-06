package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class L extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11373f;

    public L(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f11368a = str;
        this.f11369b = str2;
        this.f11370c = str3;
        this.f11371d = str4;
        this.f11372e = str5;
        this.f11373f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f11368a.equals(((L) w0Var).f11368a)) {
            L l5 = (L) w0Var;
            if (this.f11369b.equals(l5.f11369b)) {
                String str = l5.f11370c;
                String str2 = this.f11370c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = l5.f11371d;
                    String str4 = this.f11371d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = l5.f11372e;
                        String str6 = this.f11372e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = l5.f11373f;
                            String str8 = this.f11373f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11368a.hashCode() ^ 1000003) * 1000003) ^ this.f11369b.hashCode()) * 1000003;
        String str = this.f11370c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f11371d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11372e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f11373f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f11368a);
        sb.append(", version=");
        sb.append(this.f11369b);
        sb.append(", displayVersion=");
        sb.append(this.f11370c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f11371d);
        sb.append(", developmentPlatform=");
        sb.append(this.f11372e);
        sb.append(", developmentPlatformVersion=");
        return AbstractC0628i.m(sb, this.f11373f, "}");
    }
}
