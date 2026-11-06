package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class D extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2581A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ A f2582B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public F f2583C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2584z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(A a6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2582B = a6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2584z = obj;
        this.f2581A |= Integer.MIN_VALUE;
        return this.f2582B.d(null, this);
    }
}
