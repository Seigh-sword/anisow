package o0;

import h0.C0733A;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11742d;

    public C1(int i6, int i7, int i8, int i9) {
        this.f11739a = i6;
        this.f11740b = i7;
        this.f11741c = i8;
        this.f11742d = i9;
    }

    public final int a(I i6) {
        AbstractC1305a.o(i6, "loadType");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f11739a;
        }
        if (iOrdinal == 2) {
            return this.f11740b;
        }
        throw new C0733A();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c12 = (C1) obj;
        return this.f11739a == c12.f11739a && this.f11740b == c12.f11740b && this.f11741c == c12.f11741c && this.f11742d == c12.f11742d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f11742d) + Integer.hashCode(this.f11741c) + Integer.hashCode(this.f11740b) + Integer.hashCode(this.f11739a);
    }
}
