package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1208s extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D4.r f12089A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12090B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C1210t f12091C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f12092D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1210t f12093z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208s(C1210t c1210t, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f12091C = c1210t;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f12090B = obj;
        this.f12092D |= Integer.MIN_VALUE;
        return this.f12091C.k(null, this);
    }
}
