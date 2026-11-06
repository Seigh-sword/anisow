package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1123v implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1123v f11639a = new C1123v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11640b = C1479c.b("rolloutVariant");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11641c = C1479c.b("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11642d = C1479c.b("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11643e = C1479c.b("templateVersion");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        C1100g0 c1100g0 = (C1100g0) ((J0) obj);
        eVar.f(f11640b, c1100g0.f11517a);
        eVar.f(f11641c, c1100g0.f11518b);
        eVar.f(f11642d, c1100g0.f11519c);
        eVar.d(f11643e, c1100g0.f11520d);
    }
}
