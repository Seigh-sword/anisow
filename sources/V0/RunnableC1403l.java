package v0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: v0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1403l implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f13154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f13155y;

    public /* synthetic */ RunnableC1403l(Object obj, int i6, Object obj2) {
        this.f13153w = i6;
        this.f13155y = obj;
        this.f13154x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6;
        char c6;
        int i6 = this.f13153w;
        Object obj = this.f13154x;
        Object obj2 = this.f13155y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ArrayList<C1408q> arrayList = (ArrayList) obj;
                for (C1408q c1408q : arrayList) {
                    r rVar = (r) obj2;
                    u0 u0Var = c1408q.f13196a;
                    rVar.getClass();
                    View view = u0Var.f13248a;
                    int i7 = c1408q.f13199d - c1408q.f13197b;
                    int i8 = c1408q.f13200e - c1408q.f13198c;
                    if (i7 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    rVar.f13211p.add(u0Var);
                    viewPropertyAnimatorAnimate.setDuration(rVar.f13093e).setListener(new C1405n(rVar, u0Var, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                ((r) obj2).f13208m.remove(arrayList);
                break;
            case 1:
                ArrayList<C1407p> arrayList2 = (ArrayList) obj;
                for (C1407p c1407p : arrayList2) {
                    r rVar2 = (r) obj2;
                    rVar2.getClass();
                    u0 u0Var2 = c1407p.f13183a;
                    View view2 = u0Var2 == null ? null : u0Var2.f13248a;
                    u0 u0Var3 = c1407p.f13184b;
                    View view3 = u0Var3 != null ? u0Var3.f13248a : null;
                    ArrayList arrayList3 = rVar2.f13213r;
                    long j7 = rVar2.f13094f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j7);
                        arrayList3.add(c1407p.f13183a);
                        duration.translationX(c1407p.f13187e - c1407p.f13185c);
                        duration.translationY(c1407p.f13188f - c1407p.f13186d);
                        j6 = j7;
                        duration.alpha(0.0f).setListener(new C1406o(rVar2, c1407p, duration, view2, 0)).start();
                    } else {
                        j6 = j7;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList3.add(c1407p.f13184b);
                        c6 = 0;
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new C1406o(rVar2, c1407p, viewPropertyAnimatorAnimate2, view3, 1)).start();
                    } else {
                        c6 = 0;
                    }
                }
                arrayList2.clear();
                ((r) obj2).f13209n.remove(arrayList2);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ArrayList<u0> arrayList4 = (ArrayList) obj;
                for (u0 u0Var4 : arrayList4) {
                    r rVar3 = (r) obj2;
                    rVar3.getClass();
                    View view4 = u0Var4.f13248a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    rVar3.f13210o.add(u0Var4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(rVar3.f13091c).setListener(new C1404m(rVar3, u0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                }
                arrayList4.clear();
                ((r) obj2).f13207l.remove(arrayList4);
                break;
            default:
                RunnableC1396f runnableC1396f = (RunnableC1396f) obj2;
                C1399h c1399h = (C1399h) runnableC1396f.f13104B;
                if (c1399h.f13136g == runnableC1396f.f13106x) {
                    List list = (List) runnableC1396f.f13108z;
                    Runnable runnable = (Runnable) runnableC1396f.f13103A;
                    List list2 = c1399h.f13135f;
                    c1399h.f13134e = list;
                    c1399h.f13135f = Collections.unmodifiableList(list);
                    ((C1411u) obj).b(c1399h.f13130a);
                    c1399h.a(runnable);
                }
                break;
        }
    }
}
