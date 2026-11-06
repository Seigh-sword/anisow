package W;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class E extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3999A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4000B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f4001C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4002D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public W f4003z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(W w5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4001C = w5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4000B = obj;
        this.f4002D |= Integer.MIN_VALUE;
        return this.f4001C.g(this);
    }
}
