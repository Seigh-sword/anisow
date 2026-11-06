package x;

import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Iterator;
import w.C1436c;
import w.C1437d;
import w.C1438e;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f13647f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f13648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f13651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13652e;

    public final void a(ArrayList arrayList) {
        int size = this.f13648a.size();
        if (this.f13652e != -1 && size > 0) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                o oVar = (o) arrayList.get(i6);
                if (this.f13652e == oVar.f13649b) {
                    c(this.f13650c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(u.d dVar, int i6) {
        int iN;
        C1436c c1436c;
        ArrayList arrayList = this.f13648a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1438e c1438e = (C1438e) ((C1437d) arrayList.get(0)).f13359T;
        dVar.t();
        c1438e.c(dVar, false);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((C1437d) arrayList.get(i7)).c(dVar, false);
        }
        if (i6 == 0 && c1438e.f13427z0 > 0) {
            com.bumptech.glide.d.a(c1438e, dVar, arrayList, 0);
        }
        if (i6 == 1 && c1438e.f13408A0 > 0) {
            com.bumptech.glide.d.a(c1438e, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        this.f13651d = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            this.f13651d.add(new n(this, (C1437d) arrayList.get(i8), dVar, i6));
        }
        if (i6 == 0) {
            iN = u.d.n(c1438e.f13348I);
            c1436c = c1438e.f13350K;
        } else {
            iN = u.d.n(c1438e.f13349J);
            c1436c = c1438e.f13351L;
        }
        int iN2 = u.d.n(c1436c);
        dVar.t();
        return iN2 - iN;
    }

    public final void c(int i6, o oVar) {
        for (C1437d c1437d : this.f13648a) {
            ArrayList arrayList = oVar.f13648a;
            if (!arrayList.contains(c1437d)) {
                arrayList.add(c1437d);
            }
            int i7 = oVar.f13649b;
            if (i6 == 0) {
                c1437d.f13393n0 = i7;
            } else {
                c1437d.f13395o0 = i7;
            }
        }
        this.f13652e = oVar.f13649b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i6 = this.f13650c;
        sb.append(i6 == 0 ? "Horizontal" : i6 == 1 ? "Vertical" : i6 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strL = AbstractC0628i.l(sb, this.f13649b, "] <");
        Iterator it = this.f13648a.iterator();
        while (it.hasNext()) {
            strL = strL + " " + ((C1437d) it.next()).f13381h0;
        }
        return AbstractC0628i.i(strL, " >");
    }
}
