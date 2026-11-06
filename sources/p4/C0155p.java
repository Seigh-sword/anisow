package P4;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: P4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155p extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0156q f2727B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Object f2728C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0147h f2729D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2730z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155p(C0156q c0156q, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2727B = c0156q;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2730z = obj;
        this.f2726A |= Integer.MIN_VALUE;
        return this.f2727B.d(null, this);
    }
}
