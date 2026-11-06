package G1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f832a;

    public o(ArrayList arrayList) {
        this.f832a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return this.f832a.equals(((o) ((y) obj)).f832a);
    }

    public final int hashCode() {
        return this.f832a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f832a + "}";
    }
}
