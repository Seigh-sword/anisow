package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1097f implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1097f f11501a = new C1097f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11502b = C1479c.b("filename");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11503c = C1479c.b("contents");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        I i6 = (I) ((t0) obj);
        eVar.f(f11502b, i6.f11341a);
        eVar.f(f11503c, i6.f11342b);
    }
}
