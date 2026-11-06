package M4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends d0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1870B = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_invoked$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Y f1871A;
    private volatile /* synthetic */ int _invoked$volatile;

    public Z(Y y5) {
        this.f1871A = y5;
    }

    @Override // M4.Y
    public final void d(Throwable th) {
        if (f1870B.compareAndSet(this, 0, 1)) {
            this.f1871A.d(th);
        }
    }
}
