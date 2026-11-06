package i5;

import Q3.A;
import Q3.n;
import V4.C;
import V4.t;
import f5.C0710g;
import h5.InterfaceC0790q;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0790q {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t f9409y = t.a("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f9410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final A f9411x;

    public b(n nVar, A a6) {
        this.f9410w = nVar;
        this.f9411x = a6;
    }

    @Override // h5.InterfaceC0790q
    public final Object k(Object obj) throws IOException {
        C0710g c0710g = new C0710g();
        X3.b bVarD = this.f9410w.d(new OutputStreamWriter(c0710g.L(), StandardCharsets.UTF_8));
        this.f9411x.c(bVarD, obj);
        bVarD.close();
        return new C(f9409y, c0710g.m(c0710g.f8461x));
    }
}
