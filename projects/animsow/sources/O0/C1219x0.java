package o0;

import M4.InterfaceC0080z;
import P4.C0142c;
import P4.InterfaceC0146g;
import android.util.Log;
import s4.AbstractC1305a;
import s4.C1316l;
import t4.C1352i;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1219x0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12152A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ A0 f12153B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219x0(A0 a02, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12153B = a02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1219x0) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1219x0(this.f12153B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12152A;
        A0 a02 = this.f12153B;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0146g[] interfaceC0146gArr = {a02.f11726f.D(I.f11774y), a02.f11726f.D(I.f11773x)};
            int i7 = P4.G.f2592a;
            C0142c c0142c = new C0142c(new C1352i(interfaceC0146gArr));
            C1217w0 c1217w0 = new C1217w0(a02, null);
            this.f12152A = 1;
            obj = AbstractC1305a.A(c0142c, c1217w0, this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        C1 c12 = (C1) obj;
        if (c12 != null) {
            if (Log.isLoggable("Paging", 3)) {
                String str = "Jump triggered on PagingSource " + a02.f11722b + " by " + c12;
                AbstractC1305a.o(str, "message");
                Log.d("Paging", str, null);
            }
            a02.f11725e.b();
        }
        return C1316l.f12640a;
    }
}
