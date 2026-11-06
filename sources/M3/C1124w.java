package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1124w implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1124w f11644a = new C1124w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11645b = C1479c.b("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11646c = C1479c.b("variantId");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        C1102h0 c1102h0 = (C1102h0) ((I0) obj);
        eVar.f(f11645b, c1102h0.f11522a);
        eVar.f(f11646c, c1102h0.f11523b);
    }
}
