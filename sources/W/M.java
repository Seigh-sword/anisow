package W;

import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class M extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4040A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C4.p f4041B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0185d f4042C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C4.p pVar, C0185d c0185d, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4041B = pVar;
        this.f4042C = c0185d;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((M) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new M(this.f4041B, this.f4042C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4040A;
        if (i6 == 0) {
            S3.a.O(obj);
            Object obj2 = this.f4042C.f4095b;
            this.f4040A = 1;
            obj = this.f4041B.h(obj2, this);
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
