package Z0;

import a0.C0254b;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4924A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ a0.f f4925B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f4926C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0.f fVar, String str, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4925B = fVar;
        this.f4926C = str;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        d dVar = (d) l((C0254b) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        dVar.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        d dVar = new d(this.f4925B, this.f4926C, interfaceC1427e);
        dVar.f4924A = obj;
        return dVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        C0254b c0254b = (C0254b) this.f4924A;
        c0254b.getClass();
        a0.f fVar = this.f4925B;
        AbstractC1305a.o(fVar, "key");
        c0254b.d(fVar, this.f4926C);
        return C1316l.f12640a;
    }
}
