package m3;

import d.AbstractC0628i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11340b;

    public H(List list, String str) {
        this.f11339a = list;
        this.f11340b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f11339a.equals(((H) u0Var).f11339a)) {
            String str = this.f11340b;
            String str2 = ((H) u0Var).f11340b;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11339a.hashCode() ^ 1000003) * 1000003;
        String str = this.f11340b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f11339a);
        sb.append(", orgId=");
        return AbstractC0628i.m(sb, this.f11340b, "}");
    }
}
