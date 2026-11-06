package N3;

import a0.C0254b;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class D extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2125A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f2126B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2126B = str;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        D d6 = (D) l((C0254b) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        d6.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        D d6 = new D(this.f2126B, interfaceC1427e);
        d6.f2125A = obj;
        return d6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        C0254b c0254b = (C0254b) this.f2125A;
        a0.f fVar = A.f2118a;
        c0254b.getClass();
        AbstractC1305a.o(fVar, "key");
        c0254b.d(fVar, this.f2126B);
        return C1316l.f12640a;
    }
}
