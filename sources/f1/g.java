package f1;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f8396A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ f f8397B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8398C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8399z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f8397B = fVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f8396A = obj;
        this.f8398C |= Integer.MIN_VALUE;
        return this.f8397B.c(null, this);
    }
}
