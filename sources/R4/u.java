package R4;

import M4.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends d implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3040d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3041c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public u(long j6, u uVar, int i6) {
        super(uVar);
        this.f3041c = j6;
        this.cleanedAndPointers$volatile = i6 << 16;
    }

    @Override // R4.d
    public final boolean c() {
        return f3040d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3040d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i6, InterfaceC1432j interfaceC1432j);

    public final void h() {
        if (f3040d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f3040d;
            i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 65536 + i6));
        return true;
    }
}
