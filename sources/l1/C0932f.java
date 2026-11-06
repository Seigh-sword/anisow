package l1;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0932f implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.i f9896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.i f9897c;

    public C0932f(j1.i iVar, j1.i iVar2) {
        this.f9896b = iVar;
        this.f9897c = iVar2;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        this.f9896b.b(messageDigest);
        this.f9897c.b(messageDigest);
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0932f)) {
            return false;
        }
        C0932f c0932f = (C0932f) obj;
        return this.f9896b.equals(c0932f.f9896b) && this.f9897c.equals(c0932f.f9897c);
    }

    @Override // j1.i
    public final int hashCode() {
        return this.f9897c.hashCode() + (this.f9896b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9896b + ", signature=" + this.f9897c + '}';
    }
}
