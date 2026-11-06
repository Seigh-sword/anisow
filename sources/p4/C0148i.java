package P4;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: P4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148i extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2691A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0149j f2692B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0149j f2693C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0147h f2694D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2695E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f2696F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2697z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148i(C0149j c0149j, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2692B = c0149j;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2697z = obj;
        this.f2691A |= Integer.MIN_VALUE;
        return this.f2692B.d(null, this);
    }
}
