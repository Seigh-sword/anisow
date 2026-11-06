package N3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: N3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0121g implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0121g f2230a = new C0121g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f2231b = C1479c.b("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f2232c = C1479c.b("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f2233d = C1479c.b("applicationInfo");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        H h4 = (H) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f2231b, h4.f2140a);
        eVar.f(f2232c, h4.f2141b);
        eVar.f(f2233d, h4.f2142c);
    }
}
