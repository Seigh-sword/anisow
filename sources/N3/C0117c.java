package N3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: N3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117c implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0117c f2207a = new C0117c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f2208b = C1479c.b("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f2209c = C1479c.b("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f2210d = C1479c.b("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f2211e = C1479c.b("deviceManufacturer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f2212f = C1479c.b("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f2213g = C1479c.b("appProcessDetails");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        C0115a c0115a = (C0115a) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f2208b, c0115a.f2195a);
        eVar.f(f2209c, c0115a.f2196b);
        eVar.f(f2210d, c0115a.f2197c);
        eVar.f(f2211e, c0115a.f2198d);
        eVar.f(f2212f, c0115a.f2199e);
        eVar.f(f2213g, c0115a.f2200f);
    }
}
