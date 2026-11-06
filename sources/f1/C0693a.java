package f1;

import v4.InterfaceC1427e;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0693a extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f8381A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0694b f8382B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8383C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8384z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0693a(C0694b c0694b, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f8382B = c0694b;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f8381A = obj;
        this.f8383C |= Integer.MIN_VALUE;
        return this.f8382B.c(null, this);
    }
}
