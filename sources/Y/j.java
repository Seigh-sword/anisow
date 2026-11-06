package Y;

import f5.r;
import f5.x;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public r f4740A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public x f4741B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f4742C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ k f4743D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4744E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f4745z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4743D = kVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4742C = obj;
        this.f4744E |= Integer.MIN_VALUE;
        return this.f4743D.b(null, this);
    }
}
