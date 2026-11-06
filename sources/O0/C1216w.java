package o0;

import P4.InterfaceC0146g;
import W.C0199s;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1216w extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12144A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12145B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f12146C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C4.q f12147D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1216w(InterfaceC0146g interfaceC0146g, C4.q qVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12146C = interfaceC0146g;
        this.f12147D = qVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1216w) l((p1) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1216w c1216w = new C1216w(this.f12146C, this.f12147D, interfaceC1427e);
        c1216w.f12145B = obj;
        return c1216w;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12144A;
        if (i6 == 0) {
            S3.a.O(obj);
            C1214v c1214v = new C1214v(this.f12147D, new C0199s((p1) this.f12145B), null);
            this.f12144A = 1;
            if (AbstractC1305a.q(this.f12146C, c1214v, this) == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        return C1316l.f12640a;
    }
}
