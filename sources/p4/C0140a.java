package P4;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: P4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0140a extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2642A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0150k f2643B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2644C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Q4.w f2645z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140a(C0150k c0150k, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2643B = c0150k;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2642A = obj;
        this.f2644C |= Integer.MIN_VALUE;
        return this.f2643B.d(null, this);
    }
}
