package c1;

import M4.InterfaceC0080z;
import androidx.lifecycle.V;
import com.android.app.models.MyList;
import d1.AbstractC0649a;
import g1.C0724j;
import o0.C1180d0;
import o0.I0;
import o0.J0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: c1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0372m extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6209A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0373n f6210B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0372m(C0373n c0373n, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f6210B = c0373n;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0372m) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0372m(this.f6210B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f6209A;
        if (i6 == 0) {
            S3.a.O(obj);
            C0373n c0373n = this.f6210B;
            C0724j c0724j = (C0724j) c0373n.f6213C0.getValue();
            MyList myList = new MyList(c0373n.U().e());
            c0724j.getClass();
            J0 j02 = AbstractC0649a.f8163a;
            V v5 = new V(3, myList);
            AbstractC1305a.o(j02, "config");
            C1180d0 c1180d0 = new C1180d0(new I0(v5, null), null, j02);
            C0371l c0371l = new C0371l(c0373n, null);
            this.f6209A = 1;
            if (AbstractC1305a.q(c1180d0.f11913f, c0371l, this) == enumC1481a) {
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
