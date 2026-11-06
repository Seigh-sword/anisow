package G1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K f848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D f849i;

    public u(long j6, Integer num, C c6, long j7, byte[] bArr, String str, long j8, K k5, D d6) {
        this.f841a = j6;
        this.f842b = num;
        this.f843c = c6;
        this.f844d = j7;
        this.f845e = bArr;
        this.f846f = str;
        this.f847g = j8;
        this.f848h = k5;
        this.f849i = d6;
    }

    public final boolean equals(Object obj) {
        Integer num;
        C c6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g4 = (G) obj;
        if (this.f841a == ((u) g4).f841a && ((num = this.f842b) != null ? num.equals(((u) g4).f842b) : ((u) g4).f842b == null) && ((c6 = this.f843c) != null ? c6.equals(((u) g4).f843c) : ((u) g4).f843c == null)) {
            u uVar = (u) g4;
            if (this.f844d == uVar.f844d) {
                if (Arrays.equals(this.f845e, g4 instanceof u ? ((u) g4).f845e : uVar.f845e)) {
                    String str = uVar.f846f;
                    String str2 = this.f846f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f847g == uVar.f847g) {
                            K k5 = uVar.f848h;
                            K k6 = this.f848h;
                            if (k6 != null ? k6.equals(k5) : k5 == null) {
                                D d6 = uVar.f849i;
                                D d7 = this.f849i;
                                if (d7 == null) {
                                    if (d6 == null) {
                                        return true;
                                    }
                                } else if (d7.equals(d6)) {
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
        long j6 = this.f841a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f842b;
        int iHashCode = (i6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C c6 = this.f843c;
        int iHashCode2 = (iHashCode ^ (c6 == null ? 0 : c6.hashCode())) * 1000003;
        long j7 = this.f844d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f845e)) * 1000003;
        String str = this.f846f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f847g;
        int i7 = (iHashCode4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        K k5 = this.f848h;
        int iHashCode5 = (i7 ^ (k5 == null ? 0 : k5.hashCode())) * 1000003;
        D d6 = this.f849i;
        return iHashCode5 ^ (d6 != null ? d6.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f841a + ", eventCode=" + this.f842b + ", complianceData=" + this.f843c + ", eventUptimeMs=" + this.f844d + ", sourceExtension=" + Arrays.toString(this.f845e) + ", sourceExtensionJsonProto3=" + this.f846f + ", timezoneOffsetSeconds=" + this.f847g + ", networkConnectionInfo=" + this.f848h + ", experimentIds=" + this.f849i + "}";
    }
}
