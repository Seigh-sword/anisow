package Q4;

import M4.InterfaceC0080z;
import P4.InterfaceC0146g;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2868A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f2869B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ z f2870C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC0146g interfaceC0146g, z zVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2869B = interfaceC0146g;
        this.f2870C = zVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((p) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new p(this.f2869B, this.f2870C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2868A;
        if (i6 == 0) {
            S3.a.O(obj);
            this.f2868A = 1;
            if (this.f2869B.d(this.f2870C, this) == enumC1481a) {
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
