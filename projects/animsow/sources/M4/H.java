package M4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends R4.t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1849A = AtomicIntegerFieldUpdater.newUpdater(H.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // R4.t, M4.k0
    public final void v(Object obj) {
        w(obj);
    }

    @Override // R4.t, M4.k0
    public final void w(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1849A;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                R4.a.c(AbstractC1305a.H(this.f3039z), AbstractC1305a.R(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
