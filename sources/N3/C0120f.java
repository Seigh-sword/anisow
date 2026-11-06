package N3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: N3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120f implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0120f f2225a = new C0120f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f2226b = C1479c.b("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f2227c = C1479c.b("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f2228d = C1479c.b("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f2229e = C1479c.b("defaultProcess");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        C0134u c0134u = (C0134u) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f2226b, c0134u.f2271a);
        eVar.e(f2227c, c0134u.f2272b);
        eVar.e(f2228d, c0134u.f2273c);
        eVar.g(f2229e, c0134u.f2274d);
    }
}
