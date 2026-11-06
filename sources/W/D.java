package W;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class D extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j0 f3995A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f3996B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f3997C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f3998D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(W w5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f3998D = w5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((D) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        D d6 = new D(this.f3998D, interfaceC1427e);
        d6.f3997C = obj;
        return d6;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.D.n(java.lang.Object):java.lang.Object");
    }
}
