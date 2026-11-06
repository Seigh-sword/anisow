package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1121t implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1121t f11630a = new C1121t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11631b = C1479c.b("timestamp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11632c = C1479c.b("type");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11633d = C1479c.b("app");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11634e = C1479c.b("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11635f = C1479c.b("log");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f11636g = C1479c.b("rollouts");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        Q q5 = (Q) ((L0) obj);
        eVar.d(f11631b, q5.f11401a);
        eVar.f(f11632c, q5.f11402b);
        eVar.f(f11633d, q5.f11403c);
        eVar.f(f11634e, q5.f11404d);
        eVar.f(f11635f, q5.f11405e);
        eVar.f(f11636g, q5.f11406f);
    }
}
