package v0;

import N.C0083b;
import android.util.SparseArray;
import android.view.View;
import androidx.datastore.preferences.protobuf.C0289n;
import androidx.recyclerview.widget.RecyclerView;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f13164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f13169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f13170h;

    public m0(RecyclerView recyclerView) {
        this.f13170h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f13163a = arrayList;
        this.f13164b = null;
        this.f13165c = new ArrayList();
        this.f13166d = Collections.unmodifiableList(arrayList);
        this.f13167e = 2;
        this.f13168f = 2;
    }

    public final void a(u0 u0Var, boolean z5) {
        RecyclerView.j(u0Var);
        RecyclerView recyclerView = this.f13170h;
        w0 w0Var = recyclerView.f5705I0;
        if (w0Var != null) {
            v0 v0Var = w0Var.f13277e;
            boolean z6 = v0Var instanceof v0;
            View view = u0Var.f13248a;
            N.V.l(view, z6 ? (C0083b) v0Var.f13271e.remove(view) : null);
        }
        if (z5) {
            ArrayList arrayList = recyclerView.f5706J;
            if (arrayList.size() > 0) {
                AbstractC0628i.p(arrayList.get(0));
                throw null;
            }
            if (recyclerView.f5692B0 != null) {
                recyclerView.f5691B.o(u0Var);
            }
        }
        u0Var.f13266s = null;
        u0Var.f13265r = null;
        l0 l0VarC = c();
        l0VarC.getClass();
        int i6 = u0Var.f13253f;
        ArrayList arrayList2 = l0VarC.a(i6).f13149a;
        if (((k0) l0VarC.f13156a.get(i6)).f13150b <= arrayList2.size()) {
            return;
        }
        u0Var.o();
        arrayList2.add(u0Var);
    }

    public final int b(int i6) {
        RecyclerView recyclerView = this.f13170h;
        if (i6 >= 0 && i6 < recyclerView.f5692B0.b()) {
            return !recyclerView.f5692B0.f13220g ? i6 : recyclerView.f5759z.f(i6, 0);
        }
        StringBuilder sbL = H1.a.l("invalid position ", i6, ". State item count is ");
        sbL.append(recyclerView.f5692B0.b());
        sbL.append(recyclerView.y());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public final l0 c() {
        if (this.f13169g == null) {
            l0 l0Var = new l0();
            l0Var.f13156a = new SparseArray();
            l0Var.f13157b = 0;
            this.f13169g = l0Var;
        }
        return this.f13169g;
    }

    public final void d() {
        ArrayList arrayList = this.f13165c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f5686U0;
        C0289n c0289n = this.f13170h.f5690A0;
        int[] iArr2 = (int[]) c0289n.f5493d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0289n.f5492c = 0;
    }

    public final void e(int i6) {
        ArrayList arrayList = this.f13165c;
        a((u0) arrayList.get(i6), true);
        arrayList.remove(i6);
    }

    public final void f(View view) {
        u0 u0VarI = RecyclerView.I(view);
        boolean zL = u0VarI.l();
        RecyclerView recyclerView = this.f13170h;
        if (zL) {
            recyclerView.removeDetachedView(view, false);
        }
        if (u0VarI.k()) {
            u0VarI.f13261n.j(u0VarI);
        } else if (u0VarI.r()) {
            u0VarI.f13257j &= -33;
        }
        g(u0VarI);
        if (recyclerView.f5740j0 == null || u0VarI.i()) {
            return;
        }
        recyclerView.f5740j0.d(u0VarI);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(v0.u0 r9) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.m0.g(v0.u0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.View r4) {
        /*
            r3 = this;
            v0.u0 r4 = androidx.recyclerview.widget.RecyclerView.I(r4)
            r0 = 12
            boolean r0 = r4.e(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r3.f13170h
            if (r0 != 0) goto L45
            boolean r0 = r4.m()
            if (r0 == 0) goto L45
            v0.c0 r0 = r1.f5740j0
            if (r0 == 0) goto L45
            java.util.List r2 = r4.d()
            v0.r r0 = (v0.r) r0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L45
            boolean r0 = r0.f13202g
            if (r0 == 0) goto L45
            boolean r0 = r4.h()
            if (r0 == 0) goto L2f
            goto L45
        L2f:
            java.util.ArrayList r0 = r3.f13164b
            if (r0 != 0) goto L3a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f13164b = r0
        L3a:
            r4.f13261n = r3
            r0 = 1
            r4.f13262o = r0
            java.util.ArrayList r0 = r3.f13164b
        L41:
            r0.add(r4)
            goto L78
        L45:
            boolean r0 = r4.h()
            if (r0 == 0) goto L70
            boolean r0 = r4.j()
            if (r0 != 0) goto L70
            v0.W r0 = r1.f5702H
            boolean r0 = r0.f13072b
            if (r0 == 0) goto L58
            goto L70
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r2)
            java.lang.String r1 = r1.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L70:
            r4.f13261n = r3
            r0 = 0
            r4.f13262o = r0
            java.util.ArrayList r0 = r3.f13163a
            goto L41
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.m0.h(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0515 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v0.u0 i(int r25, long r26) {
        /*
            Method dump skipped, instruction units count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.m0.i(int, long):v0.u0");
    }

    public final void j(u0 u0Var) {
        (u0Var.f13262o ? this.f13164b : this.f13163a).remove(u0Var);
        u0Var.f13261n = null;
        u0Var.f13262o = false;
        u0Var.f13257j &= -33;
    }

    public final void k() {
        AbstractC1397f0 abstractC1397f0 = this.f13170h.f5704I;
        this.f13168f = this.f13167e + (abstractC1397f0 != null ? abstractC1397f0.f13118j : 0);
        ArrayList arrayList = this.f13165c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f13168f; size--) {
            e(size);
        }
    }
}
