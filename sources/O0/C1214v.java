package o0;

import W.C0199s;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1214v extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12130A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12131B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C4.q f12132C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0199s f12133D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1214v(C4.q qVar, C0199s c0199s, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12132C = qVar;
        this.f12133D = c0199s;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1214v) l(obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1214v c1214v = new C1214v(this.f12132C, this.f12133D, interfaceC1427e);
        c1214v.f12131B = obj;
        return c1214v;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12130A;
        if (i6 == 0) {
            S3.a.O(obj);
            Object obj2 = this.f12131B;
            this.f12130A = 1;
            if (this.f12132C.g(this.f12133D, obj2, this) == enumC1481a) {
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
