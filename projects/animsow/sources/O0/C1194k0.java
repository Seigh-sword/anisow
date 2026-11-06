package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194k0 extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B0 f11986A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public T4.d f11987B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f11988C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ A0 f11989D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f11990E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public A0 f11991z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1194k0(A0 a02, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f11989D = a02;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f11988C = obj;
        this.f11990E |= Integer.MIN_VALUE;
        return this.f11989D.e(this);
    }
}
