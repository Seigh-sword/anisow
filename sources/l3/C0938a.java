package l3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0938a implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0938a f10024a = new C0938a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f10025b = C1479c.b("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f10026c = C1479c.b("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f10027d = C1479c.b("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f10028e = C1479c.b("variantId");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f10029f = C1479c.b("templateVersion");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        C0939b c0939b = (C0939b) ((l) obj);
        eVar.f(f10025b, c0939b.f10030b);
        eVar.f(f10026c, c0939b.f10031c);
        eVar.f(f10027d, c0939b.f10032d);
        eVar.f(f10028e, c0939b.f10033e);
        eVar.d(f10029f, c0939b.f10034f);
    }
}
