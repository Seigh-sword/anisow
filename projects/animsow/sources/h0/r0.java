package h0;

import android.util.Log;
import d.AbstractC0628i;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f8884l;

    /* JADX WARN: Illegal instructions before constructor call */
    public r0(int i6, int i7, c0 c0Var) {
        AbstractC0628i.o(i6, "finalState");
        AbstractC0628i.o(i7, "lifecycleImpact");
        AbstractC1305a.o(c0Var, "fragmentStateManager");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
        AbstractC1305a.n(abstractComponentCallbacksC0734B, "fragmentStateManager.fragment");
        super(i6, i7, abstractComponentCallbacksC0734B);
        this.f8884l = c0Var;
    }

    @Override // h0.s0
    public final void b() {
        this.f8893h = false;
        if (!this.f8891f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f8891f = true;
            Iterator it = this.f8889d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f8888c.f8598I = false;
        this.f8884l.k();
    }
}
