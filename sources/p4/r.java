package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class r extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2743A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0157s f2744B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0157s f2745C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0147h f2746D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Q4.w f2747E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2748z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0157s c0157s, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2744B = c0157s;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2748z = obj;
        this.f2743A |= Integer.MIN_VALUE;
        return this.f2744B.d(null, this);
    }
}
