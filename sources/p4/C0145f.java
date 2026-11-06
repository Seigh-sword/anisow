package P4;

import Q4.AbstractC0169c;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: P4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145f implements InterfaceC0146g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0146g f2682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4.l f2683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C4.p f2684y;

    public C0145f(InterfaceC0146g interfaceC0146g) {
        C0153n c0153n = C0153n.f2720x;
        C0152m c0152m = C0152m.f2718x;
        this.f2682w = interfaceC0146g;
        this.f2683x = c0153n;
        this.f2684y = c0152m;
    }

    @Override // P4.InterfaceC0146g
    public final Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        D4.r rVar = new D4.r();
        rVar.f377w = AbstractC0169c.f2835b;
        Object objD = this.f2682w.d(new C0144e(this, rVar, interfaceC0147h), interfaceC1427e);
        return objD == EnumC1481a.f13592w ? objD : C1316l.f12640a;
    }
}
