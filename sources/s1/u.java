package s1;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import m1.InterfaceC1006d;

/* JADX INFO: loaded from: classes.dex */
public final class u implements j1.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.q f12598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12599c;

    public u(j1.q qVar, boolean z5) {
        this.f12598b = qVar;
        this.f12599c = z5;
    }

    @Override // j1.q
    public final l1.F a(com.bumptech.glide.f fVar, l1.F f6, int i6, int i7) {
        InterfaceC1006d interfaceC1006d = com.bumptech.glide.b.a(fVar).f6296w;
        Drawable drawable = (Drawable) f6.a();
        C1295d c1295dA = t.a(interfaceC1006d, drawable, i6, i7);
        if (c1295dA != null) {
            l1.F fA = this.f12598b.a(fVar, c1295dA, i6, i7);
            if (!fA.equals(c1295dA)) {
                return new C1295d(fVar.getResources(), fA);
            }
            fA.f();
            return f6;
        }
        if (!this.f12599c) {
            return f6;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        this.f12598b.b(messageDigest);
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f12598b.equals(((u) obj).f12598b);
        }
        return false;
    }

    @Override // j1.i
    public final int hashCode() {
        return this.f12598b.hashCode();
    }
}
