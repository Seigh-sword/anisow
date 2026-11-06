package N3;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: N3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0134u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2274d;

    public C0134u(int i6, int i7, String str, boolean z5) {
        this.f2271a = str;
        this.f2272b = i6;
        this.f2273c = i7;
        this.f2274d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0134u)) {
            return false;
        }
        C0134u c0134u = (C0134u) obj;
        return AbstractC1305a.c(this.f2271a, c0134u.f2271a) && this.f2272b == c0134u.f2272b && this.f2273c == c0134u.f2273c && this.f2274d == c0134u.f2274d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f2273c) + ((Integer.hashCode(this.f2272b) + (this.f2271a.hashCode() * 31)) * 31)) * 31;
        boolean z5 = this.f2274d;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f2271a + ", pid=" + this.f2272b + ", importance=" + this.f2273c + ", isDefaultProcess=" + this.f2274d + ')';
    }
}
