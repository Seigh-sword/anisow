package W;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188g extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4117A;

    @Override // C4.l
    public final Object j(Object obj) throws Throwable {
        C0188g c0188g = new C0188g(1, (InterfaceC1427e) obj);
        C1316l c1316l = C1316l.f12640a;
        c0188g.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        int i6 = this.f4117A;
        if (i6 == 0) {
            S3.a.O(obj);
            this.f4117A = 1;
            throw null;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        S3.a.O(obj);
        return C1316l.f12640a;
    }
}
