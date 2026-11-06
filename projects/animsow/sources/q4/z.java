package Q4;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC0147h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final O4.r f2883w;

    public z(O4.r rVar) {
        this.f2883w = rVar;
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        Object objA = this.f2883w.a(obj, interfaceC1427e);
        return objA == EnumC1481a.f13592w ? objA : C1316l.f12640a;
    }
}
