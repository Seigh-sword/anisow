package H1;

import a3.C0261b;
import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f918a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f920c;

    static {
        C0261b c0261bA = C1479c.a("currentCacheSizeBytes");
        T1.j jVarE = T1.j.e();
        jVarE.f3424w = 1;
        f919b = a.n(jVarE, c0261bA);
        C0261b c0261bA2 = C1479c.a("maxCacheSizeBytes");
        T1.j jVarE2 = T1.j.e();
        jVarE2.f3424w = 2;
        f920c = a.n(jVarE2, c0261bA2);
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        K1.g gVar = (K1.g) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.d(f919b, gVar.f1531a);
        eVar.d(f920c, gVar.f1532b);
    }
}
