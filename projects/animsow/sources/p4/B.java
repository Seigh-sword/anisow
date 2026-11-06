package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class B extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f2573A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2574B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C f2575C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2576D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C f2577z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2575C = c6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2574B = obj;
        this.f2576D |= Integer.MIN_VALUE;
        return this.f2575C.k(null, this);
    }
}
