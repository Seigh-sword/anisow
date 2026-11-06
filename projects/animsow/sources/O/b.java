package O;

import J3.G;
import N.V;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f2288a;

    public b(G g4) {
        this.f2288a = g4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f2288a.equals(((b) obj).f2288a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2288a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        S2.j jVar = (S2.j) this.f2288a.f1363x;
        AutoCompleteTextView autoCompleteTextView = jVar.f3133h;
        if (autoCompleteTextView == null || C0.k(autoCompleteTextView)) {
            return;
        }
        int i6 = z5 ? 2 : 1;
        WeakHashMap weakHashMap = V.f1964a;
        jVar.f3172d.setImportantForAccessibility(i6);
    }
}
