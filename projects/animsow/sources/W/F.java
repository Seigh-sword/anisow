package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class F extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j0 f4004A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4005B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f4006C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f4007D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4008E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public W f4009z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(W w5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4007D = w5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4006C = obj;
        this.f4008E |= Integer.MIN_VALUE;
        return W.d(this.f4007D, false, this);
    }
}
