package v0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: v0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1391c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V f13089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f13090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13094f;

    public static void b(u0 u0Var) {
        RecyclerView recyclerView;
        int i6 = u0Var.f13257j;
        if (u0Var.h() || (i6 & 4) != 0 || (recyclerView = u0Var.f13265r) == null) {
            return;
        }
        recyclerView.F(u0Var);
    }

    public abstract boolean a(u0 u0Var, u0 u0Var2, C1389b0 c1389b0, C1389b0 c1389b02);

    public final void c(u0 u0Var) {
        V v5 = this.f13089a;
        if (v5 != null) {
            boolean z5 = true;
            u0Var.p(true);
            if (u0Var.f13255h != null && u0Var.f13256i == null) {
                u0Var.f13255h = null;
            }
            u0Var.f13256i = null;
            if ((u0Var.f13257j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = v5.f13070a;
            recyclerView.d0();
            C1402k c1402k = recyclerView.f5689A;
            V v6 = (V) c1402k.f13146b;
            RecyclerView recyclerView2 = v6.f13070a;
            View view = u0Var.f13248a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c1402k.l(view);
            } else {
                C1401j c1401j = (C1401j) c1402k.f13147c;
                if (c1401j.d(iIndexOfChild)) {
                    c1401j.f(iIndexOfChild);
                    c1402k.l(view);
                    v6.h(iIndexOfChild);
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                u0 u0VarI = RecyclerView.I(view);
                m0 m0Var = recyclerView.f5755x;
                m0Var.j(u0VarI);
                m0Var.g(u0VarI);
            }
            recyclerView.e0(!z5);
            if (z5 || !u0Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(u0 u0Var);

    public abstract void e();

    public abstract boolean f();
}
