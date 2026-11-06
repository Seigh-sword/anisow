package h0;

import android.util.Log;
import android.view.ViewGroup;
import d.AbstractC0628i;
import java.util.ArrayList;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0734B f8888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f8895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f8896k;

    public s0(int i6, int i7, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        AbstractC0628i.o(i6, "finalState");
        AbstractC0628i.o(i7, "lifecycleImpact");
        this.f8886a = i6;
        this.f8887b = i7;
        this.f8888c = abstractComponentCallbacksC0734B;
        this.f8889d = new ArrayList();
        this.f8894i = true;
        ArrayList arrayList = new ArrayList();
        this.f8895j = arrayList;
        this.f8896k = arrayList;
    }

    public final void a(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        this.f8893h = false;
        if (this.f8890e) {
            return;
        }
        this.f8890e = true;
        if (this.f8895j.isEmpty()) {
            b();
            return;
        }
        for (q0 q0Var : t4.n.k0(this.f8896k)) {
            q0Var.getClass();
            if (!q0Var.f8882b) {
                q0Var.b(viewGroup);
            }
            q0Var.f8882b = true;
        }
    }

    public abstract void b();

    public final void c(q0 q0Var) {
        AbstractC1305a.o(q0Var, "effect");
        ArrayList arrayList = this.f8895j;
        if (arrayList.remove(q0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i6, int i7) {
        AbstractC0628i.o(i6, "finalState");
        AbstractC0628i.o(i7, "lifecycleImpact");
        int iB = u.h.b(i7);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8888c;
        if (iB == 0) {
            if (this.f8886a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0734B + " mFinalState = " + AbstractC0628i.u(this.f8886a) + " -> " + AbstractC0628i.u(i6) + '.');
                }
                this.f8886a = i6;
                return;
            }
            return;
        }
        if (iB != 1) {
            if (iB != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0734B + " mFinalState = " + AbstractC0628i.u(this.f8886a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0628i.t(this.f8887b) + " to REMOVING.");
            }
            this.f8886a = 1;
            this.f8887b = 3;
        } else {
            if (this.f8886a != 1) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0734B + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0628i.t(this.f8887b) + " to ADDING.");
            }
            this.f8886a = 2;
            this.f8887b = 2;
        }
        this.f8894i = true;
    }

    public final String toString() {
        StringBuilder sbN = AbstractC0628i.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(AbstractC0628i.u(this.f8886a));
        sbN.append(" lifecycleImpact = ");
        sbN.append(AbstractC0628i.t(this.f8887b));
        sbN.append(" fragment = ");
        sbN.append(this.f8888c);
        sbN.append('}');
        return sbN.toString();
    }
}
