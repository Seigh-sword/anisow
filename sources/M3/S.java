package m3;

import d.AbstractC0628i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S extends F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0 f11407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f11410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E0 f11411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11413g;

    public S(D0 d02, List list, List list2, Boolean bool, E0 e02, List list3, int i6) {
        this.f11407a = d02;
        this.f11408b = list;
        this.f11409c = list2;
        this.f11410d = bool;
        this.f11411e = e02;
        this.f11412f = list3;
        this.f11413g = i6;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        E0 e02;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return this.f11407a.equals(((S) f02).f11407a) && ((list = this.f11408b) != null ? list.equals(((S) f02).f11408b) : ((S) f02).f11408b == null) && ((list2 = this.f11409c) != null ? list2.equals(((S) f02).f11409c) : ((S) f02).f11409c == null) && ((bool = this.f11410d) != null ? bool.equals(((S) f02).f11410d) : ((S) f02).f11410d == null) && ((e02 = this.f11411e) != null ? e02.equals(((S) f02).f11411e) : ((S) f02).f11411e == null) && ((list3 = this.f11412f) != null ? list3.equals(((S) f02).f11412f) : ((S) f02).f11412f == null) && this.f11413g == ((S) f02).f11413g;
    }

    public final int hashCode() {
        int iHashCode = (this.f11407a.hashCode() ^ 1000003) * 1000003;
        List list = this.f11408b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f11409c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f11410d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        E0 e02 = this.f11411e;
        int iHashCode5 = (iHashCode4 ^ (e02 == null ? 0 : e02.hashCode())) * 1000003;
        List list3 = this.f11412f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f11413g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f11407a);
        sb.append(", customAttributes=");
        sb.append(this.f11408b);
        sb.append(", internalKeys=");
        sb.append(this.f11409c);
        sb.append(", background=");
        sb.append(this.f11410d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f11411e);
        sb.append(", appProcessDetails=");
        sb.append(this.f11412f);
        sb.append(", uiOrientation=");
        return AbstractC0628i.l(sb, this.f11413g, "}");
    }
}
