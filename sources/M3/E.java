package m3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f11333i;

    public E(int i6, String str, int i7, int i8, long j6, long j7, long j8, String str2, List list) {
        this.f11325a = i6;
        this.f11326b = str;
        this.f11327c = i7;
        this.f11328d = i8;
        this.f11329e = j6;
        this.f11330f = j7;
        this.f11331g = j8;
        this.f11332h = str2;
        this.f11333i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f11325a == ((E) r0Var).f11325a) {
            E e6 = (E) r0Var;
            if (this.f11326b.equals(e6.f11326b) && this.f11327c == e6.f11327c && this.f11328d == e6.f11328d && this.f11329e == e6.f11329e && this.f11330f == e6.f11330f && this.f11331g == e6.f11331g) {
                String str = e6.f11332h;
                String str2 = this.f11332h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = e6.f11333i;
                    List list2 = this.f11333i;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f11325a ^ 1000003) * 1000003) ^ this.f11326b.hashCode()) * 1000003) ^ this.f11327c) * 1000003) ^ this.f11328d) * 1000003;
        long j6 = this.f11329e;
        int i6 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f11330f;
        int i7 = (i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f11331g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str = this.f11332h;
        int iHashCode2 = (i8 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f11333i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f11325a + ", processName=" + this.f11326b + ", reasonCode=" + this.f11327c + ", importance=" + this.f11328d + ", pss=" + this.f11329e + ", rss=" + this.f11330f + ", timestamp=" + this.f11331g + ", traceFile=" + this.f11332h + ", buildIdMappingForArch=" + this.f11333i + "}";
    }
}
