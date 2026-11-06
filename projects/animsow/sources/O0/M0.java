package o0;

import i.C0803c;
import java.util.concurrent.CopyOnWriteArrayList;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements C4.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11809w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ X0.e f11810x;

    public M0(X0.e eVar) {
        this.f11810x = eVar;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        C4.l lVar;
        C1197m c1197m = (C1197m) obj;
        AbstractC1305a.o(c1197m, "loadStates");
        if (this.f11809w) {
            this.f11809w = false;
        } else if (c1197m.f12013d.f11768a instanceof F) {
            X0.e eVar = this.f11810x;
            X0.e.e(eVar);
            C1193k c1193k = eVar.f4505e;
            c1193k.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = c1193k.f11982j;
            copyOnWriteArrayList.remove(this);
            if (copyOnWriteArrayList.isEmpty() && (lVar = (C4.l) c1193k.f11981i.get()) != null) {
                C1185g c1185g = c1193k.f11979g;
                c1185g.getClass();
                C0803c c0803c = c1185g.f11863d;
                c0803c.getClass();
                ((CopyOnWriteArrayList) c0803c.f9277x).remove(lVar);
            }
        }
        return C1316l.f12640a;
    }
}
