package P4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class T extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2632A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ W.B f2633B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f2634z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W.B b6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2633B = b6;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2634z = obj;
        this.f2632A |= Integer.MIN_VALUE;
        return this.f2633B.k(null, this);
    }
}
