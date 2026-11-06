package j1;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l1.F;

/* JADX INFO: loaded from: classes.dex */
public final class j implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9436b;

    public j(q... qVarArr) {
        if (qVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f9436b = Arrays.asList(qVarArr);
    }

    @Override // j1.q
    public final F a(com.bumptech.glide.f fVar, F f6, int i6, int i7) {
        Iterator it = this.f9436b.iterator();
        F f7 = f6;
        while (it.hasNext()) {
            F fA = ((q) it.next()).a(fVar, f7, i6, i7);
            if (f7 != null && !f7.equals(f6) && !f7.equals(fA)) {
                f7.f();
            }
            f7 = fA;
        }
        return f7;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        Iterator it = this.f9436b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).b(messageDigest);
        }
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f9436b.equals(((j) obj).f9436b);
        }
        return false;
    }

    @Override // j1.i
    public final int hashCode() {
        return this.f9436b.hashCode();
    }
}
