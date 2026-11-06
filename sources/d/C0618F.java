package d;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0314n;
import androidx.lifecycle.InterfaceC0321v;
import h0.AbstractComponentCallbacksC0734B;
import h0.C0736a;
import h0.L;
import h0.W;
import h0.d0;
import h0.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import s4.AbstractC1305a;
import t4.C1351h;

/* JADX INFO: renamed from: d.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0618F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f8083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1351h f8084b = new C1351h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0641v f8085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f8086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f8087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8089g;

    public C0618F(Runnable runnable) {
        this.f8083a = runnable;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            this.f8086d = i6 >= 34 ? C0614B.f8075a.a(new C0642w(this, 0), new C0642w(this, 1), new C0643x(this, 0), new C0643x(this, 1)) : C0645z.f8158a.a(new C0643x(this, 2));
        }
    }

    public final void a(InterfaceC0321v interfaceC0321v, L l5) {
        AbstractC1305a.o(interfaceC0321v, "owner");
        AbstractC1305a.o(l5, "onBackPressedCallback");
        C0323x c0323xG = interfaceC0321v.g();
        if (c0323xG.f5645d == EnumC0314n.f5631w) {
            return;
        }
        l5.f8150b.add(new C0615C(this, c0323xG, l5));
        e();
        l5.f8151c = new C0617E(0, this);
    }

    public final void b() {
        Object objPrevious;
        AbstractC0641v abstractC0641v = this.f8085c;
        if (abstractC0641v == null) {
            C1351h c1351h = this.f8084b;
            ListIterator<E> listIterator = c1351h.listIterator(c1351h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0641v) objPrevious).f8149a) {
                        break;
                    }
                }
            }
            abstractC0641v = (AbstractC0641v) objPrevious;
        }
        this.f8085c = null;
        if (abstractC0641v != null) {
            abstractC0641v.a();
        }
    }

    public final void c() {
        Object objPrevious;
        AbstractC0641v abstractC0641v = this.f8085c;
        if (abstractC0641v == null) {
            C1351h c1351h = this.f8084b;
            ListIterator listIterator = c1351h.listIterator(c1351h.b());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0641v) objPrevious).f8149a) {
                        break;
                    }
                } else {
                    objPrevious = null;
                    break;
                }
            }
            abstractC0641v = (AbstractC0641v) objPrevious;
        }
        this.f8085c = null;
        if (abstractC0641v == null) {
            Runnable runnable = this.f8083a;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        L l5 = (L) abstractC0641v;
        int i6 = l5.f8666d;
        Object obj = l5.f8667e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + ((W) obj));
                }
                W w5 = (W) obj;
                w5.f8703i = true;
                w5.z(true);
                w5.f8703i = false;
                C0736a c0736a = w5.f8702h;
                L l6 = w5.f8704j;
                if (c0736a == null) {
                    if (l6.f8149a) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        w5.Q();
                        return;
                    } else {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        w5.f8701g.c();
                        return;
                    }
                }
                if (!w5.f8708n.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(W.F(w5.f8702h));
                    Iterator it = w5.f8708n.iterator();
                    while (it.hasNext()) {
                        AbstractC0628i.p(it.next());
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = w5.f8702h.f8736a.iterator();
                while (it3.hasNext()) {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = ((d0) it3.next()).f8793b;
                    if (abstractComponentCallbacksC0734B != null) {
                        abstractComponentCallbacksC0734B.f8598I = false;
                    }
                }
                for (u0 u0Var : w5.f(new ArrayList(Collections.singletonList(w5.f8702h)), 0, 1)) {
                    u0Var.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    ArrayList arrayList = u0Var.f8903c;
                    u0Var.p(arrayList);
                    u0Var.c(arrayList);
                }
                Iterator it4 = w5.f8702h.f8736a.iterator();
                while (it4.hasNext()) {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((d0) it4.next()).f8793b;
                    if (abstractComponentCallbacksC0734B2 != null && abstractComponentCallbacksC0734B2.f8617b0 == null) {
                        w5.g(abstractComponentCallbacksC0734B2).k();
                    }
                }
                w5.f8702h = null;
                w5.g0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + l6.f8149a + " for  FragmentManager " + w5);
                    return;
                }
                return;
            default:
                ((W0.b) obj).n();
                return;
        }
    }

    public final void d(boolean z5) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8087e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f8086d) == null) {
            return;
        }
        C0645z c0645z = C0645z.f8158a;
        if (z5 && !this.f8088f) {
            c0645z.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f8088f = true;
        } else {
            if (z5 || !this.f8088f) {
                return;
            }
            c0645z.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8088f = false;
        }
    }

    public final void e() {
        boolean z5 = this.f8089g;
        C1351h c1351h = this.f8084b;
        boolean z6 = false;
        if (!(c1351h instanceof Collection) || !c1351h.isEmpty()) {
            Iterator it = c1351h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0641v) it.next()).f8149a) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f8089g = z6;
        if (z6 == z5 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z6);
    }
}
