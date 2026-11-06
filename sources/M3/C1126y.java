package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1126y implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1126y f11649a = new C1126y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11650b = C1479c.b("platform");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11651c = C1479c.b("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11652d = C1479c.b("buildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11653e = C1479c.b("jailbroken");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        C1108k0 c1108k0 = (C1108k0) ((M0) obj);
        eVar.e(f11650b, c1108k0.f11561a);
        eVar.f(f11651c, c1108k0.f11562b);
        eVar.f(f11652d, c1108k0.f11563c);
        eVar.g(f11653e, c1108k0.f11564d);
    }
}
