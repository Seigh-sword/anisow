package G1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L f856g;

    public v(long j6, long j7, A a6, Integer num, String str, List list, L l5) {
        this.f850a = j6;
        this.f851b = j7;
        this.f852c = a6;
        this.f853d = num;
        this.f854e = str;
        this.f855f = list;
        this.f856g = l5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        if (this.f850a == ((v) h4).f850a) {
            v vVar = (v) h4;
            if (this.f851b == vVar.f851b) {
                A a6 = vVar.f852c;
                A a7 = this.f852c;
                if (a7 != null ? a7.equals(a6) : a6 == null) {
                    Integer num = vVar.f853d;
                    Integer num2 = this.f853d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = vVar.f854e;
                        String str2 = this.f854e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = vVar.f855f;
                            List list2 = this.f855f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                L l5 = vVar.f856g;
                                L l6 = this.f856g;
                                if (l6 == null) {
                                    if (l5 == null) {
                                        return true;
                                    }
                                } else if (l6.equals(l5)) {
                                    return true;
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
        long j6 = this.f850a;
        long j7 = this.f851b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        A a6 = this.f852c;
        int iHashCode = (i6 ^ (a6 == null ? 0 : a6.hashCode())) * 1000003;
        Integer num = this.f853d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f854e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f855f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        L l5 = this.f856g;
        return iHashCode4 ^ (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f850a + ", requestUptimeMs=" + this.f851b + ", clientInfo=" + this.f852c + ", logSource=" + this.f853d + ", logSourceName=" + this.f854e + ", logEvents=" + this.f855f + ", qosTier=" + this.f856g + "}";
    }
}
