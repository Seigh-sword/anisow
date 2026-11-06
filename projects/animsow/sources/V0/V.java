package v0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f13070a;

    public /* synthetic */ V(RecyclerView recyclerView) {
        this.f13070a = recyclerView;
    }

    public final void a(C1386a c1386a) {
        int i6 = c1386a.f13074a;
        RecyclerView recyclerView = this.f13070a;
        if (i6 == 1) {
            recyclerView.f5704I.X(c1386a.f13075b, c1386a.f13077d);
            return;
        }
        if (i6 == 2) {
            recyclerView.f5704I.a0(c1386a.f13075b, c1386a.f13077d);
        } else if (i6 == 4) {
            recyclerView.f5704I.b0(c1386a.f13075b, c1386a.f13077d);
        } else {
            if (i6 != 8) {
                return;
            }
            recyclerView.f5704I.Z(c1386a.f13075b, c1386a.f13077d);
        }
    }

    public final u0 b(int i6) {
        RecyclerView recyclerView = this.f13070a;
        int iH = recyclerView.f5689A.h();
        int i7 = 0;
        u0 u0Var = null;
        while (true) {
            if (i7 >= iH) {
                break;
            }
            u0 u0VarI = RecyclerView.I(recyclerView.f5689A.g(i7));
            if (u0VarI != null && !u0VarI.j() && u0VarI.f13250c == i6) {
                if (!recyclerView.f5689A.k(u0VarI.f13248a)) {
                    u0Var = u0VarI;
                    break;
                }
                u0Var = u0VarI;
            }
            i7++;
        }
        if (u0Var == null || recyclerView.f5689A.k(u0Var.f13248a)) {
            return null;
        }
        return u0Var;
    }

    public final void c(int i6, int i7, Object obj) {
        int i8;
        int i9;
        RecyclerView recyclerView = this.f13070a;
        int iH = recyclerView.f5689A.h();
        int i10 = i7 + i6;
        for (int i11 = 0; i11 < iH; i11++) {
            View viewG = recyclerView.f5689A.g(i11);
            u0 u0VarI = RecyclerView.I(viewG);
            if (u0VarI != null && !u0VarI.q() && (i9 = u0VarI.f13250c) >= i6 && i9 < i10) {
                u0VarI.b(2);
                u0VarI.a(obj);
                ((g0) viewG.getLayoutParams()).f13127c = true;
            }
        }
        m0 m0Var = recyclerView.f5755x;
        ArrayList arrayList = m0Var.f13165c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u0 u0Var = (u0) arrayList.get(size);
            if (u0Var != null && (i8 = u0Var.f13250c) >= i6 && i8 < i10) {
                u0Var.b(2);
                m0Var.e(size);
            }
        }
        recyclerView.f5699F0 = true;
    }

    public final void d(int i6, int i7) {
        RecyclerView recyclerView = this.f13070a;
        int iH = recyclerView.f5689A.h();
        for (int i8 = 0; i8 < iH; i8++) {
            u0 u0VarI = RecyclerView.I(recyclerView.f5689A.g(i8));
            if (u0VarI != null && !u0VarI.q() && u0VarI.f13250c >= i6) {
                u0VarI.n(i7, false);
                recyclerView.f5692B0.f13219f = true;
            }
        }
        ArrayList arrayList = recyclerView.f5755x.f13165c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            u0 u0Var = (u0) arrayList.get(i9);
            if (u0Var != null && u0Var.f13250c >= i6) {
                u0Var.n(i7, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.E0 = true;
    }

    public final void e(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f13070a;
        int iH = recyclerView.f5689A.h();
        int i15 = -1;
        if (i6 < i7) {
            i9 = i6;
            i8 = i7;
            i10 = -1;
        } else {
            i8 = i6;
            i9 = i7;
            i10 = 1;
        }
        for (int i16 = 0; i16 < iH; i16++) {
            u0 u0VarI = RecyclerView.I(recyclerView.f5689A.g(i16));
            if (u0VarI != null && (i14 = u0VarI.f13250c) >= i9 && i14 <= i8) {
                if (i14 == i6) {
                    u0VarI.n(i7 - i6, false);
                } else {
                    u0VarI.n(i10, false);
                }
                recyclerView.f5692B0.f13219f = true;
            }
        }
        m0 m0Var = recyclerView.f5755x;
        m0Var.getClass();
        if (i6 < i7) {
            i12 = i6;
            i11 = i7;
        } else {
            i11 = i6;
            i12 = i7;
            i15 = 1;
        }
        ArrayList arrayList = m0Var.f13165c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            u0 u0Var = (u0) arrayList.get(i17);
            if (u0Var != null && (i13 = u0Var.f13250c) >= i12 && i13 <= i11) {
                if (i13 == i6) {
                    u0Var.n(i7 - i6, false);
                } else {
                    u0Var.n(i15, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.E0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(v0.u0 r9, v0.C1389b0 r10, v0.C1389b0 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f13070a
            r0.getClass()
            r1 = 0
            r9.p(r1)
            v0.c0 r1 = r0.f5740j0
            r2 = r1
            v0.r r2 = (v0.r) r2
            if (r10 == 0) goto L2b
            r2.getClass()
            int r4 = r10.f13084a
            int r6 = r11.f13084a
            if (r4 != r6) goto L1f
            int r1 = r10.f13085b
            int r3 = r11.f13085b
            if (r1 == r3) goto L2b
        L1f:
            int r5 = r10.f13085b
            int r7 = r11.f13085b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3c
            goto L39
        L2b:
            r2.l(r9)
            android.view.View r10 = r9.f13248a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f13204i
            r10.add(r9)
        L39:
            r0.S()
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.V.f(v0.u0, v0.b0, v0.b0):void");
    }

    public final void g(u0 u0Var, C1389b0 c1389b0, C1389b0 c1389b02) {
        RecyclerView recyclerView = this.f13070a;
        recyclerView.f5755x.j(u0Var);
        recyclerView.f(u0Var);
        u0Var.p(false);
        r rVar = (r) recyclerView.f5740j0;
        rVar.getClass();
        int i6 = c1389b0.f13084a;
        int i7 = c1389b0.f13085b;
        View view = u0Var.f13248a;
        int left = c1389b02 == null ? view.getLeft() : c1389b02.f13084a;
        int top = c1389b02 == null ? view.getTop() : c1389b02.f13085b;
        if (u0Var.j() || (i6 == left && i7 == top)) {
            rVar.l(u0Var);
            rVar.f13203h.add(u0Var);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!rVar.g(u0Var, i6, i7, left, top)) {
                return;
            }
        }
        recyclerView.S();
    }

    public final void h(int i6) {
        RecyclerView recyclerView = this.f13070a;
        View childAt = recyclerView.getChildAt(i6);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i6);
    }
}
