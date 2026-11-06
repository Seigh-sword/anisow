package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1113n implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1113n f11580a = new C1113n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11581b = C1479c.b("type");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11582c = C1479c.b("reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11583d = C1479c.b("frames");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11584e = C1479c.b("causedBy");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11585f = C1479c.b("overflowCount");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        V v5 = (V) ((z0) obj);
        eVar.f(f11581b, v5.f11423a);
        eVar.f(f11582c, v5.f11424b);
        eVar.f(f11583d, v5.f11425c);
        eVar.f(f11584e, v5.f11426d);
        eVar.e(f11585f, v5.f11427e);
    }
}
