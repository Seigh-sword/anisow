package Y;

import f5.w;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f4726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public w f4727B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Object f4728C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f4729D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ i f4730E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f4731F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f4732z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4730E = iVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4729D = obj;
        this.f4731F |= Integer.MIN_VALUE;
        return this.f4730E.b(null, this);
    }
}
