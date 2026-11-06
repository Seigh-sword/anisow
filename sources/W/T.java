package W;

import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class T extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4057A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4058B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f4059C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4059C = w5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((T) l((Y) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        T t5 = new T(this.f4059C, interfaceC1427e);
        t5.f4058B = obj;
        return t5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4057A;
        if (i6 == 0) {
            S3.a.O(obj);
            Y y5 = (Y) this.f4058B;
            this.f4057A = 1;
            if (W.c(this.f4059C, y5, this) == enumC1481a) {
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
