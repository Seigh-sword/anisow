package Z0;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4913A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ e f4914B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4915C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a0.f f4916z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4914B = eVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4913A = obj;
        this.f4915C |= Integer.MIN_VALUE;
        return this.f4914B.a(null, this);
    }
}
