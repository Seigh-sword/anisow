package H1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E1.c f955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1.e f956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f957e;

    public s(j jVar, String str, E1.c cVar, E1.e eVar, t tVar) {
        this.f953a = jVar;
        this.f954b = str;
        this.f955c = cVar;
        this.f956d = eVar;
        this.f957e = tVar;
    }

    public final void a(E1.a aVar, E1.g gVar) {
        Integer num;
        j jVar = this.f953a;
        if (jVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = this.f954b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        E1.e eVar = this.f956d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        E1.c cVar = this.f955c;
        if (cVar == null) {
            throw new NullPointerException("Null encoding");
        }
        u uVar = (u) this.f957e;
        uVar.getClass();
        j jVarC = jVar.c(aVar.f381b);
        R0.k kVar = new R0.k();
        kVar.f2924f = new HashMap();
        kVar.f2922d = Long.valueOf(((P1.c) uVar.f959a).a());
        kVar.f2923e = Long.valueOf(((P1.c) uVar.f960b).a());
        kVar.f2919a = str;
        kVar.q(new m(cVar, (byte[]) eVar.apply(aVar.f380a)));
        kVar.f2920b = null;
        E1.b bVar = aVar.f382c;
        if (bVar != null && (num = bVar.f383a) != null) {
            kVar.f2925g = num;
        }
        i iVarB = kVar.b();
        L1.b bVar2 = (L1.b) uVar.f961c;
        bVar2.getClass();
        bVar2.f1714b.execute(new L1.a(bVar2, jVarC, gVar, iVarB, 0));
    }
}
