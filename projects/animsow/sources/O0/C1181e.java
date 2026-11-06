package o0;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1181e extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1193k f11916A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public R0 f11917B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f11918C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C1185g f11919D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f11920E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1185g f11921z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181e(C1185g c1185g, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f11919D = c1185g;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f11918C = obj;
        this.f11920E |= Integer.MIN_VALUE;
        return this.f11919D.c(null, this);
    }
}
