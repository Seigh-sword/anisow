package j1;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class m implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1.c f9442b = new C1.c();

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        int i6 = 0;
        while (true) {
            C1.c cVar = this.f9442b;
            if (i6 >= cVar.f12534y) {
                return;
            }
            l lVar = (l) cVar.h(i6);
            Object objL = this.f9442b.l(i6);
            k kVar = lVar.f9439b;
            if (lVar.f9441d == null) {
                lVar.f9441d = lVar.f9440c.getBytes(i.f9435a);
            }
            kVar.a(lVar.f9441d, objL, messageDigest);
            i6++;
        }
    }

    public final Object c(l lVar) {
        C1.c cVar = this.f9442b;
        return cVar.containsKey(lVar) ? cVar.getOrDefault(lVar, null) : lVar.f9438a;
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f9442b.equals(((m) obj).f9442b);
        }
        return false;
    }

    @Override // j1.i
    public final int hashCode() {
        return this.f9442b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f9442b + '}';
    }
}
