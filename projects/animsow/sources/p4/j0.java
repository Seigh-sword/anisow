package P4;

import o0.C1188h0;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1188h0 f2700A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2701B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2702z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(C1188h0 c1188h0, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2700A = c1188h0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2702z = obj;
        this.f2701B |= Integer.MIN_VALUE;
        return this.f2700A.b(0, this);
    }
}
