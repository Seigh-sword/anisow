package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1103i implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1103i f11524a = new C1103i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11525b = C1479c.b("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11526c = C1479c.b("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11527d = C1479c.b("cores");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11528e = C1479c.b("ram");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1479c f11529f = C1479c.b("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f11530g = C1479c.b("simulator");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f11531h = C1479c.b("state");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1479c f11532i = C1479c.b("manufacturer");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1479c f11533j = C1479c.b("modelClass");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        O o3 = (O) ((x0) obj);
        eVar.e(f11525b, o3.f11384a);
        eVar.f(f11526c, o3.f11385b);
        eVar.e(f11527d, o3.f11386c);
        eVar.d(f11528e, o3.f11387d);
        eVar.d(f11529f, o3.f11388e);
        eVar.g(f11530g, o3.f11389f);
        eVar.e(f11531h, o3.f11390g);
        eVar.f(f11532i, o3.f11391h);
        eVar.f(f11533j, o3.f11392i);
    }
}
