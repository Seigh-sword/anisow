package P4;

import o0.C1188h0;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class U extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2635A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1188h0 f2636B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Object f2637C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0147h f2638D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2639z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1188h0 c1188h0, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2636B = c1188h0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2639z = obj;
        this.f2635A |= Integer.MIN_VALUE;
        return this.f2636B.k(null, this);
    }
}
