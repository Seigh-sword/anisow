package o0;

/* JADX INFO: loaded from: classes.dex */
public final class A1 extends C1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11733f;

    public A1(int i6, int i7, int i8, int i9, int i10, int i11) {
        super(i8, i9, i10, i11);
        this.f11732e = i6;
        this.f11733f = i7;
    }

    @Override // o0.C1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a12 = (A1) obj;
        if (this.f11732e == a12.f11732e && this.f11733f == a12.f11733f) {
            if (this.f11739a == a12.f11739a) {
                if (this.f11740b == a12.f11740b) {
                    if (this.f11741c == a12.f11741c) {
                        if (this.f11742d == a12.f11742d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o0.C1
    public final int hashCode() {
        return Integer.hashCode(this.f11733f) + Integer.hashCode(this.f11732e) + super.hashCode();
    }

    public final String toString() {
        return S3.a.Q("ViewportHint.Access(\n            |    pageOffset=" + this.f11732e + ",\n            |    indexInPage=" + this.f11733f + ",\n            |    presentedItemsBefore=" + this.f11739a + ",\n            |    presentedItemsAfter=" + this.f11740b + ",\n            |    originalPageOffsetFirst=" + this.f11741c + ",\n            |    originalPageOffsetLast=" + this.f11742d + ",\n            |)");
    }
}
