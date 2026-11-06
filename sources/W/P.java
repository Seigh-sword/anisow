package W;

import M4.C0070o;
import M4.InterfaceC0080z;
import java.util.concurrent.atomic.AtomicInteger;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class P extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4050A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4051B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f4052C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C4.p f4053D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(W w5, C4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4052C = w5;
        this.f4053D = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((P) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        P p5 = new P(this.f4052C, this.f4053D, interfaceC1427e);
        p5.f4051B = obj;
        return p5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4050A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0080z interfaceC0080z = (InterfaceC0080z) this.f4051B;
            C0070o c0070oB = S3.a.b();
            W w5 = this.f4052C;
            Y y5 = new Y(this.f4053D, c0070oB, w5.f4077g.B(), interfaceC0080z.u());
            P0.h hVar = w5.f4081k;
            Object objM = ((O4.g) hVar.f2409c).m(y5);
            boolean z5 = objM instanceof O4.h;
            if (z5) {
                O4.h hVar2 = z5 ? (O4.h) objM : null;
                Throwable th = hVar2 != null ? hVar2.f2383a : null;
                if (th == null) {
                    throw new O4.m("Channel was closed normally");
                }
                throw th;
            }
            if (!(!(objM instanceof O4.i))) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (((AtomicInteger) ((L3.c) hVar.f2410d).f1734x).getAndIncrement() == 0) {
                S3.a.B((InterfaceC0080z) hVar.f2407a, null, null, new e0(hVar, null), 3);
            }
            this.f4050A = 1;
            obj = c0070oB.d0(this);
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
