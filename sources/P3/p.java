package P3;

import a0.C0254b;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2559A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f2560B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ a0.f f2561C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ q f2562D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a0.f fVar, q qVar, Object obj, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2560B = obj;
        this.f2561C = fVar;
        this.f2562D = qVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        p pVar = (p) l((C0254b) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        pVar.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        p pVar = new p(this.f2561C, this.f2562D, this.f2560B, interfaceC1427e);
        pVar.f2559A = obj;
        return pVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        C0254b c0254b = (C0254b) this.f2559A;
        a0.f fVar = this.f2561C;
        Object obj2 = this.f2560B;
        if (obj2 != null) {
            c0254b.getClass();
            AbstractC1305a.o(fVar, "key");
            c0254b.d(fVar, obj2);
        } else {
            c0254b.getClass();
            AbstractC1305a.o(fVar, "key");
            c0254b.c();
            c0254b.f4982a.remove(fVar);
        }
        q.a(this.f2562D, c0254b);
        return C1316l.f12640a;
    }
}
