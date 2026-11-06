package v4;

import C4.p;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: v4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1425c extends D4.i implements p {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C1425c f13303y = new C1425c(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C1425c f13304z = new C1425c(1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13305x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1425c(int i6) {
        super(2);
        this.f13305x = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        C1426d c1426d;
        switch (this.f13305x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                String str = (String) obj;
                InterfaceC1430h interfaceC1430h = (InterfaceC1430h) obj2;
                AbstractC1305a.o(str, "acc");
                AbstractC1305a.o(interfaceC1430h, "element");
                if (str.length() == 0) {
                    return interfaceC1430h.toString();
                }
                return str + ", " + interfaceC1430h;
            default:
                InterfaceC1432j interfaceC1432j = (InterfaceC1432j) obj;
                InterfaceC1430h interfaceC1430h2 = (InterfaceC1430h) obj2;
                AbstractC1305a.o(interfaceC1432j, "acc");
                AbstractC1305a.o(interfaceC1430h2, "element");
                InterfaceC1432j interfaceC1432jL = interfaceC1432j.l(interfaceC1430h2.getKey());
                C1433k c1433k = C1433k.f13309w;
                if (interfaceC1432jL == c1433k) {
                    return interfaceC1430h2;
                }
                C1428f c1428f = C1428f.f13308w;
                InterfaceC1429g interfaceC1429g = (InterfaceC1429g) interfaceC1432jL.n(c1428f);
                if (interfaceC1429g == null) {
                    c1426d = new C1426d(interfaceC1430h2, interfaceC1432jL);
                } else {
                    InterfaceC1432j interfaceC1432jL2 = interfaceC1432jL.l(c1428f);
                    if (interfaceC1432jL2 == c1433k) {
                        return new C1426d(interfaceC1429g, interfaceC1430h2);
                    }
                    c1426d = new C1426d(interfaceC1429g, new C1426d(interfaceC1430h2, interfaceC1432jL2));
                }
                return c1426d;
        }
    }
}
