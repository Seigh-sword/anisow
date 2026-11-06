package N3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: N3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0119e implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0119e f2221a = new C0119e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f2222b = C1479c.b("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f2223c = C1479c.b("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f2224d = C1479c.b("sessionSamplingRate");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        C0124j c0124j = (C0124j) obj;
        w3.e eVar = (w3.e) obj2;
        eVar.f(f2222b, c0124j.f2247a);
        eVar.f(f2223c, c0124j.f2248b);
        eVar.c(f2224d, c0124j.f2249c);
    }
}
