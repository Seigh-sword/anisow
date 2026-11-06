package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1091c implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1091c f11468a = new C1091c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11469b = C1479c.b("key");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11470c = C1479c.b("value");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        G g4 = (G) ((s0) obj);
        eVar.f(f11469b, g4.f11337a);
        eVar.f(f11470c, g4.f11338b);
    }
}
