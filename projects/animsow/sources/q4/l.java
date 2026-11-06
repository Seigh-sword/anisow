package Q4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class l extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f2854A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2855B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ m f2856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2857D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f2858z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2856C = mVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2855B = obj;
        this.f2857D |= Integer.MIN_VALUE;
        return this.f2856C.k(null, this);
    }
}
