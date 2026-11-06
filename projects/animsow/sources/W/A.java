package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class A extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3988A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ B f3989B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3990z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f3989B = b6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f3990z = obj;
        this.f3988A |= Integer.MIN_VALUE;
        return this.f3989B.k(null, this);
    }
}
