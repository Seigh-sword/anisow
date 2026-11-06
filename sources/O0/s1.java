package o0;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public M4.b0 f12096A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public T4.a f12097B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12098C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f12099D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ t1 f12100E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f12101F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public t1 f12102z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f12100E = t1Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f12099D = obj;
        this.f12101F |= Integer.MIN_VALUE;
        return this.f12100E.b(0, null, this);
    }
}
