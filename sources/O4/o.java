package O4;

import M4.AbstractC0056a;
import M4.c0;
import M4.i0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0056a implements p, g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f2388z;

    public o(InterfaceC1432j interfaceC1432j, c cVar) {
        super(interfaceC1432j, true);
        this.f2388z = cVar;
    }

    @Override // O4.r
    public final Object a(Object obj, InterfaceC1427e interfaceC1427e) {
        return this.f2388z.a(obj, interfaceC1427e);
    }

    @Override // M4.k0, M4.b0
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        Object objK = K();
        if (objK instanceof M4.r) {
            return;
        }
        if ((objK instanceof i0) && ((i0) objK).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new c0(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // M4.AbstractC0056a, M4.k0, M4.b0
    public final boolean c() {
        return super.c();
    }

    @Override // M4.AbstractC0056a
    public final void d0(Throwable th, boolean z5) throws IllegalAccessException, InvocationTargetException {
        if (this.f2388z.j(th) || z5) {
            return;
        }
        S3.a.x(this.f1872y, th);
    }

    @Override // M4.AbstractC0056a
    public final void e0(Object obj) {
        this.f2388z.j(null);
    }

    @Override // O4.q
    public final Object f() {
        return this.f2388z.f();
    }

    @Override // O4.q
    public final b iterator() {
        return this.f2388z.iterator();
    }

    @Override // O4.r
    public final boolean j(Throwable th) {
        return this.f2388z.j(th);
    }

    @Override // O4.r
    public final Object m(Object obj) {
        return this.f2388z.m(obj);
    }

    @Override // O4.q
    public final Object p(InterfaceC1427e interfaceC1427e) {
        return this.f2388z.p(interfaceC1427e);
    }

    @Override // M4.k0
    public final void y(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        this.f2388z.b(cancellationException);
        x(cancellationException);
    }
}
