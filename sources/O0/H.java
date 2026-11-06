package o0;

import h0.C0733A;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f11767d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f11768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f11769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f11770c;

    static {
        F f6 = F.f11748c;
        f11767d = new H(f6, f6, f6);
    }

    public H(G g4, G g6, G g7) {
        AbstractC1305a.o(g4, "refresh");
        AbstractC1305a.o(g6, "prepend");
        AbstractC1305a.o(g7, "append");
        this.f11768a = g4;
        this.f11769b = g6;
        this.f11770c = g7;
        if (!(g4 instanceof C1168D) && !(g7 instanceof C1168D)) {
            boolean z5 = g6 instanceof C1168D;
        }
        if ((g4 instanceof F) && (g7 instanceof F)) {
            boolean z6 = g6 instanceof F;
        }
    }

    public static H a(H h4, G g4, G g6, G g7, int i6) {
        if ((i6 & 1) != 0) {
            g4 = h4.f11768a;
        }
        if ((i6 & 2) != 0) {
            g6 = h4.f11769b;
        }
        if ((i6 & 4) != 0) {
            g7 = h4.f11770c;
        }
        h4.getClass();
        AbstractC1305a.o(g4, "refresh");
        AbstractC1305a.o(g6, "prepend");
        AbstractC1305a.o(g7, "append");
        return new H(g4, g6, g7);
    }

    public final H b(I i6, G g4) {
        AbstractC1305a.o(i6, "loadType");
        AbstractC1305a.o(g4, "newState");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            return a(this, g4, null, null, 6);
        }
        if (iOrdinal == 1) {
            return a(this, null, g4, null, 5);
        }
        if (iOrdinal == 2) {
            return a(this, null, null, g4, 3);
        }
        throw new C0733A();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        return AbstractC1305a.c(this.f11768a, h4.f11768a) && AbstractC1305a.c(this.f11769b, h4.f11769b) && AbstractC1305a.c(this.f11770c, h4.f11770c);
    }

    public final int hashCode() {
        return this.f11770c.hashCode() + ((this.f11769b.hashCode() + (this.f11768a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f11768a + ", prepend=" + this.f11769b + ", append=" + this.f11770c + ')';
    }
}
