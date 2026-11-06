package Z0;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4917A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ e f4918B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4919C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a0.f f4920z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4918B = eVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4917A = obj;
        this.f4919C |= Integer.MIN_VALUE;
        return this.f4918B.b(null, this);
    }
}
