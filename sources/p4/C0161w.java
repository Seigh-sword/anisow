package P4;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: P4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161w extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2763A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0162x f2764B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2765C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0162x f2766z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161w(C0162x c0162x, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2764B = c0162x;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2763A = obj;
        this.f2765C |= Integer.MIN_VALUE;
        return this.f2764B.k(null, this);
    }
}
