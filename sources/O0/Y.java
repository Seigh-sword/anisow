package o0;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e1 f11880A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f11881B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C1180d0 f11882C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11883D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1180d0 f11884z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1180d0 c1180d0, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f11882C = c1180d0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f11881B = obj;
        this.f11883D |= Integer.MIN_VALUE;
        return C1180d0.a(this.f11882C, null, this);
    }
}
