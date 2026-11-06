package x4;

import M4.C0063h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import v4.C1428f;
import v4.InterfaceC1427e;
import v4.InterfaceC1430h;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AbstractC1492a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1432j f13684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient InterfaceC1427e f13685y;

    public c(InterfaceC1427e interfaceC1427e) {
        this(interfaceC1427e, interfaceC1427e != null ? interfaceC1427e.i() : null);
    }

    @Override // v4.InterfaceC1427e
    public InterfaceC1432j i() {
        InterfaceC1432j interfaceC1432j = this.f13684x;
        AbstractC1305a.l(interfaceC1432j);
        return interfaceC1432j;
    }

    @Override // x4.AbstractC1492a
    public void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1427e interfaceC1427e = this.f13685y;
        if (interfaceC1427e != null && interfaceC1427e != this) {
            InterfaceC1430h interfaceC1430hN = i().n(C1428f.f13308w);
            AbstractC1305a.l(interfaceC1430hN);
            R4.h hVar = (R4.h) interfaceC1427e;
            do {
                atomicReferenceFieldUpdater = R4.h.f3014D;
            } while (atomicReferenceFieldUpdater.get(hVar) == R4.a.f3004d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0063h c0063h = obj instanceof C0063h ? (C0063h) obj : null;
            if (c0063h != null) {
                c0063h.n();
            }
        }
        this.f13685y = b.f13683w;
    }

    public c(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j) {
        super(interfaceC1427e);
        this.f13684x = interfaceC1432j;
    }
}
