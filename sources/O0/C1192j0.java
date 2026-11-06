package o0;

import P4.C0164z;
import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1192j0 implements InterfaceC0146g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f11969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f11970y;

    public /* synthetic */ C1192j0(InterfaceC0146g interfaceC0146g, int i6, int i7) {
        this.f11968w = i7;
        this.f11969x = interfaceC0146g;
        this.f11970y = i6;
    }

    @Override // P4.InterfaceC0146g
    public final Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        C1316l c1316l = C1316l.f12640a;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11968w;
        InterfaceC0146g interfaceC0146g = this.f11969x;
        int i7 = this.f11970y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object objD = interfaceC0146g.d(new C1177c0(i7, 1, interfaceC0147h), interfaceC1427e);
                return objD == enumC1481a ? objD : c1316l;
            default:
                Object objD2 = interfaceC0146g.d(new C0164z(new D4.p(), i7, interfaceC0147h), interfaceC1427e);
                return objD2 == enumC1481a ? objD2 : c1316l;
        }
    }
}
