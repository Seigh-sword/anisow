package H1;

import a3.C0261b;
import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f904a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f908e;

    static {
        C0261b c0261bA = C1479c.a("window");
        T1.j jVarE = T1.j.e();
        jVarE.f3424w = 1;
        f905b = a.n(jVarE, c0261bA);
        C0261b c0261bA2 = C1479c.a("logSourceMetrics");
        T1.j jVarE2 = T1.j.e();
        jVarE2.f3424w = 2;
        f906c = a.n(jVarE2, c0261bA2);
        C0261b c0261bA3 = C1479c.a("globalMetrics");
        T1.j jVarE3 = T1.j.e();
        jVarE3.f3424w = 3;
        f907d = a.n(jVarE3, c0261bA3);
        C0261b c0261bA4 = C1479c.a("appNamespace");
        T1.j jVarE4 = T1.j.e();
        jVarE4.f3424w = 4;
        f908e = a.n(jVarE4, c0261bA4);
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        K1.a aVar = (K1.a) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f905b, aVar.f1510a);
        eVar.f(f906c, aVar.f1511b);
        eVar.f(f907d, aVar.f1512c);
        eVar.f(f908e, aVar.f1513d);
    }
}
