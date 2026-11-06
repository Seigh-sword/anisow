package R4;

import M4.AbstractC0077w;
import M4.C0063h;
import M4.D;
import M4.G;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m2.RunnableC1028c1;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0077w implements G {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3019D = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ G f3020A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f3021B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f3022C;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AbstractC0077w f3023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3024z;

    /* JADX WARN: Multi-variable type inference failed */
    public i(S4.l lVar, int i6) {
        this.f3023y = lVar;
        this.f3024z = i6;
        G g4 = lVar instanceof G ? (G) lVar : null;
        this.f3020A = g4 == null ? D.f1848a : g4;
        this.f3021B = new l();
        this.f3022C = new Object();
    }

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        Runnable runnableM;
        this.f3021B.a(runnable);
        if (f3019D.get(this) >= this.f3024z || !N() || (runnableM = M()) == null) {
            return;
        }
        this.f3023y.J(this, new RunnableC1028c1(this, 14, runnableM));
    }

    @Override // M4.AbstractC0077w
    public final void K(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        Runnable runnableM;
        this.f3021B.a(runnable);
        if (f3019D.get(this) >= this.f3024z || !N() || (runnableM = M()) == null) {
            return;
        }
        this.f3023y.K(this, new RunnableC1028c1(this, 14, runnableM));
    }

    public final Runnable M() {
        while (true) {
            Runnable runnable = (Runnable) this.f3021B.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3022C) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3019D;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3021B.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean N() {
        synchronized (this.f3022C) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3019D;
            if (atomicIntegerFieldUpdater.get(this) >= this.f3024z) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // M4.G
    public final void u(long j6, C0063h c0063h) {
        this.f3020A.u(j6, c0063h);
    }
}
