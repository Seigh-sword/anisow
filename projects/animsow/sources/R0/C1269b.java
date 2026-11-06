package r0;

import C4.p;
import M4.InterfaceC0080z;
import android.net.Uri;
import android.view.InputEvent;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;
import x4.h;

/* JADX INFO: renamed from: r0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1269b extends h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12421A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1271d f12422B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Uri f12423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InputEvent f12424D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1269b(C1271d c1271d, Uri uri, InputEvent inputEvent, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12422B = c1271d;
        this.f12423C = uri;
        this.f12424D = inputEvent;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1269b) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1269b(this.f12422B, this.f12423C, this.f12424D, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12421A;
        if (i6 == 0) {
            S3.a.O(obj);
            Y2.b bVar = this.f12422B.f12428a;
            this.f12421A = 1;
            if (bVar.w(this.f12423C, this.f12424D, this) == enumC1481a) {
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
