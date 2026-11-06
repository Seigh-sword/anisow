package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1199n extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12032A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ W.B f12033B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f12034z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199n(W.B b6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f12033B = b6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f12034z = obj;
        this.f12032A |= Integer.MIN_VALUE;
        return this.f12033B.k(null, this);
    }
}
