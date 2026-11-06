package N3;

import o0.C1188h0;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class C extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2122A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1188h0 f2123B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2124z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C1188h0 c1188h0, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2123B = c1188h0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2124z = obj;
        this.f2122A |= Integer.MIN_VALUE;
        return this.f2123B.k(null, this);
    }
}
