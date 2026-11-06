package N3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: N3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0122h implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0122h f2234a = new C0122h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f2235b = C1479c.b("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f2236c = C1479c.b("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f2237d = C1479c.b("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f2238e = C1479c.b("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f2239f = C1479c.b("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f2240g = C1479c.b("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f2241h = C1479c.b("firebaseAuthenticationToken");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        P p5 = (P) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f2235b, p5.f2171a);
        eVar.f(f2236c, p5.f2172b);
        eVar.e(f2237d, p5.f2173c);
        eVar.d(f2238e, p5.f2174d);
        eVar.f(f2239f, p5.f2175e);
        eVar.f(f2240g, p5.f2176f);
        eVar.f(f2241h, p5.f2177g);
    }
}
