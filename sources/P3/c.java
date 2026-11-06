package P3;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public T4.a f2514A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2515B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ f f2516C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2517D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f2518z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2516C = fVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2515B = obj;
        this.f2517D |= Integer.MIN_VALUE;
        return this.f2516C.c(this);
    }
}
