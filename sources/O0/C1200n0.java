package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1200n0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Z f12035A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12036B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f12037z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200n0(Z z5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f12035A = z5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f12037z = obj;
        this.f12036B |= Integer.MIN_VALUE;
        return this.f12035A.k(null, this);
    }
}
