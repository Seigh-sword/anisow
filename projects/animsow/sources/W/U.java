package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class U extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4060A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ W f4061B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4062C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public D4.p f4063z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4061B = w5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4060A = obj;
        this.f4062C |= Integer.MIN_VALUE;
        return this.f4061B.i(null, false, this);
    }
}
