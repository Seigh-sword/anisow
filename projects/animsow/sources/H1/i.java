package H1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f933j;

    public i(String str, Integer num, m mVar, long j6, long j7, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f924a = str;
        this.f925b = num;
        this.f926c = mVar;
        this.f927d = j6;
        this.f928e = j7;
        this.f929f = map;
        this.f930g = num2;
        this.f931h = str2;
        this.f932i = bArr;
        this.f933j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f929f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f929f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final R0.k c() {
        R0.k kVar = new R0.k();
        String str = this.f924a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        kVar.f2919a = str;
        kVar.f2920b = this.f925b;
        kVar.f2925g = this.f930g;
        kVar.f2926h = this.f931h;
        kVar.f2927i = this.f932i;
        kVar.f2928j = this.f933j;
        kVar.q(this.f926c);
        kVar.f2922d = Long.valueOf(this.f927d);
        kVar.f2923e = Long.valueOf(this.f928e);
        kVar.f2924f = new HashMap(this.f929f);
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f924a.equals(iVar.f924a)) {
            Integer num = iVar.f925b;
            Integer num2 = this.f925b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f926c.equals(iVar.f926c) && this.f927d == iVar.f927d && this.f928e == iVar.f928e && this.f929f.equals(iVar.f929f)) {
                    Integer num3 = iVar.f930g;
                    Integer num4 = this.f930g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = iVar.f931h;
                        String str2 = this.f931h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.f932i, iVar.f932i) && Arrays.equals(this.f933j, iVar.f933j)) {
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
        int iHashCode = (this.f924a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f925b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f926c.hashCode()) * 1000003;
        long j6 = this.f927d;
        int i6 = (iHashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f928e;
        int iHashCode3 = (((i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f929f.hashCode()) * 1000003;
        Integer num2 = this.f930g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f931h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f932i)) * 1000003) ^ Arrays.hashCode(this.f933j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f924a + ", code=" + this.f925b + ", encodedPayload=" + this.f926c + ", eventMillis=" + this.f927d + ", uptimeMillis=" + this.f928e + ", autoMetadata=" + this.f929f + ", productId=" + this.f930g + ", pseudonymousId=" + this.f931h + ", experimentIdsClear=" + Arrays.toString(this.f932i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f933j) + "}";
    }
}
