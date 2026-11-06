package T4;

import C4.l;
import M4.AbstractC0077w;
import M4.C0063h;
import M4.InterfaceC0062g;
import M4.y0;
import R4.u;
import j3.C0848A;
import java.lang.reflect.InvocationTargetException;
import s4.C1316l;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0062g, y0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0063h f3547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3548x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f3549y;

    public c(d dVar, C0063h c0063h) {
        this.f3549y = dVar;
        this.f3547w = c0063h;
    }

    @Override // M4.y0
    public final void a(u uVar, int i6) {
        this.f3547w.a(uVar, i6);
    }

    @Override // M4.InterfaceC0062g
    public final void d(AbstractC0077w abstractC0077w) throws IllegalAccessException, InvocationTargetException {
        this.f3547w.d(abstractC0077w);
    }

    @Override // v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        return this.f3547w.f1889A;
    }

    @Override // v4.InterfaceC1427e
    public final void o(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.f3547w.o(obj);
    }

    @Override // M4.InterfaceC0062g
    public final C0848A q(Object obj, l lVar) {
        d dVar = this.f3549y;
        b bVar = new b(dVar, this, 1);
        C0848A c0848aQ = this.f3547w.q((C1316l) obj, bVar);
        if (c0848aQ != null) {
            d.f3550h.set(dVar, this.f3548x);
        }
        return c0848aQ;
    }

    @Override // M4.InterfaceC0062g
    public final void r(Object obj) {
        this.f3547w.r(obj);
    }

    @Override // M4.InterfaceC0062g
    public final boolean s(Throwable th) {
        return this.f3547w.s(th);
    }
}
