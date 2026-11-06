package o0;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C4.a f11776A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C4.a aVar, InterfaceC1427e interfaceC1427e) {
        super(1, interfaceC1427e);
        this.f11776A = aVar;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        return new I0(this.f11776A, (InterfaceC1427e) obj).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        return this.f11776A.b();
    }
}
