package m1;

/* JADX INFO: renamed from: m1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009g implements InterfaceC1013k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1005c f10448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f10450c;

    public C1009g(C1005c c1005c) {
        this.f10448a = c1005c;
    }

    @Override // m1.InterfaceC1013k
    public final void a() {
        this.f10448a.l(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1009g)) {
            return false;
        }
        C1009g c1009g = (C1009g) obj;
        return this.f10449b == c1009g.f10449b && this.f10450c == c1009g.f10450c;
    }

    public final int hashCode() {
        int i6 = this.f10449b * 31;
        Class cls = this.f10450c;
        return i6 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f10449b + "array=" + this.f10450c + '}';
    }
}
