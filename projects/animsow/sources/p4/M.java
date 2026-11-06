package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class M extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2610A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2611B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ N f2612C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object f2613D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public N f2614z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2612C = n5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2610A = obj;
        this.f2611B |= Integer.MIN_VALUE;
        return this.f2612C.k(null, this);
    }
}
