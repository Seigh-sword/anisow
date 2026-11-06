package P4;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: P4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0143d extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0144e f2670A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2671B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2672z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143d(C0144e c0144e, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2670A = c0144e;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2672z = obj;
        this.f2671B |= Integer.MIN_VALUE;
        return this.f2670A.k(null, this);
    }
}
