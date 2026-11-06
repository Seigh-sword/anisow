package Q4;

import M4.m0;
import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public j(InterfaceC0146g interfaceC0146g, m0 m0Var, int i6, O4.a aVar, int i7) {
        super((i7 & 4) != 0 ? -3 : i6, (i7 & 2) != 0 ? C1433k.f13309w : m0Var, (i7 & 8) != 0 ? O4.a.f2342w : aVar, interfaceC0146g);
    }

    @Override // Q4.g
    public final g g(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return new j(i6, interfaceC1432j, aVar, this.f2849z);
    }

    @Override // Q4.g
    public final InterfaceC0146g h() {
        return this.f2849z;
    }

    @Override // Q4.i
    public final Object j(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        Object objD = this.f2849z.d(interfaceC0147h, interfaceC1427e);
        return objD == EnumC1481a.f13592w ? objD : C1316l.f12640a;
    }
}
