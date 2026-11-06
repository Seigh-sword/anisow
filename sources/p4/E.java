package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class E extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2585A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2586B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ F f2587C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object f2588D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public F f2589z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2587C = f6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2585A = obj;
        this.f2586B |= Integer.MIN_VALUE;
        return this.f2587C.k(null, this);
    }
}
