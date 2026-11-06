package P3;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class o extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ q f2556A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2557B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2558z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2556A = qVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2558z = obj;
        this.f2557B |= Integer.MIN_VALUE;
        return this.f2556A.c(null, null, this);
    }
}
