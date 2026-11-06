package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1117p implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1117p f11605a = new C1117p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11606b = C1479c.b("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11607c = C1479c.b("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11608d = C1479c.b("frames");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        X x5 = (X) ((C0) obj);
        eVar.f(f11606b, x5.f11431a);
        eVar.e(f11607c, x5.f11432b);
        eVar.f(f11608d, x5.f11433c);
    }
}
