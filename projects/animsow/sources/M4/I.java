package M4;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import s4.AbstractC1305a;
import s4.AbstractC1313i;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends S4.i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1850y;

    public I(int i6) {
        super(0L, S4.k.f3333g);
        this.f1850y = i6;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC1427e c();

    public Throwable f(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar.f1916a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1305a.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC1305a.l(th);
        S3.a.x(c().i(), new B4.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objM;
        Object objM2 = C1316l.f12640a;
        I0.o oVar = this.f3325x;
        try {
            InterfaceC1427e interfaceC1427eC = c();
            AbstractC1305a.m(interfaceC1427eC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            R4.h hVar = (R4.h) interfaceC1427eC;
            InterfaceC1427e interfaceC1427e = hVar.f3015A;
            Object obj = hVar.f3017C;
            InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
            Object objF = R4.a.f(interfaceC1432jI, obj);
            w0 w0VarY = objF != R4.a.f3006f ? AbstractC1305a.Y(interfaceC1427e, interfaceC1432jI, objF) : null;
            try {
                InterfaceC1432j interfaceC1432jI2 = interfaceC1427e.i();
                Object objJ = j();
                Throwable thF = f(objJ);
                b0 b0Var = (thF == null && AbstractC1305a.J(this.f1850y)) ? (b0) interfaceC1432jI2.n(C0078x.f1930x) : null;
                if (b0Var == null || b0Var.c()) {
                    objM = thF != null ? S3.a.m(thF) : g(objJ);
                } else {
                    CancellationException cancellationExceptionF = ((k0) b0Var).F();
                    b(objJ, cancellationExceptionF);
                    objM = S3.a.m(cancellationExceptionF);
                }
                interfaceC1427e.o(objM);
                if (w0VarY == null || w0VarY.g0()) {
                    R4.a.b(interfaceC1432jI, objF);
                }
                try {
                    oVar.getClass();
                } catch (Throwable th) {
                    objM2 = S3.a.m(th);
                }
                h(null, AbstractC1313i.a(objM2));
            } catch (Throwable th2) {
                if (w0VarY == null || w0VarY.g0()) {
                    R4.a.b(interfaceC1432jI, objF);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                oVar.getClass();
            } catch (Throwable th4) {
                objM2 = S3.a.m(th4);
            }
            h(th3, AbstractC1313i.a(objM2));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
