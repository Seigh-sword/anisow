package F0;

import android.view.View;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f484b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f483a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f485c = new ArrayList();

    public F(View view) {
        this.f484b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return this.f484b == f6.f484b && this.f483a.equals(f6.f483a);
    }

    public final int hashCode() {
        return this.f483a.hashCode() + (this.f484b.hashCode() * 31);
    }

    public final String toString() {
        String strI = AbstractC0628i.i(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f484b + "\n", "    values:");
        HashMap map = this.f483a;
        for (String str : map.keySet()) {
            strI = strI + "    " + str + ": " + map.get(str) + "\n";
        }
        return strI;
    }
}
