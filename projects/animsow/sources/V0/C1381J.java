package v0;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: v0.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1381J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f13035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13036l;

    public final void a(View view) {
        int iC;
        int size = this.f13035k.size();
        View view2 = null;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            View view3 = ((u0) this.f13035k.get(i7)).f13248a;
            g0 g0Var = (g0) view3.getLayoutParams();
            if (view3 != view && !g0Var.f13125a.j() && (iC = (g0Var.f13125a.c() - this.f13028d) * this.f13029e) >= 0 && iC < i6) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i6 = iC;
                }
            }
        }
        this.f13028d = view2 == null ? -1 : ((g0) view2.getLayoutParams()).f13125a.c();
    }

    public final View b(m0 m0Var) {
        List list = this.f13035k;
        if (list == null) {
            View view = m0Var.i(this.f13028d, Long.MAX_VALUE).f13248a;
            this.f13028d += this.f13029e;
            return view;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = ((u0) this.f13035k.get(i6)).f13248a;
            g0 g0Var = (g0) view2.getLayoutParams();
            if (!g0Var.f13125a.j() && this.f13028d == g0Var.f13125a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
