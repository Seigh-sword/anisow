package B1;

import j1.i;
import java.security.MessageDigest;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78b;

    public b(Object obj) {
        AbstractC1332d.l(obj, "Argument must not be null");
        this.f78b = obj;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f78b.toString().getBytes(i.f9435a));
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f78b.equals(((b) obj).f78b);
        }
        return false;
    }

    @Override // j1.i
    public final int hashCode() {
        return this.f78b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f78b + '}';
    }
}
