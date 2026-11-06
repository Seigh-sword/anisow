package M4;

import s4.AbstractC1305a;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: M4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070o extends k0 implements InterfaceC0069n {
    public final Object d0(InterfaceC1427e interfaceC1427e) throws Throwable {
        Object objK;
        do {
            objK = K();
            if (!(objK instanceof V)) {
                if (objK instanceof r) {
                    throw ((r) objK).f1916a;
                }
                return B.t(objK);
            }
        } while (a0(objK) < 0);
        g0 g0Var = new g0(AbstractC1305a.H(interfaceC1427e), this);
        g0Var.v();
        S3.a.y(g0Var, new C0060e(2, S3.a.z(this, false, new a0(1, g0Var), 3)));
        return g0Var.u();
    }
}
