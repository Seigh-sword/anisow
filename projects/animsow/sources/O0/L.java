package o0;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class L extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f11796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11799d;

    public L(I i6, int i7, int i8, int i9) {
        AbstractC1305a.o(i6, "loadType");
        this.f11796a = i6;
        this.f11797b = i7;
        this.f11798c = i8;
        this.f11799d = i9;
        if (i6 == I.f11772w) {
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }
        if (a() > 0) {
            if (i9 < 0) {
                throw new IllegalArgumentException(AbstractC0628i.f("Invalid placeholdersRemaining ", i9).toString());
            }
        } else {
            throw new IllegalArgumentException(("Drop count must be > 0, but was " + a()).toString());
        }
    }

    public final int a() {
        return (this.f11798c - this.f11797b) + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l5 = (L) obj;
        return this.f11796a == l5.f11796a && this.f11797b == l5.f11797b && this.f11798c == l5.f11798c && this.f11799d == l5.f11799d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11799d) + ((Integer.hashCode(this.f11798c) + ((Integer.hashCode(this.f11797b) + (this.f11796a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int iOrdinal = this.f11796a.ordinal();
        if (iOrdinal == 1) {
            str = "front";
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            str = "end";
        }
        StringBuilder sbN = AbstractC0628i.n("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
        sbN.append(this.f11797b);
        sbN.append("\n                    |   maxPageOffset: ");
        sbN.append(this.f11798c);
        sbN.append("\n                    |   placeholdersRemaining: ");
        sbN.append(this.f11799d);
        sbN.append("\n                    |)");
        return S3.a.Q(sbN.toString());
    }
}
