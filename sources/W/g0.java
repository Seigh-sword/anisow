package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4118A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4119B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ i0 f4120C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4121D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public T4.d f4122z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4120C = i0Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4119B = obj;
        this.f4121D |= Integer.MIN_VALUE;
        return this.f4120C.c(null, this);
    }
}
