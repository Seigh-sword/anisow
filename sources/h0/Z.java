package h0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends androidx.lifecycle.b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Y f8729h = new Y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8733e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8730b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8731c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8732d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8734f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8735g = false;

    public Z(boolean z5) {
        this.f8733e = z5;
    }

    @Override // androidx.lifecycle.b0
    public final void d() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f8734f = true;
    }

    public final void e(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0734B);
        }
        g(abstractComponentCallbacksC0734B.f8590A, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z5 = (Z) obj;
        return this.f8730b.equals(z5.f8730b) && this.f8731c.equals(z5.f8731c) && this.f8732d.equals(z5.f8732d);
    }

    public final void f(String str, boolean z5) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z5);
    }

    public final void g(String str, boolean z5) {
        HashMap map = this.f8731c;
        Z z6 = (Z) map.get(str);
        if (z6 != null) {
            if (z5) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(z6.f8731c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z6.f((String) it.next(), true);
                }
            }
            z6.d();
            map.remove(str);
        }
        HashMap map2 = this.f8732d;
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) map2.get(str);
        if (i0Var != null) {
            i0Var.a();
            map2.remove(str);
        }
    }

    public final void h(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (this.f8735g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8730b.remove(abstractComponentCallbacksC0734B.f8590A) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0734B);
        }
    }

    public final int hashCode() {
        return this.f8732d.hashCode() + ((this.f8731c.hashCode() + (this.f8730b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f8730b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f8731c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f8732d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
