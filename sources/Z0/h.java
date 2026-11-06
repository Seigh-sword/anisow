package Z0;

import M4.InterfaceC0080z;
import m2.C0;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4932A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ p f4933B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f4934C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, String str, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4933B = pVar;
        this.f4934C = str;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((h) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new h(this.f4933B, this.f4934C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        boolean zBooleanValue;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4932A;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                e eVar = this.f4933B.f4953b;
                String str = "MESSAGE_SEEN_" + this.f4934C;
                this.f4932A = 1;
                obj = eVar.a(str, this);
                if (obj == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception e6) {
            C0.h().a(e6);
            AbstractC1332d.X("getMessageSeen ## " + e6.getMessage());
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
