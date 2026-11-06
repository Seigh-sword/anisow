package W;

import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: W.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203w extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4179A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C4.l f4180B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203w(C4.l lVar, InterfaceC1427e interfaceC1427e) {
        super(1, interfaceC1427e);
        this.f4180B = lVar;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        return new C0203w(this.f4180B, (InterfaceC1427e) obj).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4179A;
        if (i6 == 0) {
            S3.a.O(obj);
            this.f4179A = 1;
            obj = this.f4180B.j(this);
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
