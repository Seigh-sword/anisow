package N3;

import M4.InterfaceC0080z;
import a0.C0256d;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class E extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2127A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ F f2128B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f2129C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f6, String str, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2128B = f6;
        this.f2129C = str;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((E) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new E(this.f2128B, this.f2129C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2127A;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                C0139z c0139z = F.f2130e;
                Context context = this.f2128B.f2132a;
                c0139z.getClass();
                C0256d c0256dA = F.f2131f.a(context, C0139z.f2280a[0]);
                D d6 = new D(this.f2129C, null);
                this.f2127A = 1;
                if (c0256dA.a(new a0.i(d6, null), this) == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
        } catch (IOException e6) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e6);
        }
        return C1316l.f12640a;
    }
}
