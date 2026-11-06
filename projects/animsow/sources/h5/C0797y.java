package h5;

import M4.C0063h;
import M4.InterfaceC0062g;
import h0.C0733A;
import s4.AbstractC1305a;
import s4.C1307c;
import s4.C1312h;

/* JADX INFO: renamed from: h5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0797y implements InterfaceC0785l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0062g f9132b;

    public /* synthetic */ C0797y(C0063h c0063h, int i6) {
        this.f9131a = i6;
        this.f9132b = c0063h;
    }

    @Override // h5.InterfaceC0785l
    public final void a(InterfaceC0782i interfaceC0782i, U u5) {
        C1312h c1312hM;
        int i6 = this.f9131a;
        InterfaceC0062g interfaceC0062g = this.f9132b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(interfaceC0782i, "call");
                AbstractC1305a.o(u5, "response");
                if (u5.f9084a.c()) {
                    Object obj = u5.f9085b;
                    if (obj != null) {
                        interfaceC0062g.o(obj);
                    } else {
                        Object objCast = C0795w.class.cast(interfaceC0782i.g().f3755e.get(C0795w.class));
                        AbstractC1305a.l(objCast);
                        C0795w c0795w = (C0795w) objCast;
                        c1312hM = S3.a.m(new C1307c("Response from " + c0795w.f9125a.getName() + '.' + c0795w.f9127c.getName() + " was null but response body type was declared as non-null"));
                    }
                } else {
                    c1312hM = S3.a.m(new C0733A(u5));
                }
                interfaceC0062g.o(c1312hM);
                break;
            case 1:
                AbstractC1305a.o(interfaceC0782i, "call");
                AbstractC1305a.o(u5, "response");
                interfaceC0062g.o(u5.f9084a.c() ? u5.f9085b : S3.a.m(new C0733A(u5)));
                break;
            default:
                AbstractC1305a.o(interfaceC0782i, "call");
                AbstractC1305a.o(u5, "response");
                interfaceC0062g.o(u5);
                break;
        }
    }

    @Override // h5.InterfaceC0785l
    public final void b(InterfaceC0782i interfaceC0782i, Throwable th) {
        int i6 = this.f9131a;
        InterfaceC0062g interfaceC0062g = this.f9132b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(interfaceC0782i, "call");
                AbstractC1305a.o(th, "t");
                interfaceC0062g.o(S3.a.m(th));
                break;
            case 1:
                AbstractC1305a.o(interfaceC0782i, "call");
                AbstractC1305a.o(th, "t");
                interfaceC0062g.o(S3.a.m(th));
                break;
            default:
                AbstractC1305a.o(interfaceC0782i, "call");
                AbstractC1305a.o(th, "t");
                interfaceC0062g.o(S3.a.m(th));
                break;
        }
    }
}
