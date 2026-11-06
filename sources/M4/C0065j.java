package M4;

import j3.C0848A;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: M4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0065j extends d0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0063h f1900A;

    public C0065j(C0063h c0063h) {
        this.f1900A = c0063h;
    }

    @Override // M4.Y
    public final void d(Throwable th) throws IllegalAccessException, InvocationTargetException {
        k0 k0VarK = k();
        C0063h c0063h = this.f1900A;
        Throwable thT = c0063h.t(k0VarK);
        if (c0063h.z()) {
            InterfaceC1427e interfaceC1427e = c0063h.f1890z;
            AbstractC1305a.m(interfaceC1427e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            R4.h hVar = (R4.h) interfaceC1427e;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R4.h.f3014D;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0848A c0848a = R4.a.f3004d;
                if (!AbstractC1305a.c(obj, c0848a)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c0848a, thT)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != c0848a) {
                        break;
                    }
                }
                return;
            }
        }
        c0063h.s(thT);
        if (c0063h.z()) {
            return;
        }
        c0063h.n();
    }
}
