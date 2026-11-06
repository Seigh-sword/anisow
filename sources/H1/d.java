package H1;

import a3.C0261b;
import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f911a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f913c;

    static {
        C0261b c0261bA = C1479c.a("eventsDroppedCount");
        T1.j jVarE = T1.j.e();
        jVarE.f3424w = 1;
        f912b = a.n(jVarE, c0261bA);
        C0261b c0261bA2 = C1479c.a("reason");
        T1.j jVarE2 = T1.j.e();
        jVarE2.f3424w = 3;
        f913c = a.n(jVarE2, c0261bA2);
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        K1.e eVar = (K1.e) obj;
        w3.e eVar2 = (w3.e) obj2;
        eVar2.d(f912b, eVar.f1526a);
        eVar2.f(f913c, eVar.f1527b);
    }
}
