package W;

import s4.C1311g;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Throwable f4010A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4011B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f4012C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(W w5, InterfaceC1427e interfaceC1427e) {
        super(1, interfaceC1427e);
        this.f4012C = w5;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        return new G(this.f4012C, (InterfaceC1427e) obj).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        Throwable th;
        j0 z5;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4011B;
        W w5 = this.f4012C;
        try {
        } catch (Throwable th2) {
            i0 i0VarF = w5.f();
            this.f4010A = th2;
            this.f4011B = 2;
            Integer numA = i0VarF.a();
            if (numA == enumC1481a) {
                return enumC1481a;
            }
            th = th2;
            obj = numA;
        }
        if (i6 == 0) {
            S3.a.O(obj);
            this.f4011B = 1;
            obj = W.e(w5, true, this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f4010A;
                S3.a.O(obj);
                z5 = new Z(th, ((Number) obj).intValue());
                return new C1311g(z5, Boolean.TRUE);
            }
            S3.a.O(obj);
        }
        z5 = (j0) obj;
        return new C1311g(z5, Boolean.TRUE);
    }
}
