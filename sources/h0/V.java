package h0;

import android.util.Log;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class V implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f8678a;

    public V(W w5) {
        this.f8678a = w5;
    }

    @Override // h0.T
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        W w5 = this.f8678a;
        w5.getClass();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + w5.f8695a);
        }
        boolean zS = false;
        if (w5.f8698d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
        } else {
            ArrayList arrayList3 = w5.f8698d;
            C0736a c0736a = (C0736a) arrayList3.get(arrayList3.size() - 1);
            w5.f8702h = c0736a;
            Iterator it = c0736a.f8736a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = ((d0) it.next()).f8793b;
                if (abstractComponentCallbacksC0734B != null) {
                    abstractComponentCallbacksC0734B.f8598I = true;
                }
            }
            zS = w5.S(arrayList, arrayList2, -1, 0);
        }
        if (!w5.f8708n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(W.F((C0736a) it2.next()));
            }
            Iterator it3 = w5.f8708n.iterator();
            while (it3.hasNext()) {
                AbstractC0628i.p(it3.next());
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zS;
    }
}
