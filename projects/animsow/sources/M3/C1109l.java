package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1109l implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1109l f11565a = new C1109l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11566b = C1479c.b("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11567c = C1479c.b("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11568d = C1479c.b("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11569e = C1479c.b("uuid");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        U u5 = (U) ((y0) obj);
        eVar.d(f11566b, u5.f11419a);
        eVar.d(f11567c, u5.f11420b);
        eVar.f(f11568d, u5.f11421c);
        String str = u5.f11422d;
        eVar.f(f11569e, str != null ? str.getBytes(P0.f11400a) : null);
    }
}
