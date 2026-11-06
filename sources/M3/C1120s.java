package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1120s implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1120s f11623a = new C1120s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11624b = C1479c.b("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11625c = C1479c.b("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11626d = C1479c.b("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11627e = C1479c.b("orientation");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11628f = C1479c.b("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f11629g = C1479c.b("diskUsed");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        C1094d0 c1094d0 = (C1094d0) ((G0) obj);
        eVar.f(f11624b, c1094d0.f11491a);
        eVar.e(f11625c, c1094d0.f11492b);
        eVar.g(f11626d, c1094d0.f11493c);
        eVar.e(f11627e, c1094d0.f11494d);
        eVar.d(f11628f, c1094d0.f11495e);
        eVar.d(f11629g, c1094d0.f11496f);
    }
}
