package M4;

import v4.InterfaceC1429g;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f1848a;

    static {
        String property;
        G g4;
        int i6 = R4.w.f3043a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            g4 = C.f1846F;
        } else {
            S4.e eVar = J.f1851a;
            InterfaceC1429g interfaceC1429g = R4.p.f3037a;
            N4.c cVar = ((N4.c) interfaceC1429g).f2282B;
            g4 = !(interfaceC1429g instanceof G) ? C.f1846F : (G) interfaceC1429g;
        }
        f1848a = g4;
    }
}
