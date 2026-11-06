package w1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: w1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1475s implements InterfaceC1465i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f13587w = Collections.newSetFromMap(new WeakHashMap());

    @Override // w1.InterfaceC1465i
    public final void e() {
        Iterator it = C1.n.e(this.f13587w).iterator();
        while (it.hasNext()) {
            ((z1.e) it.next()).e();
        }
    }

    @Override // w1.InterfaceC1465i
    public final void i() {
        Iterator it = C1.n.e(this.f13587w).iterator();
        while (it.hasNext()) {
            ((z1.e) it.next()).i();
        }
    }

    @Override // w1.InterfaceC1465i
    public final void j() {
        Iterator it = C1.n.e(this.f13587w).iterator();
        while (it.hasNext()) {
            ((z1.e) it.next()).j();
        }
    }
}
