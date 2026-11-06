package o0;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1191j extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11964A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f11965B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f11966C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C1193k f11967D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1191j(InterfaceC0146g interfaceC0146g, InterfaceC1427e interfaceC1427e, C1193k c1193k) {
        super(2, interfaceC1427e);
        this.f11966C = interfaceC0146g;
        this.f11967D = c1193k;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1191j) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1191j c1191j = new C1191j(this.f11966C, interfaceC1427e, this.f11967D);
        c1191j.f11965B = obj;
        return c1191j;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11964A;
        if (i6 == 0) {
            S3.a.O(obj);
            C1189i c1189i = new C1189i((InterfaceC0147h) this.f11965B, this.f11967D);
            this.f11964A = 1;
            if (this.f11966C.d(c1189i, this) == enumC1481a) {
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
