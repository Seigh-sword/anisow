package H1;

import a3.C0261b;
import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f909a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f910b;

    static {
        C0261b c0261bA = C1479c.a("storageMetrics");
        T1.j jVarE = T1.j.e();
        jVarE.f3424w = 1;
        f910b = a.n(jVarE, c0261bA);
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        ((w3.e) obj2).f(f910b, ((K1.c) obj).f1516a);
    }
}
