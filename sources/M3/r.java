package m3;

import w3.C1479c;
import w3.InterfaceC1480d;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f11618a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479c f11619b = C1479c.b("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1479c f11620c = C1479c.b("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1479c f11621d = C1479c.b("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1479c f11622e = C1479c.b("defaultProcess");

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        w3.e eVar = (w3.e) obj2;
        C1090b0 c1090b0 = (C1090b0) ((E0) obj);
        eVar.f(f11619b, c1090b0.f11464a);
        eVar.e(f11620c, c1090b0.f11465b);
        eVar.e(f11621d, c1090b0.f11466c);
        eVar.g(f11622e, c1090b0.f11467d);
    }
}
