package M4;

import java.lang.reflect.InvocationTargetException;
import t4.C1351h;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends AbstractC0077w {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f1862B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1351h f1863A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1864y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1865z;

    public final void M(boolean z5) {
        long j6 = this.f1864y - (z5 ? 4294967296L : 1L);
        this.f1864y = j6;
        if (j6 <= 0 && this.f1865z) {
            shutdown();
        }
    }

    public final void N(I i6) {
        C1351h c1351h = this.f1863A;
        if (c1351h == null) {
            c1351h = new C1351h();
            this.f1863A = c1351h;
        }
        c1351h.addLast(i6);
    }

    public abstract Thread O();

    public final void P(boolean z5) {
        this.f1864y = (z5 ? 4294967296L : 1L) + this.f1864y;
        if (z5) {
            return;
        }
        this.f1865z = true;
    }

    public final boolean Q() {
        return this.f1864y >= 4294967296L;
    }

    public abstract long R();

    public final boolean S() throws IllegalAccessException, InvocationTargetException {
        C1351h c1351h = this.f1863A;
        if (c1351h == null) {
            return false;
        }
        I i6 = (I) (c1351h.isEmpty() ? null : c1351h.removeFirst());
        if (i6 == null) {
            return false;
        }
        i6.run();
        return true;
    }

    public void T(long j6, N n5) {
        C.f1846F.X(j6, n5);
    }

    public abstract void shutdown();
}
