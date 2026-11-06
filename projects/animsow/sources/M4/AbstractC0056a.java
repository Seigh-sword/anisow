package M4;

import h0.C0733A;
import java.lang.reflect.InvocationTargetException;
import s4.AbstractC1305a;
import s4.AbstractC1313i;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;
import x4.AbstractC1492a;

/* JADX INFO: renamed from: M4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0056a extends k0 implements InterfaceC1427e, InterfaceC0080z {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC1432j f1872y;

    public AbstractC0056a(InterfaceC1432j interfaceC1432j, boolean z5) {
        super(z5);
        N((b0) interfaceC1432j.n(C0078x.f1930x));
        this.f1872y = interfaceC1432j.k(this);
    }

    @Override // M4.k0
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // M4.k0
    public final void M(C0733A c0733a) throws IllegalAccessException, InvocationTargetException {
        S3.a.x(this.f1872y, c0733a);
    }

    @Override // M4.k0
    public final String U() {
        return super.U();
    }

    @Override // M4.k0
    public final void X(Object obj) {
        if (!(obj instanceof r)) {
            e0(obj);
            return;
        }
        r rVar = (r) obj;
        Throwable th = rVar.f1916a;
        rVar.getClass();
        d0(th, r.f1915b.get(rVar) != 0);
    }

    @Override // M4.k0, M4.b0
    public boolean c() {
        return super.c();
    }

    public final void f0(A a6, AbstractC0056a abstractC0056a, C4.p pVar) {
        Object objH;
        int iOrdinal = a6.ordinal();
        if (iOrdinal == 0) {
            AbstractC1305a.U(pVar, abstractC0056a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC1305a.o(pVar, "<this>");
                AbstractC1305a.H(AbstractC1305a.u(abstractC0056a, this, pVar)).o(C1316l.f12640a);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0733A();
            }
            try {
                InterfaceC1432j interfaceC1432j = this.f1872y;
                Object objF = R4.a.f(interfaceC1432j, null);
                try {
                    if (pVar instanceof AbstractC1492a) {
                        S3.a.f(2, pVar);
                        objH = pVar.h(abstractC0056a, this);
                    } else {
                        objH = AbstractC1305a.a0(abstractC0056a, this, pVar);
                    }
                    R4.a.b(interfaceC1432j, objF);
                    if (objH != EnumC1481a.f13592w) {
                        o(objH);
                    }
                } catch (Throwable th) {
                    R4.a.b(interfaceC1432j, objF);
                    throw th;
                }
            } catch (Throwable th2) {
                o(S3.a.m(th2));
            }
        }
    }

    @Override // v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        return this.f1872y;
    }

    @Override // v4.InterfaceC1427e
    public final void o(Object obj) {
        Throwable thA = AbstractC1313i.a(obj);
        if (thA != null) {
            obj = new r(thA, false);
        }
        Object objT = T(obj);
        if (objT == B.f1840e) {
            return;
        }
        w(objT);
    }

    @Override // M4.InterfaceC0080z
    public final InterfaceC1432j u() {
        return this.f1872y;
    }

    public void e0(Object obj) {
    }

    public void d0(Throwable th, boolean z5) {
    }
}
