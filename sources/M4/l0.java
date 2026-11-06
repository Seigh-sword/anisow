package M4;

import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends r0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC1427e f1908z;

    public l0(InterfaceC1432j interfaceC1432j, C4.p pVar) {
        super(interfaceC1432j, false);
        this.f1908z = AbstractC1305a.u(this, this, pVar);
    }

    @Override // M4.k0
    public final void Y() {
        try {
            R4.a.c(AbstractC1305a.H(this.f1908z), C1316l.f12640a, null);
        } catch (Throwable th) {
            o(S3.a.m(th));
            throw th;
        }
    }
}
