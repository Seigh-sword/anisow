package J3;

import a3.C0261b;
import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: J3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046b implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0046b f1393a = new C0046b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f1394b;

    static {
        C0261b c0261bA = C1479c.a("messagingClientEvent");
        T1.j jVarE = T1.j.e();
        jVarE.f3424w = 1;
        f1394b = H1.a.n(jVarE, c0261bA);
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        ((w3.e) obj2).f(f1394b, ((K3.e) obj).f1636a);
    }
}
