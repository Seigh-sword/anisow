package o0;

import P4.InterfaceC0147h;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1186g0 extends x4.h implements C4.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f11938A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11939B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f11940C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f11941D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Object f11942E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1186g0(int i6, Object obj, InterfaceC1427e interfaceC1427e) {
        super(3, interfaceC1427e);
        this.f11938A = i6;
        this.f11942E = obj;
    }

    @Override // C4.q
    public final Object g(Object obj, Object obj2, Object obj3) {
        C1316l c1316l = C1316l.f12640a;
        int i6 = this.f11938A;
        Object obj4 = this.f11942E;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i7 = 0;
                C1186g0 c1186g0 = new C1186g0(i7, (I) obj4, (InterfaceC1427e) obj3);
                c1186g0.f11940C = (C1220y) obj;
                c1186g0.f11941D = (C1220y) obj2;
                return c1186g0.n(c1316l);
            default:
                int i8 = 1;
                C1186g0 c1186g02 = new C1186g0(i8, (C4.p) obj4, (InterfaceC1427e) obj3);
                c1186g02.f11940C = (InterfaceC0147h) obj;
                c1186g02.f11941D = obj2;
                return c1186g02.n(c1316l);
        }
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        InterfaceC0147h interfaceC0147h;
        int i6 = this.f11938A;
        Object obj2 = this.f11942E;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (this.f11939B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
                C1220y c1220y = (C1220y) this.f11940C;
                C1220y c1220y2 = (C1220y) this.f11941D;
                I i7 = (I) obj2;
                AbstractC1305a.o(c1220y2, "<this>");
                AbstractC1305a.o(c1220y, "previous");
                AbstractC1305a.o(i7, "loadType");
                int i8 = c1220y2.f12154a;
                int i9 = c1220y.f12154a;
                return (i8 <= i9 && (i8 < i9 || !com.bumptech.glide.d.z(c1220y2.f12155b, c1220y.f12155b, i7))) ? c1220y : c1220y2;
            default:
                EnumC1481a enumC1481a = EnumC1481a.f13592w;
                int i10 = this.f11939B;
                if (i10 == 0) {
                    S3.a.O(obj);
                    InterfaceC0147h interfaceC0147h2 = (InterfaceC0147h) this.f11940C;
                    Object obj3 = this.f11941D;
                    this.f11940C = interfaceC0147h2;
                    this.f11939B = 1;
                    Object objH = ((C4.p) obj2).h(obj3, this);
                    if (objH == enumC1481a) {
                        return enumC1481a;
                    }
                    interfaceC0147h = interfaceC0147h2;
                    obj = objH;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        S3.a.O(obj);
                        return C1316l.f12640a;
                    }
                    interfaceC0147h = (InterfaceC0147h) this.f11940C;
                    S3.a.O(obj);
                }
                this.f11940C = null;
                this.f11939B = 2;
                if (interfaceC0147h.k(obj, this) == enumC1481a) {
                    return enumC1481a;
                }
                return C1316l.f12640a;
        }
    }
}
