package V0;

import J3.w;
import a3.C0261b;
import l4.InterfaceC0943a;
import m4.InterfaceC1135h;
import o4.InterfaceC1228a;
import p4.C1253b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements W0.c, InterfaceC0943a, InterfaceC1135h, InterfaceC1228a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3682c = this;

    public a(f fVar, c cVar) {
        this.f3680a = fVar;
        this.f3681b = cVar;
    }

    public final C0261b a() {
        Y2.b.g(8, "expectedSize");
        W2.m mVar = new W2.m(8);
        Boolean bool = Boolean.TRUE;
        mVar.b("g1.c", bool);
        mVar.b("g1.e", bool);
        mVar.b("Z0.p", bool);
        mVar.b("g1.g", bool);
        mVar.b("g1.i", bool);
        mVar.b("g1.j", bool);
        mVar.b("g1.l", bool);
        mVar.b("g1.m", bool);
        C1253b c1253b = new C1253b(mVar.a());
        w wVar = new w();
        wVar.f1441a = this.f3680a;
        wVar.f1442b = this.f3681b;
        return new C0261b(c1253b, wVar, 14);
    }
}
