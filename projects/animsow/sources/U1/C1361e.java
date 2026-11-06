package u1;

import android.graphics.Bitmap;
import j1.q;
import java.security.MessageDigest;
import l1.F;
import s1.C1295d;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: u1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1361e implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f12835b;

    public C1361e(q qVar) {
        AbstractC1332d.l(qVar, "Argument must not be null");
        this.f12835b = qVar;
    }

    @Override // j1.q
    public final F a(com.bumptech.glide.f fVar, F f6, int i6, int i7) {
        C1360d c1360d = (C1360d) f6.a();
        F c1295d = new C1295d(c1360d.f12831w.f12824a.f12856l, com.bumptech.glide.b.a(fVar).f6296w);
        q qVar = this.f12835b;
        F fA = qVar.a(fVar, c1295d, i6, i7);
        if (!c1295d.equals(fA)) {
            c1295d.f();
        }
        c1360d.f12831w.f12824a.c(qVar, (Bitmap) fA.a());
        return f6;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        this.f12835b.b(messageDigest);
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (obj instanceof C1361e) {
            return this.f12835b.equals(((C1361e) obj).f12835b);
        }
        return false;
    }

    @Override // j1.i
    public final int hashCode() {
        return this.f12835b.hashCode();
    }
}
