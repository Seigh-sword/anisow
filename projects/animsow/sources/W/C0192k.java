package W;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192k extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4134A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0196o f4135B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4136C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0196o f4137z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192k(C0196o c0196o, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4135B = c0196o;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4134A = obj;
        this.f4136C |= Integer.MIN_VALUE;
        return this.f4135B.a(this);
    }
}
