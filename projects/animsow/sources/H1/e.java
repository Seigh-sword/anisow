package H1;

import a3.C0261b;
import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f914a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f916c;

    static {
        C0261b c0261bA = C1479c.a("logSource");
        T1.j jVarE = T1.j.e();
        jVarE.f3424w = 1;
        f915b = a.n(jVarE, c0261bA);
        C0261b c0261bA2 = C1479c.a("logEventDropped");
        T1.j jVarE2 = T1.j.e();
        jVarE2.f3424w = 2;
        f916c = a.n(jVarE2, c0261bA2);
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        K1.f fVar = (K1.f) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f915b, fVar.f1529a);
        eVar.f(f916c, fVar.f1530b);
    }
}
