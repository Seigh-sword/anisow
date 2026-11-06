package P4;

import s4.AbstractC1305a;
import v4.C1433k;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2722b;

    public n0(long j6, long j7) {
        this.f2721a = j6;
        this.f2722b = j7;
        if (j6 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j6 + " ms) cannot be negative").toString());
        }
        if (j7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j7 + " ms) cannot be negative").toString());
    }

    @Override // P4.h0
    public final InterfaceC0146g a(Q4.B b6) {
        l0 l0Var = new l0(this, null);
        int i6 = G.f2592a;
        return AbstractC1305a.w(new A(new Q4.o(l0Var, b6, C1433k.f13309w, -2, O4.a.f2342w), new m0(2, null), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f2721a == n0Var.f2721a && this.f2722b == n0Var.f2722b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2722b) + (Long.hashCode(this.f2721a) * 31);
    }

    public final String toString() {
        u4.b bVar = new u4.b(2);
        long j6 = this.f2721a;
        if (j6 > 0) {
            bVar.add("stopTimeout=" + j6 + "ms");
        }
        long j7 = this.f2722b;
        if (j7 < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + j7 + "ms");
        }
        if (bVar.f12925A != null) {
            throw new IllegalStateException();
        }
        bVar.j();
        bVar.f12930z = true;
        if (bVar.f12929y <= 0) {
            bVar = u4.b.f12924C;
        }
        return "SharingStarted.WhileSubscribed(" + t4.n.f0(bVar, null, null, null, null, 63) + ')';
    }
}
