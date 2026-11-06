package w1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: w1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1471o implements InterfaceC1457a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1474r f13578a;

    public C1471o(C1474r c1474r) {
        this.f13578a = c1474r;
    }

    @Override // w1.InterfaceC1457a
    public final void a(boolean z5) {
        ArrayList arrayList;
        C1.n.a();
        synchronized (this.f13578a) {
            arrayList = new ArrayList((Set) this.f13578a.f13584x);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1457a) it.next()).a(z5);
        }
    }
}
