package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1087a implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1087a f11445a = new C1087a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11446b = C1479c.b("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11447c = C1479c.b("libraryName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11448d = C1479c.b("buildId");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        F f6 = (F) ((q0) obj);
        eVar.f(f11446b, f6.f11334a);
        eVar.f(f11447c, f6.f11335b);
        eVar.f(f11448d, f6.f11336c);
    }
}
