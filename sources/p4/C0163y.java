package P4;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: P4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0163y extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0164z f2769A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2770B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2771z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163y(C0164z c0164z, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2769A = c0164z;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2771z = obj;
        this.f2770B |= Integer.MIN_VALUE;
        return this.f2769A.k(null, this);
    }
}
