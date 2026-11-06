package r0;

import C4.p;
import M4.InterfaceC0080z;
import android.net.Uri;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;
import x4.h;

/* JADX INFO: renamed from: r0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1270c extends h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12425A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1271d f12426B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Uri f12427C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270c(C1271d c1271d, Uri uri, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12426B = c1271d;
        this.f12427C = uri;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1270c) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1270c(this.f12426B, this.f12427C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12425A;
        if (i6 == 0) {
            S3.a.O(obj);
            Y2.b bVar = this.f12426B.f12428a;
            this.f12425A = 1;
            if (bVar.x(this.f12427C, this) == enumC1481a) {
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
