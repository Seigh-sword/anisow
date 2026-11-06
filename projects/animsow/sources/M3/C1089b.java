package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1089b implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1089b f11454a = new C1089b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11455b = C1479c.b("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11456c = C1479c.b("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11457d = C1479c.b("reasonCode");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11458e = C1479c.b("importance");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11459f = C1479c.b("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f11460g = C1479c.b("rss");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f11461h = C1479c.b("timestamp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1479c f11462i = C1479c.b("traceFile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1479c f11463j = C1479c.b("buildIdMappingForArch");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        E e6 = (E) ((r0) obj);
        eVar.e(f11455b, e6.f11325a);
        eVar.f(f11456c, e6.f11326b);
        eVar.e(f11457d, e6.f11327c);
        eVar.e(f11458e, e6.f11328d);
        eVar.d(f11459f, e6.f11329e);
        eVar.d(f11460g, e6.f11330f);
        eVar.d(f11461h, e6.f11331g);
        eVar.f(f11462i, e6.f11332h);
        eVar.f(f11463j, e6.f11333i);
    }
}
