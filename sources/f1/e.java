package f1;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class e extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f8390A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ f f8391B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8392C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8393z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f8391B = fVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f8390A = obj;
        this.f8392C |= Integer.MIN_VALUE;
        return this.f8391B.c(null, this);
    }
}
