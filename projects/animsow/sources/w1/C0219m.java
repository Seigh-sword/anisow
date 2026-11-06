package W1;

import l1.C0924C;
import q2.InterfaceC1261d;

/* JADX INFO: renamed from: W1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0219m implements InterfaceC1261d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q2.j f4334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0924C f4335x;

    public C0219m(C0924C c0924c, q2.j jVar) {
        this.f4335x = c0924c;
        this.f4334w = jVar;
    }

    @Override // q2.InterfaceC1261d
    public final void c(q2.i iVar) {
        this.f4335x.f9843b.remove(this.f4334w);
    }
}
