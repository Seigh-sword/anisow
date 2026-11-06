package N3;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class L extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2154A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ M f2155B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2156C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public M f2157z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2155B = m5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2154A = obj;
        this.f2156C |= Integer.MIN_VALUE;
        return M.a(this.f2155B, this);
    }
}
