package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public T4.a f4088A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4089B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ c0 f4090C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4091D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f4092z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4090C = c0Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4089B = obj;
        this.f4091D |= Integer.MIN_VALUE;
        return this.f4090C.b(this);
    }
}
