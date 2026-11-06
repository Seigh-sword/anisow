package d3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f8204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8206c;

    public k(int i6, int i7, Class cls) {
        this(r.a(cls), i6, i7);
    }

    public static k a(r rVar) {
        return new k(rVar, 1, 0);
    }

    public static k b(Class cls) {
        return new k(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8204a.equals(kVar.f8204a) && this.f8205b == kVar.f8205b && this.f8206c == kVar.f8206c;
    }

    public final int hashCode() {
        return ((((this.f8204a.hashCode() ^ 1000003) * 1000003) ^ this.f8205b) * 1000003) ^ this.f8206c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8204a);
        sb.append(", type=");
        int i6 = this.f8205b;
        sb.append(i6 == 1 ? "required" : i6 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i7 = this.f8206c;
        if (i7 == 0) {
            str = "direct";
        } else if (i7 == 1) {
            str = "provider";
        } else {
            if (i7 != 2) {
                throw new AssertionError(AbstractC0628i.f("Unsupported injection: ", i7));
            }
            str = "deferred";
        }
        return AbstractC0628i.m(sb, str, "}");
    }

    public k(r rVar, int i6, int i7) {
        f2.h.g(rVar, "Null dependency anInterface.");
        this.f8204a = rVar;
        this.f8205b = i6;
        this.f8206c = i7;
    }
}
