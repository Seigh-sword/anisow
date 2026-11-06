package N3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: N3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118d implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0118d f2214a = new C0118d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f2215b = C1479c.b("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f2216c = C1479c.b("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f2217d = C1479c.b("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f2218e = C1479c.b("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f2219f = C1479c.b("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f2220g = C1479c.b("androidAppInfo");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        C0116b c0116b = (C0116b) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f2215b, c0116b.f2201a);
        eVar.f(f2216c, c0116b.f2202b);
        eVar.f(f2217d, c0116b.f2203c);
        eVar.f(f2218e, c0116b.f2204d);
        eVar.f(f2219f, c0116b.f2205e);
        eVar.f(f2220g, c0116b.f2206f);
    }
}
