package W;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0146g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f3994x;

    public /* synthetic */ C(InterfaceC0146g interfaceC0146g, int i6) {
        this.f3993w = i6;
        this.f3994x = interfaceC0146g;
    }

    @Override // P4.InterfaceC0146g
    public final Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        C1316l c1316l = C1316l.f12640a;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f3993w;
        InterfaceC0146g interfaceC0146g = this.f3994x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object objD = interfaceC0146g.d(new B(interfaceC0147h, 0), interfaceC1427e);
                return objD == enumC1481a ? objD : c1316l;
            case 1:
                Object objD2 = interfaceC0146g.d(new B(interfaceC0147h, 1), interfaceC1427e);
                return objD2 == enumC1481a ? objD2 : c1316l;
            default:
                Object objD3 = interfaceC0146g.d(new B(interfaceC0147h, 2), interfaceC1427e);
                return objD3 == enumC1481a ? objD3 : c1316l;
        }
    }
}
