package c1;

import M4.InterfaceC0080z;
import d1.AbstractC0649a;
import g1.C0722h;
import g1.C0723i;
import o0.C1180d0;
import o0.I0;
import o0.J0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: c1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0369j extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6200A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0370k f6201B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369j(C0370k c0370k, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f6201B = c0370k;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0369j) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0369j(this.f6201B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f6200A;
        if (i6 == 0) {
            S3.a.O(obj);
            C0370k c0370k = this.f6201B;
            ((C0723i) c0370k.f6204C0.getValue()).getClass();
            J0 j02 = AbstractC0649a.f8163a;
            C0722h c0722h = C0722h.f8520x;
            AbstractC1305a.o(j02, "config");
            C1180d0 c1180d0 = new C1180d0(new I0(c0722h, null), null, j02);
            C0368i c0368i = new C0368i(c0370k, null);
            this.f6200A = 1;
            if (AbstractC1305a.q(c1180d0.f11913f, c0368i, this) == enumC1481a) {
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
