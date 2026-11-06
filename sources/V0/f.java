package V0;

import j4.InterfaceC0877a;
import m4.InterfaceC1130c;
import n4.C1157a;
import o4.InterfaceC1228a;
import p4.C1252a;
import p4.InterfaceC1254c;

/* JADX INFO: loaded from: classes.dex */
public final class f implements n, InterfaceC0877a, InterfaceC1130c, InterfaceC1228a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1157a f3688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3689b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1254c f3690c;

    public f(C1157a c1157a) {
        this.f3688a = c1157a;
        InterfaceC1254c eVar = new e(this);
        Object obj = C1252a.f12325c;
        if (!(eVar instanceof C1252a)) {
            C1252a c1252a = new C1252a();
            c1252a.f12327b = C1252a.f12325c;
            c1252a.f12326a = eVar;
            eVar = c1252a;
        }
        this.f3690c = eVar;
    }
}
