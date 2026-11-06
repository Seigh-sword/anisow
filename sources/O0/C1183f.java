package o0;

import M4.InterfaceC0080z;
import java.util.Collection;
import s4.AbstractC1305a;
import s4.C1316l;
import v0.AbstractC1414x;
import v0.C1411u;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1183f extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ R0 f11924A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1193k f11925B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183f(R0 r02, C1193k c1193k, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f11924A = r02;
        this.f11925B = c1193k;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1183f) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1183f(this.f11924A, this.f11925B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        R0 r02 = this.f11924A;
        h1 h1Var = r02.f11832b;
        AbstractC1414x abstractC1414x = this.f11925B.f11973a;
        AbstractC1305a.o(h1Var, "<this>");
        h1 h1Var2 = r02.f11831a;
        AbstractC1305a.o(h1Var2, "newList");
        AbstractC1305a.o(abstractC1414x, "diffCallback");
        G0 g02 = (G0) h1Var;
        C1411u c1411uE = AbstractC1414x.e(new i1(h1Var, h1Var2, abstractC1414x, g02.f11764b, ((G0) h1Var2).f11764b));
        boolean z5 = false;
        Iterable iterableT = S3.a.T(0, g02.f11764b);
        if (!(iterableT instanceof Collection) || !((Collection) iterableT).isEmpty()) {
            H4.b it = iterableT.iterator();
            while (true) {
                if (!it.f1065y) {
                    break;
                }
                if (c1411uE.a(it.b()) != -1) {
                    z5 = true;
                    break;
                }
            }
        }
        return new g1(c1411uE, z5);
    }
}
