package o0;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: o0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1197m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f12010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f12011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f12012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f12013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f12014e;

    public C1197m(G g4, G g6, G g7, H h4, H h6) {
        AbstractC1305a.o(g4, "refresh");
        AbstractC1305a.o(g6, "prepend");
        AbstractC1305a.o(g7, "append");
        AbstractC1305a.o(h4, "source");
        this.f12010a = g4;
        this.f12011b = g6;
        this.f12012c = g7;
        this.f12013d = h4;
        this.f12014e = h6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1197m.class != obj.getClass()) {
            return false;
        }
        C1197m c1197m = (C1197m) obj;
        return AbstractC1305a.c(this.f12010a, c1197m.f12010a) && AbstractC1305a.c(this.f12011b, c1197m.f12011b) && AbstractC1305a.c(this.f12012c, c1197m.f12012c) && AbstractC1305a.c(this.f12013d, c1197m.f12013d) && AbstractC1305a.c(this.f12014e, c1197m.f12014e);
    }

    public final int hashCode() {
        int iHashCode = (this.f12013d.hashCode() + ((this.f12012c.hashCode() + ((this.f12011b.hashCode() + (this.f12010a.hashCode() * 31)) * 31)) * 31)) * 31;
        H h4 = this.f12014e;
        return iHashCode + (h4 != null ? h4.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f12010a + ", prepend=" + this.f12011b + ", append=" + this.f12012c + ", source=" + this.f12013d + ", mediator=" + this.f12014e + ')';
    }
}
