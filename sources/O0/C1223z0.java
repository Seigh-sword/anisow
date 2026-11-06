package o0;

import M4.InterfaceC0080z;
import P4.C0157s;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1223z0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B0 f12167A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public T4.d f12168B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public A0 f12169C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f12170D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ A0 f12171E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223z0(A0 a02, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12171E = a02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1223z0) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1223z0(this.f12171E, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        A0 a02;
        B0 b02;
        T4.d dVar;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12170D;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                a02 = this.f12171E;
                b02 = a02.f11729i;
                T4.d dVar2 = b02.f11736a;
                this.f12167A = b02;
                this.f12168B = dVar2;
                this.f12169C = a02;
                this.f12170D = 1;
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
                a02 = this.f12169C;
                dVar = this.f12168B;
                b02 = this.f12167A;
                S3.a.O(obj);
            }
            F0 f02 = b02.f11737b;
            C0157s c0157s = new C0157s(new D0(f02, null), AbstractC1305a.r(f02.f11758j));
            dVar.f(null);
            I i7 = I.f11774y;
            this.f12167A = null;
            this.f12168B = null;
            this.f12169C = null;
            this.f12170D = 2;
            if (A0.a(a02, c0157s, i7, this) == enumC1481a) {
                return enumC1481a;
            }
            return C1316l.f12640a;
        } catch (Throwable th) {
            dVar.f(null);
            throw th;
        }
    }
}
