package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: m3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1095e implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1095e f11497a = new C1095e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11498b = C1479c.b("files");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11499c = C1479c.b("orgId");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        H h4 = (H) ((u0) obj);
        eVar.f(f11498b, h4.f11339a);
        eVar.f(f11499c, h4.f11340b);
    }
}
