package G1;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: G1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042j implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0042j f796a = new C0042j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f797b = C1479c.b("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f798c = C1479c.b("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f799d = C1479c.b("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f800e = C1479c.b("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f801f = C1479c.b("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f802g = C1479c.b("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f803h = C1479c.b("qosTier");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        v vVar = (v) ((H) obj);
        eVar.d(f797b, vVar.f850a);
        eVar.d(f798c, vVar.f851b);
        eVar.f(f799d, vVar.f852c);
        eVar.f(f800e, vVar.f853d);
        eVar.f(f801f, vVar.f854e);
        eVar.f(f802g, vVar.f855f);
        eVar.f(f803h, vVar.f856g);
    }
}
