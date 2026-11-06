package Z0;

import a0.C0254b;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4921A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ a0.f f4922B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ boolean f4923C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a0.f fVar, boolean z5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4922B = fVar;
        this.f4923C = z5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        c cVar = (c) l((C0254b) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        cVar.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        c cVar = new c(this.f4922B, this.f4923C, interfaceC1427e);
        cVar.f4921A = obj;
        return cVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        C0254b c0254b = (C0254b) this.f4921A;
        Boolean boolValueOf = Boolean.valueOf(this.f4923C);
        c0254b.getClass();
        a0.f fVar = this.f4922B;
        AbstractC1305a.o(fVar, "key");
        c0254b.d(fVar, boolValueOf);
        return C1316l.f12640a;
    }
}
