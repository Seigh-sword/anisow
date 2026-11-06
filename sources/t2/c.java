package t2;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12736b = 0;

    public c() {
    }

    @Override // B.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i6) {
        v(coordinatorLayout, view, i6);
        if (this.f12735a == null) {
            this.f12735a = new d(view);
        }
        d dVar = this.f12735a;
        View view2 = dVar.f12737a;
        dVar.f12738b = view2.getTop();
        dVar.f12739c = view2.getLeft();
        this.f12735a.a();
        int i7 = this.f12736b;
        if (i7 == 0) {
            return true;
        }
        d dVar2 = this.f12735a;
        if (dVar2.f12740d != i7) {
            dVar2.f12740d = i7;
            dVar2.a();
        }
        this.f12736b = 0;
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i6) {
        coordinatorLayout.q(view, i6);
    }

    public c(int i6) {
    }
}
