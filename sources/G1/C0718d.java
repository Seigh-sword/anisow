package g1;

import C4.p;
import M4.InterfaceC0080z;
import androidx.lifecycle.E;
import com.android.app.models.Resource;
import com.android.app.network.responses.ConfigResponse;
import e1.AbstractC0660a;
import e1.InterfaceC0662c;
import m2.C0;
import s4.AbstractC1305a;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: g1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718d extends x4.h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8514A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0719e f8515B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718d(C0719e c0719e, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f8515B = c0719e;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0718d) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0718d(this.f8515B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f8514A;
        C0719e c0719e = this.f8515B;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                E e6 = c0719e.f8516b;
                Object objD = e6.d();
                AbstractC1305a.l(objD);
                e6.f(((Resource) objD).copy(true, null, null));
                InterfaceC0662c interfaceC0662c = AbstractC0660a.f8255a;
                this.f8514A = 1;
                obj = AbstractC0660a.f8255a.h(this);
                if (obj == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
            E e7 = c0719e.f8516b;
            Object objD2 = e7.d();
            AbstractC1305a.l(objD2);
            e7.f(((Resource) objD2).copy(false, (ConfigResponse) obj, null));
        } catch (Exception e8) {
            C0.h().a(e8);
            e8.printStackTrace();
            E e9 = c0719e.f8516b;
            Object objD3 = e9.d();
            AbstractC1305a.l(objD3);
            e9.f(((Resource) objD3).copy(false, null, e8.getMessage()));
            AbstractC1332d.X("ConfigViewModel ## " + e8.getMessage());
        }
        return C1316l.f12640a;
    }
}
