package v0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import d.AbstractC0628i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1391c0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f13201s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f13203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f13204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f13205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f13206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f13207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f13208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f13209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f13210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f13211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f13212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f13213r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((u0) arrayList.get(size)).f13248a.animate().cancel();
        }
    }

    @Override // v0.AbstractC1391c0
    public final boolean a(u0 u0Var, u0 u0Var2, C1389b0 c1389b0, C1389b0 c1389b02) {
        int i6;
        int i7;
        int i8 = c1389b0.f13084a;
        int i9 = c1389b0.f13085b;
        if (u0Var2.q()) {
            int i10 = c1389b0.f13084a;
            i7 = c1389b0.f13085b;
            i6 = i10;
        } else {
            i6 = c1389b02.f13084a;
            i7 = c1389b02.f13085b;
        }
        if (u0Var == u0Var2) {
            return g(u0Var, i8, i9, i6, i7);
        }
        View view = u0Var.f13248a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(u0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(u0Var2);
        float f6 = -((int) ((i6 - i8) - translationX));
        View view2 = u0Var2.f13248a;
        view2.setTranslationX(f6);
        view2.setTranslationY(-((int) ((i7 - i9) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f13206k;
        C1407p c1407p = new C1407p();
        c1407p.f13183a = u0Var;
        c1407p.f13184b = u0Var2;
        c1407p.f13185c = i8;
        c1407p.f13186d = i9;
        c1407p.f13187e = i6;
        c1407p.f13188f = i7;
        arrayList.add(c1407p);
        return true;
    }

    @Override // v0.AbstractC1391c0
    public final void d(u0 u0Var) {
        View view = u0Var.f13248a;
        view.animate().cancel();
        ArrayList arrayList = this.f13205j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1408q) arrayList.get(size)).f13196a == u0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(u0Var);
                arrayList.remove(size);
            }
        }
        j(u0Var, this.f13206k);
        if (this.f13203h.remove(u0Var)) {
            view.setAlpha(1.0f);
            c(u0Var);
        }
        if (this.f13204i.remove(u0Var)) {
            view.setAlpha(1.0f);
            c(u0Var);
        }
        ArrayList arrayList2 = this.f13209n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(u0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f13208m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C1408q) arrayList5.get(size4)).f13196a == u0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(u0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f13207l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(u0Var)) {
                view.setAlpha(1.0f);
                c(u0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f13212q.remove(u0Var);
        this.f13210o.remove(u0Var);
        this.f13213r.remove(u0Var);
        this.f13211p.remove(u0Var);
        i();
    }

    @Override // v0.AbstractC1391c0
    public final void e() {
        ArrayList arrayList = this.f13205j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1408q c1408q = (C1408q) arrayList.get(size);
            View view = c1408q.f13196a.f13248a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c1408q.f13196a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f13203h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((u0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f13204i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            u0 u0Var = (u0) arrayList3.get(size3);
            u0Var.f13248a.setAlpha(1.0f);
            c(u0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f13206k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1407p c1407p = (C1407p) arrayList4.get(size4);
            u0 u0Var2 = c1407p.f13183a;
            if (u0Var2 != null) {
                k(c1407p, u0Var2);
            }
            u0 u0Var3 = c1407p.f13184b;
            if (u0Var3 != null) {
                k(c1407p, u0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f13208m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1408q c1408q2 = (C1408q) arrayList6.get(size6);
                    View view2 = c1408q2.f13196a.f13248a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c1408q2.f13196a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f13207l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    u0 u0Var4 = (u0) arrayList8.get(size8);
                    u0Var4.f13248a.setAlpha(1.0f);
                    c(u0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f13209n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1407p c1407p2 = (C1407p) arrayList10.get(size10);
                    u0 u0Var5 = c1407p2.f13183a;
                    if (u0Var5 != null) {
                        k(c1407p2, u0Var5);
                    }
                    u0 u0Var6 = c1407p2.f13184b;
                    if (u0Var6 != null) {
                        k(c1407p2, u0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f13212q);
            h(this.f13211p);
            h(this.f13210o);
            h(this.f13213r);
            ArrayList arrayList11 = this.f13090b;
            if (arrayList11.size() > 0) {
                AbstractC0628i.p(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // v0.AbstractC1391c0
    public final boolean f() {
        return (this.f13204i.isEmpty() && this.f13206k.isEmpty() && this.f13205j.isEmpty() && this.f13203h.isEmpty() && this.f13211p.isEmpty() && this.f13212q.isEmpty() && this.f13210o.isEmpty() && this.f13213r.isEmpty() && this.f13208m.isEmpty() && this.f13207l.isEmpty() && this.f13209n.isEmpty()) ? false : true;
    }

    public final boolean g(u0 u0Var, int i6, int i7, int i8, int i9) {
        View view = u0Var.f13248a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i7 + ((int) u0Var.f13248a.getTranslationY());
        l(u0Var);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            c(u0Var);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        ArrayList arrayList = this.f13205j;
        C1408q c1408q = new C1408q();
        c1408q.f13196a = u0Var;
        c1408q.f13197b = translationX;
        c1408q.f13198c = translationY;
        c1408q.f13199d = i8;
        c1408q.f13200e = i9;
        arrayList.add(c1408q);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f13090b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC0628i.p(arrayList.get(0));
            throw null;
        }
    }

    public final void j(u0 u0Var, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1407p c1407p = (C1407p) arrayList.get(size);
            if (k(c1407p, u0Var) && c1407p.f13183a == null && c1407p.f13184b == null) {
                arrayList.remove(c1407p);
            }
        }
    }

    public final boolean k(C1407p c1407p, u0 u0Var) {
        if (c1407p.f13184b == u0Var) {
            c1407p.f13184b = null;
        } else {
            if (c1407p.f13183a != u0Var) {
                return false;
            }
            c1407p.f13183a = null;
        }
        u0Var.f13248a.setAlpha(1.0f);
        View view = u0Var.f13248a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(u0Var);
        return true;
    }

    public final void l(u0 u0Var) {
        if (f13201s == null) {
            f13201s = new ValueAnimator().getInterpolator();
        }
        u0Var.f13248a.animate().setInterpolator(f13201s);
        d(u0Var);
    }
}
