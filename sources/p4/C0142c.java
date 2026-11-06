package P4;

import M4.InterfaceC0080z;
import W.C0202v;
import java.util.Iterator;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: renamed from: P4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0142c extends Q4.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f2660A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2661z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142c(C0202v c0202v) {
        this(c0202v, C1433k.f13309w, -2, O4.a.f2342w, 0);
        this.f2661z = 0;
    }

    @Override // Q4.g
    public final Object f(O4.p pVar, InterfaceC1427e interfaceC1427e) {
        C1316l c1316l = C1316l.f12640a;
        int i6 = this.f2661z;
        Object obj = this.f2660A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object objH = ((C4.p) obj).h(pVar, interfaceC1427e);
                return objH == EnumC1481a.f13592w ? objH : c1316l;
            default:
                Q4.z zVar = new Q4.z(pVar);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    S3.a.B(pVar, null, null, new Q4.p((InterfaceC0146g) it.next(), zVar, null), 3);
                }
                return c1316l;
        }
    }

    @Override // Q4.g
    public final Q4.g g(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        int i7 = this.f2661z;
        Object obj = this.f2660A;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0142c((C4.p) obj, interfaceC1432j, i6, aVar, 0);
            default:
                return new C0142c((Iterable) obj, interfaceC1432j, i6, aVar, 1);
        }
    }

    @Override // Q4.g
    public final O4.q i(InterfaceC0080z interfaceC0080z) {
        switch (this.f2661z) {
            case 1:
                C4.p fVar = new Q4.f(this, null);
                O4.a aVar = O4.a.f2342w;
                M4.A a6 = M4.A.f1832w;
                O4.o oVar = new O4.o(AbstractC1305a.O(interfaceC0080z, this.f2843w), S3.a.a(this.f2844x, aVar, 4));
                oVar.f0(a6, oVar, fVar);
                return oVar;
            default:
                return super.i(interfaceC0080z);
        }
    }

    @Override // Q4.g
    public final String toString() {
        switch (this.f2661z) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "block[" + ((C4.p) this.f2660A) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142c(Iterable iterable) {
        this(iterable, C1433k.f13309w, -2, O4.a.f2342w, 1);
        this.f2661z = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142c(Object obj, InterfaceC1432j interfaceC1432j, int i6, O4.a aVar, int i7) {
        super(interfaceC1432j, i6, aVar);
        this.f2661z = i7;
        this.f2660A = obj;
    }
}
