package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class I extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2594A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2595B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ J f2596C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object f2597D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public J f2598z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2596C = j6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2594A = obj;
        this.f2595B |= Integer.MIN_VALUE;
        return this.f2596C.k(null, this);
    }
}
