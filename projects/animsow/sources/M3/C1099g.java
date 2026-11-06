package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1099g implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1099g f11509a = new C1099g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11510b = C1479c.b("identifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11511c = C1479c.b("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11512d = C1479c.b("displayVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11513e = C1479c.b("organization");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11514f = C1479c.b("installationUuid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f11515g = C1479c.b("developmentPlatform");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f11516h = C1479c.b("developmentPlatformVersion");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        L l5 = (L) ((w0) obj);
        eVar.f(f11510b, l5.f11368a);
        eVar.f(f11511c, l5.f11369b);
        eVar.f(f11512d, l5.f11370c);
        eVar.f(f11513e, null);
        eVar.f(f11514f, l5.f11371d);
        eVar.f(f11515g, l5.f11372e);
        eVar.f(f11516h, l5.f11373f);
    }
}
