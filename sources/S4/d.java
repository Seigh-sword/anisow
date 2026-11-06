package S4;

import M4.AbstractC0077w;
import M4.S;
import R4.w;
import d.AbstractC0628i;
import java.util.concurrent.Executor;
import v4.C1433k;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends S implements Executor {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f3319y = new d();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AbstractC0077w f3320z;

    static {
        l lVar = l.f3335y;
        int i6 = w.f3043a;
        if (64 >= i6) {
            i6 = 64;
        }
        int iM = S3.a.M("kotlinx.coroutines.io.parallelism", i6, 0, 0, 12);
        lVar.getClass();
        if (iM < 1) {
            throw new IllegalArgumentException(AbstractC0628i.f("Expected positive parallelism level, but got ", iM).toString());
        }
        AbstractC0077w iVar = lVar;
        if (iM < k.f3330d) {
            if (iM < 1) {
                throw new IllegalArgumentException(AbstractC0628i.f("Expected positive parallelism level, but got ", iM).toString());
            }
            iVar = new R4.i(lVar, iM);
        }
        f3320z = iVar;
    }

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        f3320z.J(interfaceC1432j, runnable);
    }

    @Override // M4.AbstractC0077w
    public final void K(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        f3320z.K(interfaceC1432j, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        J(C1433k.f13309w, runnable);
    }

    @Override // M4.AbstractC0077w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
