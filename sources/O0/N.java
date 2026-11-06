package o0;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class N extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f11811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f11812b;

    public N(H h4, H h6) {
        AbstractC1305a.o(h4, "source");
        this.f11811a = h4;
        this.f11812b = h6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n5 = (N) obj;
        return AbstractC1305a.c(this.f11811a, n5.f11811a) && AbstractC1305a.c(this.f11812b, n5.f11812b);
    }

    public final int hashCode() {
        int iHashCode = this.f11811a.hashCode() * 31;
        H h4 = this.f11812b;
        return iHashCode + (h4 == null ? 0 : h4.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f11811a + "\n                    ";
        H h4 = this.f11812b;
        if (h4 != null) {
            str = str + "|   mediatorLoadStates: " + h4 + '\n';
        }
        return S3.a.Q(str + "|)");
    }
}
