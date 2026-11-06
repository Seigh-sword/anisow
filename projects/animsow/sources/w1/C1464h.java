package w1;

import androidx.lifecycle.AbstractC0315o;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.EnumC0314n;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0320u;
import androidx.lifecycle.InterfaceC0321v;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: w1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1464h implements InterfaceC1463g, InterfaceC0320u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashSet f13568w = new HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AbstractC0315o f13569x;

    public C1464h(C0323x c0323x) {
        this.f13569x = c0323x;
        c0323x.a(this);
    }

    @Override // w1.InterfaceC1463g
    public final void g(InterfaceC1465i interfaceC1465i) {
        this.f13568w.remove(interfaceC1465i);
    }

    @G(EnumC0313m.ON_DESTROY)
    public void onDestroy(InterfaceC0321v interfaceC0321v) {
        Iterator it = C1.n.e(this.f13568w).iterator();
        while (it.hasNext()) {
            ((InterfaceC1465i) it.next()).j();
        }
        interfaceC0321v.g().b(this);
    }

    @G(EnumC0313m.ON_START)
    public void onStart(InterfaceC0321v interfaceC0321v) {
        Iterator it = C1.n.e(this.f13568w).iterator();
        while (it.hasNext()) {
            ((InterfaceC1465i) it.next()).i();
        }
    }

    @G(EnumC0313m.ON_STOP)
    public void onStop(InterfaceC0321v interfaceC0321v) {
        Iterator it = C1.n.e(this.f13568w).iterator();
        while (it.hasNext()) {
            ((InterfaceC1465i) it.next()).e();
        }
    }

    @Override // w1.InterfaceC1463g
    public final void p(InterfaceC1465i interfaceC1465i) {
        this.f13568w.add(interfaceC1465i);
        EnumC0314n enumC0314n = ((C0323x) this.f13569x).f5645d;
        if (enumC0314n == EnumC0314n.f5631w) {
            interfaceC1465i.j();
        } else if (enumC0314n.compareTo(EnumC0314n.f5634z) >= 0) {
            interfaceC1465i.i();
        } else {
            interfaceC1465i.e();
        }
    }
}
