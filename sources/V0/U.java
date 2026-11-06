package v0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f13069x;

    public /* synthetic */ U(RecyclerView recyclerView, int i6) {
        this.f13068w = i6;
        this.f13069x = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        int i6 = this.f13068w;
        RecyclerView recyclerView3 = this.f13069x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (recyclerView3.f5718P && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.f5714N) {
                        recyclerView3.requestLayout();
                    } else if (!recyclerView3.f5724S) {
                        recyclerView3.m();
                    } else {
                        recyclerView3.f5722R = true;
                    }
                    break;
                }
                break;
            default:
                AbstractC1391c0 abstractC1391c0 = recyclerView3.f5740j0;
                if (abstractC1391c0 != null) {
                    r rVar = (r) abstractC1391c0;
                    ArrayList arrayList = rVar.f13203h;
                    boolean z5 = !arrayList.isEmpty();
                    ArrayList arrayList2 = rVar.f13205j;
                    boolean z6 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = rVar.f13206k;
                    boolean z7 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = rVar.f13204i;
                    boolean z8 = !arrayList4.isEmpty();
                    if (z5 || z6 || z8 || z7) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j6 = rVar.f13092d;
                            if (zHasNext) {
                                u0 u0Var = (u0) it.next();
                                View view = u0Var.f13248a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                rVar.f13212q.add(u0Var);
                                viewPropertyAnimatorAnimate.setDuration(j6).alpha(0.0f).setListener(new C1404m(rVar, u0Var, viewPropertyAnimatorAnimate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (z6) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    rVar.f13208m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1403l runnableC1403l = new RunnableC1403l(rVar, 0, arrayList5);
                                    if (z5) {
                                        View view2 = ((C1408q) arrayList5.get(0)).f13196a.f13248a;
                                        WeakHashMap weakHashMap = N.V.f1964a;
                                        view2.postOnAnimationDelayed(runnableC1403l, j6);
                                    } else {
                                        runnableC1403l.run();
                                    }
                                }
                                if (z7) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    rVar.f13209n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1403l runnableC1403l2 = new RunnableC1403l(rVar, 1, arrayList6);
                                    if (z5) {
                                        View view3 = ((C1407p) arrayList6.get(0)).f13183a.f13248a;
                                        WeakHashMap weakHashMap2 = N.V.f1964a;
                                        view3.postOnAnimationDelayed(runnableC1403l2, j6);
                                    } else {
                                        runnableC1403l2.run();
                                    }
                                }
                                if (z8) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    rVar.f13207l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1403l runnableC1403l3 = new RunnableC1403l(rVar, 2, arrayList7);
                                    if (z5 || z6 || z7) {
                                        if (!z5) {
                                            j6 = 0;
                                        }
                                        long jMax = Math.max(z6 ? rVar.f13093e : 0L, z7 ? rVar.f13094f : 0L) + j6;
                                        View view4 = ((u0) arrayList7.get(0)).f13248a;
                                        WeakHashMap weakHashMap3 = N.V.f1964a;
                                        view4.postOnAnimationDelayed(runnableC1403l3, jMax);
                                    } else {
                                        runnableC1403l3.run();
                                    }
                                }
                            }
                        }
                    } else {
                        recyclerView2 = recyclerView3;
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.f5703H0 = false;
                break;
        }
    }
}
