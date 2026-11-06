package G1;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: G1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043k implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0043k f804a = new C0043k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f805b = C1479c.b("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f806c = C1479c.b("mobileSubtype");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        x xVar = (x) ((K) obj);
        eVar.f(f805b, xVar.f858a);
        eVar.f(f806c, xVar.f859b);
    }
}
