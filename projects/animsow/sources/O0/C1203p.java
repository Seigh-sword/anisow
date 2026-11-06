package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1203p extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D4.r f12053A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12054B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C1205q f12055C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f12056D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1205q f12057z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203p(C1205q c1205q, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f12055C = c1205q;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f12054B = obj;
        this.f12056D |= Integer.MIN_VALUE;
        return this.f12055C.k(null, this);
    }
}
