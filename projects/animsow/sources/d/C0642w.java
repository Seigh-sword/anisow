package d;

import android.util.Log;
import h0.L;
import h0.V;
import h0.W;
import h0.q0;
import h0.s0;
import h0.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import s4.AbstractC1305a;
import s4.C1316l;
import t4.C1351h;

/* JADX INFO: renamed from: d.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642w extends D4.i implements C4.l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0618F f8153y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0642w(C0618F c0618f, int i6) {
        super(1);
        this.f8152x = i6;
        this.f8153y = c0618f;
    }

    public final void a(C0621b c0621b) {
        Object objPrevious;
        int i6 = this.f8152x;
        Object obj = null;
        C0618F c0618f = this.f8153y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(c0621b, "backEvent");
                C1351h c1351h = c0618f.f8084b;
                ListIterator listIterator = c1351h.listIterator(c1351h.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object objPrevious2 = listIterator.previous();
                        if (((AbstractC0641v) objPrevious2).f8149a) {
                            obj = objPrevious2;
                        }
                    }
                }
                AbstractC0641v abstractC0641v = (AbstractC0641v) obj;
                if (c0618f.f8085c != null) {
                    c0618f.b();
                }
                c0618f.f8085c = abstractC0641v;
                if (abstractC0641v != null) {
                    L l5 = (L) abstractC0641v;
                    switch (l5.f8666d) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                            Object obj2 = l5.f8667e;
                            if (zIsLoggable) {
                                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + ((W) obj2));
                            }
                            W w5 = (W) obj2;
                            w5.w();
                            w5.x(new V(w5), false);
                            return;
                        default:
                            return;
                    }
                }
                return;
            default:
                AbstractC1305a.o(c0621b, "backEvent");
                AbstractC0641v abstractC0641v2 = c0618f.f8085c;
                if (abstractC0641v2 == null) {
                    C1351h c1351h2 = c0618f.f8084b;
                    ListIterator listIterator2 = c1351h2.listIterator(c1351h2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious = listIterator2.previous();
                            if (((AbstractC0641v) objPrevious).f8149a) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    abstractC0641v2 = (AbstractC0641v) objPrevious;
                }
                if (abstractC0641v2 != null) {
                    L l6 = (L) abstractC0641v2;
                    switch (l6.f8666d) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            boolean zIsLoggable2 = Log.isLoggable("FragmentManager", 2);
                            Object obj3 = l6.f8667e;
                            if (zIsLoggable2) {
                                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + ((W) obj3));
                            }
                            W w6 = (W) obj3;
                            if (w6.f8702h != null) {
                                for (u0 u0Var : w6.f(new ArrayList(Collections.singletonList(w6.f8702h)), 0, 1)) {
                                    u0Var.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0621b.f8093c);
                                    }
                                    ArrayList arrayList = u0Var.f8903c;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        t4.m.X(((s0) it.next()).f8896k, arrayList2);
                                    }
                                    List listK0 = t4.n.k0(t4.n.m0(arrayList2));
                                    int size = listK0.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        ((q0) listK0.get(i7)).d(c0621b, u0Var.f8901a);
                                    }
                                }
                                Iterator it2 = w6.f8708n.iterator();
                                if (it2.hasNext()) {
                                    AbstractC0628i.p(it2.next());
                                    throw null;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override // C4.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        C1316l c1316l = C1316l.f12640a;
        switch (this.f8152x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                a((C0621b) obj);
                break;
            default:
                a((C0621b) obj);
                break;
        }
        return c1316l;
    }
}
