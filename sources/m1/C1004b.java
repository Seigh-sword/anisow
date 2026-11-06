package m1;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.C0396c2;

/* JADX INFO: renamed from: m1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1004b implements InterfaceC1013k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1005c f10438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap.Config f10441d;

    public C1004b(C1005c c1005c) {
        this.f10438a = c1005c;
    }

    @Override // m1.InterfaceC1013k
    public final void a() {
        this.f10438a.l(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1004b)) {
            return false;
        }
        C1004b c1004b = (C1004b) obj;
        return this.f10439b == c1004b.f10439b && this.f10440c == c1004b.f10440c && this.f10441d == c1004b.f10441d;
    }

    public final int hashCode() {
        int i6 = ((this.f10439b * 31) + this.f10440c) * 31;
        Bitmap.Config config = this.f10441d;
        return i6 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C0396c2.F(this.f10439b, this.f10440c, this.f10441d);
    }
}
