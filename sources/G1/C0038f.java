package G1;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: G1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038f implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0038f f779a = new C0038f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f780b = C1479c.b("clearBlob");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f781c = C1479c.b("encryptedBlob");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        r rVar = (r) ((D) obj);
        eVar.f(f780b, rVar.f837a);
        eVar.f(f781c, rVar.f838b);
    }
}
