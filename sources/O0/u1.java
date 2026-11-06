package o0;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f12126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ w1 f12127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12128C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w1 f12129z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f12127B = w1Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f12126A = obj;
        this.f12128C |= Integer.MIN_VALUE;
        return this.f12127B.a(0, null, this);
    }
}
