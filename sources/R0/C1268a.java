package r0;

import C4.p;
import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;
import x4.h;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1268a extends h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12419A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1271d f12420B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268a(C1271d c1271d, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12420B = c1271d;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1268a) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1268a(this.f12420B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12419A;
        if (i6 == 0) {
            S3.a.O(obj);
            Y2.b bVar = this.f12420B.f12428a;
            this.f12419A = 1;
            obj = bVar.o(this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        return obj;
    }
}
