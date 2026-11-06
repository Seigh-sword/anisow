package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public T4.d f4112A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4113B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ i0 f4114C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4115D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f4116z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4114C = i0Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4113B = obj;
        this.f4115D |= Integer.MIN_VALUE;
        return this.f4114C.b(null, this);
    }
}
