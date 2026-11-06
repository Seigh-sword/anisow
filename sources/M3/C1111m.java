package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1111m implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1111m f11571a = new C1111m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11572b = C1479c.b("threads");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11573c = C1479c.b("exception");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11574d = C1479c.b("appExitInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11575e = C1479c.b("signal");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11576f = C1479c.b("binaries");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        T t5 = (T) ((D0) obj);
        eVar.f(f11572b, t5.f11414a);
        eVar.f(f11573c, t5.f11415b);
        eVar.f(f11574d, t5.f11416c);
        eVar.f(f11575e, t5.f11417d);
        eVar.f(f11576f, t5.f11418e);
    }
}
