package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1115o implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1115o f11592a = new C1115o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11593b = C1479c.b("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11594c = C1479c.b("code");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11595d = C1479c.b("address");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        W w5 = (W) ((A0) obj);
        eVar.f(f11593b, w5.f11428a);
        eVar.f(f11594c, w5.f11429b);
        eVar.d(f11595d, w5.f11430c);
    }
}
