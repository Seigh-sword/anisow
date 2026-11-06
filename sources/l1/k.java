package l1;

import j1.InterfaceC0845c;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9918c;

    public k(InterfaceC0845c interfaceC0845c, Object obj, j1.m mVar) {
        this.f9916a = interfaceC0845c;
        this.f9917b = obj;
        this.f9918c = mVar;
    }

    public final void a(U1.i iVar, j1.m mVar) {
        try {
            iVar.b().q((j1.i) this.f9916a, new k((j1.p) this.f9917b, (C0926E) this.f9918c, mVar));
        } finally {
            ((C0926E) this.f9918c).b();
        }
    }

    public k(q qVar, y1.g gVar, u uVar) {
        this.f9918c = qVar;
        this.f9917b = gVar;
        this.f9916a = uVar;
    }
}
