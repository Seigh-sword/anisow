package W1;

import java.util.Arrays;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0207a f4240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1.d f4241b;

    public /* synthetic */ F(C0207a c0207a, U1.d dVar) {
        this.f4240a = c0207a;
        this.f4241b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof F)) {
            F f6 = (F) obj;
            if (AbstractC1332d.D(this.f4240a, f6.f4240a) && AbstractC1332d.D(this.f4241b, f6.f4241b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4240a, this.f4241b});
    }

    public final String toString() {
        C1358b c1358b = new C1358b(this);
        c1358b.c(this.f4240a, "key");
        c1358b.c(this.f4241b, "feature");
        return c1358b.toString();
    }
}
