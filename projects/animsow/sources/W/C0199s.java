package W;

import N3.C0130p;
import P4.InterfaceC0147h;
import o0.p1;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: W.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199s implements InterfaceC0147h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f4172x;

    public /* synthetic */ C0199s(int i6, Object obj) {
        this.f4171w = i6;
        this.f4172x = obj;
    }

    public final Object b(C1316l c1316l, InterfaceC1427e interfaceC1427e) {
        Object objD;
        C1316l c1316l2 = C1316l.f12640a;
        int i6 = this.f4171w;
        Object obj = this.f4172x;
        switch (i6) {
            case 1:
                W w5 = (W) obj;
                return ((w5.f4077g.B() instanceof X) || (objD = W.d(w5, true, interfaceC1427e)) != EnumC1481a.f13592w) ? c1316l2 : objD;
            default:
                ((O4.g) obj).m(c1316l);
                return c1316l2;
        }
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        C1316l c1316l = C1316l.f12640a;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4171w;
        Object obj2 = this.f4172x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object objA = ((O4.o) ((O4.p) obj2)).f2388z.a(obj, interfaceC1427e);
                return objA == enumC1481a ? objA : c1316l;
            case 1:
                return b((C1316l) obj, interfaceC1427e);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Object objA2 = ((O4.r) obj2).a(obj, interfaceC1427e);
                return objA2 == enumC1481a ? objA2 : c1316l;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return b((C1316l) obj, interfaceC1427e);
            default:
                ((N3.F) obj2).f2134c.set((C0130p) obj);
                return c1316l;
        }
    }

    public C0199s(p1 p1Var) {
        this.f4171w = 2;
        AbstractC1305a.o(p1Var, "channel");
        this.f4172x = p1Var;
    }
}
