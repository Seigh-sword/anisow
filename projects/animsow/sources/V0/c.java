package V0;

import i4.InterfaceC0834a;
import m4.InterfaceC1128a;
import m4.InterfaceC1132e;
import o4.InterfaceC1228a;
import p4.C1252a;
import p4.InterfaceC1254c;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0834a, InterfaceC1128a, InterfaceC1132e, InterfaceC1228a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3684b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1254c f3685c;

    public c(f fVar) {
        this.f3683a = fVar;
        InterfaceC1254c bVar = new b();
        Object obj = C1252a.f12325c;
        if (!(bVar instanceof C1252a)) {
            C1252a c1252a = new C1252a();
            c1252a.f12327b = C1252a.f12325c;
            c1252a.f12326a = bVar;
            bVar = c1252a;
        }
        this.f3685c = bVar;
    }
}
