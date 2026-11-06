package P4;

import j3.C0848A;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2622A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2623B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f2624C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ V f2625D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Object f2626E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(InterfaceC0146g interfaceC0146g, V v5, Object obj, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2624C = interfaceC0146g;
        this.f2625D = v5;
        this.f2626E = obj;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((Q) l((f0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        Q q5 = new Q(this.f2624C, this.f2625D, this.f2626E, interfaceC1427e);
        q5.f2623B = obj;
        return q5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2622A;
        if (i6 == 0) {
            S3.a.O(obj);
            int iOrdinal = ((f0) this.f2623B).ordinal();
            V v5 = this.f2625D;
            if (iOrdinal == 0) {
                this.f2622A = 1;
                if (this.f2624C.d(v5, this) == enumC1481a) {
                    return enumC1481a;
                }
            } else if (iOrdinal == 2) {
                C0848A c0848a = d0.f2673a;
                Object obj2 = this.f2626E;
                if (obj2 == c0848a) {
                    v5.a();
                } else {
                    v5.c(obj2);
                }
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
