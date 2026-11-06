package W;

import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends x4.h implements C4.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f4168A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4169B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f4170C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(M4.b0 b0Var, InterfaceC1427e interfaceC1427e) {
        super(3, interfaceC1427e);
        this.f4170C = b0Var;
    }

    @Override // C4.q
    public final Object g(Object obj, Object obj2, Object obj3) {
        C1316l c1316l = C1316l.f12640a;
        switch (this.f4168A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new r((M4.b0) this.f4170C, (InterfaceC1427e) obj3).n(c1316l);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r((InterfaceC1427e) obj3);
                rVar.f4170C = (a0) obj;
                return rVar.n(c1316l);
        }
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        switch (this.f4168A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (this.f4169B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
                ((M4.b0) this.f4170C).b(null);
                return C1316l.f12640a;
            default:
                EnumC1481a enumC1481a = EnumC1481a.f13592w;
                int i6 = this.f4169B;
                if (i6 == 0) {
                    S3.a.O(obj);
                    a0 a0Var = (a0) this.f4170C;
                    this.f4169B = 1;
                    Y.b bVar = (Y.b) a0Var;
                    bVar.getClass();
                    obj = Y.b.a(bVar, this);
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

    public r(InterfaceC1427e interfaceC1427e) {
        super(3, interfaceC1427e);
    }
}
