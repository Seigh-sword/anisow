package m3;

import java.util.List;

/* JADX INFO: renamed from: m3.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1104i0 extends K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11534a;

    public C1104i0(List list) {
        this.f11534a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        return this.f11534a.equals(((C1104i0) ((K0) obj)).f11534a);
    }

    public final int hashCode() {
        return this.f11534a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f11534a + "}";
    }
}
