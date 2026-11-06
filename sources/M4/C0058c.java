package M4;

import java.util.concurrent.locks.LockSupport;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: M4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058c extends AbstractC0056a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Q f1877A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Thread f1878z;

    public C0058c(InterfaceC1432j interfaceC1432j, Thread thread, Q q5) {
        super(interfaceC1432j, true);
        this.f1878z = thread;
        this.f1877A = q5;
    }

    @Override // M4.k0
    public final void v(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f1878z;
        if (AbstractC1305a.c(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
