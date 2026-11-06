package Y;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b f4720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4721B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f4722C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ i f4723D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4724E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f4725z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4723D = iVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4722C = obj;
        this.f4724E |= Integer.MIN_VALUE;
        return this.f4723D.a(null, this);
    }
}
