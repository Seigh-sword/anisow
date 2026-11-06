package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1174b0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11893A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1177c0 f11894B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f11895z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174b0(C1177c0 c1177c0, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f11894B = c1177c0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f11895z = obj;
        this.f11893A |= Integer.MIN_VALUE;
        return this.f11894B.k(null, this);
    }
}
