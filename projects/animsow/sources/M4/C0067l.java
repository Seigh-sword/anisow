package M4;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: M4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0067l extends d0 implements InterfaceC0066k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC0068m f1907A;

    public C0067l(k0 k0Var) {
        this.f1907A = k0Var;
    }

    @Override // M4.InterfaceC0066k
    public final boolean b(Throwable th) {
        return k().B(th);
    }

    @Override // M4.Y
    public final void d(Throwable th) throws IllegalAccessException, InvocationTargetException {
        ((k0) this.f1907A).x(k());
    }
}
