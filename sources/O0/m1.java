package o0;

import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12029A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ O4.g f12030B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C4.p f12031C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(O4.g gVar, C4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12030B = gVar;
        this.f12031C = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((m1) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new m1(this.f12030B, this.f12031C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12029A;
        O4.g gVar = this.f12030B;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                l1 l1Var = new l1(gVar, this.f12031C, null);
                this.f12029A = 1;
                if (S3.a.l(l1Var, this) == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
            gVar.j(null);
        } catch (Throwable th) {
            gVar.j(th);
        }
        return C1316l.f12640a;
    }
}
