package o0;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1215v0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public T4.d f12134A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0147h f12135B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12136C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f12137D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ A0 f12138E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215v0(A0 a02, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12138E = a02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1215v0) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1215v0 c1215v0 = new C1215v0(this.f12138E, interfaceC1427e);
        c1215v0.f12137D = obj;
        return c1215v0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        InterfaceC0147h interfaceC0147h;
        B0 b02;
        T4.d dVar;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12136C;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                interfaceC0147h = (InterfaceC0147h) this.f12137D;
                b02 = this.f12138E.f11729i;
                T4.d dVar2 = b02.f11736a;
                this.f12137D = b02;
                this.f12134A = dVar2;
                this.f12135B = interfaceC0147h;
                this.f12136C = 1;
                if (dVar2.d(this) == enumC1481a) {
                    return enumC1481a;
                }
                dVar = dVar2;
            } else {
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S3.a.O(obj);
                    return C1316l.f12640a;
                }
                interfaceC0147h = this.f12135B;
                dVar = this.f12134A;
                b02 = (B0) this.f12137D;
                S3.a.O(obj);
            }
            H hS = b02.f11737b.f11760l.S();
            dVar.f(null);
            N n5 = new N(hS, null);
            this.f12137D = null;
            this.f12134A = null;
            this.f12135B = null;
            this.f12136C = 2;
            if (interfaceC0147h.k(n5, this) == enumC1481a) {
                return enumC1481a;
            }
            return C1316l.f12640a;
        } catch (Throwable th) {
            dVar.f(null);
            throw th;
        }
    }
}
