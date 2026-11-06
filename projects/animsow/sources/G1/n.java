package G1;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0033a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f831l;

    public n(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f820a = num;
        this.f821b = str;
        this.f822c = str2;
        this.f823d = str3;
        this.f824e = str4;
        this.f825f = str5;
        this.f826g = str6;
        this.f827h = str7;
        this.f828i = str8;
        this.f829j = str9;
        this.f830k = str10;
        this.f831l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0033a)) {
            return false;
        }
        AbstractC0033a abstractC0033a = (AbstractC0033a) obj;
        Integer num = this.f820a;
        if (num != null ? num.equals(((n) abstractC0033a).f820a) : ((n) abstractC0033a).f820a == null) {
            String str = this.f821b;
            if (str != null ? str.equals(((n) abstractC0033a).f821b) : ((n) abstractC0033a).f821b == null) {
                String str2 = this.f822c;
                if (str2 != null ? str2.equals(((n) abstractC0033a).f822c) : ((n) abstractC0033a).f822c == null) {
                    String str3 = this.f823d;
                    if (str3 != null ? str3.equals(((n) abstractC0033a).f823d) : ((n) abstractC0033a).f823d == null) {
                        String str4 = this.f824e;
                        if (str4 != null ? str4.equals(((n) abstractC0033a).f824e) : ((n) abstractC0033a).f824e == null) {
                            String str5 = this.f825f;
                            if (str5 != null ? str5.equals(((n) abstractC0033a).f825f) : ((n) abstractC0033a).f825f == null) {
                                String str6 = this.f826g;
                                if (str6 != null ? str6.equals(((n) abstractC0033a).f826g) : ((n) abstractC0033a).f826g == null) {
                                    String str7 = this.f827h;
                                    if (str7 != null ? str7.equals(((n) abstractC0033a).f827h) : ((n) abstractC0033a).f827h == null) {
                                        String str8 = this.f828i;
                                        if (str8 != null ? str8.equals(((n) abstractC0033a).f828i) : ((n) abstractC0033a).f828i == null) {
                                            String str9 = this.f829j;
                                            if (str9 != null ? str9.equals(((n) abstractC0033a).f829j) : ((n) abstractC0033a).f829j == null) {
                                                String str10 = this.f830k;
                                                if (str10 != null ? str10.equals(((n) abstractC0033a).f830k) : ((n) abstractC0033a).f830k == null) {
                                                    String str11 = this.f831l;
                                                    n nVar = (n) abstractC0033a;
                                                    if (str11 == null) {
                                                        if (nVar.f831l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(nVar.f831l)) {
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
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f820a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f821b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f822c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f823d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f824e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f825f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f826g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f827h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f828i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f829j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f830k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f831l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f820a);
        sb.append(", model=");
        sb.append(this.f821b);
        sb.append(", hardware=");
        sb.append(this.f822c);
        sb.append(", device=");
        sb.append(this.f823d);
        sb.append(", product=");
        sb.append(this.f824e);
        sb.append(", osBuild=");
        sb.append(this.f825f);
        sb.append(", manufacturer=");
        sb.append(this.f826g);
        sb.append(", fingerprint=");
        sb.append(this.f827h);
        sb.append(", locale=");
        sb.append(this.f828i);
        sb.append(", country=");
        sb.append(this.f829j);
        sb.append(", mccMnc=");
        sb.append(this.f830k);
        sb.append(", applicationBuild=");
        return AbstractC0628i.m(sb, this.f831l, "}");
    }
}
