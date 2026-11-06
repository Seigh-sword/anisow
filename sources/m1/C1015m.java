package m1;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: m1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015m implements InterfaceC1013k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1005c f10468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f10470c;

    public C1015m(C1005c c1005c) {
        this.f10468a = c1005c;
    }

    @Override // m1.InterfaceC1013k
    public final void a() {
        this.f10468a.l(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1015m)) {
            return false;
        }
        C1015m c1015m = (C1015m) obj;
        return this.f10469b == c1015m.f10469b && C1.n.b(this.f10470c, c1015m.f10470c);
    }

    public final int hashCode() {
        int i6 = this.f10469b * 31;
        Bitmap.Config config = this.f10470c;
        return i6 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return n.e(this.f10469b, this.f10470c);
    }
}
