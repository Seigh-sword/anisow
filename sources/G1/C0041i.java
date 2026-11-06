package G1;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: G1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041i implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0041i f786a = new C0041i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f787b = C1479c.b("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f788c = C1479c.b("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f789d = C1479c.b("complianceData");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f790e = C1479c.b("eventUptimeMs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f791f = C1479c.b("sourceExtension");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f792g = C1479c.b("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f793h = C1479c.b("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1479c f794i = C1479c.b("networkConnectionInfo");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1479c f795j = C1479c.b("experimentIds");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        u uVar = (u) ((G) obj);
        eVar.d(f787b, uVar.f841a);
        eVar.f(f788c, uVar.f842b);
        eVar.f(f789d, uVar.f843c);
        eVar.d(f790e, uVar.f844d);
        eVar.f(f791f, uVar.f845e);
        eVar.f(f792g, uVar.f846f);
        eVar.d(f793h, uVar.f847g);
        eVar.f(f794i, uVar.f848h);
        eVar.f(f795j, uVar.f849i);
    }
}
