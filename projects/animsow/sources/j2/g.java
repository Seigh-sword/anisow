package J2;

import F0.A;
import F0.C0014a;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import l.InterfaceC0901A;
import l.SubMenuC0907G;
import l.o;
import l.q;
import u2.C1368a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0901A {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f1321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1323y;

    @Override // l.InterfaceC0901A
    public final void b(Context context, o oVar) {
        this.f1321w.f1314d0 = oVar;
    }

    @Override // l.InterfaceC0901A
    public final int d() {
        return this.f1323y;
    }

    @Override // l.InterfaceC0901A
    public final boolean e() {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final Parcelable g() {
        f fVar = new f();
        fVar.f1319w = this.f1321w.getSelectedItemId();
        SparseArray<C1368a> badgeDrawables = this.f1321w.getBadgeDrawables();
        H2.f fVar2 = new H2.f();
        for (int i6 = 0; i6 < badgeDrawables.size(); i6++) {
            int iKeyAt = badgeDrawables.keyAt(i6);
            C1368a c1368aValueAt = badgeDrawables.valueAt(i6);
            fVar2.put(iKeyAt, c1368aValueAt != null ? c1368aValueAt.f12866A.f12909a : null);
        }
        fVar.f1320x = fVar2;
        return fVar;
    }

    @Override // l.InterfaceC0901A
    public final void h(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof f) {
            e eVar = this.f1321w;
            f fVar = (f) parcelable;
            int i6 = fVar.f1319w;
            int size = eVar.f1314d0.f9759f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                MenuItem item = eVar.f1314d0.getItem(i7);
                if (i6 == item.getItemId()) {
                    eVar.f1290C = i6;
                    eVar.f1291D = i7;
                    item.setChecked(true);
                    break;
                }
                i7++;
            }
            Context context = this.f1321w.getContext();
            H2.f fVar2 = fVar.f1320x;
            SparseArray sparseArray2 = new SparseArray(fVar2.size());
            for (int i8 = 0; i8 < fVar2.size(); i8++) {
                int iKeyAt = fVar2.keyAt(i8);
                u2.b bVar = (u2.b) fVar2.valueAt(i8);
                sparseArray2.put(iKeyAt, bVar != null ? new C1368a(context, bVar) : null);
            }
            e eVar2 = this.f1321w;
            eVar2.getClass();
            int i9 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = eVar2.f1302O;
                if (i9 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i9);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (C1368a) sparseArray2.get(iKeyAt2));
                }
                i9++;
            }
            c[] cVarArr = eVar2.f1289B;
            if (cVarArr != null) {
                for (c cVar : cVarArr) {
                    C1368a c1368a = (C1368a) sparseArray.get(cVar.getId());
                    if (c1368a != null) {
                        cVar.setBadge(c1368a);
                    }
                }
            }
        }
    }

    @Override // l.InterfaceC0901A
    public final boolean i(SubMenuC0907G subMenuC0907G) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final boolean l(q qVar) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final boolean m(q qVar) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final void n(boolean z5) {
        C0014a c0014a;
        if (this.f1322x) {
            return;
        }
        if (z5) {
            this.f1321w.b();
            return;
        }
        e eVar = this.f1321w;
        o oVar = eVar.f1314d0;
        if (oVar == null || eVar.f1289B == null) {
            return;
        }
        int size = oVar.f9759f.size();
        if (size != eVar.f1289B.length) {
            eVar.b();
            return;
        }
        int i6 = eVar.f1290C;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = eVar.f1314d0.getItem(i7);
            if (item.isChecked()) {
                eVar.f1290C = item.getItemId();
                eVar.f1291D = i7;
            }
        }
        if (i6 != eVar.f1290C && (c0014a = eVar.f1315w) != null) {
            A.a(eVar, c0014a);
        }
        int i8 = eVar.f1288A;
        boolean z6 = i8 != -1 ? i8 == 0 : eVar.f1314d0.l().size() > 3;
        for (int i9 = 0; i9 < size; i9++) {
            eVar.f1313c0.f1322x = true;
            eVar.f1289B[i9].setLabelVisibilityMode(eVar.f1288A);
            eVar.f1289B[i9].setShifting(z6);
            eVar.f1289B[i9].b((q) eVar.f1314d0.getItem(i9));
            eVar.f1313c0.f1322x = false;
        }
    }

    @Override // l.InterfaceC0901A
    public final void c(o oVar, boolean z5) {
    }
}
