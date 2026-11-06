package f1;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: f1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0695c extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f8386A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0696d f8387B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8388C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8389z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0695c(C0696d c0696d, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f8387B = c0696d;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f8386A = obj;
        this.f8388C |= Integer.MIN_VALUE;
        return this.f8387B.c(null, this);
    }
}
