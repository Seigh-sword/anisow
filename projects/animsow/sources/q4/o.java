package Q4;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C4.q f2867A;

    public o(C4.q qVar, InterfaceC0146g interfaceC0146g, InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        super(i6, interfaceC1432j, aVar, interfaceC0146g);
        this.f2867A = qVar;
    }

    @Override // Q4.g
    public final g g(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return new o(this.f2867A, this.f2849z, interfaceC1432j, i6, aVar);
    }

    @Override // Q4.i
    public final Object j(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        Object objL = S3.a.l(new n(this, interfaceC0147h, null), interfaceC1427e);
        return objL == EnumC1481a.f13592w ? objL : C1316l.f12640a;
    }
}
