package N3;

import m2.C1017B;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class r extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2261A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1017B f2262B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2263C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f2264z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1017B c1017b, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2262B = c1017b;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2261A = obj;
        this.f2263C |= Integer.MIN_VALUE;
        return this.f2262B.m(null, this);
    }
}
